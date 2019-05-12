
package window;

import clases.Persona;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import static window.Bienvenida.pathPersona;
import clases.HTML;
/**
 *
 * @author luedu
 */
public class Registro extends javax.swing.JFrame {

    public static LinkedList list = new LinkedList();
    public int buscar;
    
    public static ArrayList<Persona> sur = new ArrayList<>();
        File lista = new File("reporte.html");
    HTML ht = new HTML();
    static int cont;

//     String barra = File.separator;
  //  String ubicacion = System.getProperty("user.dir" + barra+ "\\Registros"+barra);
   
    
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
 
    }

   /* private void Crear(){
    
        String archivo = nickname.getText()+ ".registros";
        File crea_ubicacion = new File (ubicacion);
        File crea_archivo = new File (ubicacion+archivo);
         if(nickname.getText().equals("")){
             JOptionPane.showMessageDialog(rootPane, "No hay NickName");
        }else{
             
             try{
             
             if(crea_archivo.exists()){
             JOptionPane.showMessageDialog(rootPane, "El Registro ya Existe");
             }else{
             
                 crea_ubicacion.mkdirs();
                 Formatter crea = new Formatter(ubicacion+archivo);
               crea.format ("%s\r\n%s\r\n%s\r\n%s", 
                         "NickName="+nickname.getText(),
                         "Vehiculo 1="+v_1.getText(), "Vehiculo 2="+v_2.getText(),
                         "Vehiculo 3="+v_3.getText());
                 crea.close();
                 
                 
             }
             } catch (Exception e){
               JOptionPane.showMessageDialog(rootPane, "No Creado");
 
                 
             }
             
             
             
             
         } 

    }*/
    
 /**
 * Método para C_Binario
 * @param evt 
 */
   public void createBin(){
        ObjectOutputStream binario = null;
        try {
            String nameFile = nickname.getText();
            File file = new File(nameFile);
            Persona persona = (Persona) list.getLast();
           
            binario = new ObjectOutputStream(new FileOutputStream(pathPersona+persona.getNombre()+".person"));
            binario.writeObject(persona);
            
        } catch (Exception ex) {
            ex.printStackTrace();
           // Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                binario.close();
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
     
   /*    public void createBin_Par(){
        ObjectOutputStream binario = null;
        try {
            String nameFile = nickname.getText();
            File file_par = new File(nameFile);
            Persona partidas = (Persona) list.getLast();
            
            binario = new ObjectOutputStream(new FileOutputStream(pathPartidas+partidas.getNombre()+".partidas"));
            binario.writeObject(partidas);
            
        } catch (Exception ex) {
            ex.printStackTrace();
           // Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                binario.close();
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    /*/
    
   public void reportes(){
        
                  try {
              FileWriter jj = new FileWriter(lista);
              BufferedWriter bw = new BufferedWriter(jj);
             
             ht.generarEncabezado("Vehiculos");
             ht.generarpestania("Nombre", "Tipo", "Vehiculo 2", "Vehiculo 3");
             bw.write(ht.salida);
             bw.newLine();
             for(int i =0; i<sur.size();i++){
                  ht.generarFilaHTML(sur.get(i).nombre, sur.get(i).tipo1, sur.get(i).tipo2, sur.get(i).tipo3);
                  bw.write(ht.filatxt);
                  bw.newLine();
              }
             ht.generarCola();
             bw.write(ht.cola);
             bw.newLine();
             bw.close();
             jj.close();
          } catch (Exception e) {
              
          }
    }   
 
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("lueduardogr/picture/iconin.png"));
        return retValue;
    }
    public void contador(){
        Partidas.setText(Integer.toString(cont));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Partidas = new javax.swing.JTextField();
        jlNickname = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Jugar = new javax.swing.JButton();
        jButton3Reportes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nickname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        v_1 = new javax.swing.JTextField();
        v_2 = new javax.swing.JTextField();
        v_3 = new javax.swing.JTextField();
        CB3 = new javax.swing.JComboBox<>();
        CB2 = new javax.swing.JComboBox<>();
        CB1 = new javax.swing.JComboBox<>();
        Save = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        M_1 = new javax.swing.JTextField();
        M_2 = new javax.swing.JTextField();
        M_3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Partidas.setEditable(false);
        Partidas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Partidas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Partidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartidasActionPerformed(evt);
            }
        });
        getContentPane().add(Partidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 30, 30));

        jlNickname.setBackground(new java.awt.Color(102, 255, 102));
        jlNickname.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jlNickname.setForeground(new java.awt.Color(51, 255, 51));
        jlNickname.setText("NickName:");
        jlNickname.setAutoscrolls(true);
        getContentPane().add(jlNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        Back.setBackground(new java.awt.Color(102, 255, 102));
        Back.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 0, 51));
        Back.setText("Back");
        Back.setActionCommand("Ver Reportes");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 90, -1));

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Vehiculo 3:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 220, -1));

        Jugar.setBackground(new java.awt.Color(102, 255, 102));
        Jugar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Jugar.setForeground(new java.awt.Color(255, 0, 51));
        Jugar.setText("Jugar");
        Jugar.setActionCommand("Ver Reportes");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });
        getContentPane().add(Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, -1, -1));

        jButton3Reportes.setBackground(new java.awt.Color(102, 255, 102));
        jButton3Reportes.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton3Reportes.setForeground(new java.awt.Color(255, 0, 0));
        jButton3Reportes.setText("Estadisticas");
        jButton3Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ReportesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/register.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        nickname.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        nickname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 370, 30));

        jLabel7.setBackground(new java.awt.Color(102, 255, 102));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("Vehiculo 1:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 190, -1));

        jLabel8.setBackground(new java.awt.Color(102, 255, 102));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("Vehiculo 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 220, -1));

        v_1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        v_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(v_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 240, 30));

        v_2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        v_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        v_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_2ActionPerformed(evt);
            }
        });
        getContentPane().add(v_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 240, 30));

        v_3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        v_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(v_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 240, 30));

        CB3.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        CB3.setForeground(new java.awt.Color(51, 0, 51));
        CB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija Vehículo", "Avión", "Tanque", " " }));
        CB3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB3ItemStateChanged(evt);
            }
        });
        CB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB3ActionPerformed(evt);
            }
        });
        getContentPane().add(CB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        CB2.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        CB2.setForeground(new java.awt.Color(51, 0, 51));
        CB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija Vehículo", "Avión", "Tanque", " " }));
        CB2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB2ItemStateChanged(evt);
            }
        });
        CB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB2ActionPerformed(evt);
            }
        });
        getContentPane().add(CB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        CB1.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        CB1.setForeground(new java.awt.Color(51, 0, 51));
        CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija Vehículo", "Avión", "Tanque", " " }));
        CB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB1ItemStateChanged(evt);
            }
        });
        CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB1ActionPerformed(evt);
            }
        });
        getContentPane().add(CB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        Save.setBackground(new java.awt.Color(102, 255, 102));
        Save.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 0, 51));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save.png"))); // NOI18N
        Save.setActionCommand("Ver Reportes");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 60, 70));

        Clean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/clean.jpg"))); // NOI18N
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });
        getContentPane().add(Clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 80, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/WallpaperIz.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        M_1.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        getContentPane().add(M_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        M_2.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        getContentPane().add(M_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        M_3.setFont(new java.awt.Font("Dubai", 3, 18)); // NOI18N
        getContentPane().add(M_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ReportesActionPerformed
        this.setVisible(false); 
        new Estadisticas().setVisible(true);
       
        
        
        
       // new Reportes().setVisible(true);
    }//GEN-LAST:event_jButton3ReportesActionPerformed

    
    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        cont++;
        this.setVisible(false); 
        new G_Escenarios().setVisible(true);
        
             
  

        
// TODO add your handling code here:
    }//GEN-LAST:event_JugarActionPerformed

 /**
 * Método para guardar
 * @param evt 
 */
 
    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
     contador();
     cont++;
     String nombre = nickname.getText();
     String v1 = v_1.getText();
     String v2 = v_2.getText();
     String v3 = v_3.getText();
     String tipo1 = M_1.getText();
     String tipo2 = M_2.getText();
     String tipo3 = M_3.getText();
     
        //NOMBRE DE LA PERSONA ATRUBUTOS
       Persona  person = new Persona( nombre, v1, v2, v3, tipo1, tipo2, tipo3);
        list.add(person);
        sur.add(person);
        //Limpia
     
        nickname.setText("");
        v_1.setText("");
        v_2.setText("");
        v_3.setText("");
     
        Persona p = (Persona)list.getLast();
        createBin();
        reportes();
// TODO add your handling code here:
    }//GEN-LAST:event_SaveActionPerformed

    private void v_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_2ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.setVisible(false);
        new Option().setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed

       this.setVisible(false);
       new Registro().setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_CleanActionPerformed

    private void CB3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB3ItemStateChanged
        // TODO add your handling code here:
        this.M_3.setText(" "+CB3.getSelectedItem().toString());
    }//GEN-LAST:event_CB3ItemStateChanged

    private void CB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CB3ActionPerformed

    private void CB2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB2ItemStateChanged
    this.M_2.setText(" "+CB2.getSelectedItem().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_CB2ItemStateChanged

    private void CB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB2ActionPerformed

    private void CB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB1ItemStateChanged
       this.M_1.setText(" "+CB1.getSelectedItem().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_CB1ItemStateChanged

    private void CB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB1ActionPerformed

    private void PartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PartidasActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    public static javax.swing.JComboBox<String> CB1;
    public static javax.swing.JComboBox<String> CB2;
    public static javax.swing.JComboBox<String> CB3;
    private javax.swing.JButton Clean;
    private javax.swing.JButton Jugar;
    public static javax.swing.JTextField M_1;
    public static javax.swing.JTextField M_2;
    public static javax.swing.JTextField M_3;
    public static javax.swing.JTextField Partidas;
    private javax.swing.JButton Save;
    private javax.swing.JButton jButton3Reportes;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlNickname;
    public static javax.swing.JTextField nickname;
    public static javax.swing.JTextField v_1;
    public static javax.swing.JTextField v_2;
    public static javax.swing.JTextField v_3;
    // End of variables declaration//GEN-END:variables

}
