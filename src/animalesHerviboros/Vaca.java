package animalesHerviboros;
import estructuraAnimales.*;
/**
 *
 * @author Mariano
 */
public class Vaca extends Animales implements Herviboros{
    private int lecheGenerada;
    private int precioLeche;
    public Vaca(int lecheGenerada,int precioLeche) {//genera cuero y genera leche
        super("Vaca",220,15,8,7,9);
        this.lecheGenerada=lecheGenerada;
        this.precioLeche=precioLeche;
    }

    @Override
    public void ProduccionDestace() {
        
    }
    @Override
    public void ProduccionSinDestace() {
        
    }
    @Override
    public void comerPlantas() {
        
    }

    public int getLecheGenerada() {
        return this.lecheGenerada;
    }

    public void setLecheGenerada(int lecheGenerada) {
        this.lecheGenerada = lecheGenerada;
    }

    public int getPrecioLeche() {
        return this.precioLeche;
    }

    public void setPrecioLeche(int precioLeche) {
        this.precioLeche = precioLeche;
    }
    
}
