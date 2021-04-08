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

/**
 *
 * @author Mariano
 */
public class FrameGranja extends javax.swing.JFrame{

    /**
     * Creates new form FrameGranja
     */
    
    public Vida vida = new Vida();
    FondoInicio fondoInicioGranja = new FondoInicio();

    public static FrameGranja FrameGranja;
    public static void iniciarGranja(){
        FrameGranja=new FrameGranja();
    }
    public static void visible(){
        FrameGranja.setVisible(true);
    }

    public FrameGranja(){
        this.setContentPane(fondoInicioGranja);
        initComponents();
        InicializarSuelos.llamarInicializarSuelos();
        InicializarSuelos.inicializarSuelos.inicializarSuelos();
        InicializarSuelos.inicializarSuelos.inicializarAcciones();
        vida.start();
        barraVida();
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

        GranjajPanel1 = new javax.swing.JPanel();
        LimpiarTerrenoCasillajToggleButton2 = new javax.swing.JToggleButton();
        LimpiarTerrenojToggleButton2 = new javax.swing.JToggleButton();
        LimpiarTodojButton1 = new javax.swing.JButton();
        BodegajButton2 = new javax.swing.JButton();
        MercadojButton3 = new javax.swing.JButton();
        ReportesjButton4 = new javax.swing.JButton();
        SiembrajToggleButton3 = new javax.swing.JToggleButton();
        ProcesarjLabel1 = new javax.swing.JLabel();
        ProcesarParcelajToggleButton3 = new javax.swing.JToggleButton();
        ProcesarParcelaAlimentojToggleButton4 = new javax.swing.JToggleButton();
        ProcesarParcelaMateriajToggleButton5 = new javax.swing.JToggleButton();
        ParcelaDestacejToggleButton1 = new javax.swing.JToggleButton();
        ParcelaSinDestacejToggleButton1 = new javax.swing.JToggleButton();
        LimpiezajLabel2 = new javax.swing.JLabel();
        AccionesjLabel3 = new javax.swing.JLabel();
        PescarjToggleButton4 = new javax.swing.JToggleButton();
        MenujLabel4 = new javax.swing.JLabel();
        ReportesjLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BodegajLabel2 = new javax.swing.JLabel();
        SembrarjLabel2 = new javax.swing.JLabel();
        PescarjLabel3 = new javax.swing.JLabel();
        CrearParcelajLabel4 = new javax.swing.JLabel();
        LimpiarTodasParcelasjLabel2 = new javax.swing.JLabel();
        LimpiarUnaParcelajLabel2 = new javax.swing.JLabel();
        ParcelasjToggleButton5 = new javax.swing.JToggleButton();
        ComerjButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DarComerAnimalesjLabel2 = new javax.swing.JLabel();
        PorParcelajLabel2 = new javax.swing.JLabel();
        NoDestacejLabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AnimalParcelajLabel4 = new javax.swing.JLabel();
        ParcelaMateriaPrimajLabel4 = new javax.swing.JLabel();
        ParcelaMateriaPrima2jLabel4 = new javax.swing.JLabel();
        ParcelaAlimentojLabel5 = new javax.swing.JLabel();
        ParcelaAlimento2jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ComerAnimalesjToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        LlamadoNickjLabel1 = new javax.swing.JLabel();
        OrojLabel2 = new javax.swing.JLabel();
        OrojLabel6 = new javax.swing.JLabel();
        LogojLabel7 = new javax.swing.JLabel();
        VidajLabel3 = new javax.swing.JLabel();
        VidajLabel8 = new javax.swing.JLabel();
        VidajProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Granja");
        setResizable(false);

        GranjajPanel1.setOpaque(false);
        GranjajPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LimpiarTerrenoCasillajToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/LimpiarUnaParcela.PNG"))); // NOI18N
        LimpiarTerrenoCasillajToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTerrenoCasillajToggleButton2ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(LimpiarTerrenoCasillajToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 50, 50));

        LimpiarTerrenojToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/AnimalParcela.PNG"))); // NOI18N
        LimpiarTerrenojToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTerrenojToggleButton2ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(LimpiarTerrenojToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 50, 40));

        LimpiarTodojButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/LimpiarTodaParcela.PNG"))); // NOI18N
        LimpiarTodojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarTodoLimpiarTodojButton1ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(LimpiarTodojButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 60, 60));

        BodegajButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Bodega.PNG"))); // NOI18N
        BodegajButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BodegajButton2ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(BodegajButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 90, 40));

        MercadojButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Mercado.PNG"))); // NOI18N
        MercadojButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MercadojButton3ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(MercadojButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 60, 40));

        ReportesjButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Reporte.PNG"))); // NOI18N
        ReportesjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesjButton4ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ReportesjButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 40, 40));

        SiembrajToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Siembra.PNG"))); // NOI18N
        SiembrajToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiembrajToggleButton3ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(SiembrajToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 70, 50));

        ProcesarjLabel1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        ProcesarjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ProcesarjLabel1.setText("Procesar animales");
        GranjajPanel1.add(ProcesarjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        ProcesarParcelajToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/UnaParcela.PNG"))); // NOI18N
        ProcesarParcelajToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesarParcelajToggleButton3ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ProcesarParcelajToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 60, 40));

        ProcesarParcelaAlimentojToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/ParcelaAlimentos.PNG"))); // NOI18N
        ProcesarParcelaAlimentojToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesarParcelaAlimentojToggleButton4ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ProcesarParcelaAlimentojToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 50, 50));

        ProcesarParcelaMateriajToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/MateriaPrima.PNG"))); // NOI18N
        ProcesarParcelaMateriajToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesarParcelaMateriajToggleButton5ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ProcesarParcelaMateriajToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 50));

        ParcelaDestacejToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Destace.PNG"))); // NOI18N
        ParcelaDestacejToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcelaDestacejToggleButton1ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ParcelaDestacejToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 50, 50));

        ParcelaSinDestacejToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/SinDestace.PNG"))); // NOI18N
        ParcelaSinDestacejToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcelaSinDestacejToggleButton1ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ParcelaSinDestacejToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 50, 50));

        LimpiezajLabel2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        LimpiezajLabel2.setForeground(new java.awt.Color(0, 0, 0));
        LimpiezajLabel2.setText("Limpiar");
        GranjajPanel1.add(LimpiezajLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        AccionesjLabel3.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        AccionesjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        AccionesjLabel3.setText("Acciones");
        GranjajPanel1.add(AccionesjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        PescarjToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Pesca.PNG"))); // NOI18N
        PescarjToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PescarjToggleButton4ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(PescarjToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 60, 50));

        MenujLabel4.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        MenujLabel4.setForeground(new java.awt.Color(0, 0, 0));
        MenujLabel4.setText("Menu");
        GranjajPanel1.add(MenujLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, 25));

        ReportesjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ReportesjLabel1.setText("Reportes");
        GranjajPanel1.add(ReportesjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mercado");
        GranjajPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, -1));

        BodegajLabel2.setForeground(new java.awt.Color(0, 0, 0));
        BodegajLabel2.setText("Bodega");
        GranjajPanel1.add(BodegajLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        SembrarjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        SembrarjLabel2.setText("Sembrar");
        GranjajPanel1.add(SembrarjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        PescarjLabel3.setForeground(new java.awt.Color(0, 0, 0));
        PescarjLabel3.setText("Pescar");
        GranjajPanel1.add(PescarjLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        CrearParcelajLabel4.setForeground(new java.awt.Color(0, 0, 0));
        CrearParcelajLabel4.setText("Crear Parcelas");
        GranjajPanel1.add(CrearParcelajLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        LimpiarTodasParcelasjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        LimpiarTodasParcelasjLabel2.setText("Limpiar todo");
        GranjajPanel1.add(LimpiarTodasParcelasjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        LimpiarUnaParcelajLabel2.setBackground(new java.awt.Color(0, 0, 0));
        LimpiarUnaParcelajLabel2.setForeground(new java.awt.Color(0, 0, 0));
        LimpiarUnaParcelajLabel2.setText("Limpiar un cuadro");
        GranjajPanel1.add(LimpiarUnaParcelajLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        ParcelasjToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Parcela.PNG"))); // NOI18N
        ParcelasjToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcelasjToggleButton5ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ParcelasjToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 60, 50));

        ComerjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Comer.PNG"))); // NOI18N
        ComerjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComerjButton2ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ComerjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 60, 50));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Comer");
        GranjajPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        DarComerAnimalesjLabel2.setForeground(new java.awt.Color(0, 0, 0));
        DarComerAnimalesjLabel2.setText("Alimentar animales");
        GranjajPanel1.add(DarComerAnimalesjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        PorParcelajLabel2.setForeground(new java.awt.Color(0, 0, 0));
        PorParcelajLabel2.setText("Parcela");
        GranjajPanel1.add(PorParcelajLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        NoDestacejLabel2.setForeground(new java.awt.Color(0, 0, 0));
        NoDestacejLabel2.setText("Parcela sin destace");
        GranjajPanel1.add(NoDestacejLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Parcela con destace");
        GranjajPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        AnimalParcelajLabel4.setForeground(new java.awt.Color(0, 0, 0));
        AnimalParcelajLabel4.setText("Un animal");
        GranjajPanel1.add(AnimalParcelajLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        ParcelaMateriaPrimajLabel4.setForeground(new java.awt.Color(0, 0, 0));
        ParcelaMateriaPrimajLabel4.setText("Parcela y producción");
        GranjajPanel1.add(ParcelaMateriaPrimajLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        ParcelaMateriaPrima2jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        ParcelaMateriaPrima2jLabel4.setText(" de materia prima");
        GranjajPanel1.add(ParcelaMateriaPrima2jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        ParcelaAlimentojLabel5.setForeground(new java.awt.Color(0, 0, 0));
        ParcelaAlimentojLabel5.setText("Parcela y producción");
        GranjajPanel1.add(ParcelaAlimentojLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        ParcelaAlimento2jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        ParcelaAlimento2jLabel6.setText("de alimento");
        GranjajPanel1.add(ParcelaAlimento2jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        GranjajPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 880, 450));

        ComerAnimalesjToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/ComerAnimales.PNG"))); // NOI18N
        ComerAnimalesjToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComerAnimalesjToggleButton1ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(ComerAnimalesjToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 70, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/FondoMenu.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        GranjajPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 650));

        LlamadoNickjLabel1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        LlamadoNickjLabel1.setForeground(new java.awt.Color(0, 0, 0));
        LlamadoNickjLabel1.setText("Bienvenid@ "+Jugador.jugador1.getNick());
        GranjajPanel1.add(LlamadoNickjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        OrojLabel2.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        OrojLabel2.setForeground(new java.awt.Color(0, 0, 0));
        OrojLabel2.setText(""+Jugador.jugador1.getMonedas());
        GranjajPanel1.add(OrojLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        OrojLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Oro.PNG"))); // NOI18N
        GranjajPanel1.add(OrojLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 50, 40));

        LogojLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Logo.PNG"))); // NOI18N
        GranjajPanel1.add(LogojLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, 50, 40));

        VidajLabel3.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        VidajLabel3.setForeground(new java.awt.Color(0, 0, 0));
        VidajLabel3.setText(""+Jugador.jugador1.getVida());
        GranjajPanel1.add(VidajLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        VidajLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Vida.PNG"))); // NOI18N
        GranjajPanel1.add(VidajLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 40, 40));

        VidajProgressBar1.setForeground(new java.awt.Color(255, 0, 0));
        GranjajPanel1.add(VidajProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, 10));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Finalizar juego");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        GranjajPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GranjajPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GranjajPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class FondoInicio extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/decoracion/FondoGranja.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    public void barraVida(){
        VidajProgressBar1.setValue(Jugador.jugador1.getVida());
    }
        
    private void LimpiarTerrenoCasillajToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTerrenoCasillajToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarTerrenoCasillajToggleButton2ActionPerformed

    private void LimpiarTerrenojToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTerrenojToggleButton2ActionPerformed
        if(LimpiarTerrenojToggleButton2.isSelected()==true){
            LimpiarTerrenojToggleButton2.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/ProcesarMini.PNG")));
        }
        else{
            LimpiarTerrenojToggleButton2.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/AnimalParcela.PNG")));
        } 
    }//GEN-LAST:event_LimpiarTerrenojToggleButton2ActionPerformed

    private void LimpiarTodoLimpiarTodojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarTodoLimpiarTodojButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarTodoLimpiarTodojButton1ActionPerformed
    
    private void SiembrajToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiembrajToggleButton3ActionPerformed
        if(SiembrajToggleButton3.isSelected()==true){
            SiembrajToggleButton3.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/Sembrando.PNG")));
        }
        else{
            SiembrajToggleButton3.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/Siembra.PNG")));
        } 
    }//GEN-LAST:event_SiembrajToggleButton3ActionPerformed
    private void ReportesjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesjButton4ActionPerformed
        this.setVisible(false);
        LlamadoInstancias.reportes();
    }//GEN-LAST:event_ReportesjButton4ActionPerformed

    private void ProcesarParcelajToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesarParcelajToggleButton3ActionPerformed
        if(ProcesarParcelajToggleButton3.isSelected()){
            ProcesarParcelajToggleButton3.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/ProcesarMini.PNG")));
        }
        else{
            ProcesarParcelajToggleButton3.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/UnaParcela.PNG")));
        }
    }//GEN-LAST:event_ProcesarParcelajToggleButton3ActionPerformed

    private void ProcesarParcelaAlimentojToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesarParcelaAlimentojToggleButton4ActionPerformed
        if(ProcesarParcelaAlimentojToggleButton4.isSelected()){
            ProcesarParcelaAlimentojToggleButton4.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/Procesar.PNG")));
        }
        else{
            ProcesarParcelaAlimentojToggleButton4.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/ParcelaAlimentos.PNG")));
        }
    }//GEN-LAST:event_ProcesarParcelaAlimentojToggleButton4ActionPerformed

    private void ProcesarParcelaMateriajToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesarParcelaMateriajToggleButton5ActionPerformed
        if(ProcesarParcelaMateriajToggleButton5.isSelected()){
            ProcesarParcelaMateriajToggleButton5.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/ProcesarMateriaPrima.PNG")));
        }
        else{
            ProcesarParcelaMateriajToggleButton5.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/MateriaPrima.PNG")));
        }
    }//GEN-LAST:event_ProcesarParcelaMateriajToggleButton5ActionPerformed

    private void ParcelaDestacejToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcelaDestacejToggleButton1ActionPerformed
        if(ParcelaDestacejToggleButton1.isSelected()){
            ParcelaDestacejToggleButton1.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/Procesar.PNG")));
        }
        else{
            ParcelaDestacejToggleButton1.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/Destace.PNG")));
        }
    }//GEN-LAST:event_ParcelaDestacejToggleButton1ActionPerformed

    private void ParcelaSinDestacejToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcelaSinDestacejToggleButton1ActionPerformed
        if(ParcelaSinDestacejToggleButton1.isSelected()){
            ParcelaSinDestacejToggleButton1.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/Procesar.PNG")));
        }
        else{
            ParcelaSinDestacejToggleButton1.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/SinDestace.PNG")));
        }
    }//GEN-LAST:event_ParcelaSinDestacejToggleButton1ActionPerformed

    private void PescarjToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PescarjToggleButton4ActionPerformed
        if(PescarjToggleButton4.isSelected()==true){
            PescarjToggleButton4.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/Pescando.PNG")));
        }
        else{
            PescarjToggleButton4.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/Pesca.PNG")));
        } 
    }//GEN-LAST:event_PescarjToggleButton4ActionPerformed

    private void MercadojButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MercadojButton3ActionPerformed
        this.setVisible(false);
        LlamadoInstancias.mercado();
    }//GEN-LAST:event_MercadojButton3ActionPerformed

    private void ParcelasjToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcelasjToggleButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ParcelasjToggleButton5ActionPerformed

    private void ComerjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComerjButton2ActionPerformed

    }//GEN-LAST:event_ComerjButton2ActionPerformed

    private void BodegajButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BodegajButton2ActionPerformed
        this.setVisible(false);
        LlamadoInstancias.bodega();    
    }//GEN-LAST:event_BodegajButton2ActionPerformed

    private void ComerAnimalesjToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComerAnimalesjToggleButton1ActionPerformed
        if(ComerAnimalesjToggleButton1.isSelected()){
            ComerAnimalesjToggleButton1.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/DarComer.PNG")));
        }
        else{
            ComerAnimalesjToggleButton1.setIcon(new javax.swing.ImageIcon(FrameGranja.this.getClass().getResource("/decoracion/ComerAnimales.PNG")));
        }
    }//GEN-LAST:event_ComerAnimalesjToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(FrameGranja.this, "Fin del juego, vuelve pronto "+Jugador.jugador1.getNick());
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccionesjLabel3;
    private javax.swing.JLabel AnimalParcelajLabel4;
    public static javax.swing.JButton BodegajButton2;
    private javax.swing.JLabel BodegajLabel2;
    public static javax.swing.JToggleButton ComerAnimalesjToggleButton1;
    public static javax.swing.JButton ComerjButton2;
    private javax.swing.JLabel CrearParcelajLabel4;
    private javax.swing.JLabel DarComerAnimalesjLabel2;
    public static javax.swing.JPanel GranjajPanel1;
    public static javax.swing.JToggleButton LimpiarTerrenoCasillajToggleButton2;
    public static javax.swing.JToggleButton LimpiarTerrenojToggleButton2;
    private javax.swing.JLabel LimpiarTodasParcelasjLabel2;
    public static javax.swing.JButton LimpiarTodojButton1;
    private javax.swing.JLabel LimpiarUnaParcelajLabel2;
    private javax.swing.JLabel LimpiezajLabel2;
    private javax.swing.JLabel LlamadoNickjLabel1;
    private javax.swing.JLabel LogojLabel7;
    private javax.swing.JLabel MenujLabel4;
    public static javax.swing.JButton MercadojButton3;
    private javax.swing.JLabel NoDestacejLabel2;
    public static javax.swing.JLabel OrojLabel2;
    private javax.swing.JLabel OrojLabel6;
    private javax.swing.JLabel ParcelaAlimento2jLabel6;
    private javax.swing.JLabel ParcelaAlimentojLabel5;
    public static javax.swing.JToggleButton ParcelaDestacejToggleButton1;
    private javax.swing.JLabel ParcelaMateriaPrima2jLabel4;
    private javax.swing.JLabel ParcelaMateriaPrimajLabel4;
    public static javax.swing.JToggleButton ParcelaSinDestacejToggleButton1;
    public static javax.swing.JToggleButton ParcelasjToggleButton5;
    private javax.swing.JLabel PescarjLabel3;
    public static javax.swing.JToggleButton PescarjToggleButton4;
    private javax.swing.JLabel PorParcelajLabel2;
    public static javax.swing.JToggleButton ProcesarParcelaAlimentojToggleButton4;
    public static javax.swing.JToggleButton ProcesarParcelaMateriajToggleButton5;
    public static javax.swing.JToggleButton ProcesarParcelajToggleButton3;
    private javax.swing.JLabel ProcesarjLabel1;
    public static javax.swing.JButton ReportesjButton4;
    private javax.swing.JLabel ReportesjLabel1;
    private javax.swing.JLabel SembrarjLabel2;
    public static javax.swing.JToggleButton SiembrajToggleButton3;
    public static javax.swing.JLabel VidajLabel3;
    private javax.swing.JLabel VidajLabel8;
    public static javax.swing.JProgressBar VidajProgressBar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
