/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosPlantas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static manejadorDatos.EstablecerInstruccionesHilos.establecerInstruccionesHilos;

/**
 *
 * @author Mariano
 */
public class HiloMuerteManzano extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteManzano.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteManzano.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteManzano.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteManzano "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloManzano()==2){
                establecerInstruccionesHilos.setHiloManzano(0);
        }
        if(establecerInstruccionesHilos.getHiloManzano()==0){
            JOptionPane.showMessageDialog(null,"Se hecho a perder la cosecha lo sentimos, la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloManzano()==1){
            establecerInstruccionesHilos.setHiloManzano(0);
        }
       
    }
}
