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
public class HiloMuerteCerdo extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteCerdo.sleep(20000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteCerdo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteCerdo.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteCerdo "+e);
            }
            
        }
        if(establecerInstruccionesHilos.getHiloCerdo()==2){
                establecerInstruccionesHilos.setHiloCerdo(0);
        }
        if(establecerInstruccionesHilos.getHiloCerdo()==0){
            JOptionPane.showMessageDialog(null,"Se nos murio el cerdo :c , la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloCerdo()==1){
            establecerInstruccionesHilos.setHiloCerdo(0);
        }
       
    }
}
