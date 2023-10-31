package Datas;

import Entidades.Habitacion;
import Entidades.Huesped;
import Entidades.Reserva;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservaData {

    private Connection con = null;

    public ReservaData() {
        con = Conexion.getConexion();
    }

    // Método para buscar habitaciones libres
    public List<Habitacion> buscarHabitacionesLibres(LocalDate fechaEntrada,
            LocalDate fechaSalida) throws SQLException {
        String sql = "SELECT h.*, th.nombre AS tipo_habitacion, th.capacidadMaxima, th.precioPorNoche "
                + "FROM habitacion h "
                + "LEFT JOIN tipo_habitacion th ON h.codigo_tipo_habitacion = th.codigo "
                + "WHERE h.id_habitacion NOT IN "
                + "(SELECT numero_habitacion FROM reserva "
                + "WHERE (fecha_inicio <= ? AND fecha_fin >= ?) OR "
                + "(fecha_inicio <= ? AND fecha_fin >= ?) OR "
                + "(fecha_inicio >= ? AND fecha_fin <= ?)) "
                + "AND h.ocupada = 0";
        List<Habitacion> habitacionesLibres = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDate(1, Date.valueOf(fechaEntrada));
            ps.setDate(2, Date.valueOf(fechaEntrada));
            ps.setDate(3, Date.valueOf(fechaSalida));
            ps.setDate(4, Date.valueOf(fechaSalida));
            ps.setDate(5, Date.valueOf(fechaEntrada));
            ps.setDate(6, Date.valueOf(fechaSalida));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("id_habitacion"));
                habitacion.setNroHabitacion(rs.getInt("numero"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setNombreTipoHabitacion(rs.getString("tipo_habitacion"));
                habitacion.setCapacidadMaxima(rs.getInt("capacidadMaxima"));

                // Obtenemos el precio por noche del resultado de la consulta (tabla 'tipo_habitacion')
                double precioPorNoche = rs.getDouble("precioPorNoche");
                // Establecemos el precio por noche del resultado de la consulta
                habitacion.setPrecioPorNoche(precioPorNoche);

                habitacionesLibres.add(habitacion);
            }
        }
        return habitacionesLibres;
    }

    // Método para realizar una reserva
    public boolean realizarReserva(String nombre, String apellido, int dni,
            String domicilio, String correo, String celular, int numeroHabitacion, double monto, LocalDate fechaIngreso,
            LocalDate fechaEgreso) throws SQLException {
        PreparedStatement ps;
        HuespedData huespedData = new HuespedData();

        // Verificamos si el huésped ya existe en la base de datos
        Huesped huesped = buscarHuespedPorDNI(dni);
        if (huesped == null) {
            // Si el huesped no existe, creamos uno nuevo
            huesped = new Huesped(nombre, apellido, dni, domicilio, correo, celular, true);

            huespedData.guardarHuesped(huesped); // Creamos el nuevo huésped en la base de datos
        }

        // Creamos la reserva
        String sql = "INSERT INTO reserva (dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado) VALUES (?, ?, ?, ?, ?, ?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ps.setInt(2, numeroHabitacion);
        ps.setDate(3, Date.valueOf(fechaIngreso));
        ps.setDate(4, Date.valueOf(fechaEgreso));
        ps.setDouble(5, monto);
        ps.setBoolean(6, true);

        // Ejecutamos la consulta
        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            marcarHabitacionOcupada(numeroHabitacion); // Marcamos la habitación como ocupada
            return true; // La reserva se creó con éxito
        }

        return false;
    }

    // Método adicional para marcar una habitación como ocupada
    public void marcarHabitacionOcupada(int numeroHabitacion) throws SQLException {
        String sql = "UPDATE habitacion SET ocupada = 1 "
                + "WHERE numero = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, numeroHabitacion);
            ps.executeUpdate();
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

    public void bajaReserva(int dni) throws SQLException {
        // Damos de baja la reserva de la tabla 'reserva'
        String sql = "UPDATE reserva "
                + "SET estado = 0 "
                + "WHERE dni_huesped = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ps.executeUpdate();
    }

    // Método adicional para liberar una habitación
    public void liberarHabitacion(int numeroHabitacion) throws SQLException {
        String sql = "UPDATE habitacion SET ocupada = 0 "
                + "WHERE numero = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, numeroHabitacion);
            ps.executeUpdate();
        }
    }

    public void finReserva(int idReserva, int numeroHabitacion) throws SQLException {
        // Buscamos la reserva por su ID
        Reserva reserva = buscarReservaPorID(idReserva);

        if (reserva != null && reserva.isEstado()) {
            String sql = "UPDATE reserva SET estado = 0 "
                    + "WHERE id_reserva = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idReserva);
                ps.executeUpdate();
            }
        }

        // Luego liberamos la habitación asociada a la reserva
        liberarHabitacion(numeroHabitacion);
    }

    public List<Reserva> buscarReservasPorHuesped(int dni) throws SQLException {
        //Creamos una lista para alamacenar las reservas encontradas
        List<Reserva> reservas = new ArrayList<>();

        // Buscamos una reserva mediante el DNI del huesped en la tabla 'reserva'
        String sql = "SELECT id_reserva, dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado "
                + "FROM reserva "
                + "WHERE dni_huesped = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            // Guardamos en una Reserva los datos obtenidos y luego añadimos esa reserva a la List
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setDniHuesped(rs.getInt("dni_huesped"));
                reserva.setNumeroHabitacion(rs.getInt("numero_habitacion"));
                reserva.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                reserva.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                reserva.setMonto(rs.getDouble("monto"));
                reserva.setEstado(rs.getBoolean("estado"));

                reservas.add(reserva);
            }
        }
        return reservas;
    }

    public Reserva buscarReservaPorID(int idReserva) throws SQLException {
        String sql = "SELECT id_reserva, dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado "
                + "FROM reserva "
                + "WHERE id_reserva = ?";
        Reserva reserva = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idReserva);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setDniHuesped(rs.getInt("dni_huesped"));
                reserva.setNumeroHabitacion(rs.getInt("numero_habitacion"));
                reserva.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                reserva.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                reserva.setMonto(rs.getDouble("monto"));
                reserva.setEstado(rs.getBoolean("estado"));
            }
        }
        return reserva;
    }

    public Reserva buscarReservasPorFecha(LocalDate fechaEntrada,
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
        // Buscamos un huésped mediante el DNI en la tabla 'huesped'
        String sql = "SELECT id_huesped, nombre, apellido, dni, domicilio, correo, celular, estado "
                + "FROM huesped "
                + "WHERE dni = ?";
        Huesped huesped = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            // Guardamos en un Huésped los datos obtenidos
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

    public void actualizarReservas(List<Reserva> reservas) throws SQLException {
        // Deshabilitamos el AutoCommit para controlar las transacciones manualmente
        con.setAutoCommit(false);

        try {
            for (Reserva reserva : reservas) {
                // Modificamos la reserva en la tabla 'reserva'
                String sql = "UPDATE reserva "
                        + "SET dni_huesped = ?, numero_habitacion = ?, fecha_inicio = ?, fecha_fin = ?, monto = ?, estado = ? "
                        + "WHERE id_reserva = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, reserva.getHuesped().getDni());
                ps.setInt(2, reserva.getNumeroHabitacion());
                ps.setDate(3, Date.valueOf(reserva.getFechaInicio()));
                ps.setDate(4, Date.valueOf(reserva.getFechaFin()));
                ps.setDouble(5, reserva.getMonto());
                ps.setBoolean(6, reserva.isEstado());
                ps.setInt(7, reserva.getIdReserva());
                int filasActualizadas = ps.executeUpdate();

                if (filasActualizadas > 0) {
                    System.out.println("Reserva actualizada correctamente");
                } else {
                    System.out.println("No se ha actualizado ninguna fila en la base de datos.");
                }
            }

            // Confirmamos la transacción
            con.commit();
        } catch (SQLException ex) {
            // Si ocurre algún error, hacemos un rollback
            con.rollback();
            throw ex;
        } finally {
            // Reestablecemos el AutoCommit al valor por defecto
            con.setAutoCommit(true);
        }
    }

    public List<Reserva> cargarReservas() throws SQLException {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT id_reserva, dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado "
                + "FROM reserva";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setDniHuesped(rs.getInt("dni_huesped"));
                reserva.setNumeroHabitacion(rs.getInt("numero_habitacion"));
                Date fechaInicio = rs.getDate("fecha_inicio");
                Date fechaFin = rs.getDate("fecha_fin");
                reserva.setFechaInicio(fechaInicio.toLocalDate());
                reserva.setFechaFin(fechaFin.toLocalDate());
                reserva.setMonto(rs.getDouble("monto"));
                reserva.setEstado(rs.getBoolean("estado"));

                reservas.add(reserva);
            }
        }
        return reservas;
    }

    public List<Reserva> filtrarReservasPorDocumento(int dni) throws SQLException {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT id_reserva, dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado "
                + "FROM reserva "
                + "WHERE dni_huesped = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Reserva reserva = new Reserva();
                    reserva.setIdReserva(rs.getInt("id_reserva"));
                    reserva.setDniHuesped(rs.getInt("dni_huesped"));
                    reserva.setNumeroHabitacion(rs.getInt("numero_habitacion"));
                    Date fechaInicio = rs.getDate("fecha_inicio");
                    Date fechaFin = rs.getDate("fecha_fin");
                    reserva.setFechaInicio(fechaInicio.toLocalDate());
                    reserva.setFechaFin(fechaFin.toLocalDate());
                    reserva.setMonto(rs.getDouble("monto"));
                    reserva.setEstado(rs.getBoolean("estado"));

                    reservas.add(reserva);
                }
            }
        }
        return reservas;
    }

    public List<Reserva> filtrarReservasPorFechas(LocalDate fechaIngreso, LocalDate fechaEgreso) throws SQLException {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT id_reserva, dni_huesped, numero_habitacion, fecha_inicio, fecha_fin, monto, estado "
                + "FROM reserva "
                + "WHERE fecha_inicio >= ? AND fecha_fin <= ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDate(1, Date.valueOf(fechaIngreso));
            ps.setDate(2, Date.valueOf(fechaEgreso));
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Reserva reserva = new Reserva();
                    reserva.setIdReserva(rs.getInt("id_reserva"));
                    reserva.setDniHuesped(rs.getInt("dni_huesped"));
                    reserva.setNumeroHabitacion(rs.getInt("numero_habitacion"));
                    Date fechaInicio = rs.getDate("fecha_inicio");
                    Date fechaFin = rs.getDate("fecha_fin");
                    reserva.setFechaInicio(fechaInicio.toLocalDate());
                    reserva.setFechaFin(fechaFin.toLocalDate());
                    reserva.setMonto(rs.getDouble("monto"));
                    reserva.setEstado(rs.getBoolean("estado"));

                    reservas.add(reserva);
                }
            }
        }
        return reservas;
    }
}
