/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Alejandro
 */
public class ALMACEN extends javax.swing.JFrame {

    /**
     * Creates new form ALMACEN
     */
    public ALMACEN() {
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

        jLabel1 = new javax.swing.JLabel();
        BUSCAR_MEDICAMENTO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        familia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        menu1 = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALMACEN Y BUSQUEDA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, 50));

        BUSCAR_MEDICAMENTO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BUSCAR_MEDICAMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCAR_MEDICAMENTOActionPerformed(evt);
            }
        });
        getContentPane().add(BUSCAR_MEDICAMENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 310, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("BUSCAR MEDICAMENTO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        buscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("TIPO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("FAMILIA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        familia.setEditable(false);
        familia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        familia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familiaActionPerformed(evt);
            }
        });
        getContentPane().add(familia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 300, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("PRECIO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        precio.setEditable(false);
        precio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 300, -1));

        tipo.setEditable(false);
        tipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 310, -1));

        menu1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        menu1.setText("MENU");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 170, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 80, 110));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean buscar1=true;
boolean modificar=false;boolean nomb=true,apellido1= true,estatura1=true,peso1=true,genero1=true,edad1=true,telefono1=true,email1=true,direccion1=true;
 boolean paso=false;
    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed



           
            Menu menu =new Menu();
            menu.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_menu1ActionPerformed

    private void familiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_familiaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        if(BUSCAR_MEDICAMENTO.getText().equals("")){
            JOptionPane.showMessageDialog(null,"INGRESE EL NOMBRE DEL CLIENTE"); buscar1=false;
        }else{buscar1=true;}

        if(buscar1 ==true){
            Connection conectar=null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(VENTA.class.getName()).log(Level.SEVERE, null, ex);
            }
            String nombre2=this.BUSCAR_MEDICAMENTO.getText();
            try{
                Statement s=conectar.createStatement();
                ResultSet rs=s.executeQuery("SELECT tipo,precio,familia,nombre FROM medicamento WHERE nombre='"+nombre2+"'");
                if(rs.next()){
                    tipo.setText(rs.getString(1));
                    precio.setText(rs.getString(2));
                    familia.setText(rs.getString(3));
                    nombre.setText(rs.getString(4));

                }else{
                    JOptionPane.showMessageDialog(null, "EL NOMBRE DEL MEDICAMENTO: "+nombre+"  NO ESTA REGISTRADO");
                }
            } catch (SQLException ex) {
                Logger.getLogger(VENTA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void BUSCAR_MEDICAMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCAR_MEDICAMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUSCAR_MEDICAMENTOActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

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
            java.util.logging.Logger.getLogger(ALMACEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ALMACEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ALMACEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ALMACEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALMACEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BUSCAR_MEDICAMENTO;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField familia;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton menu1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
