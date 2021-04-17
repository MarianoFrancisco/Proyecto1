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
public class HiloMuerteOveja extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteOveja.sleep(21600);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteOveja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteOveja.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteOveja "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloOveja()==2){
                establecerInstruccionesHilos.setHiloOveja(0);
        }
        if(establecerInstruccionesHilos.getHiloOveja()==0){
            JOptionPane.showMessageDialog(null,"Se nos murio el oveja :c , la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloOveja()==1){
            establecerInstruccionesHilos.setHiloOveja(0);
        }
       
    }
}
