
package farmacia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class INGRESAR extends javax.swing.JFrame {

  
    public INGRESAR() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INGRESAR = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        compras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        INGRESAR.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        INGRESAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INGRESAR.setText("INGRESAR");
        getContentPane().add(INGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("NOMBRE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 390, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TELEFONO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 390, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("CORREO:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        correo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 390, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("APELLIDO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 30));

        apellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 390, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("DIRECCION:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("EDAD:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        edad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 390, -1));

        direccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 390, -1));

        guardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        menu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        menu.setText("MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 170, -1));

        compras.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        compras.setText("COMPRAS");
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        getContentPane().add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed
 boolean nombre1=true,apellido1= true,estatura1=true,peso1=true,genero1=true,edad1=true,telefono1=true,email1=true,direccion1=true;
 boolean paso=false;
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed


      
        
        if (nombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo NOMBRE esta vacio"); nombre1=false;
            }else{nombre1=true;}
        if(apellido.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo APELLIDO esta vacio"); apellido1=false;
            }else{apellido1=true;}
        
        if(telefono.getText().equals("")){
                JOptionPane.showMessageDialog(null,"El campo TELEFONO esta vacio"); telefono1=false;
            }else{telefono1=true;}
        if(correo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"El campo E-mail esta vacio"); email1=false;
            }else{email1=true;}
        if(direccion.getText().equals("")){
                JOptionPane.showMessageDialog(null,"El campo DIRECCION esta vacio"); direccion1=false;
            }else{direccion1=true;}
        if(edad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo EDAD esta vacio"); edad1=false;
        }else {
            edad1=true;
        }
        
        
        
        
        
        
        
        
        
        
        if(nombre1==true&apellido1==true&telefono1==true&email1==true&direccion1==true&edad1==true){
        
        Connection conectar=null;
        paso=true;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia1","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
             String insertar="INSERT INTO cliente (correo,nombre,apellido,telefono,direccion,edad) VALUES(?,?,?,?,?,?)"; // Campos de insercion 
             
        try {
            PreparedStatement dato=conectar.prepareStatement(insertar);   // Metodo de insertar datos en MYSQL 
            dato.setString(1, correo.getText());  //Variables de los datos 
            dato.setString (2,nombre.getText());
            dato.setString(3,apellido.getText());
            dato.setString (4,telefono.getText());
           
            dato.setString(5,direccion.getText());
             dato.setString(6,edad.getText());
            
             int i=dato.executeUpdate();
            if(i>0){  //Condicion si se guardo adecuada mente.
            JOptionPane.showMessageDialog(null,"Los datos se an guardado corectamente.");
            }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}            
        } catch (SQLException ex) {
            Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        }


    }//GEN-LAST:event_guardarActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
 if (paso==true){
         VENTA venta=new VENTA();
            venta.setVisible(true);
            this.dispose();
            
           
        }else{
    
            JOptionPane.showMessageDialog(null, "PRIMERO DEBE GUARDAR LOS DATOS DEL CLIENTE");
 }
        
        
    }//GEN-LAST:event_comprasActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

        
         if (nombre.getText().equals("")){
            nombre1=false;
            }else{nombre1=true;}
        if(apellido.getText().equals("")){
            apellido1=false;
            }else{apellido1=true;}
        
        if(telefono.getText().equals("")){
                telefono1=false;
            }else{telefono1=true;}
        if(correo.getText().equals("")){
               email1=false;
            }else{email1=true;}
        if(direccion.getText().equals("")){
                direccion1=false;
            }else{direccion1=true;}
        if(edad.getText().equals("")){
            edad1=false;
        }else {
            edad1=true;
        }
        
        
        if (nombre1==true|apellido1==true|telefono1==true|email1==true|direccion1==true|edad1==true){
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

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INGRESAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel INGRESAR;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton compras;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField edad;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton menu;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
