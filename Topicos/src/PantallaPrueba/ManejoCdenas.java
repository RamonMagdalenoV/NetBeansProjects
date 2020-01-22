/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallaPrueba;

/**
 *
 * @author Ramon
 */
public class ManejoCdenas {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("Mxxxytanejo de Cadenas");
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a' 
                    || x.charAt(i) == 'e'
                    || x.charAt(i) == 'i' 
                    || x.charAt(i) == 'o'
                    || x.charAt(i) == 'u') {
                System.out.println("La primera vocal esta en la posicion "+i);
                break;
            }
        }
    }
    
}
