
package Practicas;

public class FiboTut {
    public static void main(String[] args) {
        int act = 1;
        int ant = 0;
        int temp;
        
        while (true) {
            System.out.println(act);
            temp = act;
            act = act + ant;
            ant = temp;
            if (act > 100) {
                break;
            }
        }
        
    }
    
}
