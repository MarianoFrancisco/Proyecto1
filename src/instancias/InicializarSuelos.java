
package instancias;

import hilosAnimales.*;
import hilosPlantas.*;
import static instancias.FrameGranja.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import jugador.HiloPescar;
import jugador.Jugador;
import static manejadorDatos.AlmacenamientoUsuarioAnimales.almacenamientoUsuarioAnimales;
import suelos.CreacionSueloInicial;
import static suelos.CreacionSueloInicial.sueloElegir;
import suelos.SueloAgua;
import suelos.SueloDesierto;
import suelos.SueloGrama;
import static manejadorDatos.AlmacenamientoUsuarioPlantas.almacenamientoUsuarioPlantas;
import static manejadorDatos.EstablecerReportes.establecerReportes;

/**
 *
 * @author Mariano
 */
public class InicializarSuelos {
    int condicionM=9;
    int condicionN=9;
    int filas=9;
    int columnas=9;
    JButton[][] suelo;
    public static InicializarSuelos inicializarSuelos;
    //Iniciamos hilos uwu
    public static HiloMuerteMaiz hiloMuerteMaiz;
    public static HiloMaizCosecha hiloMaizCosecha;
    public static HiloMuerteArroz hiloMuerteArroz;
    public static HiloArrozCosecha hiloArrozCosecha;
    public static HiloMuerteFrijol hiloMuerteFrijol;
    public static HiloFrijolCosecha hiloFrijolCosecha;
    public static HiloMuerteManzano hiloMuerteManzano;
    public static HiloManzanoCosecha hiloManzanoCosecha;
    public static HiloMuerteNaranjo hiloMuerteNaranjo;
    public static HiloNaranjoCosecha hiloNaranjoCosecha;
    public static HiloMuerteBanano hiloMuerteBanano;
    public static HiloBananoCosecha hiloBananoCosecha;
    public static HiloPescar hiloPescar;
    public static HiloCerdo hiloCerdo;
    public static HiloGallina hiloGallina;
    public static HiloLlama hiloLlama;
    public static HiloVaca hiloVaca;
    public static HiloPavo hiloPavo;
    public static HiloOveja hiloOveja;
    public static HiloMuerteCerdo hiloMuerteCerdo;
    public static HiloMuerteGallina hiloMuerteGallina;
    public static HiloMuerteLlama hiloMuerteLlama;
    public static HiloMuerteOveja hiloMuerteOveja;
    public static HiloMuerteVaca hiloMuerteVaca;
    public static HiloMuertePavo hiloMuertePavo;
    
    public void inicializarSuelos(){
        int x=0;
        int y=100;
        suelo = new JButton[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suelo[i][j] = new JButton();
                suelo[i][j].setBounds(y, x, 70, 50);
                FrameGranja.jPanel1.add(suelo[i][j]);
                CreacionSueloInicial.crearCreacionSueloInicial();
                CreacionSueloInicial.sueloCreador.crearSuelos();
                CreacionSueloInicial.sueloCreador.llamadoCrearSueloInicial();   
                if(CreacionSueloInicial.sueloInicial[3].getPorcentaje()==0.35){
                    sueloElegir[i][j] = new SueloAgua();
                    suelo[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Agua.PNG")));
                }
                else if(CreacionSueloInicial.sueloInicial[3].getPorcentaje()==0.25){
                    suelo[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Desierto.PNG")));
                    sueloElegir[i][j] = new SueloDesierto();
                }
                else{
                    suelo[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Grama.PNG")));
                    sueloElegir[i][j] = new SueloGrama();
                }   
                x+=50;
                suelo[i][j].setVisible(false);
                if(2<=i&&i<=6){
                    if(2<=j&&j<=6){
                        suelo[i][j].setVisible(true);
                    }
                }
            }
            y+=70;
            x=0;
        }
    }
    public void inicializarAcciones(){
        for (int m = 0; m < condicionM; m++) {
            for (int n = 0; n < condicionN; n++) {
                int k=m;
                int l=n;
                suelo[m][n].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) { 
                        if (SiembrarjToggleButton3.isSelected()) {
                             
                            if(sueloElegir[k][l].getPorcentaje()==0.35){
                                JOptionPane.showMessageDialog(null,"No puedes sembrar en agua");
                            }
                            else if(sueloElegir[k][l].getPorcentaje()==0.25){
                                JOptionPane.showMessageDialog(null, "No podemos hacer nada en el desierto");
                            }
                            else{
                                if (PescarjToggleButton4.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion pesca para poder sembrar");
                                }
                                if(ParcelasjToggleButton5.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion parcelas para poder sembrar");
                                }
                                else{
                                    if(almacenamientoUsuarioPlantas.getControladorSembrarMaiz()>=5){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/MaizSembrado.PNG")));
                                        establecerReportes.setCeldasSembradas(establecerReportes.getCeldasSembradas()+1);
                                        JOptionPane.showMessageDialog(null, "Sembraste maiz");
                                        try {
                                            SueloGrama.Siembra();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(InicializarSuelos.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        
                                        
                                    }
                                    if(almacenamientoUsuarioPlantas.getControladorSembrarFrijol()>=8){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/FrijolSembrado.PNG")));  
                                        establecerReportes.setCeldasSembradas(establecerReportes.getCeldasSembradas()+1);
                                        JOptionPane.showMessageDialog(null, "Sembraste frijol");
                                        try {
                                            SueloGrama.Siembra();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(InicializarSuelos.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        
                                        
                                        
                                    }
                                    if(almacenamientoUsuarioPlantas.getControladorSembrarArroz()>=8){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/ArrozSembrado.PNG")));
                                        establecerReportes.setCeldasSembradas(establecerReportes.getCeldasSembradas()+1);
                                        JOptionPane.showMessageDialog(null, "Sembraste arroz");
                                        try {
                                            SueloGrama.Siembra();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(InicializarSuelos.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    if(almacenamientoUsuarioPlantas.getControladorSembrarManzano()>=3){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/ManzanoSembrado.PNG")));
                                        establecerReportes.setCeldasSembradas(establecerReportes.getCeldasSembradas()+1);
                                        JOptionPane.showMessageDialog(null, "Sembraste manzano");
                                        try {
                                            SueloGrama.Siembra();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(InicializarSuelos.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        
                                        
                                        
                                        
                                    }
                                    if(almacenamientoUsuarioPlantas.getControladorSembrarNaranjo()>=3){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/NaranjoSembrado.PNG")));
                                        establecerReportes.setCeldasSembradas(establecerReportes.getCeldasSembradas()+1);
                                        JOptionPane.showMessageDialog(null, "Sembraste naranjo");
                                        try {
                                            SueloGrama.Siembra();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(InicializarSuelos.class.getName()).log(Level.SEVERE, null, ex);
                                        }         
                                        
                                    }
                                    if(almacenamientoUsuarioPlantas.getControladorSembrarBanano()>=5){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/BananoSembrado.PNG")));
                                        establecerReportes.setCeldasSembradas(establecerReportes.getCeldasSembradas()+1);
                                        JOptionPane.showMessageDialog(null, "Sembraste banano");
                                        try {
                                            SueloGrama.Siembra();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(InicializarSuelos.class.getName()).log(Level.SEVERE, null, ex);
                                        }       
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Primero necesitas la cantidad de semillas para sembrar y seleccionar que planta sembrar");
                                    }
                                    
                                }
                            }
                        }
                        if(LimpiarTerrenoCasillajToggleButton3.isSelected()){
                            if(sueloElegir[k][l].getPorcentaje()==0.35){
                                suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Agua.PNG")));
                            }
                            else if(sueloElegir[k][l].getPorcentaje()==0.25){
                                JOptionPane.showMessageDialog(null, "No podemos hacer nada en el desierto");
                            }
                            else{
                                suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Grama.PNG")));
                            }
                        }
                        if(ColocarAnimalesjToggleButton1.isSelected()){
                            if(sueloElegir[k][l].getPorcentaje()==0.35){
                                JOptionPane.showMessageDialog(null,"No puedes poner animales en agua");
                            }
                            else if(sueloElegir[k][l].getPorcentaje()==0.25){
                                JOptionPane.showMessageDialog(null, "No podemos hacer nada en el desierto");
                            }
                            else{
                                if (PescarjToggleButton4.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion pesca para poder colocar animal");
                                }
                                if(ParcelasjToggleButton5.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion parcelas para poder colocar");
                                }
                                else{
                                    if(almacenamientoUsuarioAnimales.getControladorPonerCerdo()>=1){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Cerdo.PNG")));
                                        JOptionPane.showMessageDialog(null, "Colocaste cerdo :3");
                                        SueloGrama.ParcelaCrianza();
                                        
                                    }
                                    if(almacenamientoUsuarioAnimales.getControladorPonerPavo()>=1){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Pavo.PNG")));
                                        JOptionPane.showMessageDialog(null, "Colocaste pavo :3");
                                        SueloGrama.ParcelaCrianza();
                                        
                                    }
                                    if(almacenamientoUsuarioAnimales.getControladorPonerGallina()>=1){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Gallina.PNG")));
                                        JOptionPane.showMessageDialog(null, "Colocaste gallina :3");
                                        SueloGrama.ParcelaCrianza();
                                        
                                    }
                                    if(almacenamientoUsuarioAnimales.getControladorPonerVaca()>=1){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Vaca.PNG")));
                                        JOptionPane.showMessageDialog(null, "Colocaste vaca :3");
                                        SueloGrama.ParcelaCrianza();
                                        
                                    }
                                    if(almacenamientoUsuarioAnimales.getControladorPonerOveja()>=1){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Oveja.PNG")));
                                        JOptionPane.showMessageDialog(null, "Colocaste cerdo :3");
                                        SueloGrama.ParcelaCrianza();
                                        
                                    }
                                    if(almacenamientoUsuarioAnimales.getControladorPonerLlama()>=1){
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Llama.PNG")));
                                        JOptionPane.showMessageDialog(null, "Colocaste cerdo :3");
                                        SueloGrama.ParcelaCrianza();
                                        
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Primero necesitas una cria seleccionada");
                                    }
                            }
                            }
                            
                        }
                        if(ParcelasjToggleButton5.isSelected()){
                            if(sueloElegir[k][l].getPorcentaje()==0.35){
                                JOptionPane.showMessageDialog(null,"No puedes poner parcela en agua");
                            }
                            else if(sueloElegir[k][l].getPorcentaje()==0.25){
                                JOptionPane.showMessageDialog(null, "No podemos hacer nada en el desierto");
                            }
                            else{
                                if (PescarjToggleButton4.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion pesca para poder poner parcelas");
                                }
                                if(SiembrarjToggleButton3.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion sembrar para poder poner parcelas");
                                }
                                else{
                                    if(Jugador.jugador1.getMonedas()>=3){
                                        Jugador.jugador1.setMonedas(Jugador.jugador1.getMonedas()-3);
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/SiembraParcela.PNG")));
                                        
                                        OrojLabel2.setText(""+Jugador.jugador1.getMonedas());   
                                        
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Necesitas primero comprar semillas");
                                    }
                                }
                            }
                        }
                        if (PescarjToggleButton4.isSelected()) {
                            if(sueloElegir[k][l].getPorcentaje()==0.35){
                                if (SiembrarjToggleButton3.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion sembrar para poder pescar");
                                }
                                if(ParcelasjToggleButton5.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion parcelas para poder sembrar");
                                }
                                else{
                                    if(Jugador.jugador1.getBarco()>0){
                                        Jugador.jugador1.setBarco(Jugador.jugador1.getBarco()-1);
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/AccionPescar.PNG")));
                                        SueloAgua.Pesca();
                                        OrojLabel2.setText(""+Jugador.jugador1.getMonedas());
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Necesitas primero comprar un barco");
                                    }
                                }
                                
                            }
                            else if(sueloElegir[k][l].getPorcentaje()==0.25){
                                JOptionPane.showMessageDialog(null, "No podemos hacer nada en el desierto");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "No puedes pescar en grama");;
                            }
                        }
                    }
                }); 
            }
        }
        
    }

    public void generadorCompraTerreno(){
        //primeros candidatos
        if(Jugador.jugador1.getSuelo()==3)suelo[1][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==5)suelo[1][2].setVisible(true);
        if(Jugador.jugador1.getSuelo()==1)suelo[1][3].setVisible(true);
        if(Jugador.jugador1.getSuelo()==7)suelo[1][4].setVisible(true);
        if(Jugador.jugador1.getSuelo()==2)suelo[1][5].setVisible(true);
        if(Jugador.jugador1.getSuelo()==4)suelo[1][6].setVisible(true);
        if(Jugador.jugador1.getSuelo()==6)suelo[1][7].setVisible(true);
        if(Jugador.jugador1.getSuelo()==9)suelo[2][7].setVisible(true);
        if(Jugador.jugador1.getSuelo()==10)suelo[3][7].setVisible(true);
        if(Jugador.jugador1.getSuelo()==16)suelo[4][7].setVisible(true);
        if(Jugador.jugador1.getSuelo()==12)suelo[5][7].setVisible(true);
        if(Jugador.jugador1.getSuelo()==8)suelo[6][7].setVisible(true);
        if(Jugador.jugador1.getSuelo()==24)suelo[7][7].setVisible(true);
        if(Jugador.jugador1.getSuelo()==11)suelo[2][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==18)suelo[3][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==14)suelo[4][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==15)suelo[5][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==23)suelo[6][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==22)suelo[7][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==20)suelo[7][2].setVisible(true);
        if(Jugador.jugador1.getSuelo()==17)suelo[7][3].setVisible(true);
        if(Jugador.jugador1.getSuelo()==21)suelo[7][4].setVisible(true);
        if(Jugador.jugador1.getSuelo()==19)suelo[7][5].setVisible(true);
        if(Jugador.jugador1.getSuelo()==13)suelo[7][6].setVisible(true);
        //segundos valores
        if(Jugador.jugador1.getSuelo()==25)suelo[0][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==32)suelo[0][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==53)suelo[0][2].setVisible(true);
        if(Jugador.jugador1.getSuelo()==35)suelo[0][3].setVisible(true);
        if(Jugador.jugador1.getSuelo()==44)suelo[0][4].setVisible(true);
        if(Jugador.jugador1.getSuelo()==28)suelo[0][5].setVisible(true);
        if(Jugador.jugador1.getSuelo()==52)suelo[0][6].setVisible(true);
        if(Jugador.jugador1.getSuelo()==34)suelo[0][7].setVisible(true);
        if(Jugador.jugador1.getSuelo()==54)suelo[0][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==26)suelo[1][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==43)suelo[2][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==36)suelo[3][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==27)suelo[4][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==45)suelo[5][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==33)suelo[6][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==42)suelo[7][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==51)suelo[8][0].setVisible(true);
        if(Jugador.jugador1.getSuelo()==29)suelo[1][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==37)suelo[2][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==46)suelo[3][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==55)suelo[4][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==50)suelo[5][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==41)suelo[6][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==30)suelo[7][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==38)suelo[8][8].setVisible(true);
        if(Jugador.jugador1.getSuelo()==47)suelo[8][1].setVisible(true);
        if(Jugador.jugador1.getSuelo()==49)suelo[8][2].setVisible(true);
        if(Jugador.jugador1.getSuelo()==31)suelo[8][3].setVisible(true);
        if(Jugador.jugador1.getSuelo()==39)suelo[8][4].setVisible(true);
        if(Jugador.jugador1.getSuelo()==56)suelo[8][5].setVisible(true);
        if(Jugador.jugador1.getSuelo()==40)suelo[8][6].setVisible(true);
        if(Jugador.jugador1.getSuelo()==48)suelo[8][7].setVisible(true);
    }
    public static void llamarInicializarSuelos(){
        inicializarSuelos = new InicializarSuelos();
    }
}
