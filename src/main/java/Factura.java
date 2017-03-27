import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Factura {
	
	// Atributos
	
	private int codigo;
	private Tarifa tarifa;
	private Date fechaEmision;
	private Date[] periodoFactura = new Date[2];
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

	public Factura(int cod, Tarifa tarifa, Date fechaEmision, Date[] periodoFactura, float importe, int NIF){
		this.codigo = cod;
		this.tarifa = tarifa;
		this.fechaEmision = fechaEmision;
		this.periodoFactura = periodoFactura;
		this.importe = importe;
		this.NIF = NIF;
	}
	
	public Date getFecha(){
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

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date[] getPeriodoFactura() {
		return periodoFactura;
	}

	public void setPeriodoFactura(Date fechaInit, Date fechaFin) {
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
