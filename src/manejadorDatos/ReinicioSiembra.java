package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class ReinicioSiembra {
    private int maiz=0;
    public static ReinicioSiembra reinicioSiembra;
    public ReinicioSiembra(int maiz){
        this.maiz=maiz;
    }

    public int getMaiz() {
        return maiz;
    }

    public void setMaiz(int maiz) {
        this.maiz = maiz;
    }
    public static void crearValoresCambioImagenSiembra(){
        reinicioSiembra = new ReinicioSiembra(0);
    }
}
