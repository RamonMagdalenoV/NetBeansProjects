
public class hilo {
    
    public static void main(String[] args) {
        Thread hilo = Thread.currentThread();
        System.out.println("nombre del hilo: "+hilo.getName());
        hilo.setName("turino");
        
        try {
          for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
          
        } catch (InterruptedException e) {
            System.out.println("El hilo principal se interrumpio");
        } 
        System.out.println("La prioridad es: "+hilo.getPriority());
        System.out.println("El nombre del hilo es: "+hilo.getName());
    }
    
}