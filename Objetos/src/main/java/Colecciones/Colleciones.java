package Colecciones;


import java.util.Scanner;
import java.util.Stack;

public class Colleciones {

    Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

//        ArrayList<Integer> listaNums = new ArrayList<>();
//
//        Stack<Integer> pilaNums = new Stack<>();
//        pilaNums.push(2);
//        pilaNums.push(9);
//        pilaNums.push(12);
//
//        pilaNums.pop();
//
//        System.out.println(pilaNums.peek());
//
//        pilaNums.pop();
//
//        System.out.println(pilaNums.peek());


    }

    public void ejercicio1 (){

        Stack<Character> pilaEjercicio1 =  new Stack<>();

        pilaEjercicio1.push('a');
        pilaEjercicio1.push('j');
        pilaEjercicio1.push('o');
        pilaEjercicio1.push('l');
        pilaEjercicio1.push('o');

        System.out.println(pilaEjercicio1.isEmpty());

        System.out.println(pilaEjercicio1.size());

        pilaEjercicio1.peek();

        while (pilaEjercicio1.isEmpty()){

            System.out.println(pilaEjercicio1.pop());

        }

    }

    public void ejercicio2 (){

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





    }

}
