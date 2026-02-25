package prueba_enums;

import java.util.Random;
import java.util.Scanner;

public class DificultadApp {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduce la dificultad [FACIL, MEDIO, DIFICIL, EXPERTO]");
        Dificultad tipo = Dificultad.valueOf(read.next());

        int player = random.nextInt(1000 - 1 + 1 ) + 1;
        System.out.println("Puntuación obtenida = " + player);

        System.out.println("Puntuación final = " + player * tipo.getMultiplicador());



    }

}
