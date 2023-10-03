package Datas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "gran_hotel";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL + DB + "?user=" + USUARIO + "&password=" + PASSWORD + "&serverTimezone=UTC");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQL: " + ex.getMessage());
            }
        }
        return connection;
    }

}
