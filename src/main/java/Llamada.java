import java.time.LocalDateTime;

public class Llamada implements Fecha{

	// Atributos
	
	private int tlfnDestino;
	private LocalDateTime fechaHora;
	private int duracion;
	private int NIF;
	// Constructor

	public Llamada(int tlfnDestino, LocalDateTime fechaHora, int duracion, int nif){
		
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

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
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

	public LocalDateTime getFecha(){
		return fechaHora;
	}
}
