package manejadorDatos;
import static proyecto1.CrearAnimalesPlantas.*;
import static instancias.FrameComprar.*;
/**
 *
 * @author Mariano
 */
public class CriasSemillasVisibles {
    public static void visibilidadCompra(){
        if(plantas[1].getPrecioCompraSemilla()!=4){
            FrijoljButton2.setVisible(false);
            FrijoljLabel2.setVisible(false);
            FrijoljLabel3.setVisible(false);
        }
        
        if(plantas[2].getPrecioCompraSemilla()!=5){
            ArrozjButton1.setVisible(false);
            ArrozjLabel1.setVisible(false);
            ArrozjLabel2.setVisible(false);
        }
        if(plantas[4].getPrecioCompraSemilla()!=15){
            NaranjojButton3.setVisible(false);
            NaranjojLabel3.setVisible(false);
            NaranjojLabel4.setVisible(false);
        }
        if(plantas[5].getPrecioCompraSemilla()!=10){
            BananojButton4.setVisible(false);
            BananojLabel6.setVisible(false);
            BananojLabel7.setVisible(false);
        }
        if(animales[1].getPrecioCompra()!=50){
            CerdojButton4.setVisible(false);
            CerdojLabel4.setVisible(false);
            CerdojLabel5.setVisible(false);
        }
        if(animales[2].getPrecioCompra()!=100){
            PavojButton5.setVisible(false);
            PavojLabel7.setVisible(false);
            PavojLabel8.setVisible(false);
        }
        if(animales[4].getPrecioCompra()!=70){
            OvejajButton3.setVisible(false);
            OvejajLabel3.setVisible(false);
            OvejajLabel4.setVisible(false);
        }
        if(animales[5].getPrecioCompra()!=60){
            LlamajButton2.setVisible(false);
            LlamajLabel2.setVisible(false);
            LlamajLabel3.setVisible(false);
        }
    }
}
