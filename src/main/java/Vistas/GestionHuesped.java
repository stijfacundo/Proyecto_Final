package Vistas;

import Datas.HuespedData;
import Entidades.Huesped;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class GestionHuesped extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public GestionHuesped() {
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
        jLnombre = new javax.swing.JLabel();
        jTFnombre = new javax.swing.JTextField();
        jLapellido = new javax.swing.JLabel();
        jTFapellido = new javax.swing.JTextField();
        jlDNI = new javax.swing.JLabel();
        jTFDNI = new javax.swing.JTextField();
        jldomicilio = new javax.swing.JLabel();
        jTFdomicilio = new javax.swing.JTextField();
        jlcorreo = new javax.swing.JLabel();
        jTFcorreo = new javax.swing.JTextField();
        jLcelular = new javax.swing.JLabel();
        jTFcelular = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLestado = new javax.swing.JLabel();
        jRBestado = new javax.swing.JRadioButton();
        jbLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPmenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPmenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLnombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(0, 0, 0));
        jLnombre.setText("Nombre");

        jTFnombre.setBackground(new java.awt.Color(230, 232, 235));
        jTFnombre.setToolTipText("");
        jTFnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFnombreKeyTyped(evt);
            }
        });

        jLapellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLapellido.setForeground(new java.awt.Color(0, 0, 0));
        jLapellido.setText("Apellido");

        jTFapellido.setBackground(new java.awt.Color(230, 232, 235));
        jTFapellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFapellidoKeyTyped(evt);
            }
        });

        jlDNI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDNI.setForeground(new java.awt.Color(0, 0, 0));
        jlDNI.setText("DNI");

        jTFDNI.setBackground(new java.awt.Color(230, 232, 235));
        jTFDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFDNIKeyTyped(evt);
            }
        });

        jldomicilio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jldomicilio.setForeground(new java.awt.Color(0, 0, 0));
        jldomicilio.setText("Domicilio");

        jTFdomicilio.setBackground(new java.awt.Color(230, 232, 235));
        jTFdomicilio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFdomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFdomicilioKeyTyped(evt);
            }
        });

        jlcorreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlcorreo.setForeground(new java.awt.Color(0, 0, 0));
        jlcorreo.setText("Correo");

        jTFcorreo.setBackground(new java.awt.Color(230, 232, 235));
        jTFcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFcorreoKeyTyped(evt);
            }
        });

        jLcelular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLcelular.setForeground(new java.awt.Color(0, 0, 0));
        jLcelular.setText("Celular");

        jTFcelular.setBackground(new java.awt.Color(230, 232, 235));
        jTFcelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jTFcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFcelularKeyTyped(evt);
            }
        });

        jBguardar.setBackground(new java.awt.Color(255, 255, 255));
        jBguardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jBguardar.setForeground(new java.awt.Color(0, 0, 0));
        jBguardar.setText("Guardar");
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

        jLestado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLestado.setForeground(new java.awt.Color(0, 0, 0));
        jLestado.setText("Estado");

        jRBestado.setForeground(new java.awt.Color(0, 0, 0));
        jRBestado.setText("Activo / Inactivo");
        jRBestado.setBorder(null);

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

        javax.swing.GroupLayout jPmenuPrincipalLayout = new javax.swing.GroupLayout(jPmenuPrincipal);
        jPmenuPrincipal.setLayout(jPmenuPrincipalLayout);
        jPmenuPrincipalLayout.setHorizontalGroup(
            jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLestado)
                            .addComponent(jRBestado)
                            .addComponent(jlDNI)
                            .addComponent(jLcelular)
                            .addComponent(jlcorreo)
                            .addComponent(jldomicilio)
                            .addComponent(jLnombre)
                            .addComponent(jLapellido)
                            .addGroup(jPmenuPrincipalLayout.createSequentialGroup()
                                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jTFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPmenuPrincipalLayout.setVerticalGroup(
            jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPmenuPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlDNI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLapellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jldomicilio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlcorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLcelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBestado)
                .addGap(18, 18, 18)
                .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPmenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Gestion de Huesped");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Puede crear y modificar huéspedes, para buscar un huésped debe de ingresar su DNI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jPmenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
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

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try {
            // Verificamos si los campos están completados
            if (!jTFnombre.getText().isEmpty()
                    && !jTFapellido.getText().isEmpty()
                    && !jTFDNI.getText().isEmpty()
                    && !jTFdomicilio.getText().isEmpty()
                    && !jTFcorreo.getText().isEmpty()
                    && !jTFcelular.getText().isEmpty()) {

                HuespedData huespedData = new HuespedData();
                Huesped huespedExistente = null;

                int dniBuscado = Integer.parseInt(jTFDNI.getText());
                huespedExistente = huespedData.buscarHuespedPorDNI(dniBuscado);

                if (huespedExistente != null) {
                    // Si el huesped existe, modificamos los datos
                    huespedExistente.setNombre(jTFnombre.getText());
                    huespedExistente.setApellido(jTFapellido.getText());
                    huespedExistente.setDni(Integer.parseInt(jTFDNI.getText()));
                    huespedExistente.setDomicilio(jTFdomicilio.getText());
                    huespedExistente.setCorreo(jTFcorreo.getText());
                    huespedExistente.setCelular(jTFcelular.getText());
                    huespedExistente.setEstado(jRBestado.isSelected());

                    huespedData.modificarHuesped(huespedExistente, dniBuscado);
                    JOptionPane.showMessageDialog(this, "Huesped modificado exitosamente.");
                    //Limpiamos los campos
                    limpiarcampos();
                } else {
                    // Si el huesped no existe, creamos uno nuevo
                    Huesped huespedNuevo = new Huesped();
                    huespedNuevo.setNombre(jTFnombre.getText());
                    huespedNuevo.setApellido(jTFapellido.getText());
                    huespedNuevo.setDni(Integer.parseInt(jTFDNI.getText()));
                    huespedNuevo.setDomicilio(jTFdomicilio.getText());
                    huespedNuevo.setCorreo(jTFcorreo.getText());
                    huespedNuevo.setCelular(jTFcelular.getText());
                    huespedNuevo.setEstado(jRBestado.isSelected());

                    huespedData.guardarHuesped(huespedNuevo);
                    JOptionPane.showMessageDialog(this, "Huesped creado exitosamente.");
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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            if (!jTFDNI.getText().isEmpty()) {
                int dniBuscado = Integer.parseInt(jTFDNI.getText());
                HuespedData huespedBuscado = new HuespedData();
                Huesped huesped = huespedBuscado.buscarHuespedPorDNI(dniBuscado);

                jTFDNI.setText(Integer.toString(huesped.getDni()));
                //Habilitamos la edicion de todos los campos menos la del DNI
                jTFnombre.enable(true);
                jTFapellido.enable(true);
                jTFDNI.enable(false);
                jTFdomicilio.enable(true);
                jTFcorreo.enable(true);
                jTFcelular.enable(true);

                //Guardamos los nuevos valores
                jTFnombre.setText(huesped.getNombre());
                jTFapellido.setText(huesped.getApellido());
                jTFDNI.setText(String.valueOf(huesped.getDni()));
                jTFdomicilio.setText(huesped.getDomicilio());
                jTFcorreo.setText(huesped.getCorreo());
                jTFcelular.setText(huesped.getCelular());
                jRBestado.setSelected(huesped.isEstado());

            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un DNI valido.");
                //Limpiamos los campos
                limpiarcampos();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "El DNI ingresado no coincide con un alumno existente");
            jTFDNI.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jTFnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnombreKeyTyped
        // Consume los caracteres no alfabeticos
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFnombreKeyTyped

    private void jTFapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFapellidoKeyTyped
        // Consume los caracteres no alfabeticos
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {
            evt.consume();
        }    }//GEN-LAST:event_jTFapellidoKeyTyped

    private void jTFDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDNIKeyTyped
        // Consume los caracteres no numéricos
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_jTFDNIKeyTyped

    private void jTFdomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFdomicilioKeyTyped
        // Consume los caracteres no numéricos y no alfabeticos
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFdomicilioKeyTyped

    private void jTFcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcorreoKeyTyped
        // Consume los caracteres no numéricos y no alfabeticos
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && !Character.isDefined(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFcorreoKeyTyped

    private void jTFcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcelularKeyTyped
        // Consume los caracteres no numéricos
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFcelularKeyTyped

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarcampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLapellido;
    private javax.swing.JLabel jLcelular;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPmenuPrincipal;
    private javax.swing.JRadioButton jRBestado;
    private javax.swing.JTextField jTFDNI;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFcelular;
    private javax.swing.JTextField jTFcorreo;
    private javax.swing.JTextField jTFdomicilio;
    private javax.swing.JTextField jTFnombre;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlcorreo;
    private javax.swing.JLabel jldomicilio;
    // End of variables declaration//GEN-END:variables
private void limpiarcampos() {
        //Limpiamos los textfields y habilitamos el campo de DNI
        jTFnombre.setText("");
        jTFapellido.setText("");
        jTFDNI.setText("");
        jTFdomicilio.setText("");
        jTFcorreo.setText("");
        jTFcelular.setText("");
        jRBestado.setSelected(false);
        jTFDNI.enable(true);
    }
;
}
