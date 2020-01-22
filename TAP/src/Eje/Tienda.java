package Eje;


import java.util.ArrayList;
import java.util.List;

public class Tienda {
    public static void main(String[] args) {
        List <String> productos = new ArrayList<String>();
        
        productos p = new productos(productos);
        Consumidor c = new Consumidor(productos);
        
        Thread hilo1 = new Thread(c);
        Thread hilo2 = new Thread(p);
        Thread hilo3 = new Thread(p);
        
       
    }
}
