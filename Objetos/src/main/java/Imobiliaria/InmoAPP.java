package Imobiliaria;

public class InmoAPP {

    public static void  main (String[] args){

        Casa pisito = new Casa("Calle Falsa 123");

        System.out.println(pisito.getPropietario());

        pisito.crearHabitaciones("cocina", 20);
        pisito.crearHabitaciones("baño", 7);
        pisito.crearHabitaciones("dormitorio", 21);
        pisito.crearHabitaciones("dormitorio", 12);

        pisito.mostrarHabitaciones();
        System.out.println("La habitación más grande es " + pisito.getHabitacionMasGrande().getNombre()); // probamos cuál es la habitación más grande

        pisito.eliminarHabitaciones("baño");

        pisito.mostrarHabitaciones();

        pisito.eliminarHabitaciones("baño");

        pisito.getListaHabitaciones().get(1).agregarElectrodomestico("lavadora", 0.2);

        System.out.println(pisito.getListaHabitaciones().get(1).getListaElectrodomesticos());

    }

}
