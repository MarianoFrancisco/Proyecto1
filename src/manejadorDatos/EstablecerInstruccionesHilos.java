package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class EstablecerInstruccionesHilos {
    private int hiloMaiz;
    private int hiloFrijol;
    private int hiloArroz;
    private int hiloManzano;
    private int hiloNaranjo;
    private int hiloBanano;
    private int hiloCerdo;
    private int hiloGallina;
    private int hiloPavo;
    private int hiloVaca;
    private int hiloOveja;
    private int hiloLlama;
    public static EstablecerInstruccionesHilos establecerInstruccionesHilos;
    public EstablecerInstruccionesHilos(int hiloMaiz,int hiloFrijol,int hiloArroz,int hiloManzano,int hiloNaranjo,int hiloBanano,int hiloCerdo,int hiloGallina,int hiloPavo,int hiloVaca,int hiloOveja,int hiloLlama){
        this.hiloMaiz=hiloMaiz;
        this.hiloFrijol=hiloFrijol;
        this.hiloArroz=hiloArroz;
        this.hiloManzano=hiloManzano;
        this.hiloNaranjo=hiloNaranjo;
        this.hiloBanano=hiloBanano;
        this.hiloCerdo=hiloCerdo;
        this.hiloGallina=hiloGallina;
        this.hiloPavo=hiloPavo;
        this.hiloVaca=hiloVaca;
        this.hiloOveja=hiloOveja;
        this.hiloLlama=hiloLlama;
    }

    public int getHiloMaiz() {
        return this.hiloMaiz;
    }

    public void setHiloMaiz(int hiloMaiz) {
        this.hiloMaiz = hiloMaiz;
    }

    public int getHiloFrijol() {
        return this.hiloFrijol;
    }

    public void setHiloFrijol(int hiloFrijol) {
        this.hiloFrijol = hiloFrijol;
    }

    public int getHiloArroz() {
        return this.hiloArroz;
    }

    public void setHiloArroz(int hiloArroz) {
        this.hiloArroz = hiloArroz;
    }

    public int getHiloManzano() {
        return this.hiloManzano;
    }

    public void setHiloManzano(int hiloManzano) {
        this.hiloManzano = hiloManzano;
    }

    public int getHiloNaranjo() {
        return this.hiloNaranjo;
    }

    public void setHiloNaranjo(int hiloNaranjo) {
        this.hiloNaranjo = hiloNaranjo;
    }

    public int getHiloBanano() {
        return this.hiloBanano;
    }

    public void setHiloBanano(int hiloBanano) {
        this.hiloBanano = hiloBanano;
    }

    public int getHiloCerdo() {
        return this.hiloCerdo;
    }

    public void setHiloCerdo(int hiloCerdo) {
        this.hiloCerdo = hiloCerdo;
    }

    public int getHiloGallina() {
        return this.hiloGallina;
    }

    public void setHiloGallina(int hiloGallina) {
        this.hiloGallina = hiloGallina;
    }

    public int getHiloPavo() {
        return this.hiloPavo;
    }

    public void setHiloPavo(int hiloPavo) {
        this.hiloPavo = hiloPavo;
    }

    public int getHiloVaca() {
        return this.hiloVaca;
    }

    public void setHiloVaca(int hiloVaca) {
        this.hiloVaca = hiloVaca;
    }

    public int getHiloOveja() {
        return this.hiloOveja;
    }

    public void setHiloOveja(int hiloOveja) {
        this.hiloOveja = hiloOveja;
    }

    public int getHiloLlama() {
        return this.hiloLlama;
    }

    public void setHiloLlama(int hiloLlama) {
        this.hiloLlama = hiloLlama;
    }
    
    public static void crearEstablecerInstrucHilos(){
         establecerInstruccionesHilos = new EstablecerInstruccionesHilos(0,0,0,0,0,0,0,0,0,0,0,0);
    }
}
