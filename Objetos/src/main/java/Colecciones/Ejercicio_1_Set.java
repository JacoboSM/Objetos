package Colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_1_Set {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Dime una frase : ");
        String frase = read.nextLine();

        String[] frase_separada = frase.toLowerCase().split(" ");

        HashSet<String> lista = new HashSet<>(Arrays.asList(frase_separada));

        System.out.println("Palabras únicas : " + lista);

    }

}
