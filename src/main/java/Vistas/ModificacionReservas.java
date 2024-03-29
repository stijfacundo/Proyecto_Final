package Vistas;

import Datas.HuespedData;
import Datas.ReservaData;
import Entidades.Huesped;
import Entidades.Reserva;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ModificacionReservas extends javax.swing.JInternalFrame {

    ReservaData reservaData;
    HuespedData huespedData;
//    private List<Integer> numerosHabitacionActuales = new ArrayList<>();
//    private List<Integer> numerosHabitacionPrevios = new ArrayList<>();

    public ModificacionReservas() {
        initComponents();

        // Establecemos el JInternalFrame sin bordes y cabecera
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);

        // Inicializamos las instancias necesarias
        reservaData = new ReservaData();
        huespedData = new HuespedData();

        // Agregamos los JRadioButton al grupo
        grupoBotones.add(jrbActiva);
        grupoBotones.add(jrbInactiva);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlModificacionReservas = new javax.swing.JLabel();
        jlDescripcionModificacionReservas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jtfDocumentoCliente = new javax.swing.JTextField();
        jlDocumentoCliente = new javax.swing.JLabel();
        jbBuscarCliente = new javax.swing.JButton();
        jlEstadoReserva = new javax.swing.JLabel();
        jrbActiva = new javax.swing.JRadioButton();
        jrbInactiva = new javax.swing.JRadioButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardarCambios = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlModificacionReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jlModificacionReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlModificacionReservas.setText("Modificación de reservas existentes");

        jlDescripcionModificacionReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlDescripcionModificacionReservas.setText("Puede realizar la modificación de las reservas existentes mediante el DNI del cliente");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
                false, false, true, true, true, false
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtfDocumentoCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfDocumentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfDocumentoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfDocumentoCliente.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfDocumentoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDocumentoClienteKeyTyped(evt);
            }
        });

        jlDocumentoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDocumentoCliente.setText("DNI");

        jbBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbBuscarCliente.setForeground(new java.awt.Color(23, 23, 23));
        jbBuscarCliente.setText("Buscar");
        jbBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarClienteActionPerformed(evt);
            }
        });

        jlEstadoReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlEstadoReserva.setForeground(new java.awt.Color(23, 23, 23));
        jlEstadoReserva.setText("Modificar estado de la reserva:");

        jrbActiva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jrbActiva.setForeground(new java.awt.Color(23, 23, 23));
        jrbActiva.setText("Activa");

        jrbInactiva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jrbInactiva.setForeground(new java.awt.Color(23, 23, 23));
        jrbInactiva.setText("Inactiva");

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(23, 23, 23));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardarCambios.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardarCambios.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbGuardarCambios.setForeground(new java.awt.Color(23, 23, 23));
        jbGuardarCambios.setText("Guardar");
        jbGuardarCambios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbGuardarCambios.setPreferredSize(new java.awt.Dimension(52, 30));
        jbGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDocumentoCliente)
                            .addComponent(jbGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jlEstadoReserva))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jrbActiva)
                        .addGap(18, 18, 18)
                        .addComponent(jrbInactiva)))
                .addGap(13, 13, 13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDocumentoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlEstadoReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInactiva)
                    .addComponent(jrbActiva))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescripcionModificacionReservas)
                            .addComponent(jlModificacionReservas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlModificacionReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescripcionModificacionReservas)
                .addGap(24, 24, 24)
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

    private void jbBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarClienteActionPerformed
        buscarReservasPorHuesped();

//        // Almacenamos los números de habitación actuales antes de cualquier modificación
//        numerosHabitacionActuales.clear();
//        DefaultTableModel modelo = (DefaultTableModel) jtReservas.getModel();
//        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
//            int numeroHabitacionActual = Integer.parseInt((String) modelo.getValueAt(fila, 1));
//            numerosHabitacionActuales.add(numeroHabitacionActual);
//        }
//
//        // Limpiamos la lista de números de habitación previos
//        numerosHabitacionPrevios.clear();
    }//GEN-LAST:event_jbBuscarClienteActionPerformed

    private void jbGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarCambiosActionPerformed
        guardarCambiosReservas();
        limpiarCampos();
    }//GEN-LAST:event_jbGuardarCambiosActionPerformed

    private void jtfDocumentoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDocumentoClienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume los caracteres no numéricos
        }
    }//GEN-LAST:event_jtfDocumentoClienteKeyTyped

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbGuardarCambios;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JLabel jlDescripcionModificacionReservas;
    private javax.swing.JLabel jlDocumentoCliente;
    private javax.swing.JLabel jlEstadoReserva;
    private javax.swing.JLabel jlModificacionReservas;
    private javax.swing.JRadioButton jrbActiva;
    private javax.swing.JRadioButton jrbInactiva;
    private javax.swing.JTable jtReservas;
    private javax.swing.JTextField jtfDocumentoCliente;
    // End of variables declaration//GEN-END:variables

    // Método para buscar reservas por huésped
    private void buscarReservasPorHuesped() {
        try {
            // Obtenemos el DNI ingresado en el campo jtfDocumentoCliente
            int dni = Integer.parseInt(jtfDocumentoCliente.getText());

            List<Reserva> reservas = reservaData.buscarReservasPorHuesped(dni);

            // Llenamos la tabla con las reservas obtenidas
            DefaultTableModel modelo = (DefaultTableModel) jtReservas.getModel();
            modelo.setRowCount(0);

            for (Reserva reserva : reservas) {
                String estado = reserva.isEstado() ? "Activa" : "Inactiva";

                String idReservaStr = String.valueOf(reserva.getIdReserva());
                String numeroHabitacionStr = String.valueOf(reserva.getNumeroHabitacion());
                String fechaInicioStr = reserva.getFechaInicio().toString();
                String fechaFinStr = reserva.getFechaFin().toString();
                String montoStr = "$" + String.valueOf(reserva.getMonto());

                modelo.addRow(new Object[]{idReservaStr, numeroHabitacionStr,
                    fechaInicioStr, fechaFinStr, montoStr, estado});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar las reservas: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico correcto: " + ex.getMessage());
        }
    }

    // Método para guardar los cambios en la reservas
    private void guardarCambiosReservas() {
        DefaultTableModel modelo = (DefaultTableModel) jtReservas.getModel();
        int filasSeleccionadas = jtReservas.getSelectedRowCount();

        if (filasSeleccionadas == 0) {
            return; // No se han seleccionado filas
        }

        List<Reserva> reservasActualizadas = new ArrayList<>();

        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            if (jtReservas.isRowSelected(fila)) {
                try {
                    // Obtenemos los datos de la reserva según los campos
                    int reservaId = Integer.parseInt((String) modelo.getValueAt(fila, 0));
                    int nuevoNumeroHabitacion = Integer.parseInt((String) modelo.getValueAt(fila, 1));
                    String fechaIngresoStr = (String) modelo.getValueAt(fila, 2);
                    LocalDate fechaIngreso = LocalDate.parse(fechaIngresoStr);
                    String fechaEgresoStr = (String) modelo.getValueAt(fila, 3);
                    LocalDate fechaEgreso = LocalDate.parse(fechaEgresoStr);
                    String montoStr = ((String) modelo.getValueAt(fila, 4)).replace("$", "");
                    double monto = Double.parseDouble(montoStr);
                    String estadoTabla = (String) modelo.getValueAt(fila, 5);
                    boolean estado = !estadoTabla.equals("Activa");

                    if (!esNumeroValido(jtfDocumentoCliente.getText())) {
                        JOptionPane.showMessageDialog(this, "El documento debe contener solo números.");
                        return; // Detiene la ejecución
                    }

                    // Obtenemos el DNI del huésped y luego buscamos el huésped
                    int dni = Integer.parseInt(jtfDocumentoCliente.getText());
                    Huesped huesped = huespedData.buscarHuespedPorDNI(dni);

//                    // Marcamos la habitacion previa como disponible si el número de habitación cambió
//                    if (!numerosHabitacionActuales.isEmpty() && numerosHabitacionPrevios.get(fila) != nuevoNumeroHabitacion) {
//                        reservaData.liberarHabitacion(numerosHabitacionPrevios.get(fila));
//                    }
//
//                    // Marcamos la nueva habitación como ocupada
//                    reservaData.marcarHabitacionOcupada(nuevoNumeroHabitacion);

                    // Agregamos la reserva actualizada a la lista
                    Reserva reserva = new Reserva(reservaId, huesped, nuevoNumeroHabitacion, fechaIngreso, fechaEgreso, monto, estado);
                    reservasActualizadas.add(reserva);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al buscar el huésped: " + ex.getMessage());
                } catch (ClassCastException ex) {
                    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                }
            }
        }

        // Actualizamos las reservas en la base de datos
        try {
            reservaData.actualizarReservas(reservasActualizadas);
            JOptionPane.showMessageDialog(this, "Reservas actualizadas con éxito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar las reservas en la base de datos: " + ex.getMessage());
        }
    }

    private boolean esNumeroValido(String texto) {
        return texto.matches("\\d+"); // Acepta solo números
    }

    private void limpiarCampos() {
        jtfDocumentoCliente.setText(""); // Limpiamos el campo de documento del cliente
        DefaultTableModel modelo = (DefaultTableModel) jtReservas.getModel();
        modelo.setRowCount(0); // Limpiamos la tabla de reservas
        grupoBotones.clearSelection(); // Deseleccionamos los botones de estado
    }
}
