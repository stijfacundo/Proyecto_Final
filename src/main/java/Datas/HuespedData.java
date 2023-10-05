package Datas;

import Entidades.Huesped;
import java.sql.*;

public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
    }

    public void altaHuesped(Huesped huesped) throws SQLException {
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

    public void modificarHuesped(Huesped huesped, int dni) throws SQLException {
        // Modificamos el huesped en la tabla 'huesped'
        String sql = "UPDATE huesped "
                + "SET nombre = ?, apellido = ?, dni = ?, domicilio = ?, "
                + "correo = ?, celular = ?, estado = ? "
                + "WHERE dni = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, huesped.getNombre());
        ps.setString(2, huesped.getApellido());
        ps.setInt(3, huesped.getDni());
        ps.setString(4, huesped.getDomicilio());
        ps.setString(5, huesped.getCorreo());
        ps.setString(6, huesped.getCelular());
        ps.setBoolean(7, huesped.isEstado());
        ps.setInt(8, dni);
        int registro = ps.executeUpdate();
        System.out.println("Campos afectados: " + registro);
    }

    public void bajaHuesped(int dni) throws SQLException {
        // Damos de baja el huesped de la tabla 'huesped'
        String sql = "UPDATE huesped "
                + "SET estado = 0 "
                + "WHERE dni = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, dni);
        int registro = ps.executeUpdate();
        System.out.println("Campos afectados: " + registro);
    }

}
