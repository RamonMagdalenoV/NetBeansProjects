package Ejemplos;

import java.sql.*;

public class OperacionesMySql {
   public Connection conexion;
    
    public OperacionesMySql(String server, String user, String pass)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion =  DriverManager.getConnection(server, user, pass);
            if (conexion!=null) {
                System.out.println("Se conectó correctamente!");
            }
        } catch (SQLException ex) {
            System.out.println("Cadena de Conexión con error.");
        }
        catch(ClassNotFoundException e){
            System.out.println("Error con el conector");
        }
    }
    
    public boolean addRegistro(String dato1, String dato2)
    {
        boolean resultado = true;
        if (conexion == null) {
            System.out.println("No hay Conexion");
        }
        else
        {
            String sql = "INSERT INTO datos VALUES(0,'"+dato1+"','"+dato2+"')";
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
        String sqlDel = "DELETE FROM datos WHERE iddatos="+id;
        try {
            Statement sentencia =  conexion.createStatement();
                 sentencia.executeUpdate(sqlDel);
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
        return r;
    }
    
    public String[][] getRegistro()
    {
        String datos[][] = null;
        String sqlget = "SELECT * FROM datos"; 
        ResultSet resultado = null;
        try {
            PreparedStatement sentencia =  conexion.prepareStatement(sqlget);
           resultado = sentencia.executeQuery(sqlget);
           
           int cont = 0;
            while (resultado.next()) {            
              cont++;
            }
            datos = new String[cont][3];
            resultado.first();
            int i = 0;
            do {                
                datos[i][0] = resultado.getString(1);
                System.out.println(datos[i][0]);
                datos[i][1] = resultado.getString(2);
                System.out.println(datos[i][1]);
                datos[i][2] = resultado.getString(3);
                System.out.println(datos[i][2]);
                i++;
            } while (resultado.next());
        } catch (Exception e) {
            System.out.println("Error al realizar la consulta:"+e.toString());
        }
        return datos;
    }
    
    public boolean updateRegistro(int id,String dato1, String dato2)
    {
        boolean resultado = true;
        if (conexion == null) {
            System.out.println("No hay Conexion");
        }
        else
        {
            String sql = "UPDATE datos set iddatos="+id+", dato1='"+dato1+"',dato2='"+dato2+"'";
            try {
                 Statement sentencia =  conexion.createStatement();
                 sentencia.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Error "+e.toString());
            }
           
            
        }
        return resultado;
        
    }
}
