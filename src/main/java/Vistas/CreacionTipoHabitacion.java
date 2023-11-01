package Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class CreacionTipoHabitacion extends javax.swing.JInternalFrame {

    public CreacionTipoHabitacion() {
        initComponents();

        // Establecemos el JInternalFrame sin bordes y cabecera
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlCreacionTipoHabitacion = new javax.swing.JLabel();
        jlDescripcionCreacionTipoHabitacion = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlCreacionTipoHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jlCreacionTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jlCreacionTipoHabitacion.setText("Creación de nuevos tipos de habitación");

        jlDescripcionCreacionTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jlDescripcionCreacionTipoHabitacion.setText("Puede realizar la creación de nuevos tipos de habitación");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlDocumentoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDocumentoCliente.setText("Código");

        jtfDocumentoCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfDocumentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDocumentoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfDocumentoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfDocumentoCliente.setPreferredSize(new java.awt.Dimension(64, 30));

        jbBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbBuscarCliente.setForeground(new java.awt.Color(23, 23, 23));
        jbBuscarCliente.setText("Buscar");
        jbBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBuscarCliente.setPreferredSize(new java.awt.Dimension(60, 30));

        jlNombreCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlNombreCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlNombreCliente.setText("Nombre");

        jlApellidoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlApellidoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlApellidoCliente.setText("Cantidad de personas");

        jtfNombreCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombreCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfNombreCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfNombreCliente.setPreferredSize(new java.awt.Dimension(64, 30));

        jtfApellidoCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfApellidoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfApellidoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfApellidoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfApellidoCliente.setPreferredSize(new java.awt.Dimension(64, 30));

        jlDomicilioCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDomicilioCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDomicilioCliente.setText("Cantidad de camas");

        jtfDomicilioCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfDomicilioCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDomicilioCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfDomicilioCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfDomicilioCliente.setPreferredSize(new java.awt.Dimension(64, 30));

        jlCorreoElectronicoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCorreoElectronicoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlCorreoElectronicoCliente.setText("Tipos de camas");

        jtfCorreoElectronicoCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfCorreoElectronicoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCorreoElectronicoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfCorreoElectronicoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfCorreoElectronicoCliente.setPreferredSize(new java.awt.Dimension(64, 30));

        jlCelularCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCelularCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlCelularCliente.setText("Precio por noche");

        jtfCelularCliente.setBackground(new java.awt.Color(230, 232, 235));
        jtfCelularCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCelularCliente.setForeground(new java.awt.Color(23, 23, 23));
        jtfCelularCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfCelularCliente.setPreferredSize(new java.awt.Dimension(64, 30));

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(23, 23, 23));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcionCreacionTipoHabitacion)
                    .addComponent(jlCreacionTipoHabitacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCreacionTipoHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDescripcionCreacionTipoHabitacion)
                .addGap(105, 105, 105)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JLabel jlApellidoCliente;
    private javax.swing.JLabel jlCelularCliente;
    private javax.swing.JLabel jlCorreoElectronicoCliente;
    private javax.swing.JLabel jlCreacionTipoHabitacion;
    private javax.swing.JLabel jlDescripcionCreacionTipoHabitacion;
    private javax.swing.JLabel jlDocumentoCliente;
    private javax.swing.JLabel jlDomicilioCliente;
    private javax.swing.JLabel jlNombreCliente;
    private javax.swing.JTextField jtfApellidoCliente;
    private javax.swing.JTextField jtfCelularCliente;
    private javax.swing.JTextField jtfCorreoElectronicoCliente;
    private javax.swing.JTextField jtfDocumentoCliente;
    private javax.swing.JTextField jtfDomicilioCliente;
    private javax.swing.JTextField jtfNombreCliente;
    // End of variables declaration//GEN-END:variables
}
