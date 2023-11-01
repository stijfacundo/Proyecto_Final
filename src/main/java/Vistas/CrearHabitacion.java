package Vistas;

import Datas.HabitacionData;
import Entidades.Habitacion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class CrearHabitacion extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public CrearHabitacion() {
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
        jPmenuPrincipal = new javax.swing.JPanel();
        jLPiso = new javax.swing.JLabel();
        jTFPiso = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLNumero = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLOcupada = new javax.swing.JLabel();
        jRBOcupada = new javax.swing.JRadioButton();
        jbLimpiar = new javax.swing.JButton();
        jRBEstado = new javax.swing.JRadioButton();
        jLEstado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPmenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPmenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLPiso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLPiso.setForeground(new java.awt.Color(0, 0, 0));
        jLPiso.setText("Piso");

        jTFPiso.setBackground(new java.awt.Color(230, 232, 235));
        jTFPiso.setToolTipText("");
        jTFPiso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFPiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFPisoKeyTyped(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLCodigo.setText("Codigo");

        jTFCodigo.setBackground(new java.awt.Color(230, 232, 235));
        jTFCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCodigoKeyTyped(evt);
            }
        });

        jLNumero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLNumero.setForeground(new java.awt.Color(0, 0, 0));
        jLNumero.setText("Numero");

        jTFNumero.setBackground(new java.awt.Color(230, 232, 235));
        jTFNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNumeroKeyTyped(evt);
            }
        });

        jBguardar.setBackground(new java.awt.Color(255, 255, 255));
        jBguardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBguardar.setForeground(new java.awt.Color(0, 0, 0));
        jBguardar.setText("guardar");
        jBguardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbBuscar.setText("Buscar");
        jbBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLOcupada.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLOcupada.setForeground(new java.awt.Color(0, 0, 0));
        jLOcupada.setText("Ocupada");

        jRBOcupada.setForeground(new java.awt.Color(0, 0, 0));
        jRBOcupada.setText("Si / No");
        jRBOcupada.setBorder(null);

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jRBEstado.setForeground(new java.awt.Color(0, 0, 0));
        jRBEstado.setText("Activo / inactivo");
        jRBEstado.setBorder(null);

        jLEstado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLEstado.setForeground(new java.awt.Color(0, 0, 0));
        jLEstado.setText("Estado");

        javax.swing.GroupLayout jPmenuPrincipalLayout = new javax.swing.GroupLayout(jPmenuPrincipal);
        jPmenuPrincipal.setLayout(jPmenuPrincipalLayout);
        jPmenuPrincipalLayout.setHorizontalGroup(
            jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEstado)
                    .addComponent(jRBEstado)
                    .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTFPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLOcupada)
                                .addComponent(jRBOcupada)
                                .addComponent(jLNumero)
                                .addComponent(jLPiso)
                                .addComponent(jLCodigo)
                                .addGroup(jPmenuPrincipalLayout.createSequentialGroup()
                                    .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPmenuPrincipalLayout.setVerticalGroup(
            jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLPiso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLOcupada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBOcupada)
                .addGap(18, 18, 18)
                .addComponent(jLEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBEstado)
                .addGap(166, 166, 166)
                .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Aqui podra crear y modificar habitaciones, para buscar una habitacion debe de ingresar su Numero");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Gestion de habitaciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jPmenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPmenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            if (!jTFNumero.getText().isEmpty()) {
                int numeroBuscado = Integer.parseInt(jTFNumero.getText());
                HabitacionData habitacionBuscada = new HabitacionData();
                Habitacion habitacion = habitacionBuscada.buscarHabitacionPorNro(numeroBuscado);

                jTFNumero.setText(Integer.toString(habitacion.getNroHabitacion()));
                //Habilitamos la edicion de todos los campos
                jTFNumero.enable(true);
                jTFPiso.enable(true);
                jTFCodigo.enable(false);

                //Guardamos los nuevos valores
                jTFNumero.setText(String.valueOf(habitacion.getNroHabitacion()));
                jTFPiso.setText(String.valueOf(habitacion.getPiso()));
                jTFCodigo.setText(String.valueOf(habitacion.getcodigoTipoHabitacion()));
                jRBOcupada.setSelected(habitacion.isEstado());
                jRBEstado.setSelected(habitacion.isEstado());

            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido.");
                //Limpiamos los campos
                limpiarcampos();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "El numero ingresado no coincide con una habitacion existente");
            jTFNumero.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jTFPisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPisoKeyTyped
        // Consume los caracteres no numericos
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFPisoKeyTyped

    private void jTFNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNumeroKeyTyped
        // Consume los caracteres no numéricos
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_jTFNumeroKeyTyped

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarcampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jTFCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyTyped
        // Consume los caracteres no numéricos
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCodigoKeyTyped

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try {
            // Verificamos si los campos están completados
            if (!jTFNumero.getText().isEmpty()
                    && !jTFPiso.getText().isEmpty()
                    && !jTFCodigo.getText().isEmpty()) {

                HabitacionData habitacionData = new HabitacionData();
                Habitacion habitacionExistente = null;

                int numeroBuscado = Integer.parseInt(jTFNumero.getText());
                habitacionExistente = habitacionData.buscarHabitacionPorNro(numeroBuscado);

                if (habitacionExistente != null) {
                    // Si el huesped existe, modificamos los datos
                    habitacionExistente.setNroHabitacion(Integer.parseInt(jTFNumero.getText()));
                    habitacionExistente.setPiso(Integer.parseInt(jTFPiso.getText()));
                    habitacionExistente.setcodigoTipoHabitacion(jTFCodigo.getText());
                    habitacionExistente.setEstado(jRBOcupada.isSelected());
                    habitacionExistente.setEstado(jRBEstado.isSelected());

                    habitacionData.modificarHabitacion(habitacionExistente);
                    JOptionPane.showMessageDialog(this, "Habitacion modificada exitosamente.");
                    //Limpiamos los campos
                    limpiarcampos();
                } else {
                    // Si el huesped no existe, creamos uno nuevo
                    Habitacion habitacionNueva = new Habitacion();
                    habitacionNueva.setNroHabitacion(Integer.parseInt(jTFNumero.getText()));
                    habitacionNueva.setPiso(Integer.parseInt(jTFPiso.getText()));
                    habitacionNueva.setcodigoTipoHabitacion(jTFCodigo.getText());
                    habitacionNueva.setEstado(jRBOcupada.isSelected());
                    habitacionNueva.setEstado(jRBEstado.isSelected());
                    habitacionData.guardarHabitacion(habitacionNueva);
                    JOptionPane.showMessageDialog(this, "Habitacion creada exitosamente.");
                    //Limpiamos los campos
                    limpiarcampos();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Los campos deben estar llenos y contener valores validos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLOcupada;
    private javax.swing.JLabel jLPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPmenuPrincipal;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JRadioButton jRBOcupada;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFPiso;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    // End of variables declaration//GEN-END:variables
private void limpiarcampos() {
        //Limpiamos los textfields y habilitamos el campo de DNI
        jTFNumero.setText("");
        jTFPiso.setText("");
        jTFCodigo.setText("");
        jRBOcupada.setSelected(false);
        jRBEstado.setSelected(false);

    }
;
}
