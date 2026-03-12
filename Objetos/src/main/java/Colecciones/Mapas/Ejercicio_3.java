package Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_3 {

    static HashMap<String,Double> mapa = new HashMap<>();
    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        while (true){

            System.out.println("Elige una aopción [insetar, actualizar, consultar, ver todas, salir] : ");

            String opcion = read.nextLine().toLowerCase();

            switch (opcion){

                case "insertar" :

                    insertar();

                    break;

                case "actualizar" :

                    actualizar();

                    break;

                case "consultar" :

                    consultar();

                    break;

                case "ver todas":

                    verTodas();

                    break;

                case "salir":

                    break;

                default:

                    System.out.println("No existe la opción. Vuelve a elegir una...");


            }

            System.out.println("*** Mapita temporal ***");

            for (Map.Entry<String,Double> mapita : mapa.entrySet()){

                System.out.println(mapita.getKey() + " - " + mapita.getValue());

            }

        }

    }

    public static void insertar (){

        System.out.println("Introduce los nuevos datos (ciudad_temperatura) : ");
        String[] ciudad = read.nextLine().split("/");

        mapa.put(ciudad[0], Double.valueOf(ciudad[1]));

    }

    public static void actualizar (){

        System.out.println("Escribe los datos que quieras cambiar : ");
        String[] ciudad = read.nextLine().split("/");

        if (mapa.get(ciudad[0]).equals(Double.valueOf(ciudad[1]))){

            System.out.println("No pongas el mismo valor!");

        } else if (!mapa.containsKey(ciudad[0])) {

            System.out.println("No hay un sitio al cual cambiarle el valor");

        }else {

            mapa.put(ciudad[0],Double.valueOf(ciudad[1]));

        }

    }

    public static void consultar (){

        System.out.println("Introduce la ciudad a consultar : ");
        String ciudad = read.nextLine();

    }

    public static void verTodas (){



    }

}
