
package com.mycompany.automoviles.igu;

import com.mycompany.automoviles.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;




public class NuevoAuto extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public NuevoAuto() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblAutos = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblMotor = new javax.swing.JLabel();
        lblPatente = new javax.swing.JLabel();
        lblCantPuertas = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtCantPuertas = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(51, 102, 255));
        pnlBackground.setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Nuevo Automóvil");

        lblAutos.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\autos.png")); // NOI18N

        lblModelo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Modelo:");

        lblMarca.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca:");

        lblColor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Color:");

        lblMotor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblMotor.setForeground(new java.awt.Color(255, 255, 255));
        lblMotor.setText("Motor:");

        lblPatente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblPatente.setForeground(new java.awt.Color(255, 255, 255));
        lblPatente.setText("Patente:");

        lblCantPuertas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblCantPuertas.setForeground(new java.awt.Color(255, 255, 255));
        lblCantPuertas.setText("Cant. Puertas:");

        txtModelo.setBackground(new java.awt.Color(51, 51, 51));
        txtModelo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));

        txtMarca.setBackground(new java.awt.Color(51, 51, 51));
        txtMarca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));

        txtMotor.setBackground(new java.awt.Color(51, 51, 51));
        txtMotor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMotor.setForeground(new java.awt.Color(255, 255, 255));

        txtColor.setBackground(new java.awt.Color(51, 51, 51));
        txtColor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtColor.setForeground(new java.awt.Color(255, 255, 255));

        txtCantPuertas.setBackground(new java.awt.Color(51, 51, 51));
        txtCantPuertas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCantPuertas.setForeground(new java.awt.Color(255, 255, 255));

        txtPatente.setBackground(new java.awt.Color(51, 51, 51));
        txtPatente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPatente.setForeground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\volver.png")); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\guardar.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\limpiar.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAutos)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantPuertas, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPatente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModelo)
                                    .addComponent(lblMarca)
                                    .addComponent(lblColor)
                                    .addComponent(lblMotor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                    .addComponent(txtMarca)
                                    .addComponent(txtModelo)
                                    .addComponent(txtMotor, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnVolver)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addGap(14, 14, 14))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMotor)
                    .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatente)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCantPuertas)
                    .addComponent(txtCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String color = txtColor.getText();
        String motor = txtMotor.getText();
        String patente = txtPatente.getText();
        int cantPuertas = Integer.parseInt(txtCantPuertas.getText());
        
        control.agregarAutomovil(modelo, marca, color, motor, patente, cantPuertas);

        //Mensaje de confirmación
        JOptionPane optionPane = new JOptionPane("Se guardo correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("¡Guardado Exitoso!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        txtModelo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtMotor.setText("");
        txtPatente.setText("");
        txtCantPuertas.setText("");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        txtColor.setText("");
        txtMotor.setText("");
        txtPatente.setText("");
        txtCantPuertas.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblAutos;
    private javax.swing.JLabel lblCantPuertas;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtCantPuertas;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
