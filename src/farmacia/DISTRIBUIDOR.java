
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


public class DISTRIBUIDOR extends javax.swing.JFrame {

  
    public DISTRIBUIDOR() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idmedic = new javax.swing.JTextField();
        iddis = new javax.swing.JTextField();
        fecha = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        familia = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        prove = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();

        idmedic.setText("jTextField1");

        iddis.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DISTRIBUIDOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 980, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("MEDICAMENTO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        nombre1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 290, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("TIPO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 70, -1));

        tipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgésicos", "Corticosteroides", "Antidepresivos", "AINE", "Relajantes", "FARME" }));
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 290, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("FAMILIA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("PRECIO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        precio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 290, -1));

        familia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        familia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espondilitis anquilosante", "Fibromialgia", "Gota", "Lupus", "Osteoartritis", "Polimialgia Reumática" }));
        getContentPane().add(familia, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 290, -1));

        guardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        menu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        menu.setText("MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 170, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("CANTIDAD:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 130, -1));

        cantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 290, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("PROVEEDOR:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("DIRECCION:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));

        direccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 320, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("TELEFONO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 320, -1));

        prove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveActionPerformed(evt);
            }
        });
        getContentPane().add(prove, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 320, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("HORA:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean precio1=true,proveedor=true,cantidad1=true,prove1=true,telefono1=true,direccion1=true,hora1=true;
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        if (precio.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo PORECIO esta vacio"); precio1=false;
        }else{precio1=true;}
        if(nombre1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo NOMBRE esta vacio"); proveedor=false;
        }else{proveedor=true;}

        if(cantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo CANTIDAD esta vacio"); cantidad1=false;
        }else{cantidad1=true;}
        
        if(hora.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo HORA esta vacio"); hora1=false;
        }else{hora1=true;}
       
        if(proveedor==true&precio1==true&cantidad1==true&prove1==true&telefono1==true&direccion1==true&hora1==true){
            InsertarMedicamentos();
            InsertarDistribuidor();
            BuscarIdDistribuidor();
            InsertarCompraDis();
            BuscarIdMedicamento();
            
            rm_almacen_medic();
            
        }

    }//GEN-LAST:event_guardarActionPerformed

    
    public void InsertarMedicamentos(){
        Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
            String InsertarMedic="INSERT INTO medicamento (tipo,precio,familia,nombre) VALUES(?,?,?,?)"; // Campos de insercion
            try {
                PreparedStatement InsertMedic=conectar.prepareStatement(InsertarMedic);   // Metodo de insertar datos en MYSQL
                 //Variables de los datos\
                 InsertMedic.setString(1,tipo.getItemAt(WIDTH));
                 InsertMedic.setString (2,precio.getText());
                 InsertMedic.setString(3,familia.getItemAt(WIDTH));
                 InsertMedic.setString (4,nombre1.getText());
                int i=InsertMedic.executeUpdate();
                if(i>0){  //Condicion si se guardo adecuada mente.
                }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}
            } catch (SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void InsertarDistribuidor(){
      Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        String InsertarDis="INSERT INTO distribuidor (nombre,direccion,telefono) VALUES(?,?,?)"; // Campos de insercion
           try {
                PreparedStatement InserDis=conectar.prepareStatement(InsertarDis);   // Metodo de insertar datos en MYSQL
                 //Variables de los datos\
                 InserDis.setString(1,prove.getText());
                 InserDis.setString (2,direccion.getText());
                 InserDis.setString(3,telefono.getText());
          int i=InserDis.executeUpdate();
                if(i>0){  //Condicion si se guardo adecuada mente.
                }else{JOptionPane.showMessageDialog(null,"");}
            } catch (SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void InsertarCompraDis(){
         Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        String InsertarDis="INSERT INTO compra_distrib (fecha,hora,id_dis) VALUES(?,?,?)"; // Campos de insercion
           try {
                PreparedStatement InserDis=conectar.prepareStatement(InsertarDis);   // Metodo de insertar datos en MYSQL
                 //Variables de los datos\
                 InserDis.setString(1,fecha.getText());
                 InserDis.setString (2,hora.getText());
                 InserDis.setString(3,iddis.getText());
          int i=InserDis.executeUpdate();
                if(i>0){  //Condicion si se guardo adecuada mente.
                }else{JOptionPane.showMessageDialog(null,"");}
            } catch (SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void BuscarIdMedicamento(){
         Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         String IdMedic=this.nombre1.getText();
        try{
            Statement s1=conectar.createStatement();
            ResultSet rs1=s1.executeQuery("SELECT id FROM medicamento WHERE nombre='"+IdMedic+"'");
            
            if(rs1.next()){
           idmedic.setText(rs1.getString(1));
            }else{
                
            }
        } catch (SQLException ex) {
         Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
     } 
    }
    
    public void BuscarIdDistribuidor(){
         Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
        String IdDis=this.prove.getText();
        try{
            Statement s=conectar.createStatement();
            ResultSet rs=s.executeQuery("SELECT id FROM distribuidor WHERE nombre='"+IdDis+"'");
            
            if(rs.next()){
           iddis.setText(rs.getString(1));
            }else{
                
            }
        } catch (SQLException ex) {
         Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
     }           
    }
    
    public void rm_almacen_medic(){
         Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DISTRIBUIDOR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String RM_Medic="INSERT INTO rm_almacen_medic (id_medic,id_almacen) VALUES(?,?)"; // Campos de insercion
            try {
                PreparedStatement RM=conectar.prepareStatement(RM_Medic);   // Metodo de insertar datos en MYSQL
                 //Variables de los datos\
                // dato4.setString(1,cantidad.getText());
                 RM.setString (1,idmedic.getText());
                 RM.setString (2,iddis.getText());
                 int i2=RM.executeUpdate();
                 if(i2>0){  //Condicion si se guardo adecuada mente.
                     Menu menu =new Menu();
                     menu.setVisible(true);
                     this.dispose();
                    JOptionPane.showMessageDialog(null,"Los datos se an guardado corectamente.");
                }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}
            } catch (SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

//CONDICION : SI HAY ALGUN DATO INGRESADO EN UN TEXTFIELD


 if (precio.getText().equals("")){
           precio1=false;
        }else{precio1=true;}
        if(nombre1.getText().equals("")){
             proveedor=false;
        }else{proveedor=true;}

        if(cantidad.getText().equals("")){
           cantidad1=false;
        }else{cantidad1=true;}



        if (proveedor==true|precio1==true|cantidad1==true){
            int dialog =JOptionPane.YES_NO_OPTION;
            int resultado= JOptionPane.showConfirmDialog(null, "¿DESEA SALIR?, LOS DATOS NO SE GUARDARAN");
            if(resultado==0){
                Menu menu =new Menu();
                menu.setVisible(true);
                this.dispose();

            }
        }else{
            Menu menu =new Menu();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_menuActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void proveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

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
            java.util.logging.Logger.getLogger(DISTRIBUIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISTRIBUIDOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField direccion;
    private javax.swing.JComboBox<String> familia;
    private datechooser.beans.DateChooserCombo fecha;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField iddis;
    private javax.swing.JTextField idmedic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton menu;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField prove;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
