import java.io.*;
import java.util.ArrayList;

/**
 * Created by Andres on 21/04/2017.
 */
public class AdministrarApp implements Serializable {

    public ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    public ArrayList<Factura> listaFactura = new ArrayList<Factura>();
    public ArrayList<Llamada> listaLlamada = new ArrayList<Llamada>();
    private static final long serialVersionUID = 1566096528227068643L;

    public void cargar(String nombre) throws ClassNotFoundException, IOException{
        FileInputStream fis = new FileInputStream(nombre);
        ObjectInputStream ois = new ObjectInputStream(fis);

        listaCliente = (ArrayList<Cliente>) ois.readObject();
        listaFactura = (ArrayList<Factura>) ois.readObject();
        listaLlamada = (ArrayList<Llamada>) ois.readObject();
        ois.close();
    }

    public void guardar(String nombre) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(nombre);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(listaCliente);
        oos.writeObject(listaFactura);
        oos.writeObject(listaLlamada);
        oos.close();
    }

}
