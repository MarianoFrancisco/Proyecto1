package suelos;
import hilosAnimales.*;
import hilosPlantas.*;
import static instancias.InicializarSuelos.*;
import static manejadorDatos.AlmacenamientoUsuarioAnimales.almacenamientoUsuarioAnimales;
import static manejadorDatos.AlmacenamientoUsuarioPlantas.almacenamientoUsuarioPlantas;
/**
 *
 * @author Mariano
 */
public class SueloGrama extends Suelos{
    
    public SueloGrama() {
        super(0.4);
    }
    public static void Siembra() throws InterruptedException{
        if(almacenamientoUsuarioPlantas.getControladorSembrarMaiz()>=5){
            hiloMaizCosecha = new HiloMaizCosecha();
            hiloMaizCosecha.start();
            hiloMuerteMaiz = new HiloMuerteMaiz();    
            hiloMuerteMaiz.start();
            almacenamientoUsuarioPlantas.setControladorSembrarMaiz(0);
        }
        if(almacenamientoUsuarioPlantas.getControladorSembrarFrijol()>=8){
            hiloFrijolCosecha = new HiloFrijolCosecha();
            hiloFrijolCosecha.start();
            hiloMuerteFrijol = new HiloMuerteFrijol();    
            hiloMuerteFrijol.start();
            almacenamientoUsuarioPlantas.setControladorSembrarFrijol(0);
        }
        if(almacenamientoUsuarioPlantas.getControladorSembrarArroz()>=8){
            hiloArrozCosecha = new HiloArrozCosecha();
            hiloArrozCosecha.start();
            hiloMuerteArroz = new HiloMuerteArroz();    
            hiloMuerteArroz.start();
            almacenamientoUsuarioPlantas.setControladorSembrarArroz(0);
        }
        if(almacenamientoUsuarioPlantas.getControladorSembrarManzano()>=3){
            hiloManzanoCosecha = new HiloManzanoCosecha();
            hiloManzanoCosecha.start();
            hiloMuerteManzano = new HiloMuerteManzano();    
            hiloMuerteManzano.start();
            almacenamientoUsuarioPlantas.setControladorSembrarManzano(0);
        }
        if(almacenamientoUsuarioPlantas.getControladorSembrarNaranjo()>=3){
            hiloNaranjoCosecha = new HiloNaranjoCosecha();
            hiloNaranjoCosecha.start();
            hiloMuerteNaranjo = new HiloMuerteNaranjo();    
            hiloMuerteNaranjo.start();
            almacenamientoUsuarioPlantas.setControladorSembrarNaranjo(0);
        }
        if(almacenamientoUsuarioPlantas.getControladorSembrarBanano()>=5){
            hiloBananoCosecha = new HiloBananoCosecha();
            hiloBananoCosecha.start();
            hiloMuerteBanano = new HiloMuerteBanano();    
            hiloMuerteBanano.start();
            almacenamientoUsuarioPlantas.setControladorSembrarBanano(0);
        }
    }
    public static void ParcelaCrianza(){
        if(almacenamientoUsuarioAnimales.getControladorPonerCerdo()>=1){
            hiloCerdo = new HiloCerdo();
            hiloCerdo.start();
            hiloMuerteCerdo = new HiloMuerteCerdo();    
            hiloMuerteCerdo.start();
            almacenamientoUsuarioAnimales.setControladorPonerCerdo(0);
        }
        if(almacenamientoUsuarioAnimales.getControladorPonerPavo()>=1){
            hiloPavo = new HiloPavo();
            hiloPavo.start();
            hiloMuertePavo = new HiloMuertePavo();    
            hiloMuertePavo.start();
            almacenamientoUsuarioAnimales.setControladorPonerPavo(0);
        }
        if(almacenamientoUsuarioAnimales.getControladorPonerGallina()>=1){
            hiloGallina = new HiloGallina();
            hiloGallina.start();
            hiloMuerteGallina = new HiloMuerteGallina();    
            hiloMuerteGallina.start();
            almacenamientoUsuarioAnimales.setControladorPonerGallina(0);
        }
        if(almacenamientoUsuarioAnimales.getControladorPonerVaca()>=1){
            hiloVaca = new HiloVaca();
            hiloVaca.start();
            hiloMuerteVaca = new HiloMuerteVaca();    
            hiloMuerteVaca.start();
            almacenamientoUsuarioAnimales.setControladorPonerVaca(0);
        }
        if(almacenamientoUsuarioAnimales.getControladorPonerOveja()>=1){
            hiloOveja = new HiloOveja();
            hiloOveja.start();
            hiloMuerteOveja = new HiloMuerteOveja();    
            hiloMuerteOveja.start();
            almacenamientoUsuarioAnimales.setControladorPonerOveja(0);
        }
        if(almacenamientoUsuarioAnimales.getControladorPonerLlama()>=1){
            hiloLlama = new HiloLlama();
            hiloLlama.start();
            hiloMuerteLlama = new HiloMuerteLlama();    
            hiloMuerteLlama.start();
            almacenamientoUsuarioAnimales.setControladorPonerLlama(0);
        }
    }
    
}
