/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;


import clases.Casilla;
import clases.CasillaAgua;
import clases.CasillaMontaña;
import clases.Persona;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author lueduardogr
 */
public class Escenarios extends javax.swing.JFrame {
  Casilla[][] tablero;
    /**
     * Creates new form JuegoTableros
     */
    public Escenarios() {
        initComponents();
          this.setLocationRelativeTo(null);
        setTitle("FEROVA GAME");
        //tablero = new Casilla[8][8];
           
     
    }
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
        getContentPane().setLayout(null);

        jButtonHaciaE.setBackground(new java.awt.Color(255, 255, 255));
        jButtonHaciaE.setFont(new java.awt.Font("Dubai", 3, 24)); // NOI18N
        jButtonHaciaE.setForeground(new java.awt.Color(0, 255, 0));
        jButtonHaciaE.setText("Fin batalla");
        jButtonHaciaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHaciaEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHaciaE);
        jButtonHaciaE.setBounds(930, 770, 200, 80);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Generar Tablero");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(670, 10, 340, 40);

        jButton8x9.setBackground(new java.awt.Color(255, 255, 255));
        jButton8x9.setFont(new java.awt.Font("Dubai Medium", 0, 36)); // NOI18N
        jButton8x9.setForeground(new java.awt.Color(0, 255, 0));
        jButton8x9.setText("8 x 9");
        jButton8x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8x9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8x9);
        jButton8x9.setBounds(760, 210, 140, 60);

        jButton4x4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4x4.setFont(new java.awt.Font("Dubai Medium", 0, 36)); // NOI18N
        jButton4x4.setForeground(new java.awt.Color(0, 255, 0));
        jButton4x4.setText("4 x 4");
        jButton4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4x4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4x4);
        jButton4x4.setBounds(760, 70, 140, 60);

        jButton6x4.setBackground(new java.awt.Color(255, 255, 255));
        jButton6x4.setFont(new java.awt.Font("Dubai Medium", 0, 36)); // NOI18N
        jButton6x4.setForeground(new java.awt.Color(0, 255, 0));
        jButton6x4.setText("6  x 4");
        jButton6x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6x4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6x4);
        jButton6x4.setBounds(760, 140, 140, 60);

        panelTablero.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(panelTablero);
        panelTablero.setBounds(30, 30, 580, 500);

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Descargar Pack Fondos de Pantalla Mejores juegos (310)4.jpg"))); // NOI18N
        getContentPane().add(lblImg);
        lblImg.setBounds(0, 0, 1063, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButtonHaciaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHaciaEActionPerformed
        // TODO add your handling code here:
       /* OpcionesFinales entrada3 = new OpcionesFinales();
        entrada3.show();
        entrada3.setSize(825, 866);
       dispose();
        /*/
    }//GEN-LAST:event_jButtonHaciaEActionPerformed
    public void setCasilla(int tipoTerreno, int x, int y){
        tablero[x][y]= null;
        if (tipoTerreno == 1) {
            
            tablero[x][y] = new CasillaAgua();
        }else{
            tablero[x][y]= new CasillaMontaña();
        }
    }

    public void gTablero(int filas, int columnas){
    BorderLayout b = new BorderLayout();
   
 
        tablero =  new Casilla[filas][columnas];
         boolean blanco = true;
         System.out.println("filas" + filas);
        for (int i = 0; i<filas; i++){
            for (int j = 0; j<columnas; j++){

                blanco = !blanco;
                tablero[i][j] = new Casilla ();
               tablero[i][j].setSize(50, 50);
                if (blanco)
                    tablero[i][j].setBackground(Color.white);
                else
                    tablero[i][j].setBackground(Color.white);
                
                tablero[i][j].setVisible(true);

                tablero[i][j].setBounds((50*j), 50*i, 50, 50);
               

                this.remove(panelTablero);
              //   this.add(tablero[i][j], BorderLayout.CENTER);
               this.add(panelTablero);
                     panelTablero.add(tablero[i][j]);
            panelTablero.repaint();
            tablero[i][j].removeAll();
            
            }
            
            blanco = !blanco;
        }
   }
     
    private void jButton4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4x4ActionPerformed
        // TODO add your handling code here:
         
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
            java.util.logging.Logger.getLogger(Escenarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escenarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escenarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escenarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escenarios().setVisible(true);
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