package Datas;

import Entidades.TipoHabitacion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoHabitacionData {

    private Connection con = null;

    public TipoHabitacionData() {
        con = Conexion.getConexion();
    }

    public void busquedaTipoHabitacionPorCapacidad(int capacidadMaxima) throws SQLException {
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

    public TipoHabitacion busquedaTipoHabitacionPorNombre(String nombre) throws SQLException {
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
        return tipoHabitacion;
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

    // Método para crear un tipo de habitación
    public boolean crearTipoHabitacion(String codigo, String nombre, int capacidadMaxima, int cantidadCamas,
            String tiposCamas, double precioPorNoche) throws SQLException {
        String sql = "INSERT INTO tipo_habitacion (codigo, nombre, capacidadMaxima, cantidadCamas, tipoCamas, precioPorNoche) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, capacidadMaxima);
            ps.setInt(4, cantidadCamas);
            ps.setString(5, tiposCamas);
            ps.setDouble(6, precioPorNoche);
            int filasAfectadas = ps.executeUpdate();

            return filasAfectadas > 0;
        }
    }

    public List<TipoHabitacion> obtenerTodosLosTiposHabitacion() throws SQLException {
        List<TipoHabitacion> tiposHabitacion = new ArrayList<>();

        String sql = "SELECT * FROM tipo_habitacion";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int idTipoHabitacion = rs.getInt("id_tipo_habitacion");
            String codigo = rs.getString("codigo");
            String nombre = rs.getString("nombre");
            int capacidadMaxima = rs.getInt("capacidadMaxima");
            int cantidadCamas = rs.getInt("cantidadCamas");
            String tipoCamas = rs.getString("tipoCamas");
            double precioPorNoche = rs.getDouble("precioPorNoche");

            TipoHabitacion tipo = new TipoHabitacion(idTipoHabitacion, codigo, nombre, capacidadMaxima, cantidadCamas, tipoCamas, precioPorNoche);
            tiposHabitacion.add(tipo);
        }

        return tiposHabitacion;
    }

    public void actualizarTipoHabitacion(List<TipoHabitacion> tipos) throws SQLException {
        // Deshabilitamos el AutoCommit para controlar las transacciones manualmente
        con.setAutoCommit(false);

        try {
            for (TipoHabitacion tipo : tipos) {
                // Modificamos el tipo de habitación en la tabla 'tipo_habitacion'
                String sql = "UPDATE tipo_habitacion "
                        + "SET codigo = ?, nombre = ?, capacidadMaxima = ?, cantidadCamas = ?, tipoCamas = ?, precioPorNoche = ? "
                        + "WHERE codigo = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, tipo.getCodigo());
                ps.setString(2, tipo.getNombre());
                ps.setInt(3, tipo.getCapacidadMaxima());
                ps.setInt(4, tipo.getCantidadCamas());
                ps.setString(5, tipo.getTipoCama());
                ps.setDouble(6, tipo.getPrecioPorNoche());
                ps.setString(7, tipo.getCodigo());
                int filasActualizadas = ps.executeUpdate();

                if (filasActualizadas > 0) {
                    System.out.println("Tipo de habitación actualizado correctamente");
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
}
