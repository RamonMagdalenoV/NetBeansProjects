
package Practicas;

import java.util.LinkedList;

public class ListaLinkLista {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.add("Hola este es el inicio!!");
        lista.add(123);
        System.out.println(lista.getLast());
        System.out.println(lista.getFirst());
//        System.out.println(lista.peek());
        lista.add(1, 19);
        System.out.println("--------------------");
        lista.remove(0);
        for(Object x : lista) {
            System.out.println(x);
        }
        
        System.out.println("El tamaño de la lista es: "+lista.size());
        
        
    }
    
}
