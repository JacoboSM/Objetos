package Colecciones;

import java.util.Stack;

public class Ejercicio_3 {

    static void main(String[] args) {

        String expression = ")";

        if (esBalanceado(expression)){

            System.out.println("BIEN");

        }else {

            System.out.println("MAL");

        }

    }

    public static boolean esBalanceado (String expression){

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) == '('){

                pila.push('(');

            } else if (expression.charAt(i) == ')') {

                if (pila.contains('('))               {

                    pila.pop();

                }else {

                    return false;

                }

            }

        }

        return pila.isEmpty();

    }

}
