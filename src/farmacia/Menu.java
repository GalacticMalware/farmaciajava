
package farmacia;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        DISTRIBUIDOR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, -1));

        ingresar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ingresar.setText("INGRESAR");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 270, 230));

        ventas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ventas.setText("VENTAS");
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });
        getContentPane().add(ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 270, 230));

        DISTRIBUIDOR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DISTRIBUIDOR.setText("DISTRIBUIDOR");
        DISTRIBUIDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISTRIBUIDORActionPerformed(evt);
            }
        });
        getContentPane().add(DISTRIBUIDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 270, 230));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("ALMACEN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 270, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
 
        INGRESAR ingresar = new INGRESAR ();
        ingresar.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_ingresarActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
 
        VENTA ventas = new VENTA();
        ventas.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_ventasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        ALMACEN almacen = new ALMACEN ();
        almacen.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DISTRIBUIDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISTRIBUIDORActionPerformed

        DISTRIBUIDOR distribuidor = new DISTRIBUIDOR();
        distribuidor.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_DISTRIBUIDORActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DISTRIBUIDOR;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
