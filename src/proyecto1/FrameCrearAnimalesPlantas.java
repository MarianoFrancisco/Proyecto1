/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import instancias.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static proyecto1.CrearAnimalesPlantas.*;

/**
 *
 * @author Mariano
 */
public class FrameCrearAnimalesPlantas extends javax.swing.JFrame {

    /**
     * Creates new form FrameCrearAnimalesPlantas
     */
    public Tiempo tiempo = new Tiempo();
    FondoInicio fondoInicio = new FondoInicio();
    public FrameCrearAnimalesPlantas() {
        this.setContentPane(fondoInicio);
        initComponents();
        LlamarTiempo.tiempo();
        tiempo.start();
        Crear();
        this.setLocationRelativeTo(null);
    }
    public void Crear(){
        CrearAnimalesPlantas.iniciarAnimalesHerviboros();
        CrearAnimalesPlantas.iniciarAnimalesOmnivoros();
        CrearAnimalesPlantas.iniciarPlantasFrutas();
        CrearAnimalesPlantas.iniciarPlantasGranos();
        CrearAnimalesPlantas.animalesCreados();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IniciarJuegojButton1 = new javax.swing.JButton();
        LogojLabel1 = new javax.swing.JLabel();
        CrearAnimalesjLabel1 = new javax.swing.JLabel();
        ArrozjButton1 = new javax.swing.JButton();
        CrearGranojLabel1 = new javax.swing.JLabel();
        CrearFrutasjLabel2 = new javax.swing.JLabel();
        FrijoljButton2 = new javax.swing.JButton();
        ArrozjLabel1 = new javax.swing.JLabel();
        FrijoljLabel2 = new javax.swing.JLabel();
        NaranjojLabel3 = new javax.swing.JLabel();
        NaranjojButton3 = new javax.swing.JButton();
        BananojButton2 = new javax.swing.JButton();
        BananojLabel4 = new javax.swing.JLabel();
        FondojLabel1 = new javax.swing.JLabel();
        CerdojButton4 = new javax.swing.JButton();
        PavojButton3 = new javax.swing.JButton();
        PavojLabel5 = new javax.swing.JLabel();
        CerdojLabel4 = new javax.swing.JLabel();
        CrearFrutasjLabel3 = new javax.swing.JLabel();
        OvejajButton3 = new javax.swing.JButton();
        LlamajButton2 = new javax.swing.JButton();
        LlamajLabel2 = new javax.swing.JLabel();
        OvejajLabel3 = new javax.swing.JLabel();
        CrearGranojLabel2 = new javax.swing.JLabel();
        FondojLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creacion");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IniciarJuegojButton1.setBackground(new java.awt.Color(0, 204, 204));
        IniciarJuegojButton1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        IniciarJuegojButton1.setForeground(new java.awt.Color(0, 0, 0));
        IniciarJuegojButton1.setText("Iniciar Partida");
        IniciarJuegojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarJuegojButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(IniciarJuegojButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        LogojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Logo.PNG"))); // NOI18N
        jPanel1.add(LogojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, -1, -1));

        CrearAnimalesjLabel1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        CrearAnimalesjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        CrearAnimalesjLabel1.setText("Creacion animales");
        jPanel1.add(CrearAnimalesjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 32, -1, -1));

        ArrozjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Arroz.PNG"))); // NOI18N
        ArrozjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrozjButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(ArrozjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 94, 74));

        CrearGranojLabel1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CrearGranojLabel1.setForeground(new java.awt.Color(0, 0, 0));
        CrearGranojLabel1.setText("Crear Plantas de Granos");
        jPanel1.add(CrearGranojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        CrearFrutasjLabel2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CrearFrutasjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        CrearFrutasjLabel2.setText("Crear Plantas de Frutas");
        jPanel1.add(CrearFrutasjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        FrijoljButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Frijol.PNG"))); // NOI18N
        FrijoljButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrijoljButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(FrijoljButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 82, 74));

        ArrozjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ArrozjLabel1.setText("Arroz");
        jPanel1.add(ArrozjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        FrijoljLabel2.setForeground(new java.awt.Color(0, 0, 0));
        FrijoljLabel2.setText("Frijol");
        jPanel1.add(FrijoljLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        NaranjojLabel3.setForeground(new java.awt.Color(0, 0, 0));
        NaranjojLabel3.setText("Naranjo");
        jPanel1.add(NaranjojLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        NaranjojButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Naranjo.PNG"))); // NOI18N
        NaranjojButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaranjojButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(NaranjojButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 100, 70));

        BananojButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Banano.PNG"))); // NOI18N
        BananojButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BananojButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(BananojButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 94, 70));

        BananojLabel4.setForeground(new java.awt.Color(0, 0, 0));
        BananojLabel4.setText("Banano");
        jPanel1.add(BananojLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        FondojLabel1.setForeground(new java.awt.Color(0, 0, 0));
        FondojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/FondoCrearPlantasAnimales.jpg"))); // NOI18N
        jPanel1.add(FondojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 370, 380));

        CerdojButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Cerdo.PNG"))); // NOI18N
        CerdojButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerdojButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(CerdojButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 90, 70));

        PavojButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Pavo.PNG"))); // NOI18N
        PavojButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PavojButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(PavojButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 400, 80, 70));

        PavojLabel5.setForeground(new java.awt.Color(0, 0, 0));
        PavojLabel5.setText("Pavo");
        jPanel1.add(PavojLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, -1, -1));

        CerdojLabel4.setForeground(new java.awt.Color(0, 0, 0));
        CerdojLabel4.setText("Cerdo");
        jPanel1.add(CerdojLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, -1, -1));

        CrearFrutasjLabel3.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CrearFrutasjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        CrearFrutasjLabel3.setText("Crear animales omnivoros");
        jPanel1.add(CrearFrutasjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, -1));

        OvejajButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Oveja.PNG"))); // NOI18N
        OvejajButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OvejajButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(OvejajButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 80, 74));

        LlamajButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Llama.PNG"))); // NOI18N
        LlamajButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LlamajButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(LlamajButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 80, 74));

        LlamajLabel2.setForeground(new java.awt.Color(0, 0, 0));
        LlamajLabel2.setText("Llama");
        jPanel1.add(LlamajLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, -1, -1));

        OvejajLabel3.setForeground(new java.awt.Color(0, 0, 0));
        OvejajLabel3.setText("Oveja");
        jPanel1.add(OvejajLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, -1, -1));

        CrearGranojLabel2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CrearGranojLabel2.setForeground(new java.awt.Color(0, 0, 0));
        CrearGranojLabel2.setText("Crear animales herviboros");
        jPanel1.add(CrearGranojLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        FondojLabel2.setForeground(new java.awt.Color(0, 0, 0));
        FondojLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/FondoCrearPlantasAnimales.jpg"))); // NOI18N
        jPanel1.add(FondojLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 370, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarJuegojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarJuegojButton1ActionPerformed
        this.setVisible(false);
        FrameGranja.iniciarGranja();
        FrameGranja.visible();
        
                
    }//GEN-LAST:event_IniciarJuegojButton1ActionPerformed

    private void OvejajButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OvejajButton3ActionPerformed
        animales[4]= oveja;
        JOptionPane.showMessageDialog(null, "Creaste la oveja exitosamente");
    }//GEN-LAST:event_OvejajButton3ActionPerformed

    private void CerdojButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerdojButton4ActionPerformed
        animales[1]= cerdo;
        JOptionPane.showMessageDialog(null, "Creaste el cerdo exitosamente");
    }//GEN-LAST:event_CerdojButton4ActionPerformed
    private void PavojButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PavojButton3ActionPerformed
        animales[2]= pavo;
        JOptionPane.showMessageDialog(null, "Creaste el pavo exitosamente");
    }//GEN-LAST:event_PavojButton3ActionPerformed

    private void LlamajButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LlamajButton2ActionPerformed
        animales[5]= llama;
        JOptionPane.showMessageDialog(null, "Creaste la llama exitosamente");
    }//GEN-LAST:event_LlamajButton2ActionPerformed

    private void FrijoljButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrijoljButton2ActionPerformed
        plantas[1]= frijol;
        JOptionPane.showMessageDialog(null, "Creaste el frijol exitosamente");
    }//GEN-LAST:event_FrijoljButton2ActionPerformed

    private void ArrozjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrozjButton1ActionPerformed
        plantas[2]= arroz;
        JOptionPane.showMessageDialog(null, "Creaste el arroz exitosamente");
    }//GEN-LAST:event_ArrozjButton1ActionPerformed

    private void NaranjojButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaranjojButton3ActionPerformed
        plantas[4]= naranjo;
        JOptionPane.showMessageDialog(null, "Creaste el naranjo exitosamente");
    }//GEN-LAST:event_NaranjojButton3ActionPerformed

    private void BananojButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BananojButton2ActionPerformed
        plantas[5]= banano;
        JOptionPane.showMessageDialog(null, "Creaste el banano exitosamente");
    }//GEN-LAST:event_BananojButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    int minutos=0;
    int segundos=0;
    public class Tiempo extends Thread{
    @Override
    
    public void run() {
        
            for (minutos = 0;  minutos< 60; minutos++) {
                for (segundos = 0; segundos < 60; segundos++) {
                    LlamarTiempo.llamarTiempo.setLlamarMinutos(minutos);
                    LlamarTiempo.llamarTiempo.setLlamarSegundos(segundos);
                    try{
                    Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println("Error en inicio tiempo "+ e);
                    }
                }
            }
    }
        
    }
    class FondoInicio extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/decoracion/FondoCrearAnimales.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ArrozjButton1;
    private javax.swing.JLabel ArrozjLabel1;
    public static javax.swing.JButton BananojButton2;
    private javax.swing.JLabel BananojLabel4;
    public static javax.swing.JButton CerdojButton4;
    private javax.swing.JLabel CerdojLabel4;
    private javax.swing.JLabel CrearAnimalesjLabel1;
    private javax.swing.JLabel CrearFrutasjLabel2;
    private javax.swing.JLabel CrearFrutasjLabel3;
    private javax.swing.JLabel CrearGranojLabel1;
    private javax.swing.JLabel CrearGranojLabel2;
    private javax.swing.JLabel FondojLabel1;
    private javax.swing.JLabel FondojLabel2;
    public static javax.swing.JButton FrijoljButton2;
    private javax.swing.JLabel FrijoljLabel2;
    private javax.swing.JButton IniciarJuegojButton1;
    public static javax.swing.JButton LlamajButton2;
    private javax.swing.JLabel LlamajLabel2;
    private javax.swing.JLabel LogojLabel1;
    public static javax.swing.JButton NaranjojButton3;
    private javax.swing.JLabel NaranjojLabel3;
    public static javax.swing.JButton OvejajButton3;
    private javax.swing.JLabel OvejajLabel3;
    public static javax.swing.JButton PavojButton3;
    private javax.swing.JLabel PavojLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
