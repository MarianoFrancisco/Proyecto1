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
public class AlmacenamientoUsuarioComidas {
    private int hojas;
    private int hongos;
    private int hierba;
    private int bambu;
    private int carnes;
    private int concentrado;
    private int totalComidaAnimal;
    public static AlmacenamientoUsuarioComidas almacenamientoUsuarioComidas;
    public AlmacenamientoUsuarioComidas(int hojas,int hongos,int hierba,int bambu,int carnes,int concentrado,int totalComidaAnimal){
        this.hojas=hojas;
        this.hongos=hongos;
        this.hierba=hierba;
        this.bambu=bambu;
        this.carnes=carnes;
        this.concentrado=concentrado;
        this.totalComidaAnimal=totalComidaAnimal;
    }

    public int getHojas() {
        return this.hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    public int getHongos() {
        return this.hongos;
    }

    public void setHongos(int hongos) {
        this.hongos = hongos;
    }

    public int getHierba() {
        return this.hierba;
    }

    public void setHierba(int hierba) {
        this.hierba = hierba;
    }

    public int getBambu() {
        return this.bambu;
    }

    public void setBambu(int bambu) {
        this.bambu = bambu;
    }

    public int getCarnes() {
        return this.carnes;
    }

    public void setCarnes(int carnes) {
        this.carnes = carnes;
    }

    public int getConcentrado() {
        return this.concentrado;
    }

    public void setConcentrado(int concentrado) {
        this.concentrado = concentrado;
        
    }

    public int getTotalComidaAnimal() {
        return this.totalComidaAnimal;
    }

    public void setTotalComidaAnimal(int totalComidaAnimal) {
        this.totalComidaAnimal = totalComidaAnimal;
    }
    
    public static void crearUsuarioComidas(){
        almacenamientoUsuarioComidas = new AlmacenamientoUsuarioComidas(0,0,0,0,0,0,0);
    }
    public static void sumarTotal(){
        almacenamientoUsuarioComidas.setTotalComidaAnimal(almacenamientoUsuarioComidas.getTotalComidaAnimal()+1);
    }
    public static void sumarHojas(){
        almacenamientoUsuarioComidas.setHojas(almacenamientoUsuarioComidas.getHojas()+1);
        EstablecerReportes.sumarComidaHerviboroComprada();
    }
    public static void sumarHongos(){
        almacenamientoUsuarioComidas.setHongos(almacenamientoUsuarioComidas.getHongos()+1);
        EstablecerReportes.sumarComidaHerviboroComprada();
    }
    public static void sumarHierba(){
        almacenamientoUsuarioComidas.setHierba(almacenamientoUsuarioComidas.getHierba()+1);
        EstablecerReportes.sumarComidaHerviboroComprada();
    }
    public static void sumarBambu(){
        almacenamientoUsuarioComidas.setBambu(almacenamientoUsuarioComidas.getBambu()+1);
        EstablecerReportes.sumarComidaOmnivoroComprada();
    }
    public static void sumarCarnes(){
        almacenamientoUsuarioComidas.setCarnes(almacenamientoUsuarioComidas.getCarnes()+1);
        EstablecerReportes.sumarComidaOmnivoroComprada();
    }
    public static void sumarConcentrado(){
        almacenamientoUsuarioComidas.setConcentrado(almacenamientoUsuarioComidas.getConcentrado()+1);
        EstablecerReportes.sumarComidaOmnivoroComprada();
    }
}
