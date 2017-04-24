import java.time.LocalDateTime;

public class Factura implements Fecha{
	
	// Atributos
	
	private int codigo;
	private Tarifa tarifa;
	private LocalDateTime fechaEmision;
	private LocalDateTime[] periodoFactura = new LocalDateTime[2];
	private int NIF;
	private float importe;
	
	// Constructor
	public Factura(){
		this.codigo = 0;
		this.tarifa = null;
		this.fechaEmision = null;
		this.periodoFactura = null;
		this.importe = 0;
		this.NIF = 0;
	}

	public Factura(int cod, Tarifa tarifa, LocalDateTime fechaEmision, LocalDateTime[] periodoFactura, float importe, int NIF){
		this.codigo = cod;
		this.tarifa = tarifa;
		this.fechaEmision = fechaEmision;
		this.periodoFactura = periodoFactura;
		this.importe = importe;
		this.NIF = NIF;
	}
	
	public LocalDateTime getFecha(){
		return fechaEmision;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(int nuevaTarifa) {
		this.tarifa.setPrecio(nuevaTarifa);
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDateTime[] getPeriodoFactura() {
		return periodoFactura;
	}

	public void setPeriodoFactura(LocalDateTime fechaInit, LocalDateTime fechaFin) {
	    this.periodoFactura[0] = fechaInit;
	    this.periodoFactura[1] = fechaFin;
	}

	public int getNIF() {
		return NIF;
	}

	public void setNIF(int nIF) {
		NIF = nIF;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

}
