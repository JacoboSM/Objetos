//package Colecciones.AceptaElreto_181;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.TreeSet;
//
//public class Esquema2 {
//
//    static java.util.Scanner in;
//    static Scanner read = new Scanner(System.in);
//
//    public static boolean casoDePrueba() {
//
//        int numero_potitos = read.nextInt();
//
//        if (numero_potitos == 0){
//
//            return false;
//
//        } else {
//
//            HashSet<String> listaComidos = new HashSet<>();
//            TreeSet<String> listaNoComidos = new TreeSet<>();
//
//            for (int i = 0; i < numero_potitos; i++) {
//
//                String[] potito = read.nextLine().split(" ");
//
//                if (potito[1].equals("NO:") && i == 0){
//
//                    for (int j = 1; j <= potito.length - 1 ; j++) {
//
//                        if (j == potito.length -1){
//
//                            break;
//
//                        }
//
//                        listaNoComidos.add(potito[j]);
//
//                    }
//
//                }else {
//
//                    if (potito[1].equals("SI:")){
//
//                        for (int j = 1; j <= potito.length -1; j++) {
//
//                            if (j == potito.length -1){
//
//                                break;
//
//                            }
//
//                            if (listaNoComidos.isEmpty()){
//
//                                listaComidos.add(potito[j]);
//
//                            }else {
//
//                                if (!listaNoComidos.contains(potito[j])){
//
//                                    listaComidos.add(potito[j]);
//
//                                }
//
//                            }
//
//                        }
//
//                    }else {
//
//
//
//                    }
//
//                }
//
//
//            }
//
//            return true;
//        }
//    } // casoDePrueba
//
//    public static void main(String[] args) {
//        in = new java.util.Scanner(System.in);
//        while (casoDePrueba()) {
//        }
//    } // main
//
//} // class solution
//}
