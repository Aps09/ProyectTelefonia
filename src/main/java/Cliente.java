import java.time.LocalDateTime;

public class Cliente implements Fecha{
	
	/*Atributos*/
	
	private String nombre;
	private String NIF;
	private Direccion direccion;
	private String correo;
	private LocalDateTime fechaAlta;
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

	public Cliente (String nom, String nif, Direccion direc, String correu, LocalDateTime dataAlta, Tarifa tarifa){
		this.nombre = nom;
		this.NIF = nif;
		this.direccion = direc;
		this.correo = correu;
		this.fechaAlta = dataAlta;
		this.tarifa = tarifa;
	}
	
	public LocalDateTime getFecha(){
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

    public void setFechaAlta(LocalDateTime fechaAlta) {
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

    public float getTarifa() {
        return tarifa.getPrecio();
    }
}