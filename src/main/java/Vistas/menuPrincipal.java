package Vistas;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class menuPrincipal extends javax.swing.JFrame {

    private GestionHuesped crearHuesped;
    private ListarHuesped listarHuesped;
    private CrearHabitacion crearHabitacion;
    private ListarHabitacion listarHabitacion;
    private CreacionTipoHabitacion creacionTipoHabitacion;
    private ModificacionTipoHabitacion modificacionTipoHabitacion;
    private CreacionReservas creacionReservas;
    private ModificacionReservas modificacionReservas;
    private ListadoReservas listadoReservas;

    private boolean crearHuespedOn = false;
    private boolean listarHuespedOn = false;
    private boolean crearHabitacionOn = false;
    private boolean listarHabitacionOn = false;
    private boolean agregarTipoHabitacionOn = false;
    private boolean tipoHabitacionOn = false;
    private boolean creacionReservasOn = false;
    private boolean modificacionReservasOn = false;
    private boolean listadoReservasOn = false;

    public menuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jPMenu = new javax.swing.JPanel();
        jPUsuario = new javax.swing.JPanel();
        jLNombreUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPHuesped = new javax.swing.JPanel();
        jLHuespued1 = new javax.swing.JLabel();
        jPCrearHuesped = new javax.swing.JPanel();
        jLCrearHuesped = new javax.swing.JLabel();
        jPListarHuesped = new javax.swing.JPanel();
        jLListarHuesped = new javax.swing.JLabel();
        jS1 = new javax.swing.JSeparator();
        jPHabitacion = new javax.swing.JPanel();
        jLHabitacion = new javax.swing.JLabel();
        jPCrearHabitacion = new javax.swing.JPanel();
        jLCrearHabitacion = new javax.swing.JLabel();
        jPModificarHabitacion = new javax.swing.JPanel();
        jLModificarHabitacion = new javax.swing.JLabel();
        jS2 = new javax.swing.JSeparator();
        jPTHabitacion = new javax.swing.JPanel();
        jLTHabitacion = new javax.swing.JLabel();
        jPCrearTHabitacion = new javax.swing.JPanel();
        jLCrearTHabitacion = new javax.swing.JLabel();
        jPReserva = new javax.swing.JPanel();
        jLReserva = new javax.swing.JLabel();
        jPCrearReserva = new javax.swing.JPanel();
        jLCrearReserva = new javax.swing.JLabel();
        jPModificarReserva = new javax.swing.JPanel();
        jLModificarReserva = new javax.swing.JLabel();
        jPListarReserva = new javax.swing.JPanel();
        jLListarReserva = new javax.swing.JLabel();
        jPCopyright = new javax.swing.JPanel();
        jLCopyright = new javax.swing.JLabel();
        jPModificarTHabitacion = new javax.swing.JPanel();
        jLModificarTHabitacion = new javax.swing.JLabel();
        jS3 = new javax.swing.JSeparator();
        jDPPrograma = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPFondo.setBackground(new java.awt.Color(230, 232, 235));

        jPMenu.setBackground(new java.awt.Color(230, 232, 235));

        jPUsuario.setBackground(new java.awt.Color(230, 232, 235));

        jLNombreUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jLNombreUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jLNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombreUsuario.setText("@MiaWallace");
        jLNombreUsuario.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imagenPerfil.png"))); // NOI18N

        javax.swing.GroupLayout jPUsuarioLayout = new javax.swing.GroupLayout(jPUsuario);
        jPUsuario.setLayout(jPUsuarioLayout);
        jPUsuarioLayout.setHorizontalGroup(
            jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPUsuarioLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22))
        );
        jPUsuarioLayout.setVerticalGroup(
            jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPUsuarioLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPHuesped.setBackground(new java.awt.Color(230, 232, 235));
        jPHuesped.setPreferredSize(new java.awt.Dimension(112, 30));

        jLHuespued1.setBackground(new java.awt.Color(0, 0, 0));
        jLHuespued1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLHuespued1.setForeground(new java.awt.Color(0, 0, 0));
        jLHuespued1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLHuespued1.setText("Huesped");
        jLHuespued1.setPreferredSize(new java.awt.Dimension(60, 20));

        javax.swing.GroupLayout jPHuespedLayout = new javax.swing.GroupLayout(jPHuesped);
        jPHuesped.setLayout(jPHuespedLayout);
        jPHuespedLayout.setHorizontalGroup(
            jPHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHuespedLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLHuespued1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPHuespedLayout.setVerticalGroup(
            jPHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLHuespued1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPCrearHuesped.setBackground(new java.awt.Color(230, 232, 235));
        jPCrearHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCrearHuespedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCrearHuespedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCrearHuespedMouseExited(evt);
            }
        });

        jLCrearHuesped.setBackground(new java.awt.Color(0, 0, 0));
        jLCrearHuesped.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLCrearHuesped.setForeground(new java.awt.Color(0, 0, 0));
        jLCrearHuesped.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLCrearHuesped.setText("Gestion");
        jLCrearHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCrearHuespedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCrearHuespedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCrearHuespedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPCrearHuespedLayout = new javax.swing.GroupLayout(jPCrearHuesped);
        jPCrearHuesped.setLayout(jPCrearHuespedLayout);
        jPCrearHuespedLayout.setHorizontalGroup(
            jPCrearHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCrearHuespedLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLCrearHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCrearHuespedLayout.setVerticalGroup(
            jPCrearHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCrearHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPListarHuesped.setBackground(new java.awt.Color(230, 232, 235));
        jPListarHuesped.setPreferredSize(new java.awt.Dimension(102, 30));
        jPListarHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPListarHuespedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPListarHuespedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPListarHuespedMouseExited(evt);
            }
        });

        jLListarHuesped.setBackground(new java.awt.Color(0, 0, 0));
        jLListarHuesped.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLListarHuesped.setForeground(new java.awt.Color(0, 0, 0));
        jLListarHuesped.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLListarHuesped.setText("Listar");
        jLListarHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLListarHuespedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLListarHuespedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLListarHuespedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPListarHuespedLayout = new javax.swing.GroupLayout(jPListarHuesped);
        jPListarHuesped.setLayout(jPListarHuespedLayout);
        jPListarHuespedLayout.setHorizontalGroup(
            jPListarHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListarHuespedLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLListarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPListarHuespedLayout.setVerticalGroup(
            jPListarHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPListarHuespedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLListarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jS1.setPreferredSize(new java.awt.Dimension(0, 4));

        jPHabitacion.setBackground(new java.awt.Color(230, 232, 235));

        jLHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        jLHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jLHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLHabitacion.setText("Habitacion");

        javax.swing.GroupLayout jPHabitacionLayout = new javax.swing.GroupLayout(jPHabitacion);
        jPHabitacion.setLayout(jPHabitacionLayout);
        jPHabitacionLayout.setHorizontalGroup(
            jPHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPHabitacionLayout.setVerticalGroup(
            jPHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPCrearHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jPCrearHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCrearHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCrearHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCrearHabitacionMouseExited(evt);
            }
        });

        jLCrearHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        jLCrearHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLCrearHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jLCrearHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLCrearHabitacion.setText("Gestion");
        jLCrearHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCrearHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCrearHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCrearHabitacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPCrearHabitacionLayout = new javax.swing.GroupLayout(jPCrearHabitacion);
        jPCrearHabitacion.setLayout(jPCrearHabitacionLayout);
        jPCrearHabitacionLayout.setHorizontalGroup(
            jPCrearHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCrearHabitacionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLCrearHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCrearHabitacionLayout.setVerticalGroup(
            jPCrearHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCrearHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPModificarHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jPModificarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPModificarHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPModificarHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPModificarHabitacionMouseExited(evt);
            }
        });

        jLModificarHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        jLModificarHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLModificarHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jLModificarHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLModificarHabitacion.setText("Listar");
        jLModificarHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLModificarHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLModificarHabitacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPModificarHabitacionLayout = new javax.swing.GroupLayout(jPModificarHabitacion);
        jPModificarHabitacion.setLayout(jPModificarHabitacionLayout);
        jPModificarHabitacionLayout.setHorizontalGroup(
            jPModificarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPModificarHabitacionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLModificarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPModificarHabitacionLayout.setVerticalGroup(
            jPModificarHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModificarHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPTHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jPTHabitacion.setPreferredSize(new java.awt.Dimension(111, 30));

        jLTHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        jLTHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLTHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jLTHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLTHabitacion.setText("Tipo habitacion");

        javax.swing.GroupLayout jPTHabitacionLayout = new javax.swing.GroupLayout(jPTHabitacion);
        jPTHabitacion.setLayout(jPTHabitacionLayout);
        jPTHabitacionLayout.setHorizontalGroup(
            jPTHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTHabitacionLayout.setVerticalGroup(
            jPTHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPCrearTHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jPCrearTHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCrearTHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCrearTHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCrearTHabitacionMouseExited(evt);
            }
        });

        jLCrearTHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        jLCrearTHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLCrearTHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jLCrearTHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLCrearTHabitacion.setText("Crear");
        jLCrearTHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCrearTHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCrearTHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCrearTHabitacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPCrearTHabitacionLayout = new javax.swing.GroupLayout(jPCrearTHabitacion);
        jPCrearTHabitacion.setLayout(jPCrearTHabitacionLayout);
        jPCrearTHabitacionLayout.setHorizontalGroup(
            jPCrearTHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCrearTHabitacionLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLCrearTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCrearTHabitacionLayout.setVerticalGroup(
            jPCrearTHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCrearTHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPReserva.setBackground(new java.awt.Color(230, 232, 235));

        jLReserva.setBackground(new java.awt.Color(0, 0, 0));
        jLReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLReserva.setForeground(new java.awt.Color(0, 0, 0));
        jLReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLReserva.setText("Reserva");

        javax.swing.GroupLayout jPReservaLayout = new javax.swing.GroupLayout(jPReserva);
        jPReserva.setLayout(jPReservaLayout);
        jPReservaLayout.setHorizontalGroup(
            jPReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPReservaLayout.setVerticalGroup(
            jPReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPCrearReserva.setBackground(new java.awt.Color(230, 232, 235));
        jPCrearReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCrearReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPCrearReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPCrearReservaMouseExited(evt);
            }
        });

        jLCrearReserva.setBackground(new java.awt.Color(0, 0, 0));
        jLCrearReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLCrearReserva.setForeground(new java.awt.Color(0, 0, 0));
        jLCrearReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLCrearReserva.setText("Crear");
        jLCrearReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCrearReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCrearReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCrearReservaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPCrearReservaLayout = new javax.swing.GroupLayout(jPCrearReserva);
        jPCrearReserva.setLayout(jPCrearReservaLayout);
        jPCrearReservaLayout.setHorizontalGroup(
            jPCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCrearReservaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLCrearReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCrearReservaLayout.setVerticalGroup(
            jPCrearReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCrearReservaLayout.createSequentialGroup()
                .addComponent(jLCrearReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPModificarReserva.setBackground(new java.awt.Color(230, 232, 235));
        jPModificarReserva.setPreferredSize(new java.awt.Dimension(180, 30));
        jPModificarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPModificarReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPModificarReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPModificarReservaMouseExited(evt);
            }
        });

        jLModificarReserva.setBackground(new java.awt.Color(0, 0, 0));
        jLModificarReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLModificarReserva.setForeground(new java.awt.Color(0, 0, 0));
        jLModificarReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLModificarReserva.setText("Modificar");
        jLModificarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLModificarReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLModificarReservaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPModificarReservaLayout = new javax.swing.GroupLayout(jPModificarReserva);
        jPModificarReserva.setLayout(jPModificarReservaLayout);
        jPModificarReservaLayout.setHorizontalGroup(
            jPModificarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPModificarReservaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLModificarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPModificarReservaLayout.setVerticalGroup(
            jPModificarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPModificarReservaLayout.createSequentialGroup()
                .addComponent(jLModificarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPListarReserva.setBackground(new java.awt.Color(230, 232, 235));
        jPListarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPListarReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPListarReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPListarReservaMouseExited(evt);
            }
        });

        jLListarReserva.setBackground(new java.awt.Color(0, 0, 0));
        jLListarReserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLListarReserva.setForeground(new java.awt.Color(0, 0, 0));
        jLListarReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLListarReserva.setText("Listar");
        jLListarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLListarReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLListarReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLListarReservaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPListarReservaLayout = new javax.swing.GroupLayout(jPListarReserva);
        jPListarReserva.setLayout(jPListarReservaLayout);
        jPListarReservaLayout.setHorizontalGroup(
            jPListarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPListarReservaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLListarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPListarReservaLayout.setVerticalGroup(
            jPListarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLListarReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPCopyright.setBackground(new java.awt.Color(230, 232, 235));

        jLCopyright.setBackground(new java.awt.Color(0, 0, 0));
        jLCopyright.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        jLCopyright.setForeground(new java.awt.Color(0, 0, 0));
        jLCopyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCopyright.setText("PULPCorp © 2023");

        javax.swing.GroupLayout jPCopyrightLayout = new javax.swing.GroupLayout(jPCopyright);
        jPCopyright.setLayout(jPCopyrightLayout);
        jPCopyrightLayout.setHorizontalGroup(
            jPCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCopyrightLayout.setVerticalGroup(
            jPCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLCopyright, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPModificarTHabitacion.setBackground(new java.awt.Color(230, 232, 235));
        jPModificarTHabitacion.setPreferredSize(new java.awt.Dimension(183, 30));
        jPModificarTHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPModificarTHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPModificarTHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPModificarTHabitacionMouseExited(evt);
            }
        });

        jLModificarTHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        jLModificarTHabitacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLModificarTHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        jLModificarTHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLModificarTHabitacion.setText("Modificar");
        jLModificarTHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarTHabitacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLModificarTHabitacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLModificarTHabitacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPModificarTHabitacionLayout = new javax.swing.GroupLayout(jPModificarTHabitacion);
        jPModificarTHabitacion.setLayout(jPModificarTHabitacionLayout);
        jPModificarTHabitacionLayout.setHorizontalGroup(
            jPModificarTHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPModificarTHabitacionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLModificarTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPModificarTHabitacionLayout.setVerticalGroup(
            jPModificarTHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPModificarTHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLModificarTHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jS3)
                    .addGroup(jPMenuLayout.createSequentialGroup()
                        .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPCrearHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPListarHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(jPHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(jPCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPCrearHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPModificarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPModificarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(jPCrearReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPListarReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jS2)
                                .addComponent(jPTHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(jPCrearTHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPModificarTHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCrearHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPListarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCrearHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPModificarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCrearTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPModificarTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCrearReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPModificarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPListarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jPCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDPPrograma.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDPProgramaLayout = new javax.swing.GroupLayout(jDPPrograma);
        jDPPrograma.setLayout(jDPProgramaLayout);
        jDPProgramaLayout.setHorizontalGroup(
            jDPProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jDPProgramaLayout.setVerticalGroup(
            jDPProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDPPrograma)
                .addContainerGap())
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDPPrograma)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPCrearHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearHuespedMouseClicked
        if (crearHuespedOn) {
            // La ventana está abierta, así que la cerramos
            crearHuesped.dispose();
            crearHuespedOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            crearHuesped = new GestionHuesped();

            // Centramos el JInternalFrame
            centrarInternalFrame(crearHuesped);

            crearHuesped.setVisible(true);
            jDPPrograma.add(crearHuesped);
            jDPPrograma.moveToFront(crearHuesped);

            crearHuespedOn = true;
        }
    }//GEN-LAST:event_jPCrearHuespedMouseClicked

    private void jPCrearHuespedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearHuespedMouseEntered
        jPCrearHuesped.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPCrearHuespedMouseEntered

    private void jPCrearHuespedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearHuespedMouseExited
        jPCrearHuesped.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPCrearHuespedMouseExited

    private void jLCrearHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearHuespedMouseClicked
        if (crearHuespedOn) {
            // La ventana está abierta, así que la cerramos
            crearHuesped.dispose();
            crearHuespedOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            crearHuesped = new GestionHuesped();

            // Centramos el JInternalFrame
            centrarInternalFrame(crearHuesped);

            crearHuesped.setVisible(true);
            jDPPrograma.add(crearHuesped);
            jDPPrograma.moveToFront(crearHuesped);

            crearHuespedOn = true;
        }
    }//GEN-LAST:event_jLCrearHuespedMouseClicked

    private void jLCrearHuespedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearHuespedMouseEntered
        jPCrearHuesped.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLCrearHuespedMouseEntered

    private void jLCrearHuespedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearHuespedMouseExited
        jPCrearHuesped.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLCrearHuespedMouseExited

    private void jPCrearHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearHabitacionMouseClicked
        if (crearHabitacionOn) {
            // La ventana está abierta, así que la cerramos
            crearHabitacion.dispose();
            crearHabitacionOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            crearHabitacion = new CrearHabitacion();

            // Centramos el JInternalFrame
            centrarInternalFrame(crearHabitacion);

            crearHabitacion.setVisible(true);
            jDPPrograma.add(crearHabitacion);
            jDPPrograma.moveToFront(crearHabitacion);

            crearHabitacionOn = true;
        }
    }//GEN-LAST:event_jPCrearHabitacionMouseClicked

    private void jPCrearHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearHabitacionMouseEntered
        jPCrearHabitacion.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPCrearHabitacionMouseEntered

    private void jPCrearHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearHabitacionMouseExited
        jPCrearHabitacion.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPCrearHabitacionMouseExited

    private void jLCrearHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearHabitacionMouseClicked
        if (crearHabitacionOn) {
            // La ventana está abierta, así que la cerramos
            crearHabitacion.dispose();
            crearHabitacionOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            crearHabitacion = new CrearHabitacion();

            // Centramos el JInternalFrame
            centrarInternalFrame(crearHabitacion);

            crearHabitacion.setVisible(true);
            jDPPrograma.add(crearHabitacion);
            jDPPrograma.moveToFront(crearHabitacion);

            crearHabitacionOn = true;
        }
    }//GEN-LAST:event_jLCrearHabitacionMouseClicked

    private void jLCrearHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearHabitacionMouseEntered
        jPCrearHabitacion.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLCrearHabitacionMouseEntered

    private void jLCrearHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearHabitacionMouseExited
        jPCrearHabitacion.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLCrearHabitacionMouseExited

    private void jPModificarHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarHabitacionMouseClicked
        if (listarHabitacionOn) {
            // La ventana está abierta, así que la cerramos
            listarHabitacion.dispose();
            listarHabitacionOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            listarHabitacion = new ListarHabitacion();

            // Centramos el JInternalFrame
            centrarInternalFrame(listarHabitacion);

            listarHabitacion.setVisible(true);
            jDPPrograma.add(listarHabitacion);
            jDPPrograma.moveToFront(listarHabitacion);

            listarHabitacionOn = true;
        }
    }//GEN-LAST:event_jPModificarHabitacionMouseClicked

    private void jPModificarHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarHabitacionMouseEntered
        jPModificarHabitacion.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPModificarHabitacionMouseEntered

    private void jPModificarHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarHabitacionMouseExited
        jPModificarHabitacion.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPModificarHabitacionMouseExited

    private void jLModificarHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarHabitacionMouseClicked
        if (listarHabitacionOn) {
            // La ventana está abierta, así que la cerramos
            listarHabitacion.dispose();
            listarHabitacionOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            listarHabitacion = new ListarHabitacion();

            // Centramos el JInternalFrame
            centrarInternalFrame(listarHabitacion);

            listarHabitacion.setVisible(true);
            jDPPrograma.add(listarHabitacion);
            jDPPrograma.moveToFront(listarHabitacion);

            listarHabitacionOn = true;
        }
    }//GEN-LAST:event_jLModificarHabitacionMouseClicked

    private void jLModificarHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarHabitacionMouseEntered
        jPModificarHabitacion.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLModificarHabitacionMouseEntered

    private void jLModificarHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarHabitacionMouseExited
        jPModificarHabitacion.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLModificarHabitacionMouseExited

    private void jPCrearTHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearTHabitacionMouseClicked
        if (agregarTipoHabitacionOn) {
            // La ventana está abierta, así que la cerramos
            creacionTipoHabitacion.dispose();
            agregarTipoHabitacionOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            creacionTipoHabitacion = new CreacionTipoHabitacion();

            // Centramos el JInternalFrame
            centrarInternalFrame(creacionTipoHabitacion);

            creacionTipoHabitacion.setVisible(true);
            jDPPrograma.add(creacionTipoHabitacion);
            jDPPrograma.moveToFront(creacionTipoHabitacion);

            agregarTipoHabitacionOn = true;
        }
    }//GEN-LAST:event_jPCrearTHabitacionMouseClicked

    private void jPCrearTHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearTHabitacionMouseEntered
        jPCrearTHabitacion.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPCrearTHabitacionMouseEntered

    private void jPCrearTHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearTHabitacionMouseExited
        jPCrearTHabitacion.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPCrearTHabitacionMouseExited

    private void jLCrearTHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearTHabitacionMouseClicked
        if (agregarTipoHabitacionOn) {
            // La ventana está abierta, así que la cerramos
            creacionTipoHabitacion.dispose();
            agregarTipoHabitacionOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            creacionTipoHabitacion = new CreacionTipoHabitacion();

            // Centramos el JInternalFrame
            centrarInternalFrame(creacionTipoHabitacion);

            creacionTipoHabitacion.setVisible(true);
            jDPPrograma.add(creacionTipoHabitacion);
            jDPPrograma.moveToFront(creacionTipoHabitacion);

            agregarTipoHabitacionOn = true;
        }
    }//GEN-LAST:event_jLCrearTHabitacionMouseClicked

    private void jLCrearTHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearTHabitacionMouseEntered
        jPCrearTHabitacion.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLCrearTHabitacionMouseEntered

    private void jLCrearTHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearTHabitacionMouseExited
        jPCrearTHabitacion.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLCrearTHabitacionMouseExited

    private void jPModificarTHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarTHabitacionMouseClicked
        if (tipoHabitacionOn) {
            // La ventana está abierta, así que la cerramos
            modificacionTipoHabitacion.dispose();
            tipoHabitacionOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            modificacionTipoHabitacion = new ModificacionTipoHabitacion();

            // Centramos el JInternalFrame
            centrarInternalFrame(modificacionTipoHabitacion);

            modificacionTipoHabitacion.setVisible(true);
            jDPPrograma.add(modificacionTipoHabitacion);
            jDPPrograma.moveToFront(modificacionTipoHabitacion);

            tipoHabitacionOn = true;
        }
    }//GEN-LAST:event_jPModificarTHabitacionMouseClicked

    private void jPModificarTHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarTHabitacionMouseEntered
        jPModificarTHabitacion.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPModificarTHabitacionMouseEntered

    private void jPModificarTHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarTHabitacionMouseExited
        jPModificarTHabitacion.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPModificarTHabitacionMouseExited

    private void jLModificarTHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarTHabitacionMouseClicked
        if (tipoHabitacionOn) {
            // La ventana está abierta, así que la cerramos
            modificacionTipoHabitacion.dispose();
            tipoHabitacionOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            modificacionTipoHabitacion = new ModificacionTipoHabitacion();

            // Centramos el JInternalFrame
            centrarInternalFrame(modificacionTipoHabitacion);

            modificacionTipoHabitacion.setVisible(true);
            jDPPrograma.add(modificacionTipoHabitacion);
            jDPPrograma.moveToFront(modificacionTipoHabitacion);

            tipoHabitacionOn = true;
        }
    }//GEN-LAST:event_jLModificarTHabitacionMouseClicked

    private void jLModificarTHabitacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarTHabitacionMouseEntered
        jPModificarTHabitacion.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLModificarTHabitacionMouseEntered

    private void jLModificarTHabitacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarTHabitacionMouseExited
        jPModificarTHabitacion.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLModificarTHabitacionMouseExited

    private void jPCrearReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearReservaMouseClicked
        if (creacionReservasOn) {
            // La ventana está abierta, así que la cerramos
            creacionReservas.dispose();
            creacionReservasOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            creacionReservas = new CreacionReservas();

            // Centramos el JInternalFrame
            centrarInternalFrame(creacionReservas);

            creacionReservas.setVisible(true);
            jDPPrograma.add(creacionReservas);
            jDPPrograma.moveToFront(creacionReservas);

            creacionReservasOn = true;
        }
    }//GEN-LAST:event_jPCrearReservaMouseClicked

    private void jPCrearReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearReservaMouseEntered
        jPCrearReserva.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPCrearReservaMouseEntered

    private void jPCrearReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCrearReservaMouseExited
        jPCrearReserva.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPCrearReservaMouseExited

    private void jLCrearReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearReservaMouseClicked
        if (creacionReservasOn) {
            // La ventana está abierta, así que la cerramos
            creacionReservas.dispose();
            creacionReservasOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            creacionReservas = new CreacionReservas();

            // Centramos el JInternalFrame
            centrarInternalFrame(creacionReservas);

            creacionReservas.setVisible(true);
            jDPPrograma.add(creacionReservas);
            jDPPrograma.moveToFront(creacionReservas);

            creacionReservasOn = true;
        }
    }//GEN-LAST:event_jLCrearReservaMouseClicked

    private void jLCrearReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearReservaMouseEntered
        jPCrearReserva.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLCrearReservaMouseEntered

    private void jLCrearReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCrearReservaMouseExited
        jPCrearReserva.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLCrearReservaMouseExited

    private void jPModificarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarReservaMouseClicked
        if (modificacionReservasOn) {
            // La ventana está abierta, así que la cerramos
            modificacionReservas.dispose();
            modificacionReservasOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            modificacionReservas = new ModificacionReservas();

            // Centramos el JInternalFrame
            centrarInternalFrame(modificacionReservas);

            modificacionReservas.setVisible(true);
            jDPPrograma.add(modificacionReservas);
            jDPPrograma.moveToFront(modificacionReservas);

            modificacionReservasOn = true;
        }
    }//GEN-LAST:event_jPModificarReservaMouseClicked

    private void jPModificarReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarReservaMouseEntered
        jPModificarReserva.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPModificarReservaMouseEntered

    private void jPModificarReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPModificarReservaMouseExited
        jPModificarReserva.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPModificarReservaMouseExited

    private void jLModificarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarReservaMouseClicked
        if (modificacionReservasOn) {
            // La ventana está abierta, así que la cerramos
            modificacionReservas.dispose();
            modificacionReservasOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            modificacionReservas = new ModificacionReservas();

            // Centramos el JInternalFrame
            centrarInternalFrame(modificacionReservas);

            modificacionReservas.setVisible(true);
            jDPPrograma.add(modificacionReservas);
            jDPPrograma.moveToFront(modificacionReservas);

            modificacionReservasOn = true;
        }
    }//GEN-LAST:event_jLModificarReservaMouseClicked

    private void jLModificarReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarReservaMouseEntered
        jPModificarReserva.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLModificarReservaMouseEntered

    private void jLModificarReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarReservaMouseExited
        jPModificarReserva.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLModificarReservaMouseExited

    private void jPListarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPListarReservaMouseClicked
        if (listadoReservasOn) {
            // La ventana está abierta, así que la cerramos
            listadoReservas.dispose();
            listadoReservasOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            listadoReservas = new ListadoReservas();

            // Centramos el JInternalFrame
            centrarInternalFrame(listadoReservas);

            listadoReservas.setVisible(true);
            jDPPrograma.add(listadoReservas);
            jDPPrograma.moveToFront(listadoReservas);

            listadoReservasOn = true;
        }
    }//GEN-LAST:event_jPListarReservaMouseClicked

    private void jPListarReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPListarReservaMouseEntered
        jPListarReserva.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPListarReservaMouseEntered

    private void jPListarReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPListarReservaMouseExited
        jPListarReserva.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPListarReservaMouseExited

    private void jLListarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLListarReservaMouseClicked
        if (listadoReservasOn) {
            // La ventana está abierta, así que la cerramos
            listadoReservas.dispose();
            listadoReservasOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            listadoReservas = new ListadoReservas();

            // Centramos el JInternalFrame
            centrarInternalFrame(listadoReservas);

            listadoReservas.setVisible(true);
            jDPPrograma.add(listadoReservas);
            jDPPrograma.moveToFront(listadoReservas);

            listadoReservasOn = true;
        }
    }//GEN-LAST:event_jLListarReservaMouseClicked

    private void jLListarReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLListarReservaMouseEntered
        jPListarReserva.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLListarReservaMouseEntered

    private void jLListarReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLListarReservaMouseExited
        jPListarReserva.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLListarReservaMouseExited

    private void jPListarHuespedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPListarHuespedMouseExited
        jPListarHuesped.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jPListarHuespedMouseExited

    private void jPListarHuespedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPListarHuespedMouseEntered
        jPListarHuesped.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jPListarHuespedMouseEntered

    private void jPListarHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPListarHuespedMouseClicked
        if (listarHuespedOn) {
            // La ventana está abierta, así que la cerramos
            listarHuesped.dispose();
            listarHuespedOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            listarHuesped = new ListarHuesped();

            // Centramos el JInternalFrame
            centrarInternalFrame(listarHuesped);

            listarHuesped.setVisible(true);
            jDPPrograma.add(listarHuesped);
            jDPPrograma.moveToFront(listarHuesped);

            listarHuespedOn = true;
        }
    }//GEN-LAST:event_jPListarHuespedMouseClicked

    private void jLListarHuespedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLListarHuespedMouseExited
        jPListarHuesped.setBackground(new java.awt.Color(230, 232, 235));
    }//GEN-LAST:event_jLListarHuespedMouseExited

    private void jLListarHuespedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLListarHuespedMouseEntered
        jPListarHuesped.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLListarHuespedMouseEntered

    private void jLListarHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLListarHuespedMouseClicked
        if (listarHuespedOn) {
            // La ventana está abierta, así que la cerramos
            listarHuesped.dispose();
            listarHuespedOn = false;
        } else {
            // La ventana está cerrada, así que la abrimos
            jDPPrograma.removeAll();
            jDPPrograma.repaint();
            listarHuesped = new ListarHuesped();

            // Centramos el JInternalFrame
            centrarInternalFrame(listarHuesped);

            listarHuesped.setVisible(true);
            jDPPrograma.add(listarHuesped);
            jDPPrograma.moveToFront(listarHuesped);

            listarHuespedOn = true;
        }
    }//GEN-LAST:event_jLListarHuespedMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDPPrograma;
    private javax.swing.JLabel jLCopyright;
    private javax.swing.JLabel jLCrearHabitacion;
    private javax.swing.JLabel jLCrearHuesped;
    private javax.swing.JLabel jLCrearReserva;
    private javax.swing.JLabel jLCrearTHabitacion;
    private javax.swing.JLabel jLHabitacion;
    private javax.swing.JLabel jLHuespued1;
    private javax.swing.JLabel jLListarHuesped;
    private javax.swing.JLabel jLListarReserva;
    private javax.swing.JLabel jLModificarHabitacion;
    private javax.swing.JLabel jLModificarReserva;
    private javax.swing.JLabel jLModificarTHabitacion;
    private javax.swing.JLabel jLNombreUsuario;
    private javax.swing.JLabel jLReserva;
    private javax.swing.JLabel jLTHabitacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPCopyright;
    private javax.swing.JPanel jPCrearHabitacion;
    private javax.swing.JPanel jPCrearHuesped;
    private javax.swing.JPanel jPCrearReserva;
    private javax.swing.JPanel jPCrearTHabitacion;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPHabitacion;
    private javax.swing.JPanel jPHuesped;
    private javax.swing.JPanel jPListarHuesped;
    private javax.swing.JPanel jPListarReserva;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPModificarHabitacion;
    private javax.swing.JPanel jPModificarReserva;
    private javax.swing.JPanel jPModificarTHabitacion;
    private javax.swing.JPanel jPReserva;
    private javax.swing.JPanel jPTHabitacion;
    private javax.swing.JPanel jPUsuario;
    private javax.swing.JSeparator jS1;
    private javax.swing.JSeparator jS2;
    private javax.swing.JSeparator jS3;
    // End of variables declaration//GEN-END:variables

    private void centrarInternalFrame(JInternalFrame frame) {

        // Obtenemos el tamaño del JDesktopPane
        int anchoDesktop = jDPPrograma.getWidth();
        int altoDesktop = jDPPrograma.getHeight();

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
