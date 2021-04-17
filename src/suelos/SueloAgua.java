package suelos;

import static instancias.InicializarSuelos.hiloPescar;
import jugador.HiloPescar;

/**
 *
 * @author Mariano
 */
public class SueloAgua extends Suelos{
    public SueloAgua() {
        super(0.35);
    }
    public static void Pesca(){
        hiloPescar = new HiloPescar();
        hiloPescar.start();
        
    }
    
}
