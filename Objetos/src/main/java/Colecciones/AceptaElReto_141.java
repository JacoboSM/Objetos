package Colecciones;

import java.util.Stack;

public class AceptaElReto_141 {

    // Asume fichero llamado solution.java
    public class solution {

        static java.util.Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                // CÓDIGO PRINCIPAL AQUÍ
                // (incluyendo la lectura del caso de prueba)

                String [] pruebas = {"({[]})()", "Tengase en cuenta (obviamente) que puede haber otros simbolos.", ":)" };

                Stack<Character> pila = new Stack<>();
                
                for (int i = 0; i < pruebas.length; i++) {

                    for (int j = 0; j < pruebas[i].length(); j++) {

                        if (pruebas[i].charAt(j) == '(' || pruebas[i].charAt(j) == ')'  || pruebas[i].charAt(j) == '{' ||
                                pruebas[i].charAt(j) == '}' || pruebas[i].charAt(j) == '[' || pruebas[i].charAt(j) == ']'){

                            if ((pruebas[i].charAt(j) == '(')){
                                
                                pila.push('(');
                                
                            } else if ((pruebas[i].charAt(j) == ')')) {

                                if (pila.contains('(')){

                                    pila.remove(')');

                                }
                                
                            }

                        }

                    }

                }

                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    } // class solution

}
