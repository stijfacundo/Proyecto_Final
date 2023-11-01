package Vistas;

public class ModificacionTipoHabitacion extends javax.swing.JInternalFrame {

    public ModificacionTipoHabitacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlCreacionTipoHabitacion = new javax.swing.JLabel();
        jlDescripcionCreacionTipoHabitacion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtfDocumentoCliente = new javax.swing.JTextField();
        jlDocumentoCliente = new javax.swing.JLabel();
        jbBuscarCliente = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardarCambios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlCreacionTipoHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jlCreacionTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jlCreacionTipoHabitacion.setText("Modificación de tipos de habitación existentes");

        jlDescripcionCreacionTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jlDescripcionCreacionTipoHabitacion.setText("Puede realizar la modificación de los  tipos de habitación existentes");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtfDocumentoCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfDocumentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfDocumentoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfDocumentoCliente.setPreferredSize(new java.awt.Dimension(64, 30));

        jlDocumentoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDocumentoCliente.setText("Código");

        jbBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbBuscarCliente.setForeground(new java.awt.Color(23, 23, 23));
        jbBuscarCliente.setText("Buscar");
        jbBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(23, 23, 23));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbGuardarCambios.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardarCambios.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbGuardarCambios.setForeground(new java.awt.Color(23, 23, 23));
        jbGuardarCambios.setText("Guardar");
        jbGuardarCambios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbGuardarCambios.setPreferredSize(new java.awt.Dimension(52, 30));

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
                        .addComponent(jbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jtReservas.setBackground(new java.awt.Color(255, 255, 255));
        jtReservas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtReservas.setForeground(new java.awt.Color(23, 23, 23));
        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Capacidad", "Cantidad camas", "Tipos camas", "Precio por noche"
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
            jtReservas.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtReservas.getColumnModel().getColumn(1).setResizable(false);
            jtReservas.getColumnModel().getColumn(2).setResizable(false);
            jtReservas.getColumnModel().getColumn(2).setPreferredWidth(20);
            jtReservas.getColumnModel().getColumn(3).setResizable(false);
            jtReservas.getColumnModel().getColumn(3).setPreferredWidth(30);
            jtReservas.getColumnModel().getColumn(4).setResizable(false);
            jtReservas.getColumnModel().getColumn(5).setResizable(false);
            jtReservas.getColumnModel().getColumn(5).setPreferredWidth(50);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbGuardarCambios;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JLabel jlCreacionTipoHabitacion;
    private javax.swing.JLabel jlDescripcionCreacionTipoHabitacion;
    private javax.swing.JLabel jlDocumentoCliente;
    private javax.swing.JTable jtReservas;
    private javax.swing.JTextField jtfDocumentoCliente;
    // End of variables declaration//GEN-END:variables
}
