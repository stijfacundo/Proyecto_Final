package Vistas;

public class CreacionReservas extends javax.swing.JInternalFrame {

    public CreacionReservas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlDocumentoCliente = new javax.swing.JLabel();
        jtfDocumentoCliente = new javax.swing.JTextField();
        jbBuscarCliente = new javax.swing.JButton();
        jlNombreCliente = new javax.swing.JLabel();
        jlApellidoCliente = new javax.swing.JLabel();
        jtfNombreCliente = new javax.swing.JTextField();
        jtfApellidoCliente = new javax.swing.JTextField();
        jlDomicilioCliente = new javax.swing.JLabel();
        jtfDomicilioCliente = new javax.swing.JTextField();
        jlCorreoElectronicoCliente = new javax.swing.JLabel();
        jtfCorreoElectronicoCliente = new javax.swing.JTextField();
        jlCelularCliente = new javax.swing.JLabel();
        jtfCelularCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jdcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jdcFechaEgreso = new com.toedter.calendar.JDateChooser();
        jlFechaIngreso = new javax.swing.JLabel();
        jlFechaEgreso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHabitaciones = new javax.swing.JTable();
        jlCostoTotal = new javax.swing.JLabel();
        jlCostoTotalNro = new javax.swing.JLabel();
        jbRealizarReserva = new javax.swing.JButton();
        jlCreacionReservas = new javax.swing.JLabel();
        jlDescripcionCreacionReservas = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

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

        jlNombreCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlNombreCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlNombreCliente.setText("Nombre");

        jlApellidoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlApellidoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlApellidoCliente.setText("Apellido");

        jtfNombreCliente.setBackground(new java.awt.Color(229, 229, 229));
        jtfNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombreCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfNombreCliente.setBorder(null);
        jtfNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreClienteActionPerformed(evt);
            }
        });

        jtfApellidoCliente.setBackground(new java.awt.Color(229, 229, 229));
        jtfApellidoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfApellidoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfApellidoCliente.setBorder(null);
        jtfApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoClienteActionPerformed(evt);
            }
        });

        jlDomicilioCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDomicilioCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDomicilioCliente.setText("Domicilio");

        jtfDomicilioCliente.setBackground(new java.awt.Color(229, 229, 229));
        jtfDomicilioCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDomicilioCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfDomicilioCliente.setBorder(null);
        jtfDomicilioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDomicilioClienteActionPerformed(evt);
            }
        });

        jlCorreoElectronicoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCorreoElectronicoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlCorreoElectronicoCliente.setText("Correo electrónico");

        jtfCorreoElectronicoCliente.setBackground(new java.awt.Color(229, 229, 229));
        jtfCorreoElectronicoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCorreoElectronicoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfCorreoElectronicoCliente.setBorder(null);
        jtfCorreoElectronicoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCorreoElectronicoClienteActionPerformed(evt);
            }
        });

        jlCelularCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCelularCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlCelularCliente.setText("Celular / Teléfono");

        jtfCelularCliente.setBackground(new java.awt.Color(229, 229, 229));
        jtfCelularCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCelularCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfCelularCliente.setBorder(null);
        jtfCelularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCelularClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombreCliente)
                    .addComponent(jlDomicilioCliente)
                    .addComponent(jlCorreoElectronicoCliente)
                    .addComponent(jlCelularCliente)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfCelularCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jtfCorreoElectronicoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDomicilioCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDocumentoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlApellidoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfApellidoCliente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscarCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDocumentoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jlNombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlApellidoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlDomicilioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDomicilioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlCorreoElectronicoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCorreoElectronicoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlCelularCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));

        jdcFechaIngreso.setBackground(new java.awt.Color(229, 229, 229));
        jdcFechaIngreso.setForeground(new java.awt.Color(23, 23, 23));
        jdcFechaIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jdcFechaEgreso.setBackground(new java.awt.Color(229, 229, 229));
        jdcFechaEgreso.setForeground(new java.awt.Color(23, 23, 23));
        jdcFechaEgreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlFechaIngreso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFechaIngreso.setForeground(new java.awt.Color(23, 23, 23));
        jlFechaIngreso.setText("Fecha de Ingreso");

        jlFechaEgreso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFechaEgreso.setForeground(new java.awt.Color(23, 23, 23));
        jlFechaEgreso.setText("Fecha de Egreso");

        jtHabitaciones.setBackground(new java.awt.Color(229, 229, 229));
        jtHabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtHabitaciones.setForeground(new java.awt.Color(23, 23, 23));
        jtHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"25", "3", "HD01", "$500.000", "Libre"}
            },
            new String [] {
                "Nro.", "Piso", "Código", "Costo por noche", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtHabitaciones.setGridColor(new java.awt.Color(209, 209, 209));
        jtHabitaciones.setRowHeight(25);
        jtHabitaciones.setSelectionBackground(new java.awt.Color(52, 52, 52));
        jtHabitaciones.setSelectionForeground(new java.awt.Color(229, 229, 229));
        jtHabitaciones.setShowGrid(true);
        jtHabitaciones.getTableHeader().setResizingAllowed(false);
        jtHabitaciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtHabitaciones);
        if (jtHabitaciones.getColumnModel().getColumnCount() > 0) {
            jtHabitaciones.getColumnModel().getColumn(0).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(25);
            jtHabitaciones.getColumnModel().getColumn(1).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(1).setPreferredWidth(25);
            jtHabitaciones.getColumnModel().getColumn(2).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(2).setPreferredWidth(25);
            jtHabitaciones.getColumnModel().getColumn(3).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(4).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jlCostoTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jlCostoTotal.setForeground(new java.awt.Color(23, 23, 23));
        jlCostoTotal.setText("Costo total:");

        jlCostoTotalNro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jlCostoTotalNro.setForeground(new java.awt.Color(23, 23, 23));
        jlCostoTotalNro.setText("$500.000");

        jbRealizarReserva.setBackground(new java.awt.Color(229, 229, 229));
        jbRealizarReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbRealizarReserva.setForeground(new java.awt.Color(23, 23, 23));
        jbRealizarReserva.setText("Realizar la Reserva");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jlFechaIngreso)
                                .addGap(25, 25, 25)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jlFechaEgreso))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlCostoTotalNro)
                                .addComponent(jlCostoTotal))
                            .addGap(176, 176, 176))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbRealizarReserva)
                .addGap(174, 174, 174))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlFechaIngreso)
                            .addComponent(jlFechaEgreso))
                        .addGap(5, 5, 5)
                        .addComponent(jdcFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCostoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCostoTotalNro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbRealizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jlCreacionReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jlCreacionReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlCreacionReservas.setText("Creación de nuevas reservas");

        jlDescripcionCreacionReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlDescripcionCreacionReservas.setText("Puede realizar la creación de nuevas reservas mediante el DNI del cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcionCreacionReservas)
                    .addComponent(jlCreacionReservas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlCreacionReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescripcionCreacionReservas)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jtfNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreClienteActionPerformed

    private void jtfApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidoClienteActionPerformed

    private void jtfDomicilioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDomicilioClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDomicilioClienteActionPerformed

    private void jtfCorreoElectronicoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCorreoElectronicoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCorreoElectronicoClienteActionPerformed

    private void jtfCelularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCelularClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCelularClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbRealizarReserva;
    private com.toedter.calendar.JDateChooser jdcFechaEgreso;
    private com.toedter.calendar.JDateChooser jdcFechaIngreso;
    private javax.swing.JLabel jlApellidoCliente;
    private javax.swing.JLabel jlCelularCliente;
    private javax.swing.JLabel jlCorreoElectronicoCliente;
    private javax.swing.JLabel jlCostoTotal;
    private javax.swing.JLabel jlCostoTotalNro;
    private javax.swing.JLabel jlCreacionReservas;
    private javax.swing.JLabel jlDescripcionCreacionReservas;
    private javax.swing.JLabel jlDocumentoCliente;
    private javax.swing.JLabel jlDomicilioCliente;
    private javax.swing.JLabel jlFechaEgreso;
    private javax.swing.JLabel jlFechaIngreso;
    private javax.swing.JLabel jlNombreCliente;
    private javax.swing.JTable jtHabitaciones;
    private javax.swing.JTextField jtfApellidoCliente;
    private javax.swing.JTextField jtfCelularCliente;
    private javax.swing.JTextField jtfCorreoElectronicoCliente;
    private javax.swing.JTextField jtfDocumentoCliente;
    private javax.swing.JTextField jtfDomicilioCliente;
    private javax.swing.JTextField jtfNombreCliente;
    // End of variables declaration//GEN-END:variables
}
