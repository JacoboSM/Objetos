package Practica2;

import java.util.Scanner;

public class AppMantenimiento{

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

    }

    static public void menu (){

        boolean bucle = true;

        while (bucle){


            System.out.println(" === App de mantenimient del MUTXAMEL FC ===");
            System.out.println(" ");
            System.out.println("[1]. Mantenimiento de jugadores");
            System.out.println(" ");
            System.out.println("[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
            System.out.println(" ");
            System.out.println("[3]. Mantenimiento masajistas (añadir-modificar datos-salir)");
            System.out.println(" ");
            System.out.println("[4]. Consultar equipos");
            System.out.println(" ");
            System.out.println("[X]. Salir");
            System.out.println(" ");
            System.out.println("==============================================");
            System.out.println(" ");
            System.out.println("Selecciona una opcion -->");
            System.out.println(" ");
            String menu1 = read.next();

            switch (menu1.toLowerCase()){

                case "1":

                    menuMasajistas();
                    break;

                case "x":

                    System.out.println("Hasta la proxima!");
                    bucle = false;
                    break;

                default:

                    System.out.println("Elige una opción del menu");
                    break;

            }

        }

    }

    public static void menuMasajistas (){

        boolean bucle2 = true;

        while (bucle2){

            System.out.println(" === Mantenimeinto de Masajista === ");
            System.out.println(" ");
            System.out.println("[1]. Añadir nuevo/a masajista");
            System.out.println("[2]. Modificar datos de masajista existente");
            System.out.println("[X]. Volver al menú principal");
            System.out.println(" ");
            System.out.println("====================================================");
            System.out.println(" ");
            System.out.println("Selecciona una opcion -->");
            System.out.println(" ");
            String menu2 = read.next();

            switch (menu2.toLowerCase()){

                case "1":

                    añadirMasajistas();
                    break;

                case "2":

                    elegirMasajistas();
                    break;

                case "x":

                    System.out.println("Volviendo al menu principal");
                    bucle2 = false;
                    break;

                default:

                    System.out.println("Elige una opción de las que hay!");
                    break;

            }

        }

    }

    public static void añadirMasajistas(){

        System.out.println(" === Mantenimiento de Masajistas. Añadir nuevo Masajista === ");
        System.out.println(" ");
        System.out.println("Escribe el nombre de tu masajista");
        read.nextLine();
        String nombre = read.nextLine();
        System.out.println(" ");
        System.out.println("Que edad tiene tu masajista? ");
        int edad = read.nextInt();
        read.nextLine();
        System.out.println(" ");
        System.out.println("Que titulación tiene tu masajista?");
        String titulacion = read.nextLine();
        System.out.println(" ");
        System.out.println("Cuantos años de experiencia tiene tu masajista?");
        int anosExperiencia = read.nextInt();
        read.nextLine();
        System.out.println(" ");

        new Masajista(nombre,edad,titulacion,anosExperiencia);

    }

    public static void elegirMasajistas() {

        System.out.println(" === Mantenimiento de Masajistas. Modificar datos de masajista existente ===");

        if (Masajista.getListaMasajistas().isEmpty()) {

            System.out.println("No hay masajistas en el sistema.");

        } else {

            for (int i = 0; i < Masajista.getListaMasajistas().size(); i++) {

                System.out.println("[" + i + ", " + Masajista.getListaMasajistas().get(i).toString() + "]");

            }

            System.out.println("======================================");
            System.out.println(" ");

            System.out.println("Selecciona una opción --> ");
            int elegir = read.nextInt();

            modificarMasajistas(elegir);

        }

    }


    public static void modificarMasajistas(int elegir){

        System.out.println("Modificando masajista : " + Masajista.getListaMasajistas().get(elegir).toString());
        System.out.println(" ");
        System.out.println("======================================");
        System.out.println(" ");
        System.out.println("Seleccione una opción ");
        String parte = read.next();
        read.nextLine();

        switch (parte.toLowerCase()){

            case "nombre":

                System.out.println("Nuevo nombre : ");
                String nombre_nueva = read.nextLine();

                Masajista.getListaMasajistas().get(elegir).setNombre(nombre_nueva);
                break;

            case "edad":

                System.out.println("Nueva edad : ");
                int edad_nueva = read.nextInt();

                Masajista.getListaMasajistas().get(elegir).setEdad(edad_nueva);
                break;

            case "titulacion":

                System.out.println("Nueva titulación : ");
                String titulacion_nueva = read.nextLine();

                Masajista.getListaMasajistas().get(elegir).setTitulacion(titulacion_nueva);
                break;

            case "experiencia":

                System.out.println("Nueva experiencia : ");
                int experiencia_nueva = read.nextInt();

                Masajista.getListaMasajistas().get(elegir).setAnosExperiencia(experiencia_nueva);
                break;

            default:

                System.out.println("No es una opción valida!");
                break;

        }

    }

}