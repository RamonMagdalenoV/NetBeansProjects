package ProgramacionConcurrente;


public class Hilos {
    public static void main(String[] args) {
        Thilo p1 = new Thilo("Word");
        Thilo p2 = new Thilo("Excel");
        Thilo p3 = new Thilo("Paint");
        Thilo p4 = new Thilo("Reloj");
        Thilo p5 = new Thilo("Nexus");
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
