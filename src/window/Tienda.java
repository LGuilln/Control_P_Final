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
public class Tienda extends javax.swing.JFrame {

    /**
     * Creates new form Inicio1
     */
    public Tienda() {
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

        BComprar = new javax.swing.JButton();
        CVehiculos = new javax.swing.JButton();
        CArmas = new javax.swing.JButton();
        Bback = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BComprar.setBackground(new java.awt.Color(102, 255, 0));
        BComprar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BComprar.setText("Comprar");
        BComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BComprarActionPerformed(evt);
            }
        });
        getContentPane().add(BComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 230, 50));

        CVehiculos.setBackground(new java.awt.Color(102, 255, 0));
        CVehiculos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CVehiculos.setText("Crear Vehiculos");
        CVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVehiculosActionPerformed(evt);
            }
        });
        getContentPane().add(CVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 230, 50));

        CArmas.setBackground(new java.awt.Color(102, 255, 0));
        CArmas.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CArmas.setText("Crear Armas");
        CArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CArmasActionPerformed(evt);
            }
        });
        getContentPane().add(CArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 230, 50));

        Bback.setBackground(new java.awt.Color(102, 255, 0));
        Bback.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Bback.setText("Back");
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        getContentPane().add(Bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 100, 50));

        Exit.setBackground(new java.awt.Color(102, 255, 0));
        Exit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 690, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Descargar Pack Fondos de Pantalla Mejores juegos (310)4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVehiculosActionPerformed
        this.setVisible(false);
        new Vehiculos().setVisible(true);
      //  new NewJFrame().setVisible(true);

    }//GEN-LAST:event_CVehiculosActionPerformed

    private void CArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CArmasActionPerformed
        this.setVisible(false);
        new Armas().setVisible(true);
          
//    add your handling code here:
    }//GEN-LAST:event_CArmasActionPerformed

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed
        this.setVisible(false);
        new Option().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_BbackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void BComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BComprarActionPerformed
        this.setVisible(false);
        new Eleccion().setVisible(true);// TODO add your handling code here:
    
        // TODO add your handling code here:
    }//GEN-LAST:event_BComprarActionPerformed

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BComprar;
    private javax.swing.JButton Bback;
    private javax.swing.JButton CArmas;
    private javax.swing.JButton CVehiculos;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}