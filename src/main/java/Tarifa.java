
public class Tarifa {
	/*Atributos*/
	private float precio;

	public Tarifa(){this.precio = 0;}
	
	public Tarifa(float precio){
		this.precio = precio;
	}

	// QUIZA RETOCAR CON AMBAS TARIFAS
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(int precio2) {
		precio=precio2;
	}

}
