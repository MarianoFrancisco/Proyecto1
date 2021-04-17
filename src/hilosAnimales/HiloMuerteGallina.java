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
public class HiloMuerteGallina extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteGallina.sleep(15000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteGallina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteGallina.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteGallina "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloGallina()==2){
                establecerInstruccionesHilos.setHiloGallina(0);
        }
        if(establecerInstruccionesHilos.getHiloGallina()==0){
            JOptionPane.showMessageDialog(null,"Se nos murio la gallina :c , la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloGallina()==1){
            establecerInstruccionesHilos.setHiloGallina(0);
        }
       
    }
}
