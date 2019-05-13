/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import clases.Persona;
import java.io.File;
import static window.Registro.list;

/**
 *
 * @author luedu
 */
public class Bienvenida extends javax.swing.JFrame {

    /**
     * Creates new form Inicio1
     */
    public Bienvenida() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
                                  
/**
 * Método para iniciar el juego
 * @param evt 
 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BJugar = new javax.swing.JButton();
        BReportes = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BJugar.setBackground(new java.awt.Color(102, 255, 0));
        BJugar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BJugar.setText("Jugar");
        BJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJugarActionPerformed(evt);
            }
        });
        getContentPane().add(BJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 230, 50));

        BReportes.setBackground(new java.awt.Color(102, 255, 0));
        BReportes.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BReportes.setText("Reportes");
        BReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReportesActionPerformed(evt);
            }
        });
        getContentPane().add(BReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 230, 50));

        ButtonSalir.setBackground(new java.awt.Color(102, 255, 0));
        ButtonSalir.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ButtonSalir.setText("Exit");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Descargar Pack Fondos de Pantalla Mejores juegos (310)4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJugarActionPerformed
        this.setVisible(false);
        new Option().setVisible(true);

    }//GEN-LAST:event_BJugarActionPerformed

    private void BReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReportesActionPerformed
       
      Registro principa2 = new Registro();
      principa2.show();
      principa2.setVisible(false);
       
      G_Partidas principal = new G_Partidas();
      principal.show();
      this.setVisible(false); 
       
        // TODO add your handling code here:
    }//GEN-LAST:event_BReportesActionPerformed

                                      
/**
 * Método de Salida
 * @param  
 */
    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        File createCarpeta = new File("Persona");
        File createCarpeta1 = new File("Armas");
        File createCarpeta2 = new File("Avioness");
        File createCarpeta3 = new File("Tanquess");
          File createCarpeta4= new File("Partidas");
       if (!createCarpeta.exists()) {
            createCarpeta.mkdir();
        }
        
        pathPersona = createCarpeta.getAbsolutePath()+File.separatorChar;
        pathArmas = createCarpeta1.getAbsolutePath()+File.separatorChar;
        pathAviones = createCarpeta2.getAbsolutePath()+File.separatorChar;
        pathTanques = createCarpeta3.getAbsolutePath()+File.separatorChar;
        pathPartidas = createCarpeta4.getAbsolutePath()+File.separatorChar;
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }
    public static String pathArmas;
    public static String pathTanques;
    public static String pathAviones;
    public static String pathPartidas;
    public static String pathPersona;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BJugar;
    private javax.swing.JButton BReportes;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
