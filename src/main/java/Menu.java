import es.uji.www.GeneradorDatosINE;

import java.util.Scanner;

public class Menu {

	public static void main(String [] args) {
        int opcion;
        boolean fin = false;
        Scanner sc = new Scanner(System.in);

        // Mientras la opción elegida no sea 0, se ejecuta el menú principal
        while (!fin) {

            opcionesPrincipal();

            System.out.print("Elija la opción que desea (0-3): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0: //acabar ejecución
                    fin = true;
                    break;
                case 1: //abrir menu de clientes
                    menuClientes();
                    break;
                case 2: //abrir menu de llamadas
                    menuLlamadas();
                    break;
                case 3: //abrir menu de facturas
                    menuFacturas();
                    break;
            }
        }
        sc.close();
    }

	public static void menuClientes(){
	    int opcion;
	    boolean fin = false;
	    AdministrarCliente admClien = new AdministrarCliente();

        Scanner sc = new Scanner(System.in);

        while (!fin) {

            opcionesClientes();

            System.out.print("Elija la opción que desea (0-5): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0: //volver al menu principal
                    fin = true;
                    break;
                case 1: //añadir cliente
                    admClien.addCliente(); //No se por que da error en la excepción que pusiste de parse
                    break;
                case 2: //borrar cliente
                    admClien.delCliente();
                    break;
                case 3: //cambiar tarifa cliente
                    admClien.cambiarTarifa();
                    break;
                case 4: //Datos de un cliente
                    System.out.print("Indique el NIF del cliente que desea borrar: ");
                    String nif = sc.next();
                    admClien.listarClienteNIF(nif);
                    break;
                case 5: //Datos de todos los clientes
                    admClien.listarClientes();
                    break;
            }
        }
        sc.close();
    }

    public static void menuLlamadas(){
        int opcion;
        boolean fin = false;
        AdministrarLlamada admLlam = new AdministrarLlamada();

        Scanner sc = new Scanner(System.in);

        while (!fin) {

            opcionesLlamadas();

            System.out.print("Elija la opción que desea (0-2): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0: //volver al menu principal
                    fin = true;
                    break;
                case 1: //dar alta llamada
                    admLlam.DarAlta(); //No se por que da error en la excepción que pusiste de parse
                    break;
                case 2: //listar llamadas de un cliente
                    System.out.print("Indique el NIF del cliente que desea listar sus llamadas: ");
                    int nif = sc.nextInt();
                    admLlam.listarLlamadasNIF(nif);
                    break;
            }
        }
        sc.close();
    }

    public static void menuFacturas(){
        int opcion;
        boolean fin = false;
        AdministrarFactura admFac = new AdministrarFactura();

        Scanner sc = new Scanner(System.in);

        while (!fin) {

            opcionesFacturas();

            System.out.print("Elija la opción que desea (0-3): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0: //volver al menu principal
                    fin = true;
                    break;
                case 1: //emitir factura
                    admFac.emitirFactura(); //No se por que da error en la excepción que pusiste de parse
                    break;
                case 2: //recuperar factura a traves de codigo
                    System.out.print("Indique el código de la factura que desea recuperar: ");
                    int cod = sc.nextInt();
                    admFac.listarFacturasCodigo(cod);
                    break;
                case 3: //recuperar facturas de cliente
                    System.out.print("Indique el NIF del cliente que desea recuperar sus facturas: ");
                    int nif = sc.nextInt();
                    admFac.listarFacturasNIF(nif);
                    break;
            }
        }
        sc.close();
    }



    public static void opcionesPrincipal() {
        System.out.println("******************* MENÚ PRINCIPAL *******************");
        System.out.println();
        System.out.println("1. Menú cliente.");
        System.out.println("2. Menú llamadas.");
        System.out.println("3. Menú facturas.");
        System.out.println("0. Salir.");
    }


    public static void opcionesClientes() {
        System.out.println("******************* MENÚ CLIENTES *******************");
        System.out.println();
        System.out.println("1. Dar de alta un nuevo cliente.");
        System.out.println("2. Borrar un cliente.");
        System.out.println("3. Cambiar la tarifa de un cliente.");
        System.out.println("4. Recuperar los datos de un cliente.");
        System.out.println("5. Recuperar el listado de todos los clientes.");
        System.out.println("0. Atrás.");
    }

    public static void opcionesLlamadas() {
        System.out.println("******************* MENÚ LLAMADAS *******************");
        System.out.println();
        System.out.println("1. Dar de alta una llamada.");
        System.out.println("2. Listar las llamadas de un cliente.");
        System.out.println("0. Atrás.");
    }

    public static void opcionesFacturas() {
        System.out.println("******************* MENÚ FACTURAS *******************");
        System.out.println();
        System.out.println("1. Emitir una factura para un cliente.");
        System.out.println("2. Recuperar los datos de una factura.");
        System.out.println("3. Recuperar las facturas de un cliente.");
        System.out.println("0. Atrás.");
    }
}
