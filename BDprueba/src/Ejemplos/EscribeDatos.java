package Ejemplos;

import java.util.Scanner;

public class EscribeDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aqui vamos a escribir Registros");
        System.out.println("Ingresa dato 1: ");
        String d1 = sc.nextLine();
        System.out.println("Ingresa dato 2: ");
        String d2 = sc.nextLine();
        OperacionesMySql mysql = new OperacionesMySql("jdbc:mysql://127.0.0.1/tap","root", "root");
        mysql.addRegistro(d1, d2);

        
        
    }
    
}
