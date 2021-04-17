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
public class HiloOveja extends Thread{
    @Override  
    public void run() {
        almacenamientoUsuarioAnimales.setControladorPonerOveja(0);
        for ( int i = 0; i < 12; i++) {
            try {
                HiloOveja.sleep(1800);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloOveja "+e);
            }
        }
        establecerInstruccionesHilos.setHiloOveja(2);
        JOptionPane.showMessageDialog(null,"Tu oveja esta lista para ser destazada, si no lo destazas en 10 seg valdrá queso");        
    }
}
