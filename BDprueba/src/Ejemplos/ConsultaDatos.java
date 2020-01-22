
package Ejemplos;

public class ConsultaDatos {
    public static void main(String[] args) {
        OperacionesMySql Consulta = new OperacionesMySql("jdbc:mysql://127.0.0.1/tap","root", "root");
        Consulta.getRegistro();
    }
    
}
