/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;


import clases.Aviones_C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static window.Aviones.contenedor_avion;
import static window.Aviones.nombre_avion;
import static window.Bienvenida.pathAviones;

/**
 *
 * @author danie
 */
public class T_Aviones extends javax.swing.JFrame {
   
    private DefaultTableModel modelo;
    int cont = 0;


    /**
     * Creates new form Estadisticas
     */
    public T_Aviones() {
        initComponents();
        this.setLocationRelativeTo(null);
        readBinario();
        CargarRegistrar();
        Cargardatos();
        
    }
public void CargarRegistrar(){
    String datos [][]= {};
    String columna[]= {"Avion", "Presicion","Ataque", "Defensa", "Velocidad", "Precio"};
    
    
        
  
    
    modelo= new DefaultTableModel(datos, columna);
    jTableAviones.setModel(modelo);
    
}


    public void readBinario(){
        contenedor_avion.clear();
        ObjectInputStream binario = null;
        try {
            String nameFile = nombre_avion.getText();
            File file_av = new File("Aviones");
            
            
            
            for (String string2:file_av.list()) {
                
                binario = new ObjectInputStream(new FileInputStream(pathAviones+string2));
                Aviones_C av = (Aviones_C) binario.readObject();
                contenedor_avion.add(av);
                
            }
            
            
            
            
        } catch (Exception ext) {
            ext.printStackTrace();
           // Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                binario.close();
            } catch (IOException ext) {
                Logger.getLogger(Aviones.class.getName()).log(Level.SEVERE, null, ext);
            }
        }
        
    }
    
            public void Cargardatos(){
                Aviones_C c;
                for (int i = 0; i < Aviones.contenedor_avion.size(); i++) {
                    c= (Aviones_C)Aviones.contenedor_avion.get(i);
                    modelo.insertRow(cont, new Object []{ });
                    modelo.setValueAt(c.getAvion(), cont, 0);
                    modelo.setValueAt(c.getPresicion(), cont, 1);
                    modelo.setValueAt(c.getAtaque(), cont, 2);
                    modelo.setValueAt(c.getDefensa(), cont, 3);
                    modelo.setValueAt(c.getVelocidad(), cont, 4);
                    modelo.setValueAt(c.getPrecio(),cont,5);
                    
                 
                }
                    
                
                
            }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBack1 = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonJugar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Import = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAviones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstadisticas1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack1.setBackground(new java.awt.Color(255, 255, 51));
        jButtonBack1.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        jButtonBack1.setText("Back");
        jButtonBack1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonBack1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 800, -1, -1));

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 51));
        jButtonDelete.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonDeleteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 800, -1, -1));

        jButtonJugar.setBackground(new java.awt.Color(255, 255, 51));
        jButtonJugar.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        jButtonJugar.setText("Jugar");
        jButtonJugar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonJugarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 800, 110, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Aviones");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 280, 100));

        Import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/expor.png"))); // NOI18N
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });
        getContentPane().add(Import, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 80, 70));

        jTableAviones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableAviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Avion", "Presicion", "Ataque", "Defensa", "Velocidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTableAviones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 950, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Descargar Pack Fondos de Pantalla Mejores juegos (310)4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jTableEstadisticas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableEstadisticas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Vehículo 1", "Vehículo 2", "Vehículo 3"
            }
        ));
        jScrollPane2.setViewportView(jTableEstadisticas1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 950, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBack1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonBack1AncestorAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBack1AncestorAdded

    private void jButtonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack1ActionPerformed
        this.setVisible(false);
        new Tienda().setVisible(true);        //new interfaz().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBack1ActionPerformed

    private void jButtonDeleteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonDeleteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteAncestorAdded

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        if(jTableAviones.getSelectedRow()==-1){
            if(jTableAviones.getRowCount()<=0){
            }else{
            }
        }else{
            if(JOptionPane.showConfirmDialog(null,"¿Eliminar Registro?")==0){
                DefaultTableModel model = (DefaultTableModel) jTableAviones.getModel();
                model.removeRow(jTableAviones.getSelectedRow());
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonJugarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonJugarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonJugarAncestorAdded

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
        this.setVisible(false);
        new Option().setVisible(true);        //new interfaz().setVisible(true);

// new NewJFrame().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonJugarActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed

        String filePath = "C:\\Users\\luedu\\Documents\\NetBeansProjects\\P_Final\\file(Aviones).txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < jTableAviones.getRowCount(); i++){//rows
                for(int j = 0; j < jTableAviones.getColumnCount(); j++){//columns
                    bw.write(jTableAviones.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(T_Aviones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImportActionPerformed

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
            java.util.logging.Logger.getLogger(T_Aviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T_Aviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T_Aviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T_Aviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new T_Aviones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Import;
    private javax.swing.JButton jButtonBack1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAviones;
    private javax.swing.JTable jTableEstadisticas1;
    // End of variables declaration//GEN-END:variables
}
