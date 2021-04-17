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
public class HiloMuerteLlama extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteLlama.sleep(15400);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteLlama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteLlama.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteLlama "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloLlama()==2){
                establecerInstruccionesHilos.setHiloLlama(0);
        }
        if(establecerInstruccionesHilos.getHiloLlama()==0){
            JOptionPane.showMessageDialog(null,"Se nos murio llama :c , la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloLlama()==1){
            establecerInstruccionesHilos.setHiloLlama(0);
        }
       
    }
}