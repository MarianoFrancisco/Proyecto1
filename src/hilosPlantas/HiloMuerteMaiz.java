package hilosPlantas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static manejadorDatos.EstablecerInstruccionesHilos.establecerInstruccionesHilos;




/**
 *
 * @author Mariano
 */
public class HiloMuerteMaiz extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteMaiz.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteMaiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteMaiz.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteMaiz "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloMaiz()==2){
                establecerInstruccionesHilos.setHiloMaiz(0);
        }
        if(establecerInstruccionesHilos.getHiloMaiz()==0){
            JOptionPane.showMessageDialog(null,"Se hecho a perder la cosecha lo sentimos, la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloMaiz()==1){
            establecerInstruccionesHilos.setHiloMaiz(0);
        }
       
    }
}
