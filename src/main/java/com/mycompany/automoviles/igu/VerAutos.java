
package com.mycompany.automoviles.igu;

import com.mycompany.automoviles.logica.Automovil;
import com.mycompany.automoviles.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerAutos extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public VerAutos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblAutos = new javax.swing.JLabel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutomoviles = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlBackground.setBackground(new java.awt.Color(51, 102, 255));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Datos de Automóviles");

        lblAutos.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\autos.png")); // NOI18N

        pnlTabla.setBackground(new java.awt.Color(102, 102, 102));

        tblAutomoviles.setBackground(new java.awt.Color(204, 204, 204));
        tblAutomoviles.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblAutomoviles.setForeground(new java.awt.Color(51, 51, 51));
        tblAutomoviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAutomoviles);

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\editar.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon("D:\\Datos de Usuario\\Desktop\\Proyectos\\img java\\volver.png")); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTablaLayout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(78, 78, 78)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnVolver))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(88, 88, 88))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //Control que la tabla no esté vacía
        if (tblAutomoviles.getRowCount() > 0) {
            //Control que se haya seleccionado una fila
            if (tblAutomoviles.getSelectedRow() != -1) {
                //Obtener el Id
                int id_automovil = Integer.parseInt(String.valueOf(tblAutomoviles.getValueAt(tblAutomoviles.getSelectedRow(), 0)));
                control.borrarAutomovil(id_automovil);

                //Mensaje de borrado exitoso
                mostrarMensaje("Automóvil eliminado correctamente", "Info", "¡Borrado Exitoso!");
                cargarTabla();
            }
            else {
                mostrarMensaje("No seleccionó ningún automóvil", "Error", "¡Error al eliminar!");
            }
        }
        else {
            mostrarMensaje("No hay registros para eliminar en la tabla", "Error", "¡Error al eliminar!");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         //Control que la tabla no esté vacía
        if (tblAutomoviles.getRowCount() > 0) {
            //Control que se haya seleccionado una fila
            if (tblAutomoviles.getSelectedRow() != -1) {
                //Obtener el Id
                int id_automovil = Integer.parseInt(String.valueOf(tblAutomoviles.getValueAt(tblAutomoviles.getSelectedRow(), 0)));
                
                EditarAuto editar = new EditarAuto(id_automovil);
                editar.setVisible(true);
                editar.setLocationRelativeTo(null);
                
                this.dispose();
            }
            else {
                mostrarMensaje("No seleccionó ningún automóvil", "Error", "¡Error al editar!");
            }
        }
        else {
            mostrarMensaje("No hay registros para editar en la tabla", "Error", "¡Error al editar!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tblAutomoviles;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        //Hacemos que la tabla no sea editable
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int clumn){
                return false;
            }
        };
        
        //Títulos de las columnas
        String titulos[] = {"Id", "Modelo", "Marca", "Color", "Motor", "Patente", "Cant. Puertas"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Traer autos de la BD
        List <Automovil> listaAutomoviles = control.traerAutos();
        
        //Setear lso datos en la tabla
        if(listaAutomoviles != null){
            for (Automovil auto : listaAutomoviles){
                Object[] objeto = {auto.getId(), auto.getModelo(), auto.getMarca(), auto.getColor(),
                    auto.getMotor(), auto.getPantente(), auto.getCantPuertas()};
                
                modeloTabla.addRow(objeto);
            }
        }
        tblAutomoviles.setModel(modeloTabla);
    }

        //Recursos:
        private void mostrarMensaje (String mensaje, String tipo, String titulo) {
       
        JOptionPane optionPane = new JOptionPane(mensaje);
         
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
   }
}
