/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosAnimales;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static manejadorDatos.EstablecerInstruccionesHilos.establecerInstruccionesHilos;

/**
 *
 * @author Mariano
 */
public class HiloMuerteVaca extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteVaca.sleep(24000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteVaca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteVaca.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteVaca "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloVaca()==2){
                establecerInstruccionesHilos.setHiloVaca(0);
        }
        if(establecerInstruccionesHilos.getHiloVaca()==0){
            JOptionPane.showMessageDialog(null,"Se nos murio el vaca :c , la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloVaca()==1){
            establecerInstruccionesHilos.setHiloVaca(0);
        }
       
    }
}
