
public class Direccion {

	/*Atributos*/
	private int CP;
	private String provincia;
	private String poblacion;

	// constructor
	public Direccion(int CP, String provincia, String poblacion){
		this.CP=CP;
		this.provincia=provincia;
		this.poblacion=poblacion;
	}

    // getters
    public int getCP() {
        return CP;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPoblacion() {
        return poblacion;
    }


    // setters
    public void setCP(int CP) {
        this.CP = CP;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
}
