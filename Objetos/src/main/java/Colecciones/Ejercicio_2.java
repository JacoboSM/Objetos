package Colecciones;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_2 {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        Stack<Integer> pila =  new Stack<>();

        System.out.println("Introduce el primer número : ");
        int num1 = read.nextInt();
        pila.push(num1);

        System.out.println("Introduce el segundo número : ");
        int num2 = read.nextInt();
        pila.push(num2);

        System.out.println("Introduce el tercer número : ");
        int num3 = read.nextInt();
        pila.push(num3);

        System.out.println("Numeros en orden inverso");

        while (!pila.isEmpty()){

            System.out.println(pila.pop());

        }


    }

}
