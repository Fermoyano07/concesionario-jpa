
package com.mycompany.automoviles.igu;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        //this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblAutos = new javax.swing.JLabel();
        btnVerAutos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevoAuto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(51, 102, 255));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Concesionario de Automóviles");

        lblAutos.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\autos.png")); // NOI18N

        btnVerAutos.setBackground(new java.awt.Color(51, 51, 51));
        btnVerAutos.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVerAutos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAutos.setText("Ver Automóviles");
        btnVerAutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAutosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevoAuto.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevoAuto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnNuevoAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoAuto.setText("Nuevo Automóvil");
        btnNuevoAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAutos)
                .addGap(139, 139, 139))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblTitulo))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVerAutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAutoActionPerformed
        NuevoAuto nuevoAuto = new NuevoAuto();
        nuevoAuto.setVisible(true);
        nuevoAuto.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnNuevoAutoActionPerformed

    private void btnVerAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAutosActionPerformed
        VerAutos verAutos = new VerAutos();
        verAutos.setVisible(true);
        verAutos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVerAutosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoAuto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerAutos;
    private javax.swing.JLabel lblAutos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
