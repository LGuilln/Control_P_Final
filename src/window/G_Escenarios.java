/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import clases.Casilla;
import clases.CasillaMontaña;
import clases.CasillaAgua;
import clases.CasillaTerreno;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author danie
 */
public class G_Escenarios extends javax.swing.JFrame {
    int turno, contp, contmp;
    boolean gano= false;
    
  Casilla[][] tablero;
    /**
     * constructor
     * Creates new form JuegoTableros
     */
    public G_Escenarios() {
        initComponents();
         this.setLocationRelativeTo(null);
          turno = contp = contmp = 1;
        //tablero = new Casilla[8][8];
           
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonHaciaE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton8x9 = new javax.swing.JButton();
        jButton4x4 = new javax.swing.JButton();
        jButton6x4 = new javax.swing.JButton();
        panelTablero = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonHaciaE.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHaciaE.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jButtonHaciaE.setForeground(new java.awt.Color(0, 255, 0));
        jButtonHaciaE.setText("Exit");
        jButtonHaciaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHaciaEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHaciaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 800, 200, 80));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Batalla");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 340, 40));

        jButton8x9.setBackground(new java.awt.Color(255, 255, 255));
        jButton8x9.setFont(new java.awt.Font("Dubai Medium", 0, 36)); // NOI18N
        jButton8x9.setForeground(new java.awt.Color(0, 255, 0));
        jButton8x9.setText("8 x 9");
        jButton8x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8x9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8x9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 140, 60));

        jButton4x4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4x4.setFont(new java.awt.Font("Dubai Medium", 0, 36)); // NOI18N
        jButton4x4.setForeground(new java.awt.Color(0, 255, 0));
        jButton4x4.setText("4 x 4");
        jButton4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4x4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 140, 60));

        jButton6x4.setBackground(new java.awt.Color(255, 255, 255));
        jButton6x4.setFont(new java.awt.Font("Dubai Medium", 0, 36)); // NOI18N
        jButton6x4.setForeground(new java.awt.Color(0, 255, 0));
        jButton6x4.setText("6  x 4");
        jButton6x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6x4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 140, 60));

        panelTablero.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(panelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 730, 610));

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Descargar Pack Fondos de Pantalla Mejores juegos (310)4.jpg"))); // NOI18N
        getContentPane().add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    /**
     * Método para ir hacia las opciones finales del juego
     * @param evt 
     */
    private void jButtonHaciaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHaciaEActionPerformed

       this.setVisible(false);
       System.exit(0);
         
        //new OpcionesFinales().setVisible(true);
     /*   
        OpcionesFinales entrada3 = new OpcionesFinales();
        entrada3.show();
        entrada3.setSize(825, 866);
            dispose();  */  
    }//GEN-LAST:event_jButtonHaciaEActionPerformed
    /**
     * Método para mostrar el tablero, código generico
     * @param filas
     * @param columnas 
     */
    public void gTablero(int filas, int columnas){
    BorderLayout b = new BorderLayout();
    
 
        tablero =  new Casilla[filas][columnas];
        int[][] juego = new int[filas][columnas];
        Random n = new Random();
         boolean blanco = true;
         System.out.println("filas" + filas);
        for (int i = 0; i<filas; i++){
            for (int j = 0; j<columnas; j++){
                
                int c = (int)((Math.random()*3)+1);
                System.out.println(c);
                switch(c){
                    case 1: 
                        juego[i][j]= 1;
                        tablero[i][j] = new Casilla ();
                         tablero[i][j].setBounds((50*j), 50*i, 50, 50);
                          tablero[i][j]= new CasillaTerreno();
                          break;
                    case 2:
                        juego[i][j]= 2;
                        tablero[i][j] = new Casilla ();
                         tablero[i][j].setBounds((50*j), 50*i, 50, 50);
                          tablero[i][j]= new CasillaMontaña();
                          break;
                    case 3:
                        juego[i][j]= 3;
                        tablero[i][j] = new Casilla ();
                         tablero[i][j].setBounds((50*j), 50*i, 50, 50);
                          tablero[i][j]= new CasillaAgua();
                    break;
                    default:
                    break;
                    
                }
                /*blanco = !blanco;
                tablero[i][j] = new Casilla ();
               tablero[i][j].setSize(50, 50);
                if (blanco)
                    tablero[i][j].setBackground(Color.white);
                else
                    tablero[i][j].setBackground(Color.white);*/
               // blanco = !blanco;
             //tablero[i][j]= new CasillaTerreno();
              // tablero[i][j].setSize(50, 50);

                
               
             //   if (blanco)
               //     tablero[i][j] = new CasillaMontaña();
              //  else
                //    tablero[i][j] = new CasillaAgua();

                
                tablero[i][j].setVisible(true);

                tablero[i][j].setBounds((50*j), 50*i, 50, 50);
               

              //  this.remove(panelTablero);
               //  this.add(tablero[i][j], BorderLayout.CENTER);
               //this.add(panelTablero);
               
                    panelTablero.add(tablero[i][j]);
                   //  tablero[i][j].addActioLsitener(accion);
               //  panelTablero.removeAll();
       //     panelTablero.validate();
       panelTablero.updateUI();
       panelTablero.setLayout(new GridLayout(filas, columnas));
            panelTablero.repaint();
         //   tablero[i][j].removeAll();
           //tablero[i][j].repaint();
            
           
     
           
            }
           
            blanco = !blanco;
        }
        
        int d = (int) (Math.random()*4);
        int d2 = (int) (Math.random()*4);
              ImageIcon tanque = new ImageIcon("src/ImagenesD/tanquepequeño.jpg");
        Icon iconoTanque = new ImageIcon(tanque.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        tablero[d][d2].setIcon(iconoTanque);
        juego[d][d2] = 5;
        
        int a = (int) (Math.random()*4);
        int a2 = (int) (Math.random()*4);
            ImageIcon avion = new ImageIcon("src/ImagenesD/avionpequeño.jpg");
        Icon iconoAvion = new ImageIcon(avion.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
         tablero[a][a2].setIcon(iconoAvion);
        juego[a][a2] = 4;
        
        
        
    /*tablero = new Casilla[filas][columnas];
    int contX=-1,contY=-1;
    for (Casilla[] casillas : tablero) {
        contX++;
        for (Casilla casilla : casillas) {
            contY++;
            casilla = new Casilla();
           casilla.setSize(50, 50);
            //casilla.setVisible(true);
            casilla.setBounds((30), (30), 30, 30);
            panelTablero.add(casilla);
            panelTablero.validate();
            panelTablero.repaint();
           
        }
        
    }*/
}
    
     /*public void hola( Casilla tablero){
            
         if(!gano){
             if(tablero.equals(""))
             {
              if(turno*2 == 1)   {
                  tablero.getIcon("X");
                  
                  
              }
             }
         }
             
         
         
         
        }*/
    /*public int lanzardado(){
        int numero = 0;
        do{
            numero = (int) (Math.random()*10);
            
                   
                   
            
            
            
            
        }while(numero<1 || numero>6);
        
        
        
        
      return numero;
      
      
      
    } 
    public void generar(){
        for (int i = 0; i < 10; i++) {
            
        }
        
    }    */
    /**
     * Método de prueba para numeros random
     * @param N
     * @param M 
     */
    public void metodoRandom(int N, int M){
        Random n = new Random();
        n.nextInt(5);
        n.nextInt(6);
        
        
    }
    
    private void jButton4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4x4ActionPerformed
        // TODO add your handling code here:
        /*ImageIcon tanque = new ImageIcon("src/ImagenesD/tanquepequeño.jpg");
        Icon iconoTanque = new ImageIcon(tanque.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        tablero[filas][columnas].setIcon(iconoTanque);
        juego[filas][columnas] = 2;*/
        
        gTablero(4, 4);
       
        
    }//GEN-LAST:event_jButton4x4ActionPerformed

    private void jButton6x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6x4ActionPerformed
        // TODO add your handling code here:  
       
        gTablero(6, 4);
    }//GEN-LAST:event_jButton6x4ActionPerformed

    private void jButton8x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8x9ActionPerformed
        // TODO add your handling code here:
         
        gTablero(8, 9);
    }//GEN-LAST:event_jButton8x9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(G_Escenarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_Escenarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_Escenarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_Escenarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_Escenarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4x4;
    private javax.swing.JButton jButton6x4;
    private javax.swing.JButton jButton8x9;
    private javax.swing.JButton jButtonHaciaE;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblImg;
    private javax.swing.JPanel panelTablero;
    // End of variables declaration//GEN-END:variables
}
