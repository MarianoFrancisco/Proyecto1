package estructuraPlantas;

/**
 *
 * @author Mariano
 */
public abstract class Plantas {
    protected String tipoPlanta;
    protected int precioCompraSemilla;
    protected int semillasNecesariasSembrar;
    protected int productoCosecha;
    protected int precioVentaProducto;
    public Plantas( String tipoPlanta, int precioCompraSemilla, int semillasNecesariasSembrar, int productoCosecha, int precioVentaProducto){
        this.tipoPlanta=tipoPlanta;
        this.precioCompraSemilla=precioCompraSemilla;
        this.semillasNecesariasSembrar=semillasNecesariasSembrar;
        this.productoCosecha=productoCosecha;
        this.precioVentaProducto=precioVentaProducto;
    }
    public abstract void siembra();

    public String getTipoPlanta() {
        return this.tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public int getPrecioCompraSemilla() {
        return this.precioCompraSemilla;
    }

    public void setPrecioCompraSemilla(int precioCompraSemilla) {
        this.precioCompraSemilla = precioCompraSemilla;
    }

    public int getSemillasNecesariasSembrar() {
        return this.semillasNecesariasSembrar;
    }

    public void setSemillasNecesariasSembrar(int semillasNecesariasSembrar) {
        this.semillasNecesariasSembrar = semillasNecesariasSembrar;
    }

    public int getProductoCosecha() {
        return this.productoCosecha;
    }

    public void setProductoCosecha(int productoCosecha) {
        this.productoCosecha = productoCosecha;
    }

    public int getPrecioVentaProducto() {
        return this.precioVentaProducto;
    }

    public void setPrecioVentaProducto(int precioVentaProducto) {
        this.precioVentaProducto = precioVentaProducto;
    } 
    
}
