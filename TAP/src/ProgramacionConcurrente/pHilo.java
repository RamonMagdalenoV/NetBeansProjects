package ProgramacionConcurrente;

/**
 *
 * @author Ralex-Pc
 */
public class pHilo {

    public static void main(String[] args) {
        Thread h = Thread.currentThread();
        System.out.println("nombre del hilo: " + h.getName());
        h.setName("Palomera");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("El hilo principal se interrumpio");
        }
        System.out.println(h.getPriority());
        System.out.println("El nombre del hilo es: "+h.getName());
    }

}
