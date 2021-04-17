/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class AlmacenamientoUsuarioAlimentos {
    private int usuarioManzano;
    private int usuarioNaranjo;
    private int usuarioBanano;
    private int usuarioCerdo;
    private int usuarioPavo;
    private int usuarioGallina;
    private int usuarioVaca;
    private int usuarioLlama;
    private int usuarioOveja;

    public static AlmacenamientoUsuarioAlimentos almacenamientoUsuarioAlimentos;
    public AlmacenamientoUsuarioAlimentos(int usuarioManzano,int usuarioNaranjo,int usuarioBanano,int usuarioCerdo,int usuarioPavo,int usuarioGallina,int usuarioVaca,int usuarioLlama,int usuarioOveja){
        this.usuarioManzano=usuarioManzano;
        this.usuarioNaranjo=usuarioNaranjo;
        this.usuarioBanano=usuarioBanano;
        this.usuarioCerdo=usuarioCerdo;
        this.usuarioPavo=usuarioPavo;
        this.usuarioGallina=usuarioGallina;
        this.usuarioVaca=usuarioVaca;
        this.usuarioLlama=usuarioLlama;
        this.usuarioOveja=usuarioOveja;
    }

    public int getUsuarioManzano() {
        return this.usuarioManzano;
    }

    public void setUsuarioManzano(int usuarioManzano) {
        this.usuarioManzano = usuarioManzano;
    }

    public int getUsuarioNaranjo() {
        return this.usuarioNaranjo;
    }

    public void setUsuarioNaranjo(int usuarioNaranjo) {
        this.usuarioNaranjo = usuarioNaranjo;
    }

    public int getUsuarioBanano() {
        return this.usuarioBanano;
    }

    public void setUsuarioBanano(int usuarioBanano) {
        this.usuarioBanano = usuarioBanano;
    }

    public int getUsuarioCerdo() {
        return this.usuarioCerdo;
    }

    public void setUsuarioCerdo(int usuarioCerdo) {
        this.usuarioCerdo = usuarioCerdo;
    }

    public int getUsuarioPavo() {
        return this.usuarioPavo;
    }

    public void setUsuarioPavo(int usuarioPavo) {
        this.usuarioPavo = usuarioPavo;
    }

    public int getUsuarioGallina() {
        return this.usuarioGallina;
    }

    public void setUsuarioGallina(int usuarioGallina) {
        this.usuarioGallina = usuarioGallina;
    }

    public int getUsuarioVaca() {
        return this.usuarioVaca;
    }

    public void setUsuarioVaca(int usuarioVaca) {
        this.usuarioVaca = usuarioVaca;
    }

    public int getUsuarioLlama() {
        return this.usuarioLlama;
    }

    public void setUsuarioLlama(int usuarioLlama) {
        this.usuarioLlama = usuarioLlama;
    }

    public int getUsuarioOveja() {
        return this.usuarioOveja;
    }

    public void setUsuarioOveja(int usuarioOveja) {
        this.usuarioOveja = usuarioOveja;
    }
    
    public static void crearAlmacenamientoUsAnimales(){
        almacenamientoUsuarioAlimentos = new AlmacenamientoUsuarioAlimentos(0,0,0,0,0,0,0,0,0);
    }
}
