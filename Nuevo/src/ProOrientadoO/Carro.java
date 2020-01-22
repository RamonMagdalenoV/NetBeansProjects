package ProOrientadoO;

public class Carro {

    double peso, altura, ancho, largo;
    int numPuertas;
    String modelo;
    boolean encendido;

    public Carro() {
        peso = 1000;
        altura = 1.90;
        ancho = 4;
        encendido = false;
    }

    public void encenderCoche() {
        encendido = true;
    }

    public double ObtenerPeso() {
        return peso;
    }

    public void apagar() {
        encendido = false;
    }

    public void estado() {
        if (encendido) {
            System.out.println("Esta encendido");
        } else {
            System.out.println("No esta encendido");
        }
    }
}

class CarroBMV extends Carro{
    public CarroBMV(){
        modelo = "BMV";
    }
    public void turbo(){
        System.out.println("Ahora estas Viajando 100 km por hora!!");
    }
}
