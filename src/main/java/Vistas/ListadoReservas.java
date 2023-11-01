package Vistas;

import Datas.ReservaData;
import Entidades.Reserva;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ListadoReservas extends javax.swing.JInternalFrame {

    private final ReservaData reservaData;

    public ListadoReservas() {
        initComponents();

        // Establecemos el JInternalFrame sin bordes y cabecera
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);

        // Inicializamos las instancias necesarias
        reservaData = new ReservaData();

        cargarReservasEnTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlListadoReservas = new javax.swing.JLabel();
        jlDescripcionListadoReservas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlDocumentoCliente = new javax.swing.JLabel();
        jtfDocumentoCliente = new javax.swing.JTextField();
        jlFechaIngreso = new javax.swing.JLabel();
        jdcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jlFechaEgreso = new javax.swing.JLabel();
        jdcFechaEgreso = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlListadoReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jlListadoReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlListadoReservas.setText("Listado de reservas existentes");

        jlDescripcionListadoReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlDescripcionListadoReservas.setText("Puede filtrar el listado de las reservas existentes mediante el DNI del cliente o una fecha específica");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlDocumentoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDocumentoCliente.setText("DNI");

        jtfDocumentoCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfDocumentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfDocumentoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfDocumentoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDocumentoClienteActionPerformed(evt);
            }
        });
        jtfDocumentoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDocumentoClienteKeyTyped(evt);
            }
        });

        jlFechaIngreso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFechaIngreso.setForeground(new java.awt.Color(23, 23, 23));
        jlFechaIngreso.setText("Fecha de ingreso");

        jdcFechaIngreso.setBackground(new java.awt.Color(230, 232, 235));
        jdcFechaIngreso.setForeground(new java.awt.Color(23, 23, 23));
        jdcFechaIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jdcFechaIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaIngresoPropertyChange(evt);
            }
        });

        jlFechaEgreso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFechaEgreso.setForeground(new java.awt.Color(23, 23, 23));
        jlFechaEgreso.setText("Fecha de egreso");

        jdcFechaEgreso.setBackground(new java.awt.Color(230, 232, 235));
        jdcFechaEgreso.setForeground(new java.awt.Color(23, 23, 23));
        jdcFechaEgreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jdcFechaEgreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaEgresoPropertyChange(evt);
            }
        });

        jtReservas.setBackground(new java.awt.Color(255, 255, 255));
        jtReservas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtReservas.setForeground(new java.awt.Color(23, 23, 23));
        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nro. Habitación", "Fecha de ingreso", "Fecha de egreso", "Monto", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtReservas.setGridColor(new java.awt.Color(209, 209, 209));
        jtReservas.setRowHeight(25);
        jtReservas.setSelectionBackground(new java.awt.Color(52, 52, 52));
        jtReservas.setSelectionForeground(new java.awt.Color(229, 229, 229));
        jtReservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtReservas.setShowGrid(true);
        jtReservas.getTableHeader().setResizingAllowed(false);
        jtReservas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtReservas);
        if (jtReservas.getColumnModel().getColumnCount() > 0) {
            jtReservas.getColumnModel().getColumn(0).setResizable(false);
            jtReservas.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtReservas.getColumnModel().getColumn(1).setResizable(false);
            jtReservas.getColumnModel().getColumn(2).setResizable(false);
            jtReservas.getColumnModel().getColumn(3).setResizable(false);
            jtReservas.getColumnModel().getColumn(4).setResizable(false);
            jtReservas.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jlDocumentoCliente)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlFechaIngreso)
                                .addGap(25, 25, 25)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jlFechaEgreso)))
                        .addContainerGap(442, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jlFechaEgreso)
                            .addGap(5, 5, 5)
                            .addComponent(jdcFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jlDocumentoCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jlFechaIngreso)
                            .addGap(33, 33, 33))
                        .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcionListadoReservas)
                    .addComponent(jlListadoReservas))
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
                .addComponent(jlListadoReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescripcionListadoReservas)
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
        filtrarReservasPorDocumento();
    }//GEN-LAST:event_jtfDocumentoClienteActionPerformed

    private void jdcFechaIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaIngresoPropertyChange
        if (evt.getPropertyName().equals("date")) {
            LocalDate fechaIngreso = jdcFechaIngreso.getDate() != null
                    ? jdcFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                    : null;

            LocalDate fechaEgreso = jdcFechaEgreso.getDate() != null
                    ? jdcFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                    : null;

            if (fechaIngreso != null && fechaEgreso != null) {
                filtrarReservasPorFechas();
            }
        }
    }//GEN-LAST:event_jdcFechaIngresoPropertyChange

    private void jdcFechaEgresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaEgresoPropertyChange
        if (evt.getPropertyName().equals("date")) {
            LocalDate fechaIngreso = jdcFechaIngreso.getDate() != null
                    ? jdcFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                    : null;

            LocalDate fechaEgreso = jdcFechaEgreso.getDate() != null
                    ? jdcFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                    : null;

            if (fechaIngreso != null && fechaEgreso != null) {
                filtrarReservasPorFechas();
            }
        }
    }//GEN-LAST:event_jdcFechaEgresoPropertyChange

    private void jtfDocumentoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDocumentoClienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume los caracteres no numéricos
        }
    }//GEN-LAST:event_jtfDocumentoClienteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaEgreso;
    private com.toedter.calendar.JDateChooser jdcFechaIngreso;
    private javax.swing.JLabel jlDescripcionListadoReservas;
    private javax.swing.JLabel jlDocumentoCliente;
    private javax.swing.JLabel jlFechaEgreso;
    private javax.swing.JLabel jlFechaIngreso;
    private javax.swing.JLabel jlListadoReservas;
    private javax.swing.JTable jtReservas;
    private javax.swing.JTextField jtfDocumentoCliente;
    // End of variables declaration//GEN-END:variables

    private void cargarReservasEnTabla() {
        try {
            List<Reserva> reservas = reservaData.cargarReservas();
            DefaultTableModel modelo = (DefaultTableModel) jtReservas.getModel();
            modelo.setRowCount(0);

            for (Reserva reserva : reservas) {
                String estado = reserva.isEstado() ? "Activa" : "Inactiva";
                String montoConSigno = "$" + reserva.getMonto();
                modelo.addRow(new Object[]{reserva.getIdReserva(), reserva.getNumeroHabitacion(),
                    reserva.getFechaInicio(), reserva.getFechaFin(), montoConSigno, estado});

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar las reservas: " + ex.getMessage());
        }
    }

    private void filtrarReservasPorDocumento() {
        try {
            int dni = Integer.parseInt(jtfDocumentoCliente.getText());
            List<Reserva> reservas = reservaData.filtrarReservasPorDocumento(dni);

            if (!esNumeroValido(jtfDocumentoCliente.getText())) {
                JOptionPane.showMessageDialog(this, "El documento debe contener solo números.");
                return; // Detiene la ejecución
            }

            DefaultTableModel modelo = (DefaultTableModel) jtReservas.getModel();
            modelo.setRowCount(0);

            for (Reserva reserva : reservas) {
                String estado = reserva.isEstado() ? "Activa" : "Inactiva";
                String montoConSigno = "$" + reserva.getMonto();
                modelo.addRow(new Object[]{reserva.getIdReserva(), reserva.getNumeroHabitacion(),
                    reserva.getFechaInicio(), reserva.getFechaFin(), montoConSigno, estado});
            }
        } catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al filtrar las reservas: " + ex.getMessage());
        }
    }

    public void filtrarReservasPorFechas() {
        try {
            Date dateIngreso = jdcFechaIngreso.getDate();
            Date dateEgreso = jdcFechaEgreso.getDate();

            if (dateIngreso != null && dateEgreso != null) {
                LocalDate fechaIngreso = dateIngreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaEgreso = dateEgreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                List<Reserva> reservas = reservaData.filtrarReservasPorFechas(fechaIngreso, fechaEgreso);

                DefaultTableModel modelo = (DefaultTableModel) jtReservas.getModel();
                modelo.setRowCount(0); // Limpia la tabla antes de agregar las nuevas filas.

                for (Reserva reserva : reservas) {
                    String estado = reserva.isEstado() ? "Activa" : "Inactiva";
                    String montoConSigno = "$" + reserva.getMonto();
                    modelo.addRow(new Object[]{reserva.getIdReserva(), reserva.getNumeroHabitacion(),
                        reserva.getFechaInicio(), reserva.getFechaFin(), montoConSigno, estado});
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione fechas válidas.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al filtrar las reservas: " + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Error, seleccione fechas válidas: " + ex.getMessage());
        }
    }

    private boolean esNumeroValido(String texto) {
        return texto.matches("\\d+"); // Acepta solo números
    }
}
