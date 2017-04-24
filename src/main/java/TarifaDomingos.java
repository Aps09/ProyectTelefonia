/**
 * Created by Andres on 23/04/2017.
 */
public class TarifaDomingos extends Tarifa{

    //LOS DOMINGOS SALEN GRATIS, PRECIO 0


    private Tarifa tarifa;

    public TarifaDomingos(Tarifa tari, float nuevoPrecio){
        super(nuevoPrecio);
        this.tarifa = tari;
    }



    @Override

    public float getPrecio(){
        return 0;
    }

}
