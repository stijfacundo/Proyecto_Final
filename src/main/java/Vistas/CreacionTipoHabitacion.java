package Vistas;

import Datas.TipoHabitacionData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
        jtfCodigoTipoHabitacion = new javax.swing.JTextField();
        jbLimpiarCampos = new javax.swing.JButton();
        jlNombreCliente = new javax.swing.JLabel();
        jlApellidoCliente = new javax.swing.JLabel();
        jtfNombreTipoHabitacion = new javax.swing.JTextField();
        jtfCapacidadMaximaTipoHabitacion = new javax.swing.JTextField();
        jlDomicilioCliente = new javax.swing.JLabel();
        jtfCantidadCamasTipoHabitacion = new javax.swing.JTextField();
        jlCorreoElectronicoCliente = new javax.swing.JLabel();
        jtfTiposCamasTipoHabitacion = new javax.swing.JTextField();
        jlCelularCliente = new javax.swing.JLabel();
        jtfPrecioPorNocheTipoHabitacion = new javax.swing.JTextField();
        jbGuardarTipoHabitacion = new javax.swing.JButton();

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

        jtfCodigoTipoHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jtfCodigoTipoHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCodigoTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jtfCodigoTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfCodigoTipoHabitacion.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfCodigoTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoTipoHabitacionKeyTyped(evt);
            }
        });

        jbLimpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiarCampos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbLimpiarCampos.setForeground(new java.awt.Color(23, 23, 23));
        jbLimpiarCampos.setText("Limpiar");
        jbLimpiarCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbLimpiarCampos.setPreferredSize(new java.awt.Dimension(60, 30));
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        jlNombreCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlNombreCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlNombreCliente.setText("Nombre");

        jlApellidoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlApellidoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlApellidoCliente.setText("Capacidad máxima");

        jtfNombreTipoHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jtfNombreTipoHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombreTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jtfNombreTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfNombreTipoHabitacion.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfNombreTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreTipoHabitacionKeyTyped(evt);
            }
        });

        jtfCapacidadMaximaTipoHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jtfCapacidadMaximaTipoHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCapacidadMaximaTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jtfCapacidadMaximaTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfCapacidadMaximaTipoHabitacion.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfCapacidadMaximaTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCapacidadMaximaTipoHabitacionKeyTyped(evt);
            }
        });

        jlDomicilioCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlDomicilioCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlDomicilioCliente.setText("Cantidad de camas");

        jtfCantidadCamasTipoHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jtfCantidadCamasTipoHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCantidadCamasTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jtfCantidadCamasTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfCantidadCamasTipoHabitacion.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfCantidadCamasTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCantidadCamasTipoHabitacionKeyTyped(evt);
            }
        });

        jlCorreoElectronicoCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCorreoElectronicoCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlCorreoElectronicoCliente.setText("Tipos de camas");

        jtfTiposCamasTipoHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jtfTiposCamasTipoHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfTiposCamasTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jtfTiposCamasTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfTiposCamasTipoHabitacion.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfTiposCamasTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTiposCamasTipoHabitacionKeyTyped(evt);
            }
        });

        jlCelularCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jlCelularCliente.setForeground(new java.awt.Color(23, 23, 23));
        jlCelularCliente.setText("Precio por noche");

        jtfPrecioPorNocheTipoHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jtfPrecioPorNocheTipoHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPrecioPorNocheTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jtfPrecioPorNocheTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 232, 235), 6));
        jtfPrecioPorNocheTipoHabitacion.setPreferredSize(new java.awt.Dimension(64, 30));
        jtfPrecioPorNocheTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPrecioPorNocheTipoHabitacionKeyTyped(evt);
            }
        });

        jbGuardarTipoHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardarTipoHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jbGuardarTipoHabitacion.setForeground(new java.awt.Color(23, 23, 23));
        jbGuardarTipoHabitacion.setText("Guardar");
        jbGuardarTipoHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbGuardarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarTipoHabitacionActionPerformed(evt);
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
                        .addComponent(jbLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGuardarTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlDocumentoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlApellidoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDomicilioCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCorreoElectronicoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCelularCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCodigoTipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfNombreTipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCapacidadMaximaTipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCantidadCamasTipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfTiposCamasTipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfPrecioPorNocheTipoHabitacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDocumentoCliente)
                .addGap(8, 8, 8)
                .addComponent(jtfCodigoTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNombreTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlApellidoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCapacidadMaximaTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDomicilioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCantidadCamasTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCorreoElectronicoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTiposCamasTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCelularCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPrecioPorNocheTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardarTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbGuardarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarTipoHabitacionActionPerformed
        try {
            if (jtfCodigoTipoHabitacion.getText().isEmpty() || jtfNombreTipoHabitacion.getText().isEmpty()
                    || jtfCapacidadMaximaTipoHabitacion.getText().isEmpty() || jtfCantidadCamasTipoHabitacion.getText().isEmpty()
                    || jtfTiposCamasTipoHabitacion.getText().isEmpty() || jtfPrecioPorNocheTipoHabitacion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos antes de crear un tipo de habitación.");
                return;
            }

            String codigo = jtfCodigoTipoHabitacion.getText();
            String nombre = jtfNombreTipoHabitacion.getText();
            int capacidadMaxima = Integer.parseInt(jtfCapacidadMaximaTipoHabitacion.getText());
            int cantidadCamas = Integer.parseInt(jtfCantidadCamasTipoHabitacion.getText());
            String tiposCamas = jtfTiposCamasTipoHabitacion.getText();
            double precioPorNoche = Double.parseDouble(jtfPrecioPorNocheTipoHabitacion.getText());

            // Validamos los datos antes de crear el tipo de habitación
            if (!esTextoNumerosSimbolosValido(codigo)) {
                JOptionPane.showMessageDialog(this, "El código debe contener letras, números y símbolos.");
                return; // Detiene la ejecución
            }

            if (!esTextoValido(nombre)) {
                JOptionPane.showMessageDialog(this, "El nombre debe contener solo letras y espacios.");
                return; // Detiene la ejecución
            }

            if (!esNumeroValido(jtfCapacidadMaximaTipoHabitacion.getText())) {
                JOptionPane.showMessageDialog(this, "La capacidad máxima debe contener solo números.");
                return; // Detiene la ejecución
            }

            if (!esNumeroValido(jtfCantidadCamasTipoHabitacion.getText())) {
                JOptionPane.showMessageDialog(this, "La cantidad de camas debe contener solo números.");
                return; // Detiene la ejecución
            }

            if (!esTextoNumerosSimbolosValido(tiposCamas)) {
                JOptionPane.showMessageDialog(this, "Los tipos de camas deben contener letras, números y símbolos.");
                return; // Detiene la ejecución
            }

            if (!esNumeroValido(jtfPrecioPorNocheTipoHabitacion.getText())) {
                JOptionPane.showMessageDialog(this, "El precio por noche debe contener solo números.");
                return; // Detiene la ejecución
            }

            // Llamamos al método de la clase TipoHabitacionData para crear el tipo de habitación
            TipoHabitacionData tipoHabitacionData = new TipoHabitacionData();
            boolean creacionExitosa = tipoHabitacionData.crearTipoHabitacion(codigo, nombre, capacidadMaxima, cantidadCamas, tiposCamas, precioPorNoche);

            if (creacionExitosa) {
                JOptionPane.showMessageDialog(this, "Tipo de habitación creado con éxito.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al crear el tipo de habitación.");
            }

            // Limpiamos los campos tras la creación del tipo de habitación
            limpiarCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al crear un tipo de habitación: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbGuardarTipoHabitacionActionPerformed

    private void jbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarCamposActionPerformed

    private void jtfCodigoTipoHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoTipoHabitacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && !Character.isDefined(c)) {
            evt.consume(); // Consume los caracteres no permitidos
        }
    }//GEN-LAST:event_jtfCodigoTipoHabitacionKeyTyped

    private void jtfNombreTipoHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreTipoHabitacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume(); // Consume los caracteres no alfabéticos
        }
    }//GEN-LAST:event_jtfNombreTipoHabitacionKeyTyped

    private void jtfCapacidadMaximaTipoHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCapacidadMaximaTipoHabitacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume los caracteres no numéricos
        }
    }//GEN-LAST:event_jtfCapacidadMaximaTipoHabitacionKeyTyped

    private void jtfCantidadCamasTipoHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCantidadCamasTipoHabitacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume los caracteres no numéricos
        }
    }//GEN-LAST:event_jtfCantidadCamasTipoHabitacionKeyTyped

    private void jtfTiposCamasTipoHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTiposCamasTipoHabitacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && !Character.isDefined(c)) {
            evt.consume(); // Consume los caracteres no permitidos
        }
    }//GEN-LAST:event_jtfTiposCamasTipoHabitacionKeyTyped

    private void jtfPrecioPorNocheTipoHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioPorNocheTipoHabitacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Consume los caracteres no permitidos
        }
    }//GEN-LAST:event_jtfPrecioPorNocheTipoHabitacionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbGuardarTipoHabitacion;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JLabel jlApellidoCliente;
    private javax.swing.JLabel jlCelularCliente;
    private javax.swing.JLabel jlCorreoElectronicoCliente;
    private javax.swing.JLabel jlCreacionTipoHabitacion;
    private javax.swing.JLabel jlDescripcionCreacionTipoHabitacion;
    private javax.swing.JLabel jlDocumentoCliente;
    private javax.swing.JLabel jlDomicilioCliente;
    private javax.swing.JLabel jlNombreCliente;
    private javax.swing.JTextField jtfCantidadCamasTipoHabitacion;
    private javax.swing.JTextField jtfCapacidadMaximaTipoHabitacion;
    private javax.swing.JTextField jtfCodigoTipoHabitacion;
    private javax.swing.JTextField jtfNombreTipoHabitacion;
    private javax.swing.JTextField jtfPrecioPorNocheTipoHabitacion;
    private javax.swing.JTextField jtfTiposCamasTipoHabitacion;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtfCodigoTipoHabitacion.setText("");
        jtfNombreTipoHabitacion.setText("");
        jtfCapacidadMaximaTipoHabitacion.setText("");
        jtfCantidadCamasTipoHabitacion.setText("");
        jtfTiposCamasTipoHabitacion.setText("");
        jtfPrecioPorNocheTipoHabitacion.setText("");
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
