
package Ejercicio2;
/**
 *
 * @author Ralex-Pc
 */
public class Principal {
    public static void main(String[] args) {
       
     pruebaconhilos hilo1 = new pruebaconhilos("Yo Soy Turino");
        pruebaconhilos hilo2 = new pruebaconhilos("Yo Soy Faby");
        Thread Hilo1 = new Thread(hilo1);
        Thread Hilo2 = new Thread(hilo2);
        Hilo1.start();
        Hilo2.start();
    }
}
