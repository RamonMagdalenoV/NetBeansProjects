
package Ejemplos;

import java.util.Scanner;

public class EliminaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         OperacionesMySql mysql = new OperacionesMySql("jdbc:mysql://127.0.0.1/tap","root", "root");
        System.out.println("introduce id de registro a borrar: ");
        int id = sc.nextInt();
        mysql.delRegistro(id);
    }
    
}
