
package Eje;
import java.util.List;

public class productos implements Runnable{
    
    private List <String> productos;

    
    public productos(List<String>productos){
        this.productos = productos;
    }
    
    @Override
    public void run(){
//        while (true) {            
            try {
//                Thread.sleep(5000);
                synchronized(productos){
                    productos.add("Nuevo Producto");
                    productos.notify();
                    System.out.println("Se agrego un nuevo producto");
                }
        } catch (Exception e) {
        }
//        }
        
    }
}
