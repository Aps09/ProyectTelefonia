import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Scanner;

public class AdministrarCliente extends AdministrarApp{
	
	public void addCliente() throws ParseException{							// Dar de alta un cliente
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduzca el NIF: ");
		String NIF = sc.nextLine();
		
		System.out.println("Introduzca la provincia: ");
		String provincia = sc.nextLine();
		System.out.println("Introduzca la población: ");
		String poblacion = sc.nextLine();
		System.out.println("Introduzca el CP: ");
		int CP = sc.nextInt();
		Direccion direccion = new Direccion(CP, provincia, poblacion);
		
		System.out.println("Introduzca el correo: ");
		String correo = sc.nextLine();
		
		System.out.println("Introduzca la fecha del alta: ");
		String dateString = sc.next();
        LocalDateTime fechaAlta = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("EEEE dd MMM yyyy"));
		
		System.out.println("Introduzca la tarifa base (€/min): ");
		float n = sc.nextFloat();
		Tarifa tarifa = new Tarifa(n);
		
		Cliente nuevoCliente = new Cliente(nombre, NIF, direccion, correo, fechaAlta, tarifa);
		listaCliente.add(nuevoCliente);

		sc.close();
	}

	// borrar cliente
	public void delCliente(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique el NIF del cliente que desea borrar: ");
        String nif = sc.next();

        for(Cliente i : listaCliente){
            if(i.getNIF() == nif){
                listaCliente.remove(i);
            }
        }

        sc.close();
	}

    // camnbiar tarifa
    public void cambiarTarifa(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique el NIF del cliente que desea cambiar la tarifa: ");
        String nif = sc.next();

		System.out.println("Introduzca la nueva tarifa para el cliente con NIF: "+nif+" (Ex: 54)");
		int nuevaTarifa = sc.nextInt();


        for(Cliente i : listaCliente){
            if(i.getNIF() == nif){
                i.setTarifa(nuevaTarifa);
            }
        }

        sc.close();
    }

    public void listarClientesFecha (LocalDateTime[] periodoFecha){
        Collection<Cliente> lista = getFecha(listaCliente,periodoFecha[0],periodoFecha[1]);

        System.out.println("Lista de los datos de los clientes que se dieron de alta en dicha fecha: \n************************************************");
        System.out.println("Nombre\tNIF\tCorreo\tFecha alta\tTarifa\tDirección");

        for(Cliente i : lista){
            System.out.println(i.getNombre()+" "+i.getNIF()+" "+i.getCorreo()+" "+i.getFecha()+" "+i.getTarifa()+" "+i.getDireccion());
        }
    }

    // listar cliente nif
    public void listarClienteNIF(String nif){
        System.out.println("Lista de los datos de un cliente con NIF: "+ nif +":\n************************************************");
        System.out.println("Nombre\tNIF\tCorreo\tFecha alta\tTarifa\tDirección");
        for(Cliente i : listaCliente){
            if(i.getNIF() == nif){
                System.out.println(i.getNombre()+" "+i.getNIF()+" "+i.getCorreo()+" "+i.getFecha()+" "+i.getTarifa()+" "+i.getDireccion());
            }
        }
    }

    // listar clientes
    public void listarClientes(){
        System.out.println("Lista de los datos de todos los clientes inscritos: " +":\n************************************************");
        System.out.println("Nombre\tNIF\tCorreo\tFecha alta\tTarifa\tDirección");
        for(Cliente i : listaCliente){
            System.out.println(i.getNombre()+" "+i.getNIF()+" "+i.getCorreo()+" "+i.getFecha()+" "+i.getTarifa()+" "+i.getDireccion());
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
