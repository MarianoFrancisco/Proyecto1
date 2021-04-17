package suelos;

/**
 *
 * @author Mariano
 */
public class CreacionSueloInicial {
    public static Suelos sueloInicial[] = new Suelos[4];
    public static Suelos sueloElegir[][] = new Suelos[9][9];
    public static CreacionSueloInicial sueloCreador;
    public void crearSuelos(){
        sueloInicial[0] = new SueloAgua();
        sueloInicial[1] = new SueloDesierto();
        sueloInicial[2] = new SueloGrama();
    }
    
    public int probabilidad(){//Crear variable para asignar valores en el switch
        double aleatorio = Math.random();//numero aleatorio
        if(aleatorio <= sueloInicial[0].getPorcentaje())//0 a 0.35 probabilidad de que caiga
            return 0;
        else if(aleatorio <=(sueloInicial[0].getPorcentaje()+sueloInicial[1].getPorcentaje()))//0.35 a 0.6 probabilidad de que caiga
            return 1;
        else//0.4 probabilidad de que caiga
            return 2;
    }
    public int getValor(){
        return this.probabilidad();//llamar el valor suerte asignado para el switch
    }
    public void llamadoCrearSueloInicial(){
        switch(this.probabilidad()){
            case 0:
                sueloInicial[3] = new SueloAgua();
                break;
            case 1:
                sueloInicial[3] = new SueloDesierto();
                break;
            case 2:
                sueloInicial[3] = new SueloGrama();
                break;
        }
    }
    public static void crearCreacionSueloInicial(){
        sueloCreador = new CreacionSueloInicial();
    }
}
