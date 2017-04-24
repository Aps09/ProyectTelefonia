/**
 * Created by Andres on 22/04/2017.
 */
public class FechaIncorrecta extends Exception {

    public FechaIncorrecta(){
        super("Error. La primera fecha debe ser menor que la segunda.");
    }
}
