package hilosPlantas;

import javax.swing.JOptionPane;
import static manejadorDatos.AlmacenamientoUsuarioPlantas.almacenamientoUsuarioPlantas;
import static manejadorDatos.EstablecerInstruccionesHilos.establecerInstruccionesHilos;

/**
 *
 * @author Mariano
 */
public class HiloMaizCosecha extends Thread{
    @Override  
    public void run() {
        almacenamientoUsuarioPlantas.setControladorSembrarMaiz(0);
        for ( int i = 0; i < 10; i++) {
            try {
                HiloMaizCosecha.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloCosechaMaiz "+e);
            }
        }
        establecerInstruccionesHilos.setHiloMaiz(2);
        JOptionPane.showMessageDialog(null,"La cosecha de maiz está hecha apurate, tienes 10 segundos para cosechar o pierdes tu cosecha");
        
    }
}