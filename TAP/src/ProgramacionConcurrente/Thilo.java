
package ProgramacionConcurrente;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thilo extends Thread{
    private String proceso="";
    private long ms;
    //Metodo run...Todo lo que queremos que haga el hilo..
    public void run(){
        try {
            ms = (long)(Math.random()*5)*1000;
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Proceso: "+proceso+" Finalizado en "+ms+" Milisegundos");
    }
    public Thilo(String proceso){
        this.proceso=proceso;
    }
}
