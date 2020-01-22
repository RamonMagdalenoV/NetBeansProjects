package Proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mySql {

    private static Connection conexion;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3306/proyecto";

    public mySql() {
        conexion = null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, pass);
            if (conexion != null) {
                System.out.println("Conexion Establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e);
        }
    }

    public Connection getConnection() {
        return conexion;

    }
    
    public boolean addRegistro(int id, String name, int age) {
        boolean resultado = true;
        if (conexion == null) {
            System.out.println("No hay Conexion");
        } else {
            String sql = "INSERT INTO datos VALUES(0,'" + name + "','" + age + "')";
            try {
                Statement sentencia = conexion.createStatement();
                sentencia.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        }
        return resultado;
    }
}




