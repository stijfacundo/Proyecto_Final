package Datas;

import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import Vistas.habitaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HabitacionData {

    private Connection con = null;

    public HabitacionData() {
        con = Conexion.getConexion();
    }

    public void guardarHabitacion(Habitacion habitacion) throws SQLException {

        String sql = "INSERT INTO habitacion (numero, piso, ocupada, codigo_tipo_habitacion) VALUES (?, ?, ?, ?) ";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, habitacion.getNroHabitacion());
            ps.setInt(2, habitacion.getPiso());
            ps.setBoolean(3, habitacion.isEstado());
            ps.setString(4, habitacion.getcodigoTipoHabitacion());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
            }
        }
    }
    
    public Habitacion buscarHabitacionPorNro(int nroHabitacion) throws SQLException {
        
        String sql = "SELECT id_habitacion, numero, piso,  ocupada, codigo_tipo_habitacion FROM habitacion WHERE numero = ?";
        Habitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, nroHabitacion);
            ResultSet rs = ps.executeQuery();

            
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("id_habitacion"));
                habitacion.setNroHabitacion(rs.getInt("numero"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setcodigoTipoHabitacion(rs.getString("codigo_tipo_habitacion"));
               
            }
        }
        return habitacion;
    }
    
    public Habitacion buscarHabitacionPorEstado(boolean estado) throws SQLException {
        
        String sql = "SELECT id_habitacion, numero, piso,  ocupada, codigo_tipo_habitacion FROM habitacion WHERE ocupada = ?";
        Habitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();

            
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt(rs.getInt("id_habitacion")));
                habitacion.setNroHabitacion(rs.getInt(rs.getInt("numero")));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setOcupada(estado);
                habitacion.setcodigoTipoHabitacion(rs.getString("codigo_tipo_habitacion"));
               
            }
        }
        return habitacion;
    }
    
    public TipoHabitacion buscarHabitacionPorTipo(String nombre) throws SQLException {
        
        String sql = "SELECT id_tipo_habitacion, codigo, nombre, capacidadMaxima, cantidadCamas, tipoCamas, precioPorNoche FROM tipo_habitacion WHERE nombre = ?";
        TipoHabitacion habitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            
            if (rs.next()) {
                habitacion = new TipoHabitacion();
                habitacion.setIdTipoHabitacion(rs.getInt("id_tipo_habitacion"));
                habitacion.setCodigo(rs.getString("codigo"));
                habitacion.setNombre(rs.getString("nombre"));
                habitacion.setCapacidadMaxima(rs.getInt("capacidadMaxima"));
                habitacion.setCantidadCamas(rs.getInt("cantidadCamas")); 
            }
        }
        return habitacion;
    }
    
    
    public void eliminarHabitacion(int nro) throws SQLException {
        
        String sql = "UPDATE habitacion SET ocupada = 0 WHERE numero = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, nro);
        ps.executeUpdate();
    }
    
    public void modificarHabitacion(Habitacion habitacion, int numero) throws SQLException {
        
        String sql = "UPDATE habitacion "
                + "SET numero = ?, piso = ?, ocupada = ?, codigo_tipo_habitacion = ? "
                + "WHERE numero = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, habitacion.getNroHabitacion());
        ps.setInt(2, habitacion.getPiso());
        ps.setBoolean(3, habitacion.isOcupada());
        ps.setString(4, habitacion.getcodigoTipoHabitacion());
        ps.setInt(5, numero);
        ps.executeUpdate();
    }
    
    
 public List<Habitacion> listarHabitacion() throws SQLException {
        // Buscamos todas las materias de  la tabla 'materia'
        String sql = "SELECT codigo_tipo_habitacion FROM habitacion";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            // Guardamos las materias en la lista Materia
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                
                habitacion.setcodigoTipoHabitacion(rs.getString("codigo_tipo_habitacion"));
                
                habitaciones.add(habitacion);
            }
        }
        return habitaciones;
    }   
}
