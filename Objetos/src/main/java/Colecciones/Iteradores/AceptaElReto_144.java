package Colecciones.Iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AceptaElReto_144 {

    static Scanner read = new Scanner(System.in);

        static java.util.Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {

                ArrayList<Character> lista = new ArrayList<>();
                ListIterator<Character> it = lista.listIterator();

                String frase = read.nextLine();

                for (Character character : frase.toCharArray()){

                    switch (character){

                        case '-':

                            while (it.hasPrevious()){

                                it.previous();

                            }

                            break;

                        case '+':

                            while (it.hasNext()){

                                it.next();

                            }

                            break;

                        case '*':

                            if (it.hasNext()){

                                it.next();

                            }

                            break;

                        case '3':

                            if (it.hasNext()){

                                it.next();
                                it.remove();

                            }

                            break;

                        default:

                            it.add(character);

                    }

                }

                for (Character character : lista){

                    System.out.print(character);

                }

                System.out.println(lista);

                System.out.println();

                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    // class solution

}
