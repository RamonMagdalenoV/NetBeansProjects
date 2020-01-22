package Programacion;

import java.sql.*;

public class MySqlOperaPrueba {

    public Connection conexion;

    public MySqlOperaPrueba(String server, String user, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server, user, pass);
            if (conexion != null) {
                System.out.println("Se conectó correctamente!");
            }
        } catch (SQLException ex) {
            System.out.println("Cadena de Conexión con error.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error con el conector");
        }
    }

    public boolean addReg(int id, String clave, String nombre, String edad) {
        boolean resultado = true;
        if (conexion == null) {
            System.out.println("No hay Conexion");
        } else {
            String sql = "INSERT INTO administrativo VALUES(0,'" + clave + "','" + nombre + "','" + edad + "')";
            try {
                Statement sentencia = conexion.createStatement();
                sentencia.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        }
        return resultado;
    }

    public String[][] getRegistro() {
        String datos[][] = null;
        String sqlget = "SELECT * FROM administrativo";
        ResultSet resultado = null;
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sqlget);
            resultado = sentencia.executeQuery(sqlget);

            int cont = 0;
            while (resultado.next()) {
                cont++;
            }
            datos = new String[cont][4];
            resultado.first();
            int i = 0;
            do {
                datos[i][0] = resultado.getString(1);
//                System.out.println(datos[i][0]);
                datos[i][1] = resultado.getString(2);
//                System.out.println(datos[i][1]);
                datos[i][2] = resultado.getString(3);
//                System.out.println(datos[i][2]);
                datos[i][3] = resultado.getString(4);
                i++;
            } while (resultado.next());
        } catch (Exception e) {
            System.out.println("Error al realizar la consulta:" + e.toString());
        }
        return datos;
    }
}
