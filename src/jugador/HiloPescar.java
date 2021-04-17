package jugador;

import hilosPlantas.HiloMaizCosecha;
import javax.swing.JOptionPane;
import static manejadorDatos.AlmacenamientoUsuarioAnimales.almacenamientoUsuarioAnimales;

/**
 *
 * @author Mariano
 */
public class HiloPescar extends Thread{
    @Override  
    public void run() {
        JOptionPane.showMessageDialog(null,"A pescar camarada :3");
        for ( int i = 0; i < almacenamientoUsuarioAnimales.getPecesDisponibles(); i++) {
            try {
                HiloMaizCosecha.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloCosechaMaiz "+e);
            }
            almacenamientoUsuarioAnimales.setUsuarioPeces(almacenamientoUsuarioAnimales.getUsuarioPeces()+1);
            JOptionPane.showMessageDialog(null,"Obtuviste 1 pez, que grande eres");
        }
        Jugador.jugador1.setEntradaVentas(Jugador.jugador1.getEntradaVentas()+almacenamientoUsuarioAnimales.getUsuarioPeces());
        JOptionPane.showMessageDialog(null,"Fin pezca, limpia la celda si quieres volver a pescar");
        
    }
}
