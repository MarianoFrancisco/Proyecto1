package proyecto1;
import animalesHerviboros.*;
import animalesOmnivoros.*;
import estructuraAnimales.*;
import estructuraPlantas.*;
import plantasFrutas.*;
import plantasGranos.*;

/**
 *
 * @author Mariano
 */
public class CrearAnimalesPlantas {
    //Llamamos nuevos animales
    public static Plantas plantas[]= new Plantas[6];
    public static Animales animales[]= new Animales[6];
    public static PlantaVacia plantaVacia = new PlantaVacia();
    public static AnimalVacio animalVacio = new AnimalVacio();
    public static Maiz maiz;
    public static Frijol frijol;
    public static Arroz arroz;
    public static Manzano manzano;//frijol,arroz,naranjo,banano.  , oveja, llama, cerdo, pavo.
    public static Naranjo naranjo;
    public static Banano banano;
    public static Vaca vaca;
    public static Oveja oveja;
    public static Llama llama;
    public static Gallina gallina;
    public static Cerdo cerdo;
    public static Pavo pavo;
    public static CrearAnimalesPlantas crearAnimalesPlantas;
    public static void LlamadoCrearAnimales(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCrearAnimalesPlantas().setVisible(true);
            }
        });
    }
    public static void iniciarAnimalesHerviboros(){
        vaca = new Vaca(10,3);//añadimos cantidad leche y precio
        oveja= new Oveja();
        llama= new Llama();
    }
    public static void iniciarAnimalesOmnivoros(){
        gallina = new Gallina();
        cerdo= new Cerdo();
        pavo= new Pavo();
    }
    public static void iniciarPlantasGranos(){
        maiz= new Maiz();
        frijol= new Frijol();
        arroz= new Arroz();
    }
    public static void iniciarPlantasFrutas(){
        manzano= new Manzano();
        naranjo= new Naranjo();
        banano= new Banano();
    }
    public static void animalesCreados(){
        animales[0]= gallina;
        animales[1]= animalVacio;
        animales[2]= animalVacio;
        animales[3]= vaca;
        animales[4]= animalVacio;
        animales[5]= animalVacio;
    }
    public static void plantasCreadas(){
        plantas[0]= maiz;
        plantas[1]= plantaVacia;
        plantas[2]= plantaVacia;
        plantas[3]= manzano;
        plantas[4]= plantaVacia;
        plantas[5]= plantaVacia;
    }
}
