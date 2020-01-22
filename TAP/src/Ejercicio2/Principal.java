
package Ejercicio2;
/**
 *
 * @author Ralex-Pc
 */
public class Principal {
    public static void main(String[] args) {
       
     pruebaconhilos hilo1 = new pruebaconhilos("Chuchita");
        pruebaconhilos hilo2 = new pruebaconhilos("La bolsearon!!!");
        Thread Hilo1 = new Thread(hilo1);
        Thread Hilo2 = new Thread(hilo2);

    }
}
