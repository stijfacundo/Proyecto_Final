package Vistas;

import Datas.TipoHabitacionData;
import Entidades.TipoHabitacion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ModificacionTipoHabitacion extends javax.swing.JInternalFrame {

    TipoHabitacionData tipoHabitacionData;

    public ModificacionTipoHabitacion() {
        initComponents();

        // Establecemos el JInternalFrame sin bordes y cabecera
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);

        // Inicializamos las instancias necesarias
        tipoHabitacionData = new TipoHabitacionData();

        // Cargamos la tabla con los tipos de habitación existentes
        cargarTiposHabitacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlCreacionTipoHabitacion = new javax.swing.JLabel();
        jlDescripcionCreacionTipoHabitacion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtfCodigoTipoHabitacion = new javax.swing.JTextField();
        jlDocumentoCliente = new javax.swing.JLabel();
        jbBuscarTipoHabitacion = new javax.swing.JButton();
        jbLimpiarCampos = new javax.swing.JButton();
        jbGuardarTipoHabitacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTiposHabitacion = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlCreacionTipoHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jlCreacionTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jlCreacionTipoHabitacion.setText("Modificación de tipos de habitación existentes");

        jlDescripcionCreacionTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jlDescripcionCreacionTipoHabitacion.setText("Puede realizar la modificación de los  tipos de habitación existentes");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtfCodigoTipoHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jtfCodigoTipoHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCodigoTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jtfCodigoTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfCodigoTipoHabitacion.setPreferredSize(new java.awt.Dimension(64, 30));

        jlDocumentoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDocumentoCliente.setText("Código");

        jbBuscarTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarTipoHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbBuscarTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jbBuscarTipoHabitacion.setText("Buscar");
        jbBuscarTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBuscarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTipoHabitacionActionPerformed(evt);
            }
        });

        jbLimpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiarCampos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbLimpiarCampos.setForeground(new java.awt.Color(23, 23, 23));
        jbLimpiarCampos.setText("Limpiar");
        jbLimpiarCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        jbGuardarTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardarTipoHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbGuardarTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jbGuardarTipoHabitacion.setText("Guardar");
        jbGuardarTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbGuardarTipoHabitacion.setPreferredSize(new java.awt.Dimension(52, 30));
        jbGuardarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarTipoHabitacionActionPerformed(evt);
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
                            .addComponent(jbGuardarTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfCodigoTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jbBuscarTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDocumentoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfCodigoTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbBuscarTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardarTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jtTiposHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jtTiposHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtTiposHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jtTiposHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Capacidad", "Cantidad camas", "Tipos camas", "Precio por noche"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTiposHabitacion.setGridColor(new java.awt.Color(209, 209, 209));
        jtTiposHabitacion.setRowHeight(25);
        jtTiposHabitacion.setSelectionBackground(new java.awt.Color(52, 52, 52));
        jtTiposHabitacion.setSelectionForeground(new java.awt.Color(229, 229, 229));
        jtTiposHabitacion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtTiposHabitacion.setShowGrid(true);
        jtTiposHabitacion.getTableHeader().setResizingAllowed(false);
        jtTiposHabitacion.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTiposHabitacion);
        if (jtTiposHabitacion.getColumnModel().getColumnCount() > 0) {
            jtTiposHabitacion.getColumnModel().getColumn(0).setResizable(false);
            jtTiposHabitacion.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtTiposHabitacion.getColumnModel().getColumn(1).setResizable(false);
            jtTiposHabitacion.getColumnModel().getColumn(2).setResizable(false);
            jtTiposHabitacion.getColumnModel().getColumn(2).setPreferredWidth(20);
            jtTiposHabitacion.getColumnModel().getColumn(3).setResizable(false);
            jtTiposHabitacion.getColumnModel().getColumn(3).setPreferredWidth(30);
            jtTiposHabitacion.getColumnModel().getColumn(4).setResizable(false);
            jtTiposHabitacion.getColumnModel().getColumn(5).setResizable(false);
            jtTiposHabitacion.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcionCreacionTipoHabitacion)
                    .addComponent(jlCreacionTipoHabitacion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCreacionTipoHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescripcionCreacionTipoHabitacion)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                .addGap(199, 199, 199))
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

    private void jbBuscarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTipoHabitacionActionPerformed
        filtrarTiposHabitacionPorCodigo();
    }//GEN-LAST:event_jbBuscarTipoHabitacionActionPerformed

    private void jbGuardarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarTipoHabitacionActionPerformed
        guardarCambiosTiposHabitacion();
        cargarTiposHabitacion();
    }//GEN-LAST:event_jbGuardarTipoHabitacionActionPerformed

    private void jbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarCamposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarTipoHabitacion;
    private javax.swing.JButton jbGuardarTipoHabitacion;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JLabel jlCreacionTipoHabitacion;
    private javax.swing.JLabel jlDescripcionCreacionTipoHabitacion;
    private javax.swing.JLabel jlDocumentoCliente;
    private javax.swing.JTable jtTiposHabitacion;
    private javax.swing.JTextField jtfCodigoTipoHabitacion;
    // End of variables declaration//GEN-END:variables

    private void cargarTiposHabitacion() {
        try {
            List<TipoHabitacion> tiposHabitacion = tipoHabitacionData.obtenerTodosLosTiposHabitacion();

            DefaultTableModel modelo = (DefaultTableModel) jtTiposHabitacion.getModel();
            modelo.setRowCount(0);

            for (TipoHabitacion tipo : tiposHabitacion) {
                String codigoStr = String.valueOf(tipo.getCodigo());
                String nombreStr = String.valueOf(tipo.getNombre());
                String capacidadMaximaStr = String.valueOf(tipo.getCapacidadMaxima());
                String cantidadCamasStr = String.valueOf(tipo.getCantidadCamas());
                String tipoCamasStr = String.valueOf(tipo.getTipoCama());
                String precioPorNocheStr = "$" + String.valueOf(tipo.getPrecioPorNoche());

                modelo.addRow(new Object[]{
                    codigoStr,
                    nombreStr,
                    capacidadMaximaStr,
                    cantidadCamasStr,
                    tipoCamasStr,
                    precioPorNocheStr
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los tipos de habitación: " + ex.getMessage());
        }
    }

    private void filtrarTiposHabitacionPorCodigo() {
        String codigoBuscado = jtfCodigoTipoHabitacion.getText();

        // Recargamos la tabla con todos los tipos de habitación existentes
        cargarTiposHabitacion();

        DefaultTableModel modelo = (DefaultTableModel) jtTiposHabitacion.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        jtTiposHabitacion.setRowSorter(sorter);

        if (!codigoBuscado.isEmpty()) {
            // Aplicamos el filtro en la columna "Código"
            RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter(codigoBuscado, 0);
            sorter.setRowFilter(rowFilter);
        }
    }

    private void guardarCambiosTiposHabitacion() {
        DefaultTableModel modelo = (DefaultTableModel) jtTiposHabitacion.getModel();
        int filasSeleccionadas = jtTiposHabitacion.getSelectedRowCount();

        if (filasSeleccionadas == 0) {
            return; // No se han seleccionado filas
        }

        List<TipoHabitacion> tiposActualizados = new ArrayList<>();

        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            if (jtTiposHabitacion.isRowSelected(fila)) {
                try {
                    // Obtenemos los datos de la fila
                    String codigo = modelo.getValueAt(fila, 0).toString();
                    String nombre = modelo.getValueAt(fila, 1).toString();
                    String capacidadMaximaStr = (String) modelo.getValueAt(fila, 2);
                    int capacidadMaxima = Integer.parseInt(capacidadMaximaStr);
                    String cantidadCamasStr = (String) modelo.getValueAt(fila, 3);
                    int cantidadCamas = Integer.parseInt(cantidadCamasStr);
                    String tipoCamas = modelo.getValueAt(fila, 4).toString();
                    String precioPorNocheStr = (String) modelo.getValueAt(fila, 5);
                    precioPorNocheStr = precioPorNocheStr.replace("$", "");
                    double precioPorNoche = Double.parseDouble(precioPorNocheStr);

                    // Agregamos el tipo de habitacion actualizado a la lista
                    TipoHabitacion tipo = new TipoHabitacion(codigo, nombre, capacidadMaxima, cantidadCamas, tipoCamas, precioPorNoche);
                    tiposActualizados.add(tipo);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Error: Formato de precio incorrecto: " + ex.getMessage());
                }
            }
        }

        // Actualizamos los tipos de habitación en la base de datos
        try {
            tipoHabitacionData.actualizarTipoHabitacion(tiposActualizados);
            JOptionPane.showMessageDialog(this, "Tipos de habitación actualizados con éxito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar los tipos de habitación en la base de datos: " + ex.getMessage());
        }

        // Limpiamos los campos tras guardar los cambios
        limpiarCampos();
    }

    private void limpiarCampos() {
        jtfCodigoTipoHabitacion.setText(""); // Limpiamos el campo del código
        DefaultTableModel modelo = (DefaultTableModel) jtTiposHabitacion.getModel();
        modelo.setRowCount(0); // Limpiamos la tabla de reservas
    }
}
