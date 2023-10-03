package Datas;

import Entidades.Habitaciones;
import Entidades.Huesped;
import Entidades.Reserva;
import java.sql.*;

public class ReservaData {

    private Connection con = null;

    public ReservaData() {
        con = Conexion.getConexion();
    }

    public void altaReserva(Reserva reserva, Huesped huesped,
            Habitaciones habitacion) throws SQLException {
        // Damos de alta la reserva en la tabla 'reserva'
        String sql = "INSERT INTO reserva (dni_huesped, numero_habitacion, "
                + "fecha_inicio, fecha_fin, monto, estado) "
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
            Habitaciones habitacion, int dni) throws SQLException {
        // Modificamos la reserva en la tabla 'reserva'
        String sql = "UPDATE reserva "
                + "SET dni_huesped = ?, numero_habitacion = ?, fecha_inicio = ?, "
                + "fecha_fin = ?, monto = ?, estado = ? "
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
                + "WHERE dni = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        ps.executeUpdate();
    }

    public Reserva buscarReservaPorHuesped(int dni) throws SQLException {
        // Buscamos una reserva mediante el DNI del huesped en la tabla 'reserva'
        String sql = "SELECT id_reserva, dni_huesped, numero_habitacion, "
                + "fecha_inicio, fecha_fin, monto, estado "
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
                reserva.setDniHuesped(rs.getInt("dni"));
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

}
