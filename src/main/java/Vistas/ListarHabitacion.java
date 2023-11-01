package Vistas;

import Datas.HabitacionData;
import Entidades.Habitacion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ListarHabitacion extends javax.swing.JInternalFrame {

    public ListarHabitacion() {
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
        jPHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jPMenu = new javax.swing.JPanel();
        jLNumero = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPHeader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Listar Habitaciones");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Puede ver la lista de habitaciones y filtrarla mediante el numero de la habitacion");

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGroup(jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jtTabla.setBackground(new java.awt.Color(255, 255, 255));
        jtTabla.setForeground(new java.awt.Color(0, 0, 0));
        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Piso", "Ocupada", "Codigo de TdH", "Estado"
            }
        ));
        jtTabla.setShowGrid(false);
        jScrollPane1.setViewportView(jtTabla);

        jPMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLNumero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLNumero.setForeground(new java.awt.Color(0, 0, 0));
        jLNumero.setText("Numero");

        jTFNumero.setBackground(new java.awt.Color(230, 232, 235));
        jTFNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNumeroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNumeroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumero))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 558, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addGap(63, 63, 63))
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

    private void jTFNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNumeroKeyReleased

        HabitacionData listaHabitacion = new HabitacionData();

        try {
            DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();

            //Colocamos las filas en blanco
            modelo.setRowCount(0);

            //Cargamos los huespedes a la tabla
            for (Habitacion habitacion : listaHabitacion.listarHabitacion()) {
                if (habitacion.getNroHabitacion() == Integer.parseInt(jTFNumero.getText())) {
                    modelo.addRow(new Object[]{
                        habitacion.getNroHabitacion(),
                        habitacion.getPiso(),
                        habitacion.getOcupada(),
                        habitacion.getcodigoTipoHabitacion(),
                        habitacion.getEstado()
                    });
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTFNumeroKeyReleased

    private void jTFNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNumeroKeyTyped
        // Consume los caracteres no numericos
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFNumeroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
    // Método para alumnos curssando la materia seleccionada
}
