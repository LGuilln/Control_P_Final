/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

/**
 *
 * @author luedu
 */
public class Vehiculos extends javax.swing.JFrame {

    /**
     * Creates new form Inicio1
     */
    public Vehiculos() {
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

        C_Tanques = new javax.swing.JButton();
        C_Aviones = new javax.swing.JButton();
        Bback = new javax.swing.JButton();
        GArmas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C_Tanques.setBackground(new java.awt.Color(102, 255, 0));
        C_Tanques.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        C_Tanques.setText("Crear Tanques");
        C_Tanques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_TanquesActionPerformed(evt);
            }
        });
        getContentPane().add(C_Tanques, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 230, 50));

        C_Aviones.setBackground(new java.awt.Color(102, 255, 0));
        C_Aviones.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        C_Aviones.setText("Crear Aviones");
        C_Aviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_AvionesActionPerformed(evt);
            }
        });
        getContentPane().add(C_Aviones, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 230, 50));

        Bback.setBackground(new java.awt.Color(102, 255, 0));
        Bback.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Bback.setText("Back");
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        getContentPane().add(Bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 100, 50));

        GArmas.setBackground(new java.awt.Color(102, 255, 0));
        GArmas.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        GArmas.setText("Guardar");
        GArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GArmasActionPerformed(evt);
            }
        });
        getContentPane().add(GArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 690, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Descargar Pack Fondos de Pantalla Mejores juegos (310)4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_TanquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_TanquesActionPerformed
        this.setVisible(false);
        new Tanques().setVisible(true);
      //  new NewJFrame().setVisible(true);

    }//GEN-LAST:event_C_TanquesActionPerformed

    private void C_AvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_AvionesActionPerformed
        this.setVisible(false);
        new Aviones().setVisible(true);
      
// TODO add your handling code here:
    }//GEN-LAST:event_C_AvionesActionPerformed

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed
        this.setVisible(false);
        new Tienda().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_BbackActionPerformed

    private void GArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GArmasActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_GArmasActionPerformed

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
            java.util.logging.Logger.getLogger(Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bback;
    private javax.swing.JButton C_Aviones;
    private javax.swing.JButton C_Tanques;
    private javax.swing.JButton GArmas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}