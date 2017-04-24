import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Scanner;


public class AdministrarFactura extends AdministrarApp {

    // Metodos

    private float getImporte(int NIF, LocalDateTime[] periodoFactura, Tarifa tari) {

        int sumaDuracion = 0;
        Collection<Llamada> lista = getFecha(listaLlamada,periodoFactura[0],periodoFactura[1]);

        for (Llamada llamada : lista)
            sumaDuracion += llamada.getDuracion();

        float tarifa = tari.getPrecio();
        float impo = sumaDuracion * tarifa;
        return impo;
    }

    public void emitirFactura() throws ParseException, FechaIncorrecta {
        Scanner sc = null; //Puede fallar con NullPointerException

        Factura e = new Factura();

        System.out.println("Introduzca el codigo de la factura: Ex:123");
        int codigo = sc.nextInt();
        e.setCodigo(codigo);

        System.out.println("Introduzca la tarifa que tienen contratada el cliente: EX: 54");
        int precio = sc.nextInt();
        e.setTarifa(precio);

        System.out.println("Introduzca la fecha de Emision: Ex: Monday 12 December 2013");
        String dateString = sc.next();

        LocalDateTime dateEmision = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("EEEE dd MMM yyyy"));

        e.setFechaEmision(dateEmision);

        System.out.println("Introduzca el periodo de Factura: Ex: \nMonday 12 December 2013 \nFriday 17 April 2015");
        String dateStringInit = sc.next();
        LocalDateTime dateInit = LocalDateTime.parse(dateStringInit, DateTimeFormatter.ofPattern("EEEE dd MMM yyyy"));

        String dateStringFinal = sc.next();
        LocalDateTime dateFinal = LocalDateTime.parse(dateStringFinal, DateTimeFormatter.ofPattern("EEEE dd MMM yyyy"));

        if(dateInit.compareTo(dateFinal)>0)
            throw new FechaIncorrecta();

        e.setPeriodoFactura(dateInit, dateFinal);

        System.out.println("Introduzca el NIF del cliente: Ex: 12456");
        int NIF = sc.nextInt();
        e.setNIF(NIF);

        float importe = getImporte(e.getNIF(), e.getPeriodoFactura(), e.getTarifa());
        e.setImporte(importe);

        sc.close();

        listaFactura.add(e);
    }

    public void listarFacturasFecha(LocalDateTime[] periodoFecha){
        Collection<Factura> lista = getFecha(listaFactura,periodoFecha[0],periodoFecha[1]);

        System.out.println("Lista de todas las facturas que se hicieron entre dichas fechas:\n************************************************");
        System.out.println("NIF\tFechaEmision\tFecha\tTarifa\tImporte");

        for (Factura i : lista) {
            System.out.println(i.getNIF() + " " + i.getFechaEmision() + " " + i.getFecha() + " " + i.getTarifa() + " " + i.getImporte());
        }
    }

    public void listarFacturasCodigo(int codigo) {
        System.out.println("Lista de todas las llamadas con codigo " + codigo + ":\n************************************************");
        System.out.println("NIF\tFechaEmision\tFecha\tTarifa\tImporte");
        for (Factura i : listaFactura) {
            if (i.getCodigo() == codigo) {
                System.out.println(i.getNIF() + " " + i.getFechaEmision() + " " + i.getFecha() + " " + i.getTarifa() + " " + i.getImporte());
            }
        }
    }

    public void listarFacturasNIF(int NIF) {
        System.out.println("Lista de todas las llamadas con NIF " + NIF + ":\n************************************************");
        System.out.println("NIF\tFechaEmision\tFecha\tTarifa\tImporte\tCodigo");
        for (Factura i : listaFactura) {
            if (i.getNIF() == NIF) {
                System.out.println(i.getNIF() + " " + i.getFechaEmision() + " " + i.getFecha() + " " + i.getTarifa() + " " + i.getImporte() + " " + i.getNIF());
            }
        }
    }

    public <T extends Fecha> Collection<T> getFecha(Collection<T> coleccion, LocalDateTime inicio, LocalDateTime fin){

        Collection <T> resultado = null;

        for(T objeto : coleccion){
            if (objeto.getFecha().compareTo(inicio)>=0 && objeto.getFecha().compareTo(fin)<=0)
                resultado.add(objeto);
        }
        return resultado;
    }
}