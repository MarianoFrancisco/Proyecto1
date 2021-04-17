package estructuraAnimales;

/**
 *
 * @author Mariano
 */
public abstract class Animales {
    protected String tipoAnimal;
    protected int precioCompra;
    protected int librasCarneGenerada;
    protected int cantidadMateriaPrimaGenerada;
    protected int precioVentaMateriaPrima;
    protected int precioVentaCarne;
    public Animales( String tipoAnimal,int precioCompra,int librasCarneGenerada,int cantidadMateriaPrimaGenerada,int precioVentaMateriaPrima,int precioVentaCarne){
        this.tipoAnimal=tipoAnimal;
        this.precioCompra=precioCompra;
        this.librasCarneGenerada=librasCarneGenerada;
        this.cantidadMateriaPrimaGenerada=cantidadMateriaPrimaGenerada;
        this.precioVentaMateriaPrima=precioVentaMateriaPrima;
        this.precioVentaCarne=precioVentaCarne;
    }
    public abstract void ProduccionDestace();
    public abstract void ProduccionSinDestace();

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getLibrasCarneGenerada() {
        return this.librasCarneGenerada;
    }

    public void setLibrasCarneGenerada(int librasCarneGenerada) {
        this.librasCarneGenerada = librasCarneGenerada;
    }

    public int getCantidadMateriaPrimaGenerada() {
        return this.cantidadMateriaPrimaGenerada;
    }

    public void setCantidadMateriaPrimaGenerada(int cantidadMateriaPrimaGenerada) {
        this.cantidadMateriaPrimaGenerada = cantidadMateriaPrimaGenerada;
    }

    public int getPrecioVentaMateriaPrima() {
        return this.precioVentaMateriaPrima;
    }

    public void setPrecioVentaMateriaPrima(int precioVentaMateriaPrima) {
        this.precioVentaMateriaPrima = precioVentaMateriaPrima;
    }

    public int getPrecioVentaCarne() {
        return this.precioVentaCarne;
    }

    public void setPrecioVentaCarne(int precioVentaCarne) {
        this.precioVentaCarne = precioVentaCarne;
    }
}
