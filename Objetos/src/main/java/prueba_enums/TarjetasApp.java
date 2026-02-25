package prueba_enums;

import java.util.Scanner;

public class TarjetasApp {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Tarjetas tarjeta_tipo = Tarjetas.VISA;

        System.out.println(tarjeta_tipo.ordinal()); // posicion en la que se encuentra el valor en tarjetas
        System.out.println(tarjeta_tipo.name()); // nombre del valor que es

        System.out.println("Tipos de tarjetas : ");
        for (Tarjetas tarjetas : Tarjetas.values()){

            System.out.println(tarjetas);

        }

        System.out.println("Introduce el tipo :");
        Tarjetas tipo = Tarjetas.valueOf(read.next()); // si pido esto por teclado tiene que tener exactamente el mismo valor que lo que hay en mi Tarjetas

        System.out.println("Las Tarjetas de tipo " + tipo.name() + " tiene una comision de " + tipo.getComision() + "€");

    }

}
