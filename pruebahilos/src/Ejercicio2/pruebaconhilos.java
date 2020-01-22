
package Ejercicio2;

public class pruebaconhilos extends Thread {

    public pruebaconhilos(String elemento) {
        super(elemento);
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(i + " " + getName());
            //System.out.println(i + " " +getName()+" La prioridad es: "+getPriority());
        }
        System.out.println("Termino la ejecucion del hilo " + getName());
    }
}
