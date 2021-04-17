package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class EstablecerReportes {
    private int oroGenerado;
    private int alimentoGenerado;
    private int alimentoConsumido;
    private int celdasCompradas;
    private int criasCompradas;
    private int unidadesDestazadas;
    private int semillasCompradas;
    private int celdasSembradas;
    private int fertilizantesComprados;
    private int comidaHerviborosComprada;
    private int comidaOmnivorosComprada;
    public static EstablecerReportes establecerReportes;
    public EstablecerReportes(int oroGenerado,int alimentoGenerado,int alimentoConsumido,int celdasCompradas,int criasCompradas,int unidadesDestazadas,int semillasCompradas,int celdasSembradas,int fertilizantesComprados,int comidaHerviborosComprada,int comidaOmnivorosComprada){
        this.oroGenerado=oroGenerado;
        this.alimentoGenerado=alimentoGenerado;
        this.alimentoConsumido=alimentoConsumido;
        this.celdasCompradas=celdasCompradas;
        this.criasCompradas=criasCompradas;
        this.unidadesDestazadas=unidadesDestazadas;
        this.semillasCompradas=semillasCompradas;
        this.celdasSembradas=celdasSembradas;
        this.fertilizantesComprados=fertilizantesComprados;
        this.comidaHerviborosComprada=comidaHerviborosComprada;
        this.comidaOmnivorosComprada=comidaOmnivorosComprada;
    }

    public int getOroGenerado() {
        return this.oroGenerado;
    }

    public void setOroGenerado(int oroGenerado) {
        this.oroGenerado = oroGenerado;
    }

    public int getAlimentoGenerado() {
        return this.alimentoGenerado;
    }

    public void setAlimentoGenerado(int alimentoGenerado) {
        this.alimentoGenerado = alimentoGenerado;
    }

    public int getAlimentoConsumido() {
        return this.alimentoConsumido;
    }

    public void setAlimentoConsumido(int alimentoConsumido) {
        this.alimentoConsumido = alimentoConsumido;
    }

    public int getCeldasCompradas() {
        return this.celdasCompradas;
    }

    public void setCeldasCompradas(int celdasCompradas) {
        this.celdasCompradas = celdasCompradas;
    }

    public int getCriasCompradas() {
        return this.criasCompradas;
    }

    public void setCriasCompradas(int criasCompradas) {
        this.criasCompradas = criasCompradas;
    }

    public int getUnidadesDestazadas() {
        return this.unidadesDestazadas;
    }

    public void setUnidadesDestazadas(int unidadesDestazadas) {
        this.unidadesDestazadas = unidadesDestazadas;
    }

    public int getSemillasCompradas() {
        return this.semillasCompradas;
    }

    public void setSemillasCompradas(int semillasCompradas) {
        this.semillasCompradas = semillasCompradas;
    }

    public int getCeldasSembradas() {
        return this.celdasSembradas;
    }

    public void setCeldasSembradas(int celdasSembradas) {
        this.celdasSembradas = celdasSembradas;
    }

    public int getFertilizantesComprados() {
        return this.fertilizantesComprados;
    }

    public void setFertilizantesComprados(int fertilizantesComprados) {
        this.fertilizantesComprados = fertilizantesComprados;
    }

    public int getComidaHerviborosComprada() {
        return this.comidaHerviborosComprada;
    }

    public void setComidaHerviborosComprada(int comidaHerviborosComprada) {
        this.comidaHerviborosComprada = comidaHerviborosComprada;
    }

    public int getComidaOmnivorosComprada() {
        return this.comidaOmnivorosComprada;
    }

    public void setComidaOmnivorosComprada(int comidaOmnivorosComprada) {
        this.comidaOmnivorosComprada = comidaOmnivorosComprada;
    }
    
    public static void creadorDatosReportes(){
        establecerReportes=new EstablecerReportes(0,0,0,0,0,0,0,0,0,0,0);
    }
    public static void sumarSemilla(){
        establecerReportes.setSemillasCompradas(establecerReportes.getSemillasCompradas()+1);
    }
    public static void sumarCrias(){
        establecerReportes.setCriasCompradas(establecerReportes.getCriasCompradas()+1);
    }
    public static void sumarFertlizanteComprado(){
        establecerReportes.setFertilizantesComprados(establecerReportes.getFertilizantesComprados()+1);
    }
    public static void sumarComidaHerviboroComprada(){
        establecerReportes.setComidaHerviborosComprada(establecerReportes.getComidaHerviborosComprada()+1);
    }
    public static void sumarComidaOmnivoroComprada(){
        establecerReportes.setComidaOmnivorosComprada(establecerReportes.getComidaOmnivorosComprada()+1);
    }
    public static void sumarComidasConsumidas(){
        establecerReportes.setAlimentoConsumido(establecerReportes.getAlimentoConsumido()+1);
    }
    public static void sumarOroGenerado(){
        establecerReportes.setOroGenerado(establecerReportes.getOroGenerado()+1);
    }
    public static void sumarUnidadesDestazadas(){
        establecerReportes.setUnidadesDestazadas(establecerReportes.getUnidadesDestazadas()+1);
    }
    public static void sumarCeldasSembradas(){
        establecerReportes.setCeldasSembradas(establecerReportes.getCeldasSembradas()+1);
    }
    public static void sumarAlimentoGenerado(){
        establecerReportes.setAlimentoGenerado(establecerReportes.getAlimentoGenerado()+1);
    }
}
