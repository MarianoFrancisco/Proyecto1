/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import static instancias.FrameGranja.*;
import jugador.*;

/**
 *
 * @author Mariano
 */
public class Tiempo extends Thread{
    int minutos=0;
    int segundos=0;
    @Override
    public void run() {
        int infinito=0;
        while(infinito==0){
            for (minutos = 0;  minutos< 60; minutos++) {
                for (segundos = 0; segundos < 60; segundos++) {
                    LlamarTiempo.llamarTiempo.setLlamarMinutos(minutos);
                    LlamarTiempo.llamarTiempo.setLlamarSegundos(segundos);  
                    try{
                    OrojLabel2.setText(""+Jugador.jugador1.getMonedas());
                    Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println("Error en inicio tiempo "+ e);
                    }
                }
            }
            LlamarTiempo.llamarTiempo.setLlamarHoras(LlamarTiempo.llamarTiempo.getLlamarHoras()+1);
        }
            
    }
    
}
