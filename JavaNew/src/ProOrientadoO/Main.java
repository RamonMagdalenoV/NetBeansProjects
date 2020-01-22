
package ProOrientadoO;


public class Main {
    public static void main(String[] args) {
        CarroBMV x = new CarroBMV();
        x.peso = 2000;
        System.out.printf("El peso del carro bmv es: %.2f\n",x.ObtenerPeso());
        x.encenderCoche();
        x.estado();
        x.turbo();
//        System.out.printf("El peso es: %.2f\n",peso);
//        x.encenderCoche();
//        x.apagar();
//        x.estado();
       
    }
    
}
