package Datas;

import Entidades.Huesped;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
    }

    public void guardarHuesped(Huesped huesped) throws SQLException {
        // Damos de alta el huesped en la tabla 'huesped'
        String sql = "INSERT INTO huesped (nombre, apellido, dni, domicilio, "
                + "correo, celular, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isEstado());
            int registro = ps.executeUpdate();
            System.out.println("Campos afectados: " + registro);

            // Guardamos el 'id_huesped' en el huesped generado
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                huesped.setIdHuesped(rs.getInt(1));
            }
        }
    }

    public void modificarHuesped(Huesped huesped, int dniBuscado) throws SQLException {
        // Modificamos el huesped en la tabla 'huesped'
        String sql = "UPDATE huesped SET nombre = ?, apellido = ?, dni = ?, domicilio = ?, correo = ?, celular = ?, estado = ? "
                + "WHERE dni = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, huesped.getNombre());
        ps.setString(2, huesped.getApellido());
        ps.setInt(3, huesped.getDni());
        ps.setString(4, huesped.getDomicilio());
        ps.setString(5, huesped.getCorreo());
        ps.setString(6, huesped.getCelular());
        ps.setBoolean(7, huesped.isEstado());
        ps.setInt(8, dniBuscado);
        ps.executeUpdate();
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

            // Guardamos en un huesped los datos obtenidos
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

    public List<Huesped> listarHuespedes() throws SQLException {
        // Buscamos todos los huespedes
        String sql = "SELECT nombre, apellido, dni, domicilio, correo, celular FROM huesped";
        ArrayList<Huesped> huespedes = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            // Guardamos los huespedes en una lista
            while (rs.next()) {
                Huesped huesped = new Huesped();
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));

                huespedes.add(huesped);
            }
        }
        return huespedes;
    }
}
