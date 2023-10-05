package Datas;

import Entidades.TipoHabitacion;
import java.sql.*;

public class TipoHabitacionData {

    private Connection con = null;

    public TipoHabitacionData() {
        con = Conexion.getConexion();
    }

    public void busquedaDeHabitacionPorCapacidad(int capacidadMaxima) throws SQLException {
        // Buscamos el tipo de habitacion acorde a su capacidad maxima
        String sql = "SELECT id_tipo_habitacion, codigo, nombre, capacidadMaxima, cantidadCamas, tipoCamas, PrecioPorNoche FROM tipo_habitacion WHERE capacidadMaxima >= ?";
        TipoHabitacion tipoHabitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, capacidadMaxima);
            ResultSet rs = ps.executeQuery();

            // Guardamos en un TipoHabitacion los datos obtenidos
            if (rs.next()) {
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setIdTipoHabitacion(rs.getInt("id_tipo_habitacion"));
                tipoHabitacion.setCodigo(rs.getString("codigo"));
                tipoHabitacion.setNombre(rs.getString("nombre"));
                tipoHabitacion.setCapacidadMaxima(rs.getInt("capacidadMaxima"));
                tipoHabitacion.setCantidadCamas(rs.getInt("cantidadCamas"));
                tipoHabitacion.setTipoCama(rs.getString("tipoCamas"));
                tipoHabitacion.setPrecioPorNoche(rs.getDouble("PrecioPorNoche"));
            }
        }
    }

    public void busquedaDeHabitacionPorNombre(String nombre) throws SQLException {
        // Buscamos el tipo de habitacion acorde por nombre
        String sql = "SELECT id_tipo_habitacion, codigo, nombre, capacidadMaxima, cantidadCamas, tipoCamas, PrecioPorNoche FROM tipo_habitacion WHERE nombre = ?";
        TipoHabitacion tipoHabitacion = null;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            // Guardamos en un TipoHabitacion los datos obtenidos
            if (rs.next()) {
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setIdTipoHabitacion(rs.getInt("id_tipo_habitacion"));
                tipoHabitacion.setCodigo(rs.getString("codigo"));
                tipoHabitacion.setNombre(rs.getString("nombre"));
                tipoHabitacion.setCapacidadMaxima(rs.getInt("capacidadMaxima"));
                tipoHabitacion.setCantidadCamas(rs.getInt("cantidadCamas"));
                tipoHabitacion.setTipoCama(rs.getString("tipoCamas"));
                tipoHabitacion.setPrecioPorNoche(rs.getDouble("PrecioPorNoche"));
            }
        }
    }

    public void altaTipoHabitacion(TipoHabitacion tipohabitacion) throws SQLException {
        // Damos de alta el TipoHabitacion 
        String sql = "INSERT INTO tipo_habitacion (codigo, nombre, capacidadMaxima, cantidadCamas, tipoCamas, precioPorNoche)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql,
                Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, tipohabitacion.getCodigo());
            ps.setString(2, tipohabitacion.getNombre());
            ps.setInt(3, tipohabitacion.getCapacidadMaxima());
            ps.setInt(4, tipohabitacion.getCantidadCamas());
            ps.setString(5, tipohabitacion.getTipoCama());
            ps.setDouble(6, tipohabitacion.getPrecioPorNoche());
            ps.executeUpdate();

            // Guardamos el 'id_tipo_habitacion' en el tipohabitacion generado
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tipohabitacion.setIdTipoHabitacion(rs.getInt(1));
            }
        }
    }

    public void modificarTipoHabitacion(TipoHabitacion tipohabitacion, String codigo) throws SQLException {
        // Modificamos el tipohabitacion
        String sql = "UPDATE tipo_habitacion "
                + "SET codigo = ?, nombre = ?, capacidadMaxima = ?, cantidadCamas = ?, "
                + "tipoCamas = ?, precioPorNoche = ? "
                + "WHERE codigo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tipohabitacion.getCodigo());
        ps.setString(2, tipohabitacion.getNombre());
        ps.setInt(3, tipohabitacion.getCapacidadMaxima());
        ps.setInt(4, tipohabitacion.getCantidadCamas());
        ps.setString(5, tipohabitacion.getTipoCama());
        ps.setDouble(6, tipohabitacion.getPrecioPorNoche());
        ps.setString(7, codigo);
        ps.executeUpdate();
    }
}
