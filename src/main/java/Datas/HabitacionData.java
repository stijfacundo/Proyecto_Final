package Datas;

import Entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HabitacionData {

    private Connection con = null;

    public HabitacionData() {
        con = Conexion.getConexion();
    }

    public void guardarHabitacion(Habitacion habitacion) throws SQLException {

        String sql = "INSERT INTO habitacion (numero, piso, ocupada) VALUES (?, ?, ?) WHERE codigo_tipo_habitacion = ?";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, habitacion.getNroHabitacion());
            ps.setInt(2, habitacion.getPiso());
            ps.setBoolean(3, habitacion.isOcupada());
            ps.setString(4, habitacion.getcodigoTipoHabitacion());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
            }
        }
    }
    
    public Habitacion buscarHabitacionPorID(int id) throws SQLException {
        
        String sql = "SELECT idHabitaciones, numero, piso,  ocupada  FROM habitacion WHERE codigo_tipo_habitacion = ?";
        Habitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(id));
                habitacion.setNroHabitacion(rs.getInt("numero"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setcodigoTipoHabitacion(rs.getString("codigo_tipo_habitacion"));
               
            }
        }
        return habitacion;
    }
    
    public Habitacion buscarHabitacionPorNro(int nroHabitacion) throws SQLException {
        
        String sql = "SELECT idHabitacion, piso,  ocupada, codigo_tipo_habitacion FROM habitacion WHERE numero = ?";
        Habitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, nroHabitacion);
            ResultSet rs = ps.executeQuery();

            
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(rs.getInt("idHabitacion")));
                habitacion.setNroHabitacion(rs.getInt(nroHabitacion));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setcodigoTipoHabitacion(rs.getString("codigo_tipo_habitacion"));
               
            }
        }
        return habitacion;
    }
    
    public Habitacion buscarHabitacionPorEstado(boolean estado) throws SQLException {
        
        String sql = "SELECT idHabitacion, piso,  ocupada, codigo_tipo_habitacion FROM habitacion WHERE ocupada = ?";
        Habitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();

            
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(rs.getInt("idHabitacion")));
                habitacion.setNroHabitacion(rs.getInt(rs.getInt("nroDeHabitacion")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setOcupada(estado);
                habitacion.setcodigoTipoHabitacion(rs.getString("codigo_tipo_habitacion"));
               
            }
        }
        return habitacion;
    }
    
    
    public void eliminarHabitacion(int id) throws SQLException {
        
        String sql = "UPDATE habitacion SET estado = 0 WHERE codigo_tipo_habitacion = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    
    public void modificarHabitacion(Habitacion habitacion) throws SQLException {
        
        String sql = "UPDATE habitacion SET numero = ?, piso = ?, ocupada = ?, codigo_tipo_habitacion = ? "
                + "WHERE id_habitacion= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, habitacion.getNroHabitacion());
        ps.setInt(2, habitacion.getPiso());
        ps.setBoolean(3, habitacion.isOcupada());
        ps.setString(4, habitacion.getcodigoTipoHabitacion());
        ps.executeUpdate();
    }
}
