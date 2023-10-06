package Vistas;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class InicioTesting extends javax.swing.JFrame {

    private CreacionReservas gestionReservas;

    public InicioTesting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmClientes = new javax.swing.JMenu();
        jmiGestionarClientes = new javax.swing.JMenuItem();
        jmHabitaciones = new javax.swing.JMenu();
        jmiGestionarHabitaciones = new javax.swing.JMenuItem();
        jmReservas = new javax.swing.JMenu();
        jmiGestionarReservas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpEscritorio.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jmClientes.setText("Clientes");

        jmiGestionarClientes.setText("Gestionar clientes");
        jmClientes.add(jmiGestionarClientes);

        jMenuBar1.add(jmClientes);

        jmHabitaciones.setText("Habitaciones");

        jmiGestionarHabitaciones.setText("Gestionar habitaciones");
        jmHabitaciones.add(jmiGestionarHabitaciones);

        jMenuBar1.add(jmHabitaciones);

        jmReservas.setText("Reservas");

        jmiGestionarReservas.setText("Gestionar reservas");
        jmiGestionarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGestionarReservasActionPerformed(evt);
            }
        });
        jmReservas.add(jmiGestionarReservas);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jmiGestionarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGestionarReservasActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        gestionReservas = new CreacionReservas();

        // Centramos el JInternalFrame
        centrarInternalFrame(gestionReservas);

        gestionReservas.setVisible(true);
        jdpEscritorio.add(gestionReservas);
        jdpEscritorio.moveToFront(gestionReservas);
    }//GEN-LAST:event_jmiGestionarReservasActionPerformed

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
    private javax.swing.JMenuItem jmiGestionarClientes;
    private javax.swing.JMenuItem jmiGestionarHabitaciones;
    private javax.swing.JMenuItem jmiGestionarReservas;
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
