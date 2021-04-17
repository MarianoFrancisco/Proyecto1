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
public class HiloLlama extends Thread{
    @Override  
    public void run() {
        almacenamientoUsuarioAnimales.setControladorPonerLlama(0);
        for ( int i = 0; i < 11; i++) {
            try {
                HiloLlama.sleep(1400);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloLlama "+e);
            }
        }
        establecerInstruccionesHilos.setHiloLlama(2);
        JOptionPane.showMessageDialog(null,"Tu Llama esta lista para ser destazado, si no lo destazas en 10 seg valdrá queso");
    }
}