
package com.mycompany.automoviles.igu;

import com.mycompany.automoviles.logica.Automovil;
import com.mycompany.automoviles.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class EditarAuto extends javax.swing.JFrame {

    Controladora control = null;
    Automovil auto = new Automovil();
    
    public EditarAuto(int id_automovil) {
        control = new Controladora();
        initComponents();
        
        cargarDatosAuto(id_automovil);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground3 = new javax.swing.JPanel();
        lblTitulo3 = new javax.swing.JLabel();
        lblAutos3 = new javax.swing.JLabel();
        lblModelo3 = new javax.swing.JLabel();
        lblMarca3 = new javax.swing.JLabel();
        lblColor3 = new javax.swing.JLabel();
        lblMotor3 = new javax.swing.JLabel();
        lblPatente3 = new javax.swing.JLabel();
        lblCantPuertas3 = new javax.swing.JLabel();
        txtModelo3 = new javax.swing.JTextField();
        txtMarca3 = new javax.swing.JTextField();
        txtMotor3 = new javax.swing.JTextField();
        txtColor3 = new javax.swing.JTextField();
        txtCantPuertas3 = new javax.swing.JTextField();
        txtPatente3 = new javax.swing.JTextField();
        btnVolver3 = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground3.setBackground(new java.awt.Color(51, 102, 255));
        pnlBackground3.setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setText("Editar Automóvil");

        lblAutos3.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\autos.png")); // NOI18N

        lblModelo3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblModelo3.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo3.setText("Modelo:");

        lblMarca3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblMarca3.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca3.setText("Marca:");

        lblColor3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblColor3.setForeground(new java.awt.Color(255, 255, 255));
        lblColor3.setText("Color:");

        lblMotor3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblMotor3.setForeground(new java.awt.Color(255, 255, 255));
        lblMotor3.setText("Motor:");

        lblPatente3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblPatente3.setForeground(new java.awt.Color(255, 255, 255));
        lblPatente3.setText("Patente:");

        lblCantPuertas3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCantPuertas3.setForeground(new java.awt.Color(255, 255, 255));
        lblCantPuertas3.setText("Cant. Puertas:");

        txtModelo3.setBackground(new java.awt.Color(51, 51, 51));
        txtModelo3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtModelo3.setForeground(new java.awt.Color(255, 255, 255));

        txtMarca3.setBackground(new java.awt.Color(51, 51, 51));
        txtMarca3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMarca3.setForeground(new java.awt.Color(255, 255, 255));

        txtMotor3.setBackground(new java.awt.Color(51, 51, 51));
        txtMotor3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMotor3.setForeground(new java.awt.Color(255, 255, 255));

        txtColor3.setBackground(new java.awt.Color(51, 51, 51));
        txtColor3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtColor3.setForeground(new java.awt.Color(255, 255, 255));

        txtCantPuertas3.setBackground(new java.awt.Color(51, 51, 51));
        txtCantPuertas3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCantPuertas3.setForeground(new java.awt.Color(255, 255, 255));

        txtPatente3.setBackground(new java.awt.Color(51, 51, 51));
        txtPatente3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPatente3.setForeground(new java.awt.Color(255, 255, 255));

        btnVolver3.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVolver3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver3.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\volver.png")); // NOI18N
        btnVolver3.setText("Volver");
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        btnGuardarCambios.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarCambios.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\guardar.png")); // NOI18N
        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnLimpiar2.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiar2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnLimpiar2.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar2.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\limpiar.png")); // NOI18N
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackground3Layout = new javax.swing.GroupLayout(pnlBackground3);
        pnlBackground3.setLayout(pnlBackground3Layout);
        pnlBackground3Layout.setHorizontalGroup(
            pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackground3Layout.createSequentialGroup()
                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackground3Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAutos3)
                            .addGroup(pnlBackground3Layout.createSequentialGroup()
                                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantPuertas3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPatente3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantPuertas3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatente3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackground3Layout.createSequentialGroup()
                                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModelo3)
                                    .addComponent(lblMarca3)
                                    .addComponent(lblColor3)
                                    .addComponent(lblMotor3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtColor3, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                    .addComponent(txtMarca3)
                                    .addComponent(txtModelo3)
                                    .addComponent(txtMotor3, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(pnlBackground3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnVolver3)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCambios)))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackground3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo3)
                .addGap(111, 111, 111))
        );
        pnlBackground3Layout.setVerticalGroup(
            pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackground3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo3)
                    .addComponent(txtModelo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca3)
                    .addComponent(txtMarca3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor3)
                    .addComponent(txtColor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMotor3)
                    .addComponent(txtMotor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatente3)
                    .addComponent(txtPatente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCantPuertas3)
                    .addComponent(txtCantPuertas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver3)
                    .addComponent(btnGuardarCambios)
                    .addComponent(btnLimpiar2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolver3ActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed

        //Todos los datos del auto
        String modelo = txtModelo3.getText();
        String marca = txtMarca3.getText();
        String color = txtColor3.getText();
        String motor = txtMotor3.getText();
        String patente = txtPatente3.getText();
        int cantPuertas = Integer.parseInt(txtCantPuertas3.getText());

        control.editarAuto(auto, modelo, marca, color, motor, patente, cantPuertas);

        //Mensaje de confirmación
        JOptionPane optionPane = new JOptionPane("Se edito correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("¡Editado Exitoso!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        VerAutos verAutos = new VerAutos();
        verAutos.setVisible(true);
        verAutos.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtMotor.setText("");
        txtPatente.setText("");
        txtCantPuertas.setText("");
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnGuardar3;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnLimpiar3;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JButton btnVolver4;
    private javax.swing.JLabel lblAutos;
    private javax.swing.JLabel lblAutos1;
    private javax.swing.JLabel lblAutos2;
    private javax.swing.JLabel lblAutos3;
    private javax.swing.JLabel lblAutos4;
    private javax.swing.JLabel lblCantPuertas;
    private javax.swing.JLabel lblCantPuertas1;
    private javax.swing.JLabel lblCantPuertas2;
    private javax.swing.JLabel lblCantPuertas3;
    private javax.swing.JLabel lblCantPuertas4;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblColor1;
    private javax.swing.JLabel lblColor2;
    private javax.swing.JLabel lblColor3;
    private javax.swing.JLabel lblColor4;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblMarca2;
    private javax.swing.JLabel lblMarca3;
    private javax.swing.JLabel lblMarca4;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblModelo1;
    private javax.swing.JLabel lblModelo2;
    private javax.swing.JLabel lblModelo3;
    private javax.swing.JLabel lblModelo4;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblMotor1;
    private javax.swing.JLabel lblMotor2;
    private javax.swing.JLabel lblMotor3;
    private javax.swing.JLabel lblMotor4;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JLabel lblPatente1;
    private javax.swing.JLabel lblPatente2;
    private javax.swing.JLabel lblPatente3;
    private javax.swing.JLabel lblPatente4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlBackground1;
    private javax.swing.JPanel pnlBackground2;
    private javax.swing.JPanel pnlBackground3;
    private javax.swing.JPanel pnlBackground4;
    private javax.swing.JTextField txtCantPuertas;
    private javax.swing.JTextField txtCantPuertas1;
    private javax.swing.JTextField txtCantPuertas2;
    private javax.swing.JTextField txtCantPuertas3;
    private javax.swing.JTextField txtCantPuertas4;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtColor1;
    private javax.swing.JTextField txtColor2;
    private javax.swing.JTextField txtColor3;
    private javax.swing.JTextField txtColor4;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtMarca2;
    private javax.swing.JTextField txtMarca3;
    private javax.swing.JTextField txtMarca4;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModelo1;
    private javax.swing.JTextField txtModelo2;
    private javax.swing.JTextField txtModelo3;
    private javax.swing.JTextField txtModelo4;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtMotor1;
    private javax.swing.JTextField txtMotor2;
    private javax.swing.JTextField txtMotor3;
    private javax.swing.JTextField txtMotor4;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPatente1;
    private javax.swing.JTextField txtPatente2;
    private javax.swing.JTextField txtPatente3;
    private javax.swing.JTextField txtPatente4;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosAuto(int id_automovil) {
        //Busco el auto en la BD
        auto = control.traerAuto(id_automovil);
        //Seteo los valores del auto en el form
        txtModelo3.setText(auto.getModelo());
        txtMarca3.setText(auto.getMarca());
        txtColor3.setText(auto.getColor());
        txtMotor3.setText(auto.getMotor());
        txtPatente3.setText(auto.getPantente());
        txtCantPuertas3.setText(String.valueOf(auto.getCantPuertas()));
        
    }

}
