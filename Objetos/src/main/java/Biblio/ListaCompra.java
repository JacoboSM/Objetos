package Biblio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaCompra {

    static Scanner read = new Scanner(System.in);
    static ArrayList<String> listacompra = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("La lista esta : " + listacompra.isEmpty());

        listacompra.add("pepinillos");

        System.out.println("La lista esta : " + listacompra.isEmpty());

        listacompra.addAll(Arrays.asList("pan","huevos","mantequilla","aceite","leche"));

        System.out.println(listacompra);

        System.out.println("El tercer elemento de la lista es : " + listacompra.get(2));

        listacompra.set(1,"Queso");

        System.out.println("Esta leche en la lista? " + listacompra.contains("leche"));

        System.out.println("Dime el producto que quieres poner :");
        String producto = read.next();
        comprobarAdd(producto);

        System.out.println("Dime la posición en la que quieres tu producto y el nombre del producto : ");
        comprobarSet(1, "pan");

    }

    public static void comprobarAdd (String producto){

        if (listacompra.contains(producto)){

            System.out.println("Ya tienes apuntado ese producto en la lista!");


        }else {

            listacompra.add(producto);
            System.out.println(listacompra);

        }

    }

    public static void comprobarSet (int posicion,String comprobar){

        if (listacompra.contains(comprobar.toLowerCase())){

            System.out.println("Ya tienes apuntado ese producto en la lista!");

        }else {

            listacompra.set(posicion,comprobar.toLowerCase());
            System.out.println(listacompra);

        }

    }

}
