package Partido_de_Tenis;

import java.util.ArrayList;
import java.util.Arrays;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaDeSets;

    public Partido(Jugador jugador1, Jugador jugador2){

        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        listaDeSets = null;

    }

    public void insertarSet (int jugador1, int jugador2){

        Set set = new Set(jugador1, jugador2);
        listaDeSets.add(set);

    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public ArrayList<Set> getListaDeSets() {
        return listaDeSets;
    }

    public void setListaDeSets(ArrayList<Set> listaDeSets) {
        this.listaDeSets = listaDeSets;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "jugador1=" + jugador1 +
                ", jugador2=" + jugador2 +
                ", listaDeSets=" + listaDeSets +
                '}';
    }

}
