/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author luedu
 */
public class Elegir_Dados extends javax.swing.JFrame {

    /**
     * Creates new form Dado_M
     */
    public Elegir_Dados() {
        initComponents();
        this.setLocationRelativeTo(null);
 
    }
    
  /**
 * Método para el valor _Comodin
 * @param evt 
 */
 
        public int valorcomodin(){
        int valor;
        Random rgen = new Random();
        valor = rgen.nextInt(5);

        return valor;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        D_4 = new javax.swing.JButton();
        D_6 = new javax.swing.JButton();
        D_100 = new javax.swing.JButton();
        Tirar_Dado2 = new javax.swing.JLabel();
        Tirar_Dado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        D_4.setBackground(new java.awt.Color(102, 255, 102));
        D_4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        D_4.setForeground(new java.awt.Color(255, 0, 51));
        D_4.setText("4");
        D_4.setActionCommand("Ver Reportes");
        D_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_4ActionPerformed(evt);
            }
        });

        D_6.setBackground(new java.awt.Color(102, 255, 102));
        D_6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        D_6.setForeground(new java.awt.Color(255, 0, 51));
        D_6.setText("6");
        D_6.setActionCommand("Ver Reportes");
        D_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_6ActionPerformed(evt);
            }
        });

        D_100.setBackground(new java.awt.Color(102, 255, 102));
        D_100.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        D_100.setForeground(new java.awt.Color(255, 0, 51));
        D_100.setText("100");
        D_100.setActionCommand("Ver Reportes");
        D_100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_100ActionPerformed(evt);
            }
        });

        Tirar_Dado2.setBackground(new java.awt.Color(255, 102, 0));
        Tirar_Dado2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Tirar_Dado2.setForeground(new java.awt.Color(51, 51, 51));
        Tirar_Dado2.setText("Elegir las caras del Dado");

        Tirar_Dado1.setBackground(new java.awt.Color(102, 255, 102));
        Tirar_Dado1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        Tirar_Dado1.setForeground(new java.awt.Color(51, 51, 51));
        Tirar_Dado1.setText("Tipo de Dado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tirar_Dado2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(D_4)
                        .addGap(35, 35, 35)
                        .addComponent(D_6)
                        .addGap(27, 27, 27)
                        .addComponent(D_100)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tirar_Dado1)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tirar_Dado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Tirar_Dado2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D_4)
                    .addComponent(D_6)
                    .addComponent(D_100))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_4ActionPerformed
        this.setVisible(false);
        new Dado_C().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_D_4ActionPerformed

    private void D_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_6ActionPerformed
        this.setVisible(false);
        new Dado_M().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_D_6ActionPerformed

    private void D_100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_100ActionPerformed
        this.setVisible(false);
        new Dado_A().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_D_100ActionPerformed

      
        
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
            java.util.logging.Logger.getLogger(Elegir_Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Elegir_Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Elegir_Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Elegir_Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elegir_Dados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton D_100;
    private javax.swing.JButton D_4;
    private javax.swing.JButton D_6;
    private javax.swing.JLabel Tirar_Dado1;
    private javax.swing.JLabel Tirar_Dado2;
    // End of variables declaration//GEN-END:variables
}