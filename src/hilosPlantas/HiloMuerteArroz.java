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
public class HiloMuerteArroz extends Thread{
    @Override  
    public void run() {
        try {
            HiloMuerteArroz.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuerteArroz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for ( int i = 0; i < 10; i++) {
            
            try {
                HiloMuerteArroz.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloMuerteArroz "+e);
            }        
        }
        if(establecerInstruccionesHilos.getHiloArroz()==2){
                establecerInstruccionesHilos.setHiloArroz(0);
        }
        if(establecerInstruccionesHilos.getHiloArroz()==0){
            JOptionPane.showMessageDialog(null,"Se hecho a perder la cosecha lo sentimos, la proxima tienes que estar mas atent@ uwu");
        }
        if(establecerInstruccionesHilos.getHiloArroz()==1){
            establecerInstruccionesHilos.setHiloArroz(0);
        }
    }
}
