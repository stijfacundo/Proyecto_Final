package Vistas;

import Datas.ReservaData;
import Entidades.Habitacion;
import Entidades.Huesped;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class CreacionReservas extends javax.swing.JInternalFrame {

    private ReservaData reservaData;
    private double costoTotal = 0.0;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;

    // Obtenemos la fecha actual para configurar la fecha mínima de los JDateChooser
    Calendar cal = Calendar.getInstance();
    Date fechaActual = cal.getTime();

    public CreacionReservas() {
        initComponents();

        // Establecemos el JInternalFrame sin bordes y cabecera
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);

        // Inicializamos las instancias necesarias
        reservaData = new ReservaData();

        // Establecemos el dollar renderer en la columna del costo por noche
        DefaultTableModel modelo = (DefaultTableModel) jtHabitaciones.getModel();
        jtHabitaciones.setDefaultRenderer(Object.class, new DollarRenderer());
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
        jbLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHabitaciones = new javax.swing.JTable();
        jlCostoTotal = new javax.swing.JLabel();
        jlCostoTotalNro = new javax.swing.JLabel();
        jlCreacionReservas = new javax.swing.JLabel();
        jlDescripcionCreacionReservas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jdcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jlFechaIngreso = new javax.swing.JLabel();
        jdcFechaEgreso = new com.toedter.calendar.JDateChooser();
        jlFechaEgreso = new javax.swing.JLabel();
        jbRealizarReserva = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlDocumentoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDocumentoCliente.setText("DNI");

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

        jbBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbBuscarCliente.setForeground(new java.awt.Color(23, 23, 23));
        jbBuscarCliente.setText("Buscar");
        jbBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBuscarCliente.setPreferredSize(new java.awt.Dimension(60, 30));
        jbBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarClienteActionPerformed(evt);
            }
        });

        jlNombreCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlNombreCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlNombreCliente.setText("Nombre");

        jlApellidoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlApellidoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlApellidoCliente.setText("Apellido");

        jtfNombreCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombreCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfNombreCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfNombreCliente.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreClienteKeyTyped(evt);
            }
        });

        jtfApellidoCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfApellidoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfApellidoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfApellidoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfApellidoCliente.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoClienteKeyTyped(evt);
            }
        });

        jlDomicilioCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDomicilioCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDomicilioCliente.setText("Domicilio");

        jtfDomicilioCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfDomicilioCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDomicilioCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfDomicilioCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfDomicilioCliente.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfDomicilioCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDomicilioClienteKeyTyped(evt);
            }
        });

        jlCorreoElectronicoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCorreoElectronicoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlCorreoElectronicoCliente.setText("Correo electrónico");

        jtfCorreoElectronicoCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfCorreoElectronicoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCorreoElectronicoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfCorreoElectronicoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfCorreoElectronicoCliente.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfCorreoElectronicoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCorreoElectronicoClienteKeyTyped(evt);
            }
        });

        jlCelularCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCelularCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlCelularCliente.setText("Celular / Teléfono");

        jtfCelularCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfCelularCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCelularCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfCelularCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfCelularCliente.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfCelularCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCelularClienteKeyTyped(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlDocumentoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlApellidoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDomicilioCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCorreoElectronicoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCelularCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfApellidoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfDomicilioCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCorreoElectronicoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCelularCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDocumentoCliente)
                .addGap(8, 8, 8)
                .addComponent(jtfDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlApellidoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDomicilioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDomicilioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCorreoElectronicoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCorreoElectronicoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCelularCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jtHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        jtHabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtHabitaciones.setForeground(new java.awt.Color(23, 23, 23));
        jtHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro.", "Piso", "Tipo", "Capacidad", "Costo por noche"
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
        jtHabitaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtHabitaciones.setShowGrid(true);
        jtHabitaciones.getTableHeader().setResizingAllowed(false);
        jtHabitaciones.getTableHeader().setReorderingAllowed(false);
        jtHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtHabitaciones);
        if (jtHabitaciones.getColumnModel().getColumnCount() > 0) {
            jtHabitaciones.getColumnModel().getColumn(0).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtHabitaciones.getColumnModel().getColumn(1).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(1).setPreferredWidth(10);
            jtHabitaciones.getColumnModel().getColumn(2).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(2).setPreferredWidth(50);
            jtHabitaciones.getColumnModel().getColumn(3).setResizable(false);
            jtHabitaciones.getColumnModel().getColumn(3).setPreferredWidth(10);
            jtHabitaciones.getColumnModel().getColumn(4).setResizable(false);
        }

        jlCostoTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jlCostoTotal.setForeground(new java.awt.Color(23, 23, 23));
        jlCostoTotal.setText("Costo total:");

        jlCostoTotalNro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jlCostoTotalNro.setForeground(new java.awt.Color(23, 23, 23));
        jlCostoTotalNro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCostoTotalNro.setText("$0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jlCostoTotal)
                        .addGap(29, 29, 29))
                    .addComponent(jlCostoTotalNro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(31, 31, 31)
                .addComponent(jlCostoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCostoTotalNro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jlCreacionReservas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jlCreacionReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlCreacionReservas.setText("Creación de nuevas reservas");

        jlDescripcionCreacionReservas.setForeground(new java.awt.Color(23, 23, 23));
        jlDescripcionCreacionReservas.setText("Puede realizar la creación de nuevas reservas mediante la búsqueda del cliente mediante su DNI");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jdcFechaIngreso.setBackground(new java.awt.Color(230, 232, 235));
        jdcFechaIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jdcFechaIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jdcFechaIngreso.setMinSelectableDate(fechaActual);
        jdcFechaIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaIngresoPropertyChange(evt);
            }
        });

        jlFechaIngreso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFechaIngreso.setForeground(new java.awt.Color(23, 23, 23));
        jlFechaIngreso.setText("Fecha de ingreso");

        jdcFechaEgreso.setBackground(new java.awt.Color(230, 232, 235));
        jdcFechaEgreso.setForeground(new java.awt.Color(23, 23, 23));
        jdcFechaEgreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jdcFechaEgreso.setMinSelectableDate(fechaActual);
        jdcFechaEgreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaEgresoPropertyChange(evt);
            }
        });

        jlFechaEgreso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlFechaEgreso.setForeground(new java.awt.Color(23, 23, 23));
        jlFechaEgreso.setText("Fecha de egreso");

        jbRealizarReserva.setBackground(new java.awt.Color(255, 255, 255));
        jbRealizarReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbRealizarReserva.setForeground(new java.awt.Color(23, 23, 23));
        jbRealizarReserva.setText("Realizar la reserva");
        jbRealizarReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbRealizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jlFechaEgreso))
                            .addComponent(jdcFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jlFechaIngreso)
                                    .addGap(25, 25, 25)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jbRealizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlFechaIngreso)
                        .addGap(33, 33, 33))
                    .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlFechaEgreso)
                .addGap(5, 5, 5)
                .addComponent(jdcFechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbRealizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescripcionCreacionReservas)
                            .addComponent(jlCreacionReservas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCreacionReservas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescripcionCreacionReservas)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        String documento = jtfDocumentoCliente.getText();
        if (!esNumeroValido(documento)) {
            JOptionPane.showMessageDialog(this, "El documento debe contener solo números.");
            return; // Detiene la ejecución
        }

        buscarCliente();
    }//GEN-LAST:event_jbBuscarClienteActionPerformed

    private void jdcFechaIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaIngresoPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            cargarHabitacionesDisponibles();
        }
    }//GEN-LAST:event_jdcFechaIngresoPropertyChange

    private void jdcFechaEgresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaEgresoPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            cargarHabitacionesDisponibles();
        }
    }//GEN-LAST:event_jdcFechaEgresoPropertyChange

    private void jtHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHabitacionesMouseClicked
        int fila = jtHabitaciones.getSelectedRow();
        if (fila != -1) {
            // Obtenemos el costo por noche y las fechas de ingreso y egreso
            double costoPorNoche = (Double) jtHabitaciones.getValueAt(fila, 4);
            fechaIngreso = jdcFechaIngreso.getDate().toInstant()
                    .atZone(ZoneId.systemDefault()).toLocalDate();
            fechaEgreso = jdcFechaEgreso.getDate().toInstant()
                    .atZone(ZoneId.systemDefault()).toLocalDate();

            // Calculamos la diferencia en días
            long días = ChronoUnit.DAYS.between(fechaIngreso, fechaEgreso);

            // Calculamos el costo total
            costoTotal = costoPorNoche * días;

            // Actualizamos el label jlCostoTotalNro
            jlCostoTotalNro.setText("$" + String.format("%.2f", costoTotal));
        }
    }//GEN-LAST:event_jtHabitacionesMouseClicked

    private void jbRealizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizarReservaActionPerformed
        try {
            if (jtfDocumentoCliente.getText().isEmpty() || jtfNombreCliente.getText().isEmpty()
                    || jtfApellidoCliente.getText().isEmpty() || jtfDomicilioCliente.getText().isEmpty()
                    || jtfCorreoElectronicoCliente.getText().isEmpty() || jtfCelularCliente.getText().isEmpty()
                    || jdcFechaIngreso.getDate() == null || jdcFechaEgreso.getDate() == null
                    || jtHabitaciones.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, completa todos los "
                        + "campos antes de realizar la reserva.");
                return;
            }

            String nombre = jtfNombreCliente.getText();
            String apellido = jtfApellidoCliente.getText();
            int dni = Integer.parseInt(jtfDocumentoCliente.getText());
            String domicilio = jtfDomicilioCliente.getText();
            String correo = jtfCorreoElectronicoCliente.getText();
            String celular = jtfCelularCliente.getText();

            if (!esTextoValido(nombre)) {
                JOptionPane.showMessageDialog(this, "El nombre debe contener solo letras y espacios.");
                return; // Detiene la ejecución
            }

            if (!esTextoValido(apellido)) {
                JOptionPane.showMessageDialog(this, "El apellido debe contener solo letras y espacios.");
                return; // Detiene la ejecución
            }

            if (!esNumeroValido(jtfDocumentoCliente.getText())) {
                JOptionPane.showMessageDialog(this, "El documento debe contener solo números.");
                return; // Detiene la ejecución
            }

            if (!esTextoNumerosSimbolosValido(domicilio)) {
                JOptionPane.showMessageDialog(this, "El domicilio debe contener letras, números y símbolos.");
                return; // Detiene la ejecución
            }

            if (!esTextoNumerosSimbolosValido(correo)) {
                JOptionPane.showMessageDialog(this, "El correo electrónico debe contener letras, números y símbolos.");
                return; // Detiene la ejecución
            }

            if (!esNumeroValido(celular)) {
                JOptionPane.showMessageDialog(this, "El número de celular debe contener solo números.");
                return; // Detiene la ejecución
            }

            int filaSeleccionada = jtHabitaciones.getSelectedRow();
            int numeroHabitacion = (Integer) jtHabitaciones.getValueAt(filaSeleccionada, 0);

            String costoTotalStr = jlCostoTotalNro.getText().replace("$", ""); // Eliminamos el símbolo $ para poder convertir a double
            double monto = Double.parseDouble(costoTotalStr);

            fechaIngreso = jdcFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            fechaEgreso = jdcFechaEgreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            try {
                boolean reservaExitosa = reservaData.realizarReserva(nombre, apellido, dni, domicilio, correo, celular, numeroHabitacion, monto, fechaIngreso, fechaEgreso);

                if (reservaExitosa) {
                    JOptionPane.showMessageDialog(this, "Reserva creada con éxito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al crear la reserva.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }

            // Limpiamos los campos tras realizar la reserva
            limpiarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico correcto: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbRealizarReservaActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtfDocumentoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDocumentoClienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume los caracteres no numéricos
        }
    }//GEN-LAST:event_jtfDocumentoClienteKeyTyped

    private void jtfNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreClienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume(); // Consume los caracteres no alfabéticos
        }
    }//GEN-LAST:event_jtfNombreClienteKeyTyped

    private void jtfApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoClienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume(); // Consume los caracteres no alfabéticos
        }
    }//GEN-LAST:event_jtfApellidoClienteKeyTyped

    private void jtfDomicilioClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDomicilioClienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && !Character.isDefined(c)) {
            evt.consume(); // Consume los caracteres no permitidos
        }
    }//GEN-LAST:event_jtfDomicilioClienteKeyTyped

    private void jtfCorreoElectronicoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCorreoElectronicoClienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && !Character.isDefined(c)) {
            evt.consume(); // Consume los caracteres no permitidos
        }
    }//GEN-LAST:event_jtfCorreoElectronicoClienteKeyTyped

    private void jtfCelularClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCelularClienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume los caracteres no numéricos
        }
    }//GEN-LAST:event_jtfCelularClienteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbLimpiar;
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

    private void buscarCliente() {
        try {
            // Obtenemos el DNI ingresado en el campo jtfDocumentoCliente
            int dni = Integer.parseInt(jtfDocumentoCliente.getText());

            // Llamamos al método buscarHuespedPorDNI para obtener el cliente
            Huesped huesped = reservaData.buscarHuespedPorDNI(dni);

            if (huesped != null) {
                // Cargamos los datos obtenidos en los respectivos campos
                jtfNombreCliente.setText(huesped.getNombre());
                jtfApellidoCliente.setText(huesped.getApellido());
                jtfDomicilioCliente.setText(huesped.getDomicilio());
                jtfCorreoElectronicoCliente.setText(huesped.getCorreo());
                jtfCelularCliente.setText(huesped.getCelular());
            } else {
                JOptionPane.showMessageDialog(this,
                        "El cliente no existe en la base de datos, ingresa "
                        + "sus datos para crear la reserva.");
                // Dejamos que el usuario ingrese los datos del cliente de forma manual
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar el "
                    + "cliente en la base de datos: " + ex.getMessage());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese datos válidos para el DNI: " + ex.getMessage());
        }
    }

    private void cargarHabitacionesDisponibles() {
        // Obtenemos las fechas de ingreso y egreso seleccionadas
        Date fechaIngresoDate = jdcFechaIngreso.getDate();
        Date fechaEgresoDate = jdcFechaEgreso.getDate();

        // Si las dos fechas no están seleccionadas, no se muestra nada
        if (fechaIngresoDate == null || fechaEgresoDate == null) {
            return;
        }

        // Convertimos las fechas a LocalDate
        fechaIngreso = new java.sql.Date(fechaIngresoDate.getTime()).toLocalDate();
        fechaEgreso = new java.sql.Date(fechaEgresoDate.getTime()).toLocalDate();

        try {
            // Llamamos al método buscarHabitacionesLibres para obtener las habitaciones disponibles
            List<Habitacion> habitacionesLibres = reservaData.
                    buscarHabitacionesLibres(fechaIngreso, fechaEgreso);

            // Limpiamos la tabla antes de cargar los nuevos datos
            DefaultTableModel modelo = (DefaultTableModel) jtHabitaciones.getModel();
            modelo.setRowCount(0);

            // Llenamos la tabla con las habitaciones disponibles
            for (Habitacion habitacion : habitacionesLibres) {
                Object[] infoFila = {habitacion.getNroHabitacion(), habitacion.getPiso(),
                    habitacion.getNombreTipoHabitacion(), habitacion.getCapacidadMaxima(),
                    habitacion.getPrecioPorNoche()};
                modelo.addRow(infoFila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar las "
                    + "habitaciones disponibles: " + ex.getMessage());
        }
    }

    private void limpiarCampos() {
        jtfDocumentoCliente.setText("");
        jtfNombreCliente.setText("");
        jtfApellidoCliente.setText("");
        jtfDomicilioCliente.setText("");
        jtfCorreoElectronicoCliente.setText("");
        jtfCelularCliente.setText("");
        jdcFechaIngreso.setDate(null);
        jdcFechaEgreso.setDate(null);

        DefaultTableModel modelo = (DefaultTableModel) jtHabitaciones.getModel();
        modelo.setRowCount(0);

        jlCostoTotalNro.setText("$0");
    }

    private boolean esNumeroValido(String texto) {
        return texto.matches("\\d+"); // Acepta solo números
    }

    private boolean esTextoValido(String texto) {
        return texto.matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+$"); // Acepta solo letras y espacios
    }

    private boolean esTextoNumerosSimbolosValido(String texto) {
        return texto.matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ0-9\\s\\p{Punct}]+$"); // Acepta letras, números y símbolos
    }
}
