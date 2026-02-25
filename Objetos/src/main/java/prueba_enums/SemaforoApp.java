package prueba_enums;

public class SemaforoApp {

    public static void main (String[] args){

        Semaforo color = Semaforo.ROJO;

        for (int i = 0; i < 10; i++) {

            System.out.println(color.name());
                color = color.siguiente(color);


        }

    }

}
