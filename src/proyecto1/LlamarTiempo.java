/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Mariano
 */
public class LlamarTiempo {
    private int llamarMinutos;
    private int llamarSegundos;
    private int llamarHoras;
    public static LlamarTiempo llamarTiempo;
    public LlamarTiempo(int llamarMinutos, int llamarSegundo0,int llamarHoras){
        this.llamarMinutos=llamarMinutos;
        this.llamarSegundos=llamarSegundos;
        this.llamarHoras=llamarHoras;
    }
    public int getLlamarMinutos() {
        return this.llamarMinutos;
    }

    public void setLlamarMinutos(int llamarMinutos) {
        this.llamarMinutos = llamarMinutos;
    }

    public int getLlamarSegundos() {
        return this.llamarSegundos;
    }

    public void setLlamarSegundos(int llamarSegundos) {
        this.llamarSegundos = llamarSegundos;
    }

    public int getLlamarHoras() {
        return this.llamarHoras;
    }

    public void setLlamarHoras(int llamarHoras) {
        this.llamarHoras = llamarHoras;
    }
    
    public static void tiempo(){
         llamarTiempo = new LlamarTiempo(0,0,0);
    }
}
