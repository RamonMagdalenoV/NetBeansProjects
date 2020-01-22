
package Practicas;

import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String serie;
        int anterior = 0, actual = 1, siguiente;
        System.out.println("Dame limite de numero en serie: ");
        int n = sc.nextInt();
        serie = anterior+", "+actual;
        
        
        for (int i = 1; i <=n; i++) {
             
            siguiente = anterior + actual;
            if(siguiente >= n)
                break;
            serie += ", "+siguiente;
            anterior = actual;
            actual = siguiente;
            

        }
        System.out.println(serie);
        
    }
    
}
