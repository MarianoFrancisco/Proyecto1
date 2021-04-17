/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosAnimales;

import javax.swing.JOptionPane;
import static manejadorDatos.AlmacenamientoUsuarioAnimales.almacenamientoUsuarioAnimales;
import static manejadorDatos.EstablecerInstruccionesHilos.establecerInstruccionesHilos;

/**
 *
 * @author Mariano
 */
public class HiloVaca extends Thread{
    @Override  
    public void run() {
        almacenamientoUsuarioAnimales.setControladorPonerVaca(0);
        for ( int i = 0; i < 12; i++) {
            try {
                HiloVaca.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloVaca "+e);
            }
        }
        establecerInstruccionesHilos.setHiloVaca(2);
        JOptionPane.showMessageDialog(null,"Tu vaca esta listo para ser destazado, si no lo destazas en 10 seg valdrá queso");
        
    }
}
