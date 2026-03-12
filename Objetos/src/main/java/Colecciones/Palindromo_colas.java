package Colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class Palindromo_colas {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        Deque<Character> cola = new LinkedList<>();

        System.out.println("Escribe una palabra ");
        String pl1 = read.next();

        for (int i = 0; i < pl1.length() ; i++) {

            if (pl1.length() % 2 != 0 ){

                if (i == pl1.length()-i -1){

                    cola.offer(pl1.charAt(i));

                    int size = cola.size() - 2;

                    for (int j = size; j >= 0; j--) {

                        cola.offer(pl1.charAt(j));

                    }

                    break;

                }else {

                    if (pl1.charAt(i) == pl1.charAt(pl1.length() - 1 -i)){

                        cola.offer(pl1.charAt(i));

                    }else {

                        break;

                    }

                }

            }else {

                if (pl1.charAt(i) == pl1.charAt(pl1.length() - 1 -i)){

                    cola.offer(pl1.charAt(i));

                }else {

                    break;

                }

            }

        }

        if (cola.size() != pl1.length()){

            System.out.println(pl1 + " no es palíndromo");

        }else {

            System.out.println(pl1 + " es palindromo");

        }

    }



}
