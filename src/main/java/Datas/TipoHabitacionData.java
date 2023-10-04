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
}
