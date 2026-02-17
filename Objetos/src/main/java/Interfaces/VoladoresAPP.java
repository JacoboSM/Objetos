package Interfaces;

import java.util.ArrayList;

public class VoladoresAPP {

    public static void main (String[] args){

        Superman clark_kent = new Superman();
        Pajaro piolin = new Pajaro();

        clark_kent.volar();
        piolin.volar();

        clark_kent.rayoLaser();
        clark_kent.alientoHelado();

        Spiderman Peter_Parker =  new Spiderman();

        ArrayList<SuperHeroe> listaheroes =  new ArrayList<>();

        listaheroes.add(clark_kent);
        listaheroes.add(Peter_Parker);

        for (SuperHeroe superHeroe : listaheroes){

            if (superHeroe instanceof Superman){

                ((Superman) superHeroe).alientoHelado();
                ((Superman) superHeroe).rayoLaser();

            }

        }

    }




}
