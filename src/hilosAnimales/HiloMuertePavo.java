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
public class HiloMuertePavo extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuertePavo.sleep(20000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuertePavo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuertePavo.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuertePavo "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloPavo()==2){
                establecerInstruccionesHilos.setHiloPavo(0);
        }
        if(establecerInstruccionesHilos.getHiloPavo()==0){
            JOptionPane.showMessageDialog(null,"Se nos murio el pavo :c , la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloPavo()==1){
            establecerInstruccionesHilos.setHiloPavo(0);
        }
       
    }
}
