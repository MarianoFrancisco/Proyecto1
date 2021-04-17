package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class AlmacenamientoUsuarioFertilizante {
    private int fertilizantePotasio;
    private int fertilizanteSulfato;
    private int fertilizanteUrea;
    public static AlmacenamientoUsuarioFertilizante almacenamientoUsuarioFertilizante;
    public AlmacenamientoUsuarioFertilizante(int fertilizantePotasio,int fertilizanteSulfato,int fertilizanteUrea){
        this.fertilizantePotasio=fertilizantePotasio;
        this.fertilizanteSulfato=fertilizanteSulfato;
        this.fertilizanteUrea=fertilizanteUrea;
    }

    public int getFertilizantePotasio() {
        return this.fertilizantePotasio;
    }

    public void setFertilizantePotasio(int fertilizantePotasio) {
        this.fertilizantePotasio = fertilizantePotasio;
    }

    public int getFertilizanteSulfato() {
        return this.fertilizanteSulfato;
    }

    public void setFertilizanteSulfato(int fertilizanteSulfato) {
        this.fertilizanteSulfato = fertilizanteSulfato;
    }

    public int getFertilizanteUrea() {
        return this.fertilizanteUrea;
    }

    public void setFertilizanteUrea(int fertilizanteUrea) {
        this.fertilizanteUrea = fertilizanteUrea;
        
    }
    public static void crearUsuarioFertlizante(){
        almacenamientoUsuarioFertilizante=new AlmacenamientoUsuarioFertilizante(0,0,0);
    }
}
