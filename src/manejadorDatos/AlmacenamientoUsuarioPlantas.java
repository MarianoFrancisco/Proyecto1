package manejadorDatos;

import static instancias.FrameComer.*;
import static instancias.FrameSeleccionSiembra.*;
import static instancias.FrameVender.*;
import static manejadorDatos.AlmacenamientoUsuarioAlimentos.almacenamientoUsuarioAlimentos;
import static manejadorDatos.AlmacenamientoUsuarioAnimales.almacenamientoUsuarioAnimales;
import static manejadorDatos.AlmacenamientoUsuarioProductos.almacenamientoUsuarioProductos;
import static proyecto1.CrearAnimalesPlantas.*;
/**
 *
 * @author Mariano
 */
public class AlmacenamientoUsuarioPlantas {
    private int totalSemillas;
    private int semillaNaranjo;
    private int semillaBanano;
    private int semillaManzano;
    private int semillaMaiz;
    private int semillaFrijol;
    private int semillaArroz;
    private int controladorSembrarNaranjo;
    private int controladorSembrarBanano;
    private int controladorSembrarManzano;
    private int controladorSembrarMaiz;
    private int controladorSembrarFrijol;
    private int controladorSembrarArroz;
    public static AlmacenamientoUsuarioPlantas almacenamientoUsuarioPlantas;
    public AlmacenamientoUsuarioPlantas(int totalSemillas,int semillaNaranjo,int semillaBanano,int semillaManzano,int semillaMaiz,int semillaFrijol,int semillaArroz,int controladorSembrarNaranjo,int controladorSembrarBanano,int controladorSembrarManzano,int controladorSembrarMaiz,int controladorSembrarFrijol,int controladorSembrarArroz){
        this.totalSemillas=totalSemillas;
        this.semillaNaranjo=semillaNaranjo;
        this.semillaBanano=semillaBanano;
        this.semillaManzano=semillaManzano;
        this.semillaMaiz=semillaMaiz;
        this.semillaFrijol=semillaFrijol;
        this.semillaArroz=semillaArroz;
        this.controladorSembrarNaranjo=controladorSembrarNaranjo;
        this.controladorSembrarBanano=controladorSembrarBanano;
        this.controladorSembrarManzano=controladorSembrarMaiz;
        this.controladorSembrarFrijol=controladorSembrarFrijol;
        this.controladorSembrarArroz=controladorSembrarArroz;
    }

    public int getTotalSemillas() {
        return this.totalSemillas;
    }

    public void setTotalSemillas(int totalSemillas) {
        this.totalSemillas = totalSemillas;
    }
    
    public int getSemillaNaranjo() {
        return this.semillaNaranjo;
    }

    public void setSemillaNaranjo(int semillaNaranjo) {
        this.semillaNaranjo = semillaNaranjo;
    }

    public int getSemillaBanano() {
        return this.semillaBanano;
    }

    public void setSemillaBanano(int semillaBanano) {
        this.semillaBanano = semillaBanano;
    }

    public int getSemillaManzano() {
        return this.semillaManzano;
    }

    public void setSemillaManzano(int semillaManzano) {
        this.semillaManzano = semillaManzano;
    }

    public int getSemillaMaiz() {
        return this.semillaMaiz;
    }

    public void setSemillaMaiz(int semillaMaiz) {
        this.semillaMaiz = semillaMaiz;
    }

    public int getSemillaFrijol() {
        return this.semillaFrijol;
    }

    public void setSemillaFrijol(int semillaFrijol) {
        this.semillaFrijol = semillaFrijol;
    }

    public int getSemillaArroz() {
        return this.semillaArroz;
    }

    public void setSemillaArroz(int semillaArroz) {
        this.semillaArroz = semillaArroz;
    }

    public int getControladorSembrarNaranjo() {
        return this.controladorSembrarNaranjo;
    }

    public void setControladorSembrarNaranjo(int controladorSembrarNaranjo) {
        this.controladorSembrarNaranjo = controladorSembrarNaranjo;
    }

    public int getControladorSembrarBanano() {
        return this.controladorSembrarBanano;
    }

    public void setControladorSembrarBanano(int controladorSembrarBanano) {
        this.controladorSembrarBanano = controladorSembrarBanano;
    }

    public int getControladorSembrarManzano() {
        return this.controladorSembrarManzano;
    }

    public void setControladorSembrarManzano(int controladorSembrarManzano) {
        this.controladorSembrarManzano = controladorSembrarManzano;
    }

    public int getControladorSembrarMaiz() {
        return this.controladorSembrarMaiz;
    }

    public void setControladorSembrarMaiz(int controladorSembrarMaiz) {
        this.controladorSembrarMaiz = controladorSembrarMaiz;
    }

    public int getControladorSembrarFrijol() {
        return this.controladorSembrarFrijol;
    }

    public void setControladorSembrarFrijol(int controladorSembrarFrijol) {
        this.controladorSembrarFrijol = controladorSembrarFrijol;
    }

    public int getControladorSembrarArroz() {
        return this.controladorSembrarArroz;
    }

    public void setControladorSembrarArroz(int controladorSembrarArroz) {
        this.controladorSembrarArroz = controladorSembrarArroz;
    }
    
    public static void crearUsuarioPlantas(){
        almacenamientoUsuarioPlantas=new AlmacenamientoUsuarioPlantas(0,0,0,0,0,0,0,0,0,0,0,0,0);
    }
    public static void sumarBanano(){
        almacenamientoUsuarioPlantas.setSemillaBanano(almacenamientoUsuarioPlantas.getSemillaBanano()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarManzano(){
        almacenamientoUsuarioPlantas.setSemillaManzano(almacenamientoUsuarioPlantas.getSemillaManzano()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarMaiz(){
        almacenamientoUsuarioPlantas.setSemillaMaiz(almacenamientoUsuarioPlantas.getSemillaMaiz()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarNaranjo(){
        almacenamientoUsuarioPlantas.setSemillaNaranjo(almacenamientoUsuarioPlantas.getSemillaNaranjo()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarFrjol(){
        almacenamientoUsuarioPlantas.setSemillaFrijol(almacenamientoUsuarioPlantas.getSemillaFrijol()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarArroz(){
        almacenamientoUsuarioPlantas.setSemillaArroz(almacenamientoUsuarioPlantas.getSemillaArroz()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    
    //Resta
    
    public static void restarBanano(){
        almacenamientoUsuarioPlantas.setSemillaBanano(almacenamientoUsuarioPlantas.getSemillaBanano()-plantas[5].getSemillasNecesariasSembrar());
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-plantas[5].getSemillasNecesariasSembrar());
    }
    public static void restarManzano(){
        almacenamientoUsuarioPlantas.setSemillaManzano(almacenamientoUsuarioPlantas.getSemillaManzano()-plantas[3].getSemillasNecesariasSembrar());
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-plantas[3].getSemillasNecesariasSembrar());
    }
    public static void restarMaiz(){
        almacenamientoUsuarioPlantas.setSemillaMaiz(almacenamientoUsuarioPlantas.getSemillaMaiz()-plantas[0].getSemillasNecesariasSembrar());
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-plantas[0].getSemillasNecesariasSembrar());
    }
    public static void restarNaranjo(){
        almacenamientoUsuarioPlantas.setSemillaNaranjo(almacenamientoUsuarioPlantas.getSemillaNaranjo()-plantas[4].getSemillasNecesariasSembrar());
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-plantas[4].getSemillasNecesariasSembrar());
    }
    public static void restarFrijol(){
        almacenamientoUsuarioPlantas.setSemillaFrijol(almacenamientoUsuarioPlantas.getSemillaFrijol()-plantas[1].getSemillasNecesariasSembrar());
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-plantas[1].getSemillasNecesariasSembrar());
    }
    public static void restarArroz(){
        almacenamientoUsuarioPlantas.setSemillaArroz(almacenamientoUsuarioPlantas.getSemillaArroz()-plantas[2].getSemillasNecesariasSembrar());
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-plantas[2].getSemillasNecesariasSembrar());
    }
    public static void visibilidadCompra(){
        if(almacenamientoUsuarioPlantas.getSemillaFrijol()==0){
            FrijoljSembrarButton2.setVisible(false);
            FrijolSembrarjLabel3.setVisible(false);
            FrijolSembrarjLabel5.setVisible(false);
            FrijolSembrarjLabel4.setVisible(false);
        }
        if(almacenamientoUsuarioPlantas.getSemillaArroz()==0){
            ArrozSembrarjButton1.setVisible(false);
            ArrozSembrarjLabel1.setVisible(false);
            ArrozSembrarjLabel2.setVisible(false);
            ArrozSembrarjLabel3.setVisible(false);
        }  
        if(almacenamientoUsuarioPlantas.getSemillaNaranjo()==0){
            NaranjoSembrarjButton3.setVisible(false);
            NaranjoSembrarjLabel3.setVisible(false);
            NaranjoSembrarjLabel4.setVisible(false);
            NaranjoSembrarjLabel5.setVisible(false);
        }
        if(almacenamientoUsuarioPlantas.getSemillaBanano()==0){
            BananoSembrarjButton4.setVisible(false);
            BananoSembrarjLabel6.setVisible(false);
            BananoSembrarjLabel7.setVisible(false);
            BananoSembrarjLabel8.setVisible(false);
        }
        if(almacenamientoUsuarioPlantas.getSemillaMaiz()==0){
            MaizSembrarjButton2.setVisible(false);
            MaizSembrarjLabel2.setVisible(false);
            MaizSembrarjLabel3.setVisible(false);
            MaizSembrarjLabel4.setVisible(false);
        }
        if(almacenamientoUsuarioPlantas.getSemillaManzano()==0){
            ManzanoSembrarjButton3.setVisible(false);
            ManzanoSembrarjLabel5.setVisible(false);
            ManzanoSembrarjLabel6.setVisible(false);
            ManzanoSembrarjLabel7.setVisible(false);
        }
        
    }
    public static void visibilidadVender(){
        if(almacenamientoUsuarioProductos.getUsuarioFrijol()==0){
            VFrijoljSembrarButton2.setVisible(false);
            VFrijolSembrarjLabel3.setVisible(false);
        }
        
        if(almacenamientoUsuarioProductos.getUsuarioArroz()==0){
            VArrozSembrarjButton1.setVisible(false);
            VArrozSembrarjLabel1.setVisible(false);
        }  
        if(almacenamientoUsuarioAlimentos.getUsuarioNaranjo()==0){
            VNaranjoSembrarjButton3.setVisible(false);
            VNaranjoSembrarjLabel3.setVisible(false);
        }
        if(almacenamientoUsuarioAlimentos.getUsuarioBanano()==0){
            VBananoSembrarjButton4.setVisible(false);
            VBananoSembrarjLabel6.setVisible(false);

        }
        if(almacenamientoUsuarioProductos.getUsuarioMaiz()==0){
            VMaizSembrarjButton2.setVisible(false);
            VMaizSembrarjLabel2.setVisible(false);

        }
        if(almacenamientoUsuarioAlimentos.getUsuarioManzano()==0){
            VManzanoSembrarjButton3.setVisible(false);
            VManzanoSembrarjLabel5.setVisible(false);
        }
        if(almacenamientoUsuarioAnimales.getUsuarioPeces()==0){
            pescarjButton5.setVisible(false);
            PescadojLabel7.setVisible(false);
        }
        //------------------------------------------------------
        if(almacenamientoUsuarioAlimentos.getUsuarioLlama()==0){
            VFrijoljSembrarButton3.setVisible(false);
            VFrijolSembrarjLabel4.setVisible(false);
        }
        
        if(almacenamientoUsuarioAlimentos.getUsuarioVaca()==0){
            VArrozSembrarjButton2.setVisible(false);
            VArrozSembrarjLabel2.setVisible(false);
        }  
        if(almacenamientoUsuarioAlimentos.getUsuarioCerdo()==0){
            VNaranjoSembrarjButton4.setVisible(false);
            VNaranjoSembrarjLabel4.setVisible(false);
        }
        if(almacenamientoUsuarioAlimentos.getUsuarioGallina()==0){
            VBananoSembrarjButton5.setVisible(false);
            VBananoSembrarjLabel7.setVisible(false);

        }
        if(almacenamientoUsuarioAlimentos.getUsuarioOveja()==0){
            VMaizSembrarjButton3.setVisible(false);
            VMaizSembrarjLabel3.setVisible(false);

        }
        if(almacenamientoUsuarioAlimentos.getUsuarioPavo()==0){
            VManzanoSembrarjButton4.setVisible(false);
            VManzanoSembrarjLabel6.setVisible(false);
        }
    }
    public static void visibilidadComer(){
        if(almacenamientoUsuarioAlimentos.getUsuarioBanano()==0){
            ZBananoSembrarjButton4.setVisible(false);
            ZBananoSembrarjLabel6.setVisible(false);

        }
        if(almacenamientoUsuarioAlimentos.getUsuarioNaranjo()==0){
            ZNaranjoSembrarjButton3.setVisible(false);
            ZNaranjoSembrarjLabel3.setVisible(false);
        }
        if(almacenamientoUsuarioAlimentos.getUsuarioManzano()==0){
            ZManzanoSembrarjButton3.setVisible(false);
            ZManzanoSembrarjLabel5.setVisible(false);
        }
        if(almacenamientoUsuarioAnimales.getUsuarioPeces()==0){
            ZpescarjButton5.setVisible(false);
            ZPescadojLabel7.setVisible(false);
        }
        //------------------------------------------------------
        if(almacenamientoUsuarioAlimentos.getUsuarioLlama()==0){
            ZFrijoljSembrarButton3.setVisible(false);
            ZFrijolSembrarjLabel4.setVisible(false);
        }
        
        if(almacenamientoUsuarioAlimentos.getUsuarioVaca()==0){
            ZArrozSembrarjButton2.setVisible(false);
            ZArrozSembrarjLabel2.setVisible(false);
        }  
        if(almacenamientoUsuarioAlimentos.getUsuarioCerdo()==0){
            ZNaranjoSembrarjButton4.setVisible(false);
            ZNaranjoSembrarjLabel4.setVisible(false);
        }
        if(almacenamientoUsuarioAlimentos.getUsuarioGallina()==0){
            ZBananoSembrarjButton5.setVisible(false);
            ZBananoSembrarjLabel7.setVisible(false);

        }
        if(almacenamientoUsuarioAlimentos.getUsuarioOveja()==0){
            ZMaizSembrarjButton3.setVisible(false);
            ZMaizSembrarjLabel3.setVisible(false);

        }
        if(almacenamientoUsuarioAlimentos.getUsuarioPavo()==0){
            ZManzanoSembrarjButton4.setVisible(false);
            ZManzanoSembrarjLabel6.setVisible(false);
        }
    }
}
