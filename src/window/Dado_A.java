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
public class Dado_A extends javax.swing.JFrame {

    /**
     * Creates new form Dado_M
     */
    public Dado_A() {
        initComponents();
        this.setLocationRelativeTo(null);
 
    }
    
  /**
 * Método para el valor _D
 * @param evt 
 */
 
        public int valorDado(){
        int valor;
        Random rgen = new Random();
        valor = rgen.nextInt(100);

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

        Valor = new javax.swing.JLabel();
        Dado_G = new javax.swing.JButton();
        Atacar = new javax.swing.JButton();
        Tirar_Dado1 = new javax.swing.JLabel();
        No_Dado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Valor.setBackground(new java.awt.Color(102, 255, 102));
        Valor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Valor.setForeground(new java.awt.Color(255, 153, 0));
        Valor.setText("Valor: ");

        Dado_G.setBackground(new java.awt.Color(102, 255, 102));
        Dado_G.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Dado_G.setForeground(new java.awt.Color(255, 0, 51));
        Dado_G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/dado.png"))); // NOI18N
        Dado_G.setActionCommand("Ver Reportes");
        Dado_G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dado_GActionPerformed(evt);
            }
        });

        Atacar.setBackground(new java.awt.Color(102, 255, 102));
        Atacar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Atacar.setForeground(new java.awt.Color(255, 0, 51));
        Atacar.setText("Atacar");
        Atacar.setActionCommand("Ver Reportes");
        Atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtacarActionPerformed(evt);
            }
        });

        Tirar_Dado1.setBackground(new java.awt.Color(102, 255, 102));
        Tirar_Dado1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        Tirar_Dado1.setForeground(new java.awt.Color(51, 51, 51));
        Tirar_Dado1.setText("\"Ataque\"");

        No_Dado.setBackground(new java.awt.Color(102, 255, 102));
        No_Dado.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        No_Dado.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Dado_G, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(No_Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Valor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(Atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Tirar_Dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Tirar_Dado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dado_G)
                .addGap(33, 33, 33)
                .addComponent(Valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(No_Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Atacar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
        
    private void Dado_GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dado_GActionPerformed
         String valor1 = String.valueOf(valorDado());
         No_Dado.setText(valor1);
      
    }//GEN-LAST:event_Dado_GActionPerformed

    private void AtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtacarActionPerformed
        this.setVisible(false);
            
        // TODO add your handling code here:
    }//GEN-LAST:event_AtacarActionPerformed

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
            java.util.logging.Logger.getLogger(Dado_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dado_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dado_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dado_A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dado_A().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atacar;
    public static javax.swing.JButton Dado_G;
    private javax.swing.JLabel No_Dado;
    private javax.swing.JLabel Tirar_Dado1;
    private javax.swing.JLabel Valor;
    // End of variables declaration//GEN-END:variables
}