package Vistas;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class InicioTesting extends javax.swing.JFrame {

    private CreacionReservas creacionReservas;
    private ModificacionReservas modificacionReservas;
    private ListadoReservas listadoReservas;
    private habitaciones habitaciones;
    private AgregarHabitacion agregarHabitacion;
    private CreacionTipoHabitacion creacionTipoHabitacion;
    private ModificacionTipoHabitacion modificacionTipoHabitacion;
    private GestionHuesped altaHuesped;

    public InicioTesting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jmHabitaciones = new javax.swing.JMenu();
        jmiAdministrarHabitaciones = new javax.swing.JMenuItem();
        jmiCrearHabitaciones = new javax.swing.JMenuItem();
        jmiCreacionTipoHabitacion = new javax.swing.JMenuItem();
        jmiModificacionTipoHabitacion = new javax.swing.JMenuItem();
        jmReservas = new javax.swing.JMenu();
        jmiCreacionReservas = new javax.swing.JMenuItem();
        jmiModificacionReservas = new javax.swing.JMenuItem();
        jmiListadoReservas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jdpEscritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );

        jmClientes.setText("Clientes");

        jmiClientes.setText("Clientes (en construcción)");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jmClientes.add(jmiClientes);

        jMenuBar1.add(jmClientes);

        jmHabitaciones.setText("Habitaciones");

        jmiAdministrarHabitaciones.setText("Administrar habitaciones");
        jmiAdministrarHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministrarHabitacionesActionPerformed(evt);
            }
        });
        jmHabitaciones.add(jmiAdministrarHabitaciones);

        jmiCrearHabitaciones.setText("Crear habitaciones");
        jmiCrearHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearHabitacionesActionPerformed(evt);
            }
        });
        jmHabitaciones.add(jmiCrearHabitaciones);

        jmiCreacionTipoHabitacion.setText("Crear tipos de habitación");
        jmiCreacionTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCreacionTipoHabitacionActionPerformed(evt);
            }
        });
        jmHabitaciones.add(jmiCreacionTipoHabitacion);

        jmiModificacionTipoHabitacion.setText("Modificar tipos de habitación");
        jmiModificacionTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificacionTipoHabitacionActionPerformed(evt);
            }
        });
        jmHabitaciones.add(jmiModificacionTipoHabitacion);

        jMenuBar1.add(jmHabitaciones);

        jmReservas.setText("Reservas");

        jmiCreacionReservas.setText("Crear reservas");
        jmiCreacionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCreacionReservasActionPerformed(evt);
            }
        });
        jmReservas.add(jmiCreacionReservas);

        jmiModificacionReservas.setText("Modificar reservas");
        jmiModificacionReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificacionReservasActionPerformed(evt);
            }
        });
        jmReservas.add(jmiModificacionReservas);

        jmiListadoReservas.setText("Listar reservas");
        jmiListadoReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListadoReservasActionPerformed(evt);
            }
        });
        jmReservas.add(jmiListadoReservas);

        jMenuBar1.add(jmReservas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCreacionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCreacionReservasActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        creacionReservas = new CreacionReservas();

        // Centramos el JInternalFrame
        centrarInternalFrame(creacionReservas);

        creacionReservas.setVisible(true);
        jdpEscritorio.add(creacionReservas);
        jdpEscritorio.moveToFront(creacionReservas);
    }//GEN-LAST:event_jmiCreacionReservasActionPerformed

    private void jmiModificacionReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificacionReservasActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        modificacionReservas = new ModificacionReservas();

        // Centramos el JInternalFrame
        centrarInternalFrame(modificacionReservas);

        modificacionReservas.setVisible(true);
        jdpEscritorio.add(modificacionReservas);
        jdpEscritorio.moveToFront(modificacionReservas);
    }//GEN-LAST:event_jmiModificacionReservasActionPerformed

    private void jmiAdministrarHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarHabitacionesActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        habitaciones = new habitaciones();

        // Centramos el JInternalFrame
        centrarInternalFrame(habitaciones);

        habitaciones.setVisible(true);
        jdpEscritorio.add(habitaciones);
        jdpEscritorio.moveToFront(habitaciones);
    }//GEN-LAST:event_jmiAdministrarHabitacionesActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        altaHuesped = new GestionHuesped();

        // Centramos el JInternalFrame
        centrarInternalFrame(altaHuesped);

        altaHuesped.setVisible(true);
        jdpEscritorio.add(altaHuesped);
        jdpEscritorio.moveToFront(altaHuesped);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiListadoReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListadoReservasActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        listadoReservas = new ListadoReservas();

        // Centramos el JInternalFrame
        centrarInternalFrame(listadoReservas);

        listadoReservas.setVisible(true);
        jdpEscritorio.add(listadoReservas);
        jdpEscritorio.moveToFront(listadoReservas);
    }//GEN-LAST:event_jmiListadoReservasActionPerformed

    private void jmiCreacionTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCreacionTipoHabitacionActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        creacionTipoHabitacion = new CreacionTipoHabitacion();

        // Centramos el JInternalFrame
        centrarInternalFrame(creacionTipoHabitacion);

        creacionTipoHabitacion.setVisible(true);
        jdpEscritorio.add(creacionTipoHabitacion);
        jdpEscritorio.moveToFront(creacionTipoHabitacion);
    }//GEN-LAST:event_jmiCreacionTipoHabitacionActionPerformed

    private void jmiModificacionTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificacionTipoHabitacionActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        modificacionTipoHabitacion = new ModificacionTipoHabitacion();

        // Centramos el JInternalFrame
        centrarInternalFrame(modificacionTipoHabitacion);

        modificacionTipoHabitacion.setVisible(true);
        jdpEscritorio.add(modificacionTipoHabitacion);
        jdpEscritorio.moveToFront(modificacionTipoHabitacion);
    }//GEN-LAST:event_jmiModificacionTipoHabitacionActionPerformed

    private void jmiCrearHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearHabitacionesActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        agregarHabitacion = new AgregarHabitacion();

        // Centramos el JInternalFrame
        centrarInternalFrame(agregarHabitacion);

        agregarHabitacion.setVisible(true);
        jdpEscritorio.add(agregarHabitacion);
        jdpEscritorio.moveToFront(agregarHabitacion);
    }//GEN-LAST:event_jmiCrearHabitacionesActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioTesting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmHabitaciones;
    private javax.swing.JMenu jmReservas;
    private javax.swing.JMenuItem jmiAdministrarHabitaciones;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiCreacionReservas;
    private javax.swing.JMenuItem jmiCreacionTipoHabitacion;
    private javax.swing.JMenuItem jmiCrearHabitaciones;
    private javax.swing.JMenuItem jmiListadoReservas;
    private javax.swing.JMenuItem jmiModificacionReservas;
    private javax.swing.JMenuItem jmiModificacionTipoHabitacion;
    // End of variables declaration//GEN-END:variables

    private void centrarInternalFrame(JInternalFrame frame) {

        // Obtenemos el tamaño del JDesktopPane
        int anchoDesktop = jdpEscritorio.getWidth();
        int altoDesktop = jdpEscritorio.getHeight();

        // Obtenemos el tamaño del JInternalFrame
        int anchoFrame = frame.getWidth();
        int altoFrame = frame.getHeight();

        // Calculamos las coordenadas para centrar el JInternalFrame
        int x = (anchoDesktop - anchoFrame) / 2;
        int y = (altoDesktop - altoFrame) / 2;

        // Establecemos la ubicación del JInternalFrame
        frame.setLocation(x, y);
    }
}
