import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Llamada {

	// Atributos
	
	private int tlfnDestino;
	private Date fechaHora;
	private int duracion;
	private int NIF;
	// Constructor

	public Llamada(int tlfnDestino, Date fechaHora, int duracion, int nif){
		
		this.tlfnDestino = tlfnDestino;
		this.fechaHora = fechaHora;
		this.duracion = duracion;
		this.NIF = nif;
		
	}
	
	
	public int getTlfnDestino() {
		return tlfnDestino;
	}

	public void setTlfnDestino(int tlfnDestino) {
		this.tlfnDestino = tlfnDestino;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getNIF() {
		return NIF;
	}

	public void setNIF(int nIF) {
		NIF = nIF;
	}

	public Date getFecha(){
		return fechaHora;
	}
}
