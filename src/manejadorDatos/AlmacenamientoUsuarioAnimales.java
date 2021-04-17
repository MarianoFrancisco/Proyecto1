package manejadorDatos;

import static instancias.FrameSeleccionCria.*;

/**
 *
 * @author Mariano
 */
public class AlmacenamientoUsuarioAnimales {
    private int totalCrias;
    private int criaCerdo;
    private int criaPavo;
    private int criaGallina;
    private int criaVaca;
    private int criaLlama;
    private int criaOveja;
    private int controladorPonerCerdo;
    private int controladorPonerPavo;
    private int controladorPonerGallina;
    private int controladorPonerVaca;
    private int controladorPonerLlama;
    private int controladorPonerOveja;
    private int usuarioPeces;
    private int precioPeces;
    private int pecesDisponibles;
    public static AlmacenamientoUsuarioAnimales almacenamientoUsuarioAnimales;
    public AlmacenamientoUsuarioAnimales(int totalCrias,int criaCerdo,int criaPavo,int criaGallina,int criaVaca,int criaLlama,int criaOveja, int controladorPonerCerdo,int controladorPonerPavo,int controladorPonerGallina,int controladorPonerVaca,int controladorPonerLlama,int controladorPonerOveja,int usuarioPeces,int precioPeces,int pecesDisponibles){
        this.totalCrias=totalCrias;
        this.criaCerdo=criaCerdo;
        this.criaPavo=criaPavo;
        this.criaGallina=criaGallina;
        this.criaVaca=criaVaca;
        this.criaLlama=criaLlama;
        this.criaOveja=criaOveja;
        this.controladorPonerCerdo=controladorPonerCerdo;
        this.controladorPonerPavo=controladorPonerPavo;
        this.controladorPonerCerdo=controladorPonerGallina;
        this.controladorPonerVaca=controladorPonerVaca;
        this.controladorPonerLlama=controladorPonerLlama;
        this.controladorPonerOveja=controladorPonerOveja;
        this.usuarioPeces=usuarioPeces;
        this.precioPeces=precioPeces;
        this.pecesDisponibles=pecesDisponibles;
    }

    public int getTotalCrias() {
        return this.totalCrias;
    }

    public void setTotalCrias(int totalCrias) {
        this.totalCrias = totalCrias;
    }
    
    public int getCriaCerdo() {
        return this.criaCerdo;
    }

    public void setCriaCerdo(int criaCerdo) {
        this.criaCerdo = criaCerdo;
    }

    public int getCriaPavo() {
        return this.criaPavo;
    }

    public void setCriaPavo(int criaPavo) {
        this.criaPavo = criaPavo;
    }

    public int getCriaGallina() {
        return this.criaGallina;
    }

    public void setCriaGallina(int criaGallina) {
        this.criaGallina = criaGallina;
    }

    public int getCriaVaca() {
        return this.criaVaca;
    }

    public void setCriaVaca(int criaVaca) {
        this.criaVaca = criaVaca;
    }

    public int getCriaLlama() {
        return this.criaLlama;
    }

    public void setCriaLlama(int criaLlama) {
        this.criaLlama = criaLlama;
    }

    public int getCriaOveja() {
        return this.criaOveja;
    }

    public void setCriaOveja(int criaOveja) {
        this.criaOveja = criaOveja;
    }

    public int getControladorPonerCerdo() {
        return this.controladorPonerCerdo;
    }

    public void setControladorPonerCerdo(int controladorPonerCerdo) {
        this.controladorPonerCerdo = controladorPonerCerdo;
    }

    public int getControladorPonerPavo() {
        return this.controladorPonerPavo;
    }

    public void setControladorPonerPavo(int controladorPonerPavo) {
        this.controladorPonerPavo = controladorPonerPavo;
    }

    public int getControladorPonerGallina() {
        return this.controladorPonerGallina;
    }

    public void setControladorPonerGallina(int controladorPonerGallina) {
        this.controladorPonerGallina = controladorPonerGallina;
    }

    public int getControladorPonerVaca() {
        return this.controladorPonerVaca;
    }

    public void setControladorPonerVaca(int controladorPonerVaca) {
        this.controladorPonerVaca = controladorPonerVaca;
    }

    public int getControladorPonerLlama() {
        return this.controladorPonerLlama;
    }

    public void setControladorPonerLlama(int controladorPonerLlama) {
        this.controladorPonerLlama = controladorPonerLlama;
    }

    public int getControladorPonerOveja() {
        return this.controladorPonerOveja;
    }

    public void setControladorPonerOveja(int controladorPonerOveja) {
        this.controladorPonerOveja = controladorPonerOveja;
    }
    public int getUsuarioPeces() {
        return this.usuarioPeces;
    }

    public void setUsuarioPeces(int usuarioPeces) {
        this.usuarioPeces = usuarioPeces;
    }

    public int getPrecioPeces() {
        return this.precioPeces;
    }

    public void setPrecioPeces(int precioPeces) {
        this.precioPeces = precioPeces;
    }

    public int getPecesDisponibles() {
        return pecesDisponibles;
    }

    public void setPecesDisponibles(int pecesDisponibles) {
        this.pecesDisponibles = pecesDisponibles;
    }
    
    public static void crearUsuarioAnimales(){
        almacenamientoUsuarioAnimales = new AlmacenamientoUsuarioAnimales(0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,3);
    }
    public static void sumarCerdos(){
        almacenamientoUsuarioAnimales.setCriaCerdo(almacenamientoUsuarioAnimales.getCriaCerdo()+1);
        EstablecerReportes.sumarCrias();
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()+1);
    }
    public static void sumarPavos(){
        almacenamientoUsuarioAnimales.setCriaPavo(almacenamientoUsuarioAnimales.getCriaPavo()+1);
        EstablecerReportes.sumarCrias();
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()+1);
    }
    public static void sumarGallinas(){
        almacenamientoUsuarioAnimales.setCriaGallina(almacenamientoUsuarioAnimales.getCriaGallina()+1);
        EstablecerReportes.sumarCrias();
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()+1);
    }
    public static void sumarVacas(){
        almacenamientoUsuarioAnimales.setCriaVaca(almacenamientoUsuarioAnimales.getCriaVaca()+1);
        EstablecerReportes.sumarCrias();
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()+1);
    }
    public static void sumarLlama(){
        almacenamientoUsuarioAnimales.setCriaLlama(almacenamientoUsuarioAnimales.getCriaLlama()+1);
        EstablecerReportes.sumarCrias();
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()+1);
    }
    public static void sumarOveja(){
        almacenamientoUsuarioAnimales.setCriaOveja(almacenamientoUsuarioAnimales.getCriaOveja()+1);
        EstablecerReportes.sumarCrias();
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()+1);
    }
    public static void restarCerdo(){
        almacenamientoUsuarioAnimales.setCriaCerdo(almacenamientoUsuarioAnimales.getCriaCerdo()-1);
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()-1);
    }
    public static void restarPavo(){
        almacenamientoUsuarioAnimales.setCriaPavo(almacenamientoUsuarioAnimales.getCriaPavo()-1);
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()-1);
    }
    public static void restarGallinas(){
        almacenamientoUsuarioAnimales.setCriaGallina(almacenamientoUsuarioAnimales.getCriaGallina()-1);
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()-1);
    }
    public static void restarVacas(){
        almacenamientoUsuarioAnimales.setCriaVaca(almacenamientoUsuarioAnimales.getCriaVaca()-1);
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()-1);
    }
    public static void restarLlama(){
        almacenamientoUsuarioAnimales.setCriaLlama(almacenamientoUsuarioAnimales.getCriaLlama()-1);
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()-1);
    }
    public static void restarOveja(){
        almacenamientoUsuarioAnimales.setCriaOveja(almacenamientoUsuarioAnimales.getCriaOveja()-1);
        almacenamientoUsuarioAnimales.setTotalCrias(almacenamientoUsuarioAnimales.getTotalCrias()-1);
    }
    public static void visibilidadSeleccionAnimales(){
        if(almacenamientoUsuarioAnimales.getCriaCerdo()==0){
            CerdoPonerjLabel5.setVisible(false);
            CerdoPonerjButton4.setVisible(false);
            CerdoTextojLabel7.setVisible(false);
            
        }
        if(almacenamientoUsuarioAnimales.getCriaPavo()==0){
            PavoPonerjLabel8.setVisible(false);
            PavoPonerjButton5.setVisible(false);
            PavoTextojLabel4.setVisible(false);
        }
        if(almacenamientoUsuarioAnimales.getCriaGallina()==0){
            PolloPonerjLabel6.setVisible(false);
            GallinaPonerjButton4.setVisible(false);
            GallinaTextojLabel3.setVisible(false);
        }
        if(almacenamientoUsuarioAnimales.getCriaVaca()==0){
            VacaPonerjLabel7.setVisible(false);
            VacaPonerjButton3.setVisible(false);
            VacaTextojLabel6.setVisible(false);
        }
        if(almacenamientoUsuarioAnimales.getCriaLlama()==0){
            LlamaPonerjLabel3.setVisible(false);
            LlamaPonerjButton2.setVisible(false);
            LlamaTextojLabel2.setVisible(false);
        }
        if(almacenamientoUsuarioAnimales.getCriaOveja()==0){
            OvejaPonerjLabel4.setVisible(false);
            OvejaPonerjButton3.setVisible(false);
            OvejaTextojLabel4.setVisible(false);
                    
        }
    }
}
