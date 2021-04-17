package estructuraPlantas;

import static manejadorDatos.AlmacenamientoUsuarioAnimales.almacenamientoUsuarioAnimales;


/**
 *
 * @author Mariano
 */
public class HiloCosecha extends Thread{
    
    int i;
    @Override  
    public void run() {
        System.out.println("---------------------------");
        for ( i = 0; i < almacenamientoUsuarioAnimales.getPecesDisponibles(); i++) {
            try {
                HiloCosecha.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloCosecha "+e);
            }
            almacenamientoUsuarioAnimales.setUsuarioPeces(almacenamientoUsuarioAnimales.getUsuarioPeces()+1);
        }
        System.out.println("Empieza Hilo dos");
        
    }

}
