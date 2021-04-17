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
public class HiloCerdo extends Thread{
    @Override  
    public void run() {
        almacenamientoUsuarioAnimales.setControladorPonerCerdo(0);
        for ( int i = 0; i < 10; i++) {
            try {
                HiloCerdo.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloCerdo "+e);
            }
        }
        establecerInstruccionesHilos.setHiloCerdo(2);
        JOptionPane.showMessageDialog(null,"Tu cerdo esta listo para ser destazado, si no lo destazas en 10 seg valdrá queso");
        
    }
}
