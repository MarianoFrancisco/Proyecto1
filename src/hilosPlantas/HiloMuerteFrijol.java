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
public class HiloMuerteFrijol extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteFrijol.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteFrijol.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteFrijol.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteFrijol "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloFrijol()==2){
                establecerInstruccionesHilos.setHiloFrijol(0);
        }
        if(establecerInstruccionesHilos.getHiloFrijol()==0){
            JOptionPane.showMessageDialog(null,"Se hecho a perder la cosecha lo sentimos, la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloFrijol()==1){
            establecerInstruccionesHilos.setHiloFrijol(0);
        }
    }
}
