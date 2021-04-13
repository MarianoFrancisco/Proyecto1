/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jugador.Jugador;
import static manejadorDatos.AlmacenamientoUsuarioAlimentos.almacenamientoUsuarioAlimentos;
import static manejadorDatos.AlmacenamientoUsuarioAnimales.almacenamientoUsuarioAnimales;
import static manejadorDatos.AlmacenamientoUsuarioProductos.almacenamientoUsuarioProductos;

/**
 *
 * @author Mariano
 */
public class FrameBodega extends javax.swing.JFrame{
    
    /**
     * Creates new form FrameBodega
     * @param llamarGranja
     */
    FondoInicio fondoInicioBodega = new FondoInicio();
    public FrameBodega() {
        this.setContentPane(fondoInicioBodega);
        initComponents();
        this.setLocationRelativeTo(null);
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
        RegresarGranjajButton1 = new javax.swing.JButton();
        FinalizarJuegojButton1 = new javax.swing.JButton();
        LogojLabel1 = new javax.swing.JLabel();
        AlimentosjLabel2 = new javax.swing.JLabel();
        ProductosjLabel3 = new javax.swing.JLabel();
        DatoAlimentosjLabel2 = new javax.swing.JLabel();
        DatoAlimentosjLabel3 = new javax.swing.JLabel();
        DatoAlimentosjLabel4 = new javax.swing.JLabel();
        FondojLabel2 = new javax.swing.JLabel();
        DatoAlimentosjLabel5 = new javax.swing.JLabel();
        DatoAlimentosjLabel6 = new javax.swing.JLabel();
        DatoAlimentosjLabel7 = new javax.swing.JLabel();
        DatoAlimentosjLabel11 = new javax.swing.JLabel();
        FondojLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bodega");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegresarGranjajButton1.setBackground(new java.awt.Color(0, 204, 204));
        RegresarGranjajButton1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        RegresarGranjajButton1.setForeground(new java.awt.Color(0, 0, 0));
        RegresarGranjajButton1.setText("Regresar a Granja");
        RegresarGranjajButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarGranjajButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarGranjajButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        FinalizarJuegojButton1.setBackground(new java.awt.Color(255, 0, 0));
        FinalizarJuegojButton1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        FinalizarJuegojButton1.setForeground(new java.awt.Color(0, 0, 0));
        FinalizarJuegojButton1.setText("Finalizar Juego");
        FinalizarJuegojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarJuegojButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(FinalizarJuegojButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 601, -1, -1));

        LogojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Logo.PNG"))); // NOI18N
        jPanel1.add(LogojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1224, 601, -1, -1));

        AlimentosjLabel2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        AlimentosjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        AlimentosjLabel2.setText("Alimentos");
        jPanel1.add(AlimentosjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        ProductosjLabel3.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        ProductosjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        ProductosjLabel3.setText("Productos");
        jPanel1.add(ProductosjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        DatoAlimentosjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        DatoAlimentosjLabel2.setText("Libras de maiz : "+almacenamientoUsuarioProductos.getUsuarioMaiz());
        jPanel1.add(DatoAlimentosjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        DatoAlimentosjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        DatoAlimentosjLabel3.setText("Libras de frijol : "+almacenamientoUsuarioProductos.getUsuarioArroz());
        jPanel1.add(DatoAlimentosjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, -1, -1));

        DatoAlimentosjLabel4.setForeground(new java.awt.Color(0, 0, 0));
        DatoAlimentosjLabel4.setText("Libras de arroz : "+almacenamientoUsuarioProductos.getUsuarioFrijol());
        jPanel1.add(DatoAlimentosjLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, -1, -1));

        FondojLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/FondoBodega.jpg"))); // NOI18N
        jPanel1.add(FondojLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        DatoAlimentosjLabel5.setForeground(new java.awt.Color(0, 0, 0));
        DatoAlimentosjLabel5.setText("Frutas de Manzano : "+almacenamientoUsuarioAlimentos.getUsuarioManzano());
        jPanel1.add(DatoAlimentosjLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        DatoAlimentosjLabel6.setForeground(new java.awt.Color(0, 0, 0));
        DatoAlimentosjLabel6.setText("Frutas de Naranjo : "+almacenamientoUsuarioAlimentos.getUsuarioNaranjo());
        jPanel1.add(DatoAlimentosjLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        DatoAlimentosjLabel7.setForeground(new java.awt.Color(0, 0, 0));
        DatoAlimentosjLabel7.setText("Frutas de Banano : "+almacenamientoUsuarioAlimentos.getUsuarioBanano());
        jPanel1.add(DatoAlimentosjLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        DatoAlimentosjLabel11.setForeground(new java.awt.Color(0, 0, 0));
        DatoAlimentosjLabel11.setText("Pescados : "+almacenamientoUsuarioAnimales.getUsuarioPeces());
        jPanel1.add(DatoAlimentosjLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        FondojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/FondoBodega.jpg"))); // NOI18N
        jPanel1.add(FondojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void RegresarGranjajButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarGranjajButton1ActionPerformed
        //regresar a granja
        this.dispose();
        FrameGranja.visible();    
    }//GEN-LAST:event_RegresarGranjajButton1ActionPerformed

    private void FinalizarJuegojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarJuegojButton1ActionPerformed
        JOptionPane.showMessageDialog(FrameBodega.this, "Fin del juego, vuelve pronto "+Jugador.jugador1.getNick());
        System.exit(0);
        
                
                        
    }//GEN-LAST:event_FinalizarJuegojButton1ActionPerformed
    class FondoInicio extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/decoracion/IrBodega.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlimentosjLabel2;
    public static javax.swing.JLabel DatoAlimentosjLabel11;
    public static javax.swing.JLabel DatoAlimentosjLabel2;
    public static javax.swing.JLabel DatoAlimentosjLabel3;
    public static javax.swing.JLabel DatoAlimentosjLabel4;
    public static javax.swing.JLabel DatoAlimentosjLabel5;
    public static javax.swing.JLabel DatoAlimentosjLabel6;
    public static javax.swing.JLabel DatoAlimentosjLabel7;
    private javax.swing.JButton FinalizarJuegojButton1;
    private javax.swing.JLabel FondojLabel1;
    private javax.swing.JLabel FondojLabel2;
    private javax.swing.JLabel LogojLabel1;
    private javax.swing.JLabel ProductosjLabel3;
    private javax.swing.JButton RegresarGranjajButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
