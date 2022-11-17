import java.util.Random;

public class Hilo extends Thread {
    private String nombre;

    public Hilo(String nombre) {
        super();
        this.nombre = nombre;
    }

    public void ejecucionHilo(){
        try {
            while (true) {
                System.out.println("Soy el bucle " + this.nombre + " y estoy trabajando");
                Thread.sleep((long) (Math.floor(Math.random()*11+1) * 1000));
            }
        }catch(InterruptedException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void run(){
        this.ejecucionHilo();
    }

    public static void main(String[] args) {
        Hilo hilo1 = new Hilo("hilo1");
        Hilo hilo2 = new Hilo("hilo2");
        Hilo hilo3 = new Hilo("hilo3");
        Hilo hilo4 = new Hilo("hilo4");
        Hilo hilo5 = new Hilo("hilo5");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }
}
