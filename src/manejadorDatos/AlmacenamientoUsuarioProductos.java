/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class AlmacenamientoUsuarioProductos {
    private int usuarioMaiz;
    private int usuarioFrijol;
    private int usuarioArroz;
    public static AlmacenamientoUsuarioProductos almacenamientoUsuarioProductos;
    public AlmacenamientoUsuarioProductos(int usuarioMaiz,int usuarioFrijol,int usuarioArroz){
        this.usuarioMaiz=usuarioMaiz;
        this.usuarioFrijol=usuarioFrijol;
        this.usuarioArroz=usuarioArroz;
    }

    public int getUsuarioMaiz() {
        return this.usuarioMaiz;
    }

    public void setUsuarioMaiz(int usuarioMaiz) {
        this.usuarioMaiz = usuarioMaiz;
    }

    public int getUsuarioFrijol() {
        return this.usuarioFrijol;
    }

    public void setUsuarioFrijol(int usuarioFrijol) {
        this.usuarioFrijol = usuarioFrijol;
    }

    public int getUsuarioArroz() {
        return this.usuarioArroz;
    }

    public void setUsuarioArroz(int usuarioArroz) {
        this.usuarioArroz = usuarioArroz;
    }
    public static void crearAlmacenamientoUsProductos(){
        almacenamientoUsuarioProductos = new AlmacenamientoUsuarioProductos(0,0,0);
    }
}
