package proyecto1;
import animalesHerviboros.*;
import animalesOmnivoros.*;
import plantasFrutas.*;
import plantasGranos.*;

/**
 *
 * @author Mariano
 */
public class CrearAnimalesPlantas {
    //Llamamos nuevos animales
    static Maiz maiz[]= new Maiz[5];
    static Manzano manzano[]= new Manzano[5];
    static Vaca vaca[]= new Vaca[5];
    static Gallina gallina[]=new Gallina[5];
    public static void LlamadoCrearAnimales(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCrearAnimales().setVisible(true);
            }
        });
    }
    public static void iniciarAnimalesHerviboros(){
        vaca[0] = new Vaca();
    }
    public static void iniciarAnimalesOmnivoros(){
        gallina[0] = new Gallina();
    }
    public static void iniciarPlantasFrutas(){
        manzano[0]= new Manzano();
    }
    public static void iniciarPlantasGranos(){
        maiz[0]= new Maiz();
    }
}