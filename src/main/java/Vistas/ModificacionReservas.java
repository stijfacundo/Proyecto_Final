/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author stijf
 */
public class ModificacionReservas extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificacionReservas
     */
    public ModificacionReservas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlModificacionReservas = new javax.swing.JLabel();
        jlDescripcionModificacionReservas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlDocumentoCliente = new javax.swing.JLabel();
        jtfDocumentoCliente = new javax.swing.JTextField();
        jbBuscarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jbGuardarCambios = new javax.swing.JButton();
        jlEstadoReserva = new javax.swing.JLabel();
        jrbActiva = new javax.swing.JRadioButton();
        jrbInactiva = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jlModificacionReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jlModificacionReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlModificacionReservas.setText("Modificación de reservas existentes");

        jlDescripcionModificacionReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlDescripcionModificacionReservas.setText("Puede realizar la modificación de las reservas existentes mediante el DNI del cliente");

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        jlDocumentoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDocumentoCliente.setText("Documento del cliente");

        jtfDocumentoCliente.setBackground(new java.awt.Color(229, 229, 229));
        jtfDocumentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfDocumentoCliente.setBorder(null);
        jtfDocumentoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDocumentoClienteActionPerformed(evt);
            }
        });

        jbBuscarCliente.setBackground(new java.awt.Color(229, 229, 229));
        jbBuscarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbBuscarCliente.setForeground(new java.awt.Color(23, 23, 23));
        jbBuscarCliente.setText("Buscar");

        jtReservas.setBackground(new java.awt.Color(229, 229, 229));
        jtReservas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtReservas.setForeground(new java.awt.Color(23, 23, 23));
        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro. Habitación", "Fecha de ingreso", "Fecha de egreso", "Monto", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtReservas.setGridColor(new java.awt.Color(209, 209, 209));
        jtReservas.setRowHeight(25);
        jtReservas.setSelectionBackground(new java.awt.Color(52, 52, 52));
        jtReservas.setSelectionForeground(new java.awt.Color(229, 229, 229));
        jtReservas.setShowGrid(true);
        jtReservas.getTableHeader().setResizingAllowed(false);
        jtReservas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtReservas);
        if (jtReservas.getColumnModel().getColumnCount() > 0) {
            jtReservas.getColumnModel().getColumn(0).setResizable(false);
            jtReservas.getColumnModel().getColumn(1).setResizable(false);
            jtReservas.getColumnModel().getColumn(2).setResizable(false);
            jtReservas.getColumnModel().getColumn(3).setResizable(false);
            jtReservas.getColumnModel().getColumn(4).setResizable(false);
        }

        jbGuardarCambios.setBackground(new java.awt.Color(229, 229, 229));
        jbGuardarCambios.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbGuardarCambios.setForeground(new java.awt.Color(23, 23, 23));
        jbGuardarCambios.setText("Guardar cambios");

        jlEstadoReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEstadoReserva.setForeground(new java.awt.Color(23, 23, 23));
        jlEstadoReserva.setText("Estado de la reserva:");

        jrbActiva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jrbActiva.setForeground(new java.awt.Color(23, 23, 23));
        jrbActiva.setText("Activa");

        jrbInactiva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jrbInactiva.setForeground(new java.awt.Color(23, 23, 23));
        jrbInactiva.setText("Inactiva");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDocumentoCliente)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscarCliente))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jbGuardarCambios)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlEstadoReserva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbInactiva)
                                    .addComponent(jrbActiva))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDocumentoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEstadoReserva)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbActiva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbInactiva)))
                .addGap(18, 18, 18)
                .addComponent(jbGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcionModificacionReservas)
                    .addComponent(jlModificacionReservas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlModificacionReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescripcionModificacionReservas)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDocumentoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDocumentoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDocumentoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbGuardarCambios;
    private javax.swing.JLabel jlDescripcionModificacionReservas;
    private javax.swing.JLabel jlDocumentoCliente;
    private javax.swing.JLabel jlEstadoReserva;
    private javax.swing.JLabel jlModificacionReservas;
    private javax.swing.JRadioButton jrbActiva;
    private javax.swing.JRadioButton jrbInactiva;
    private javax.swing.JTable jtReservas;
    private javax.swing.JTextField jtfDocumentoCliente;
    // End of variables declaration//GEN-END:variables
}
