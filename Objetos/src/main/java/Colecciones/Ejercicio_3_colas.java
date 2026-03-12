package Colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio_3_colas {

    static void main(String[] args) {

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("La cancion");
        playlist.offer("La mordidita");
        playlist.offer("Call me by your name");
        playlist.offer("Rap de Fernanflo");

        System.out.println();

        System.out.println("Estado inicial de la playlist : " +playlist);

        System.out.println();

        while (!playlist.isEmpty()){

            System.out.println("Reproduciendo : " + playlist.poll() );

            System.out.println("Estado de la playlist despues de reproducir una canción : " + playlist);

            System.out.println();

        }

        System.out.println("La playlist ha terminado.");

    }

}
