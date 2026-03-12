package Colecciones;

public class PresidentesApp {

    static void main(String[] args) {

        Presidente trump = new Presidente("Donald Trompeta", "USA");
        System.out.println(trump.hashCode());
        Presidente miley = new Presidente("Donald Trompeta", "USA");
        System.out.println(miley.hashCode());

        if (trump.equals(miley)){

            System.out.println("Son iguales");

        }


    }

}
