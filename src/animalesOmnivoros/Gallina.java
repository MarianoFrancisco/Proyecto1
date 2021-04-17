package animalesOmnivoros;
import estructuraAnimales.*;
/**
 *
 * @author Mariano
 */
public class Gallina extends Animales implements Omnivoros{

    public Gallina() {//genera huevos
        super("Gallina",45,5,20,1,7);
    }
    @Override
    public void ProduccionDestace() {
        
    }

    @Override
    public void ProduccionSinDestace() {
        
    }

    @Override
    public void comerCarne() {
        
    }

    @Override
    public void comerPlantas() {
        
    }
    
}
