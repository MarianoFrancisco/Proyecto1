/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

/**
 *
 * @author Mariano
 */
public class LlamadoInstancias {
    public static void granja(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGranja().setVisible(true);
                
            }
        });
    }
    public static void bodega(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBodega().setVisible(true);
            }
        });
    }
    public static void mercado(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMercado().setVisible(true);
            }
        });
    }
    public static void reportes(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameReportes().setVisible(true);
            }
        });
    }
    public static void vender(){  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameVender().setVisible(true);
            }
        });
    }
    public static void comprar(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameComprar().setVisible(true);
            }
        });
    }
    public static void sembrarSeleccion(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSeleccionSiembra().setVisible(true);
            }
        });
    }
    public static void criaSeleccion(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSeleccionCria().setVisible(true);
            }
        });
    }
    public static void comerSiu(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameComer().setVisible(true);
            }
        });
    }
}
