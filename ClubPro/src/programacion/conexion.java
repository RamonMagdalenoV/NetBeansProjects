
package programacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public Connection conexion;

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/p", "root", "root");
            if (conexion != null) {
                System.out.println("Se conectó correctamente!");
            }
        } catch (SQLException ex) {
            System.out.println("Cadena de Conexión con error.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error con el conector");
        }
    }
    
    public Connection getConnection()
    {
        return conexion;
    }
}
