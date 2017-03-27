import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cliente{
	
	/*Atributos*/
	
	private String nombre;
	private String NIF;
	private Direccion direccion;
	private String correo;
	private Date fechaAlta;
	private Tarifa tarifa;

	/*Constructor*/
	public Cliente(){
	    this.nombre=null;
	    this.NIF=null;
	    this.direccion=null;
	    this.correo=null;
	    this.fechaAlta=null;
	    this.tarifa=null;
    }

	public Cliente (String nom, String nif, Direccion direc, String correu, Date dataAlta, Tarifa tarifa){
		this.nombre = nom;
		this.NIF = nif;
		this.direccion = direc;
		this.correo = correu;
		this.fechaAlta = dataAlta;
		this.tarifa = tarifa;
	}
	
	public Date getFecha(){
		return fechaAlta;
	}

	// setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setTarifa(int nuevaFactura) {
        this.tarifa.setPrecio(nuevaFactura);
    }

    // getters


    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public float getTarifa() {
        return tarifa.getPrecio();
    }
}