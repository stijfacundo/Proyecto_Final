package Datas;

import Entidades.Habitaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HabitacionesData {

    private Connection con = null;

    public HabitacionesData() {
        con = Conexion.getConexion();
    }

    public void guardarHabitacion(Habitaciones habitacion) throws SQLException {

        String sql = "INSERT INTO habitacion (numero, piso, ocupada) VALUES (?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, habitacion.getNroHabitacion());
            ps.setInt(2, habitacion.getPiso());
            ps.setBoolean(3, habitacion.isOcupada());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
            }
        }
    }
    
    public Habitaciones buscarHabitacionPorID(int id) throws SQLException {
        
        String sql = "SELECT numero, piso,  ocupada, codigo_tipo_habitacion FROM alumno WHERE idHabitaciones = ?";
        Habitaciones habitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            
            if (rs.next()) {
                habitacion = new Habitaciones();
                habitacion.setIdHabitacion(rs.getInt(id));
                habitacion.setNroHabitacion(rs.getInt("numero"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setIdTipoHabitacion(rs.getInt("codigo_tipo_habitacion"));
               
            }
        }
        return habitacion;
    }
    
    public Habitaciones buscarHabitacionPorNro(int nroHabitacion) throws SQLException {
        
        String sql = "SELECT idHabitacion, piso,  ocupada, codigo_tipo_habitacion FROM alumno WHERE numero = ?";
        Habitaciones habitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, nroHabitacion);
            ResultSet rs = ps.executeQuery();

            
            if (rs.next()) {
                habitacion = new Habitaciones();
                habitacion.setIdHabitacion(rs.getInt(rs.getInt("idHabitacion")));
                habitacion.setNroHabitacion(rs.getInt(nroHabitacion));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setIdTipoHabitacion(rs.getInt("codigo_tipo_habitacion"));
               
            }
        }
        return habitacion;
    }
    
    public void eliminarHabitacion(int id) throws SQLException {
        
        String sql = "UPDATE habitacion SET estado = 0 WHERE id_habitacion = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    
    public void modificarHabitacion(Habitaciones habitacion) throws SQLException {
        
        String sql = "UPDATE habitacion SET numero = ?, piso = ?, ocupada = ?, codigo_tipo_habitacion = ? "
                + "WHERE id_habitacion= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, habitacion.getNroHabitacion());
        ps.setInt(2, habitacion.getPiso());
        ps.setBoolean(3, habitacion.isOcupada());
        ps.setInt(4, habitacion.getIdTipoHabitacion());
        ps.executeUpdate();
    }
    
}
