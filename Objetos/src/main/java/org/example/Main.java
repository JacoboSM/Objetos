package org.example;

public class Main {

    public static void main(String[] args) {

        Bocadillo pepito = new Bocadillo("pepito","baguete","bacon","bigmac",10.0);

        pepito.imprimirinfobocata();

        System.out.println(pepito.getNombre() + " " + pepito.getPrecio());

        Bocadillo vacio = new Bocadillo();

        vacio.setNombre("vegetal");

        vacio.imprimirinfobocata();

    }

}
