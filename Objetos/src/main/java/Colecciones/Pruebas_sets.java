package Colecciones;

import java.util.*;

public class Pruebas_sets {

    static void main(String[] args) {

        String[] esquiroles = {"Joaquin","Christian","Christian","Carlos","Carlos","Ángel","Kevin","Eric","DavidG","DavidG"};

        HashSet<String> normal = new HashSet<>(Arrays.asList(esquiroles));

        LinkedHashSet<String> respeta_add = new LinkedHashSet<>(Arrays.asList(esquiroles));

        TreeSet<String> ordenada = new TreeSet<>(Arrays.asList(esquiroles));

        System.out.println(normal);
        System.out.println();
        System.out.println(respeta_add);
        System.out.println();
        System.out.println(ordenada);


    }

}
