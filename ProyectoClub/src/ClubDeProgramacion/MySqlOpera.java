package ClubDeProgramacion;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySqlOpera {

    public Connection conexion;

    public MySqlOpera(String server, String user, String pass) {
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

    public boolean addReg(int id, String codigo, String nombre, String apellido, String telefono, String direccion) {
        boolean resultado = true;
        if (conexion == null) {
            System.out.println("No hay Conexion");
        } else {
            String sql = "INSERT INTO administrativos VALUES(0,'" + codigo + "','" + nombre + "','" + apellido + "','" + telefono + "','" + direccion + "')";
            try {
                Statement sentencia = conexion.createStatement();
                sentencia.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        }
        return resultado;
    }

    public String[][] getReg( ) {
        String datos[][] = null;
        String sqlget = "SELECT * FROM administrativos";
        ResultSet resultado = null;
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sqlget);
            resultado = sentencia.executeQuery(sqlget);

            int cont = 0;
            while (resultado.next()) {
                cont++;
            }

            datos = new String[cont][6];
            resultado.first();
            int i = 0;
            do {
                datos[i][0] = resultado.getString(1);

                datos[i][1] = resultado.getString(2);

                datos[i][2] = resultado.getString(3);

                datos[i][3] = resultado.getString(4);

                datos[i][4] = resultado.getString(5);

                datos[i][5] = resultado.getString(6);

                i++;
            } while (resultado.next());
        } catch (Exception e) {
            System.out.println("Error al realizar la consulta:" + e.toString());
        }
        return datos;
    }
   
    public boolean updateRegistro(int id, String codigo, String nombre, String apellido, String tel, String dir)
    {
        boolean resultado = true;
        if (conexion == null) {
            System.out.println("No hay Conexion");
        }
        else
        {
            String sql = "UPDATE administrativos SET codigo='"+codigo+"', nombre='"+nombre+"', apellido='"+apellido+"'"
                    + ", telefono='"+tel+"', direccion='"+dir+"' WHERE idadministrativos='"+id+"'";
            try {
                 Statement sentencia =  conexion.createStatement();
                 sentencia.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Error "+e.toString());
            }
           
            
        }
        return resultado;
        
    }
    
    public boolean delRegistro(int id)
    {
        boolean r = true;
        String sqlDel = "DELETE FROM administrativos WHERE idadministrativos="+id;
        try {
            Statement sentencia =  conexion.createStatement();
                 sentencia.executeUpdate(sqlDel);
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
        return r;
    } 
      public String[][] buscar( String dato, String columna) {
        String datos[][] = null;
        String sqlget = "SELECT * FROM administrativos WHERE "+columna+" ="+dato+" ";
        ResultSet resultado = null;
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sqlget);
            resultado = sentencia.executeQuery(sqlget);

            int cont = 0;
            while (resultado.next()) {
                cont++;
            }

            datos = new String[cont][6];
            resultado.first();
            int i = 0;
            do {
                datos[i][0] = resultado.getString(1);

                datos[i][1] = resultado.getString(2);

                datos[i][2] = resultado.getString(3);

                datos[i][3] = resultado.getString(4);

                datos[i][4] = resultado.getString(5);

                datos[i][5] = resultado.getString(6);

                i++;
            } while (resultado.next());
        } catch (Exception e) {
            System.out.println("Error al realizar la consulta:" + e.toString());
        }
        return datos;
    }
  
   
    
   
    
    
    

}
