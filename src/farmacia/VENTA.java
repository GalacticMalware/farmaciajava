
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


public class VENTA extends javax.swing.JFrame {

  
    public VENTA() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
boolean guardar1=false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        idcliente = new javax.swing.JTextField();
        idmedic = new javax.swing.JTextField();
        idventa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BUSCAR_CLIENTE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        fecha = new datechooser.beans.DateChooserCombo();
        buscar = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        NombreMedicamento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        familia = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();

        jLabel12.setText("jLabel12");

        idcliente.setText("jTextField1");

        idmedic.setText("jTextField2");
        idmedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idmedicActionPerformed(evt);
            }
        });

        idventa.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("BUSCAR CLIENTE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        BUSCAR_CLIENTE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BUSCAR_CLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCAR_CLIENTEActionPerformed(evt);
            }
        });
        getContentPane().add(BUSCAR_CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 310, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("APELLIDO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("EDAD:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("DIRECCION:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("CORREO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("TELEFONO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        nombre1.setEditable(false);
        nombre1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 300, -1));

        apellido.setEditable(false);
        apellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 300, -1));

        edad.setEditable(false);
        edad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 300, -1));

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 300, -1));

        correo.setEditable(false);
        correo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 300, -1));

        direccion.setEditable(false);
        direccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 300, -1));

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 380, 160));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("DESCRIPCION DE COMPRA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("HORA:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 90, -1));

        hora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 140, 30));

        guardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        guardar.setText("GUARDAR DATOS");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, -1, -1));

        fecha.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 380, 30));

        buscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        menu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        menu.setText("MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 170, -1));

        NombreMedicamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreMedicamentoActionPerformed(evt);
            }
        });
        getContentPane().add(NombreMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 120, 290, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("MEDICAMENTO:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("TIPO:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 200, 70, -1));

        tipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analgésicos", "Corticosteroides", "Antidepresivos", "AINE", "Relajantes", "FARME" }));
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 200, 290, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("FAMILIA:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 280, -1, -1));

        familia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        familia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espondilitis anquilosante", "Fibromialgia", "Gota", "Lupus", "Osteoartritis", "Polimialgia Reumática" }));
        getContentPane().add(familia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 280, 290, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("PRECIO:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 360, -1, -1));

        precio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 360, 290, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("CANTIDAD:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 420, 130, -1));

        cantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 420, 290, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUSCAR_CLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCAR_CLIENTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUSCAR_CLIENTEActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed
boolean tot=false,des=false;
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        
        
        
        if(guardar1==true){
        
        if (hora.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo TOTAL esta vacio"); tot=false;
            }else{tot=true;}
        if(descripcion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"El campo DESCRIPCION esta vacio"); des=false;
            }else{des=true;}
        
        

if(tot==true&des==true){
            
       InsertarVenta();
       BuscarIdVenta();
       InsertarMedicamento();
       BuscarIdMedicamento();
       InsertarRmVentaMedicina();
       
}
        }else{JOptionPane.showMessageDialog(null, "PRIMERO DEVERA BUSCAR AL CLIENTE PARA GUARDA LOS DATOS DE COMPRA");}
    }//GEN-LAST:event_guardarActionPerformed

    
    public void InsertarVenta(){
            Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String InsertarVenta="INSERT INTO venta (detalle,fecha,hora,id_cliente) VALUES(?,?,?,?)";
            try {
            PreparedStatement venta=conectar.prepareStatement(InsertarVenta);   // Metodo de insertar datos en MYSQL 
              //Variables de los datos 
            
            venta.setString(1,descripcion.getText());
            venta.setString (2,fecha.getText());
            venta.setString(3,hora.getText());
            venta.setString(4, idcliente.getText());
           
           
             int i=venta.executeUpdate();
            if(i>0){  //Condicion si se guardo adecuada mente.
           
          
            }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}            
        } catch (SQLException ex) {
            Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            
    }    
    public void BuscarIdVenta(){
        Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    String BuscarIdVenta=this.descripcion.getText();
        try{
            Statement s1=conectar.createStatement();
            ResultSet rs1=s1.executeQuery("SELECT id FROM venta WHERE detalle='"+BuscarIdVenta+"'");
            
            if(rs1.next()){
           idventa.setText(rs1.getString(1));
            }else{
                
            }
        } catch (SQLException ex) {
         Logger.getLogger(VENTA.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
    }
    public void InsertarMedicamento(){
        
Connection conectar=null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        String InsertarMedic="INSERT INTO medicamento (tipo,precio,familia,nombrem) VALUES(?,?,?,?)"; // Campos de insercion
            
            

            try {
                PreparedStatement Medic=conectar.prepareStatement(InsertarMedic);   // Metodo de insertar datos en MYSQL
                 //Variables de los datos\
                 
                 Medic.setString(1,tipo.getItemAt(WIDTH));
                 Medic.setString (2,precio.getText());
                 Medic.setString(3,familia.getItemAt(WIDTH));
                 Medic.setString (4,NombreMedicamento.getText());
               
                int i=Medic.executeUpdate();
                if(i>0){  //Condicion si se guardo adecuada mente.
                }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}
            } catch (SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void BuscarIdMedicamento(){
         Connection conectar=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    String BuscarIdMedic=this.NombreMedicamento.getText();
        try{
            Statement s1=conectar.createStatement();
            ResultSet rs1=s1.executeQuery("SELECT id FROM medicamento WHERE nombrem='"+BuscarIdMedic+"'");
            
            if(rs1.next()){
           idmedic.setText(rs1.getString(1));
            }else{
                
            }
        } catch (SQLException ex) {
         Logger.getLogger(VENTA.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    public void InsertarRmVentaMedicina(){
        
Connection conectar=null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        String InsertarRM="INSERT INTO rm_venta_medic (id_medic,id_venta) VALUES(?,?)"; // Campos de insercion
            
            

            try {
                PreparedStatement RM=conectar.prepareStatement(InsertarRM);   // Metodo de insertar datos en MYSQL
                 //Variables de los datos\
                 RM.setString(1,idmedic.getText());
                 RM.setString(2,idventa.getText());
               
                int i=RM.executeUpdate();
                if(i>0){  //Condicion si se guardo adecuada mente.
                     //otros();
                    JOptionPane.showMessageDialog(null,"Los datos se an guardado corectamente.");
                  Menu menu =new Menu ();
                  menu.setVisible(true);
                this.dispose();
                }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error, no se guardaron los datos");}
            } catch (SQLException ex) {
                Logger.getLogger(INGRESAR.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    
    boolean buscar1=true;
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        
        if(BUSCAR_CLIENTE.getText().equals("")){
            JOptionPane.showMessageDialog(null,"INGRESE EL NOMBRE DEL MEDICAMENTO"); buscar1=false;
        }else{buscar1=true;}

       if(buscar1 ==true){
            Connection conectar=null;
            guardar1 =true;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar=DriverManager.getConnection("jdbc:mysql://localhost/farmacia2","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(VENTA.class.getName()).log(Level.SEVERE, null, ex);
            }
            String nombre=this.BUSCAR_CLIENTE.getText();
        try{
            Statement s=conectar.createStatement();
            ResultSet rs=s.executeQuery("SELECT id,correo,nombre,apellido,telefono,direccion,edad FROM cliente WHERE nombre='"+nombre+"'");
            
            if(rs.next()){
            idcliente.setText(rs.getString(1));
            correo.setText(rs.getString(2));
            nombre1.setText(rs.getString(3));
            apellido.setText(rs.getString(4));
            telefono.setText(rs.getString(5));
            direccion.setText(rs.getString(6));
            edad.setText(rs.getString(7));
            }else{
                JOptionPane.showMessageDialog(null, "EL NOMBRE DEL CLIENTE: "+nombre+"  NO ESTA REGISTRADO");
            }
        } catch (SQLException ex) {
         Logger.getLogger(VENTA.class.getName()).log(Level.SEVERE, null, ex);
     }           
       }
        
        
        
    }//GEN-LAST:event_buscarActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

        if (hora.getText().equals("")){
             tot=false;
            }else{tot=true;}
        if(descripcion.getText().equals("")){
             des=false;
            }else{des=true;}
        

        if (tot==true|des==true){
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

    private void NombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreMedicamentoActionPerformed

    private void idmedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idmedicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idmedicActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VENTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BUSCAR_CLIENTE;
    private javax.swing.JTextField NombreMedicamento;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField correo;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField edad;
    private javax.swing.JComboBox<String> familia;
    private datechooser.beans.DateChooserCombo fecha;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField idcliente;
    private javax.swing.JTextField idmedic;
    private javax.swing.JTextField idventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
