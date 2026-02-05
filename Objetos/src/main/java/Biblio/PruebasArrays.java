package Biblio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PruebasArrays {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        ArrayList<Integer> listaNotas = new ArrayList<>();

        listaNotas.add(5);
        listaNotas.add(10);
        listaNotas.add(6);

        System.out.println("Elementos en la lista: " + listaNotas.size());

        listaNotas.add(1, 4);

        System.out.println("Elementos en la lista: " + listaNotas.size());

        System.out.println("Nota en la posición 2 :" + listaNotas.get(2));

        listaNotas.remove(1); // saber que con integer no se puede borrar por valor

        System.out.println(listaNotas);

        System.out.println(listaNotas.indexOf(10));

        System.out.println("El 10 esta en la posicion : " + listaNotas.indexOf(10));

        System.out.println("Las notas de Raúl: ");

        for (Integer nota : listaNotas){

            System.out.println("Nota de la asignatura : " + nota);

        }

        for (int i = 0; i < listaNotas.size(); i++) {

            System.out.println("Notas de la asignatura " + i + " : " + listaNotas.get(i));

        }

        listaNotas.set(0,10);

        System.out.println(listaNotas);

        Object copia_mala = listaNotas.clone(); // La forma mala de utilizar una lista devuelve un object

        ArrayList<Integer> copia = new ArrayList<>(listaNotas); // Forma buena de copiar una lista

        System.out.println(listaNotas.contains(5));

        System.out.println("Lista vacia? : " + listaNotas.isEmpty());

        listaNotas.clear();

        System.out.println("Lista vacia? : " + listaNotas.isEmpty());

        listaNotas.addAll(Arrays.asList(2,5,6,3));

        System.out.println(listaNotas);

    }

}
