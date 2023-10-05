package Datas;

import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;

    public ReservaData() {
        con = Conexion.getConexion();
    }

    public void altaReserva(Reserva reserva, Huesped huesped,
            Habitacion habitacion) throws SQLException {
        // Damos de alta la reserva en la tabla 'reserva'
        String sql = "INSERT INTO reserva (dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, huesped.getIdHuesped());
            ps.setInt(2, habitacion.getNroHabitacion());
            ps.setDate(3, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(4, Date.valueOf(reserva.getFechaFin()));
            ps.setDouble(5, reserva.getMonto());
            ps.setBoolean(6, reserva.isEstado());
            ps.executeUpdate();

            // Guardamos el 'id_reserva' en la reserva generada
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
            }
        }
    }

    public void modificarReserva(Reserva reserva, Huesped huesped,
            Habitacion habitacion, int dni) throws SQLException {
        // Modificamos la reserva en la tabla 'reserva'
        String sql = "UPDATE reserva "
                + "SET dni_huesped = ?, numero_habitacion = ?, fecha_inicio = ?, fecha_fin = ?, monto = ?, estado = ? "
                + "WHERE dni_huesped = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, huesped.getIdHuesped());
        ps.setInt(2, habitacion.getNroHabitacion());
        ps.setDate(3, Date.valueOf(reserva.getFechaInicio()));
        ps.setDate(4, Date.valueOf(reserva.getFechaFin()));
        ps.setDouble(5, reserva.getMonto());
        ps.setBoolean(6, reserva.isEstado());
        ps.setInt(7, dni);
        ps.executeUpdate();
    }

    // Método en principio no utilizable
    public void bajaReserva(int dni) throws SQLException {
        // Damos de baja la reserva de la tabla 'reserva'
        String sql = "UPDATE reserva "
                + "SET estado = 0 "
                + "WHERE dni_huesped = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ps.executeUpdate();
    }

    public Reserva buscarReservaPorHuesped(int dni) throws SQLException {
        // Buscamos una reserva mediante el DNI del huesped en la tabla 'reserva'
        String sql = "SELECT id_reserva, dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado "
                + "FROM reserva "
                + "WHERE dni_huesped = ?";
        Reserva reserva = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            // Guardamos en una Reserva los datos obtenidos
            if (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setDniHuesped(rs.getInt("dni_huesped"));
                reserva.setNumeroHabitacion(rs.getInt(
                        "numero_habitacion"));
                reserva.setFechaInicio(rs.getDate("fecha_inicio")
                        .toLocalDate());
                reserva.setFechaFin(rs.getDate("fecha_fin")
                        .toLocalDate());
                reserva.setMonto(rs.getDouble("monto"));
                if (rs.getBoolean("estado") == true) {
                    reserva.setEstado(true);
                } else {
                    reserva.setEstado(false);
                }
            }
        }
        return reserva;
    }

    public List<Habitacion> buscarHabitacionesLibres(LocalDate fechaEntrada,
            LocalDate fechaSalida, int cantidadPersonas) throws SQLException {
        String sql = "SELECT h.numero, h.codigo_tipo_habitacion, th.precioPorNoche FROM habitacion h "
                + "INNER JOIN tipo_habitacion th ON h.codigo_tipo_habitacion = th.codigo "
                + "WHERE h.codigo_tipo_habitacion IN (SELECT id_tipo_habitacion FROM tipo_habitacion "
                + "WHERE capacidadMaxima >= ?) "
                + "AND h.numero NOT IN (SELECT numero_habitacion FROM reserva "
                + "WHERE (fecha_inicio BETWEEN ? AND ? OR fecha_fin BETWEEN ? AND ?) AND estado = 1)";
        List<Habitacion> habitacionesLibres = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, cantidadPersonas);
            ps.setDate(2, Date.valueOf(fechaEntrada));
            ps.setDate(3, Date.valueOf(fechaSalida));
            ps.setDate(4, Date.valueOf(fechaEntrada));
            ps.setDate(5, Date.valueOf(fechaSalida));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setNroHabitacion(rs.getInt("numero"));
                habitacion.setcodigoTipoHabitacion(rs.getString(
                        "codigo_tipo_habitacion"));

                // Obtenemos el precio por noche del resultado de la consulta (tabla 'tipo_habitacion')
                double precioPorNoche = rs.getDouble("precioPorNoche");
                // Establecemos el precio por noche del resultado de la consulta
                habitacion.setPrecioPorNoche(precioPorNoche);

                habitacionesLibres.add(habitacion);
            }
        }
        return habitacionesLibres;
    }

    public double calcularMontoEstadia(LocalDate fechaEntrada, LocalDate fechaSalida,
            double precioPorNoche) {
        long diasEstadia = ChronoUnit.DAYS.between(fechaEntrada,
                fechaSalida);
        return precioPorNoche * diasEstadia;
    }

    // Método adicional para marcar una habitación como ocupada
    private void marcarHabitacionOcupada(int numeroHabitacion) throws SQLException {
        String sql = "UPDATE habitaciones SET estado = 1 "
                + "WHERE numero_habitacion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, numeroHabitacion);
            ps.executeUpdate();
        }
    }

    // Método adicional para liberar una habitación
    private void liberarHabitacion(int idReserva) throws SQLException {
        String sql = "UPDATE habitaciones SET estado = 0 "
                + "WHERE numero_habitacion = "
                + "(SELECT numero_habitacion FROM reserva WHERE id_reserva = ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idReserva);
            ps.executeUpdate();
        }
    }

    public void crearReserva(Huesped huesped, LocalDate fechaEntrada,
            LocalDate fechaSalida, int cantidadPersonas) throws SQLException {
        List<Habitacion> habitacionesLibres = buscarHabitacionesLibres(fechaEntrada,
                fechaSalida, cantidadPersonas);
        if (!habitacionesLibres.isEmpty()) {
            Habitacion habitacionSeleccionada = habitacionesLibres.get(0); // Seleccionamos la primera habitación libre
            double montoEstadia = calcularMontoEstadia(fechaEntrada, fechaSalida,
                    habitacionSeleccionada.getPrecioPorNoche());
            Reserva reserva = new Reserva(huesped.getIdHuesped(),
                    habitacionSeleccionada.getNroHabitacion(),
                    fechaEntrada, fechaSalida, montoEstadia,
                    true);
            altaReserva(reserva, huesped, habitacionSeleccionada);

            // Marcamos la habitación como ocupada
            marcarHabitacionOcupada(habitacionSeleccionada.getNroHabitacion());
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay habitaciones disponibles para las fechas y "
                    + "la cantidad de personas especificadas.");
        }
    }

    public void finReserva(Huesped huesped) throws SQLException {
        // Primero buscamos la reserva activa del huesped
        Reserva reserva = buscarReservaPorHuesped(huesped.getDni());

        if (reserva != null && reserva.isEstado()) {
            String sql = "UPDATE reserva SET estado = 0 "
                    + "WHERE id_reserva = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, reserva.getIdReserva());
                ps.executeUpdate();
            }
        }

        // Luego liberamos la habitación asociada a la reserva
        liberarHabitacion(reserva.getIdReserva());
    }

    public Reserva buscarReservaPorFecha(LocalDate fechaEntrada,
            LocalDate fechaSalida) throws SQLException {
        // Buscamos una reserva en basea la fecha de entrada y salida en la tabla 'reserva'
        String sql = "SELECT id_reserva, dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado "
                + "FROM reserva "
                + "WHERE fecha_inicio = ? AND fecha_fin = ?";
        Reserva reserva = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDate(1, Date.valueOf(fechaEntrada));
            ps.setDate(2, Date.valueOf(fechaSalida));
            ResultSet rs = ps.executeQuery();

            // Guardamos en una Reserva los datos obtenidos
            if (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setDniHuesped(rs.getInt("dni_huesped"));
                reserva.setNumeroHabitacion(rs.getInt(
                        "numero_habitacion"));
                reserva.setFechaInicio(rs.getDate("fecha_inicio")
                        .toLocalDate());
                reserva.setFechaFin(rs.getDate("fecha_fin")
                        .toLocalDate());
                reserva.setMonto(rs.getDouble("monto"));
                if (rs.getBoolean("estado") == true) {
                    reserva.setEstado(true);
                } else {
                    reserva.setEstado(false);
                }
            }
        }
        return reserva;
    }

    public Huesped buscarHuespedPorDNI(int dni) throws SQLException {
        // Buscamos un huesped mediante el DNI en la tabla 'huesped'
        String sql = "SELECT id_huesped, nombre, apellido, dni, domicilio, correo, celular, estado "
                + "FROM huesped "
                + "WHERE dni = ?";
        Huesped huesped = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            // Guardamos en una Reserva los datos obtenidos
            if (rs.next()) {
                huesped = new Huesped(
                        rs.getInt("id_huesped"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("domicilio"),
                        rs.getString("correo"),
                        rs.getString("celular")
                );
                huesped.setEstado(rs.getBoolean("estado"));
            }
        }
        return huesped;
    }

}
