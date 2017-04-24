/**
 * Created by Andres on 23/04/2017.
 */
public class TarifaEntreHoras extends Tarifa {

    //ENTRE LAS 16:00 Y LAS 20:00 LA TARIFA SERÁ X CENTIMOS/MINUTO


    private Tarifa tarifa;

    public TarifaEntreHoras(Tarifa tari, float precioNuevo){
        super(precioNuevo);
        this.tarifa = tari;
    }



    @Override

    public float getPrecio(){
        return super.getPrecio();
    }


}
