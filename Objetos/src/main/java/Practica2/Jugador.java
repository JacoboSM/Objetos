package Practica2;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements FuncionesIntegrantes, AccionesDeportivas {

    private int dorsal;
    private Equipos categoria;
    private Posiciones posicion;
    private static ArrayList<Jugador> listajugadores = new ArrayList<>();

    public Jugador(String nombre, int edad, int dorsal, Equipos categoria, Posiciones posicion) {

        super(nombre, edad);
        this.categoria = categoria;
        this.posicion = posicion;
        setDorsal(dorsal);

        listajugadores.add(this);

        System.out.println("Jugador : " + getNombre() + " creado y añadido a la lista");

    }

    public void calentar(){

        System.out.println(getNombre() + " empieza a estirar los isquios, luego los gemelos y luego el tren superior");

    }

    public void descansar(){

        System.out.println(getNombre() + " despues de un duro partido/entreno procede a dormir la siesta");

    }

    public void marcarGol(){

        System.out.println("Comentarista : Arranca por la derecha " + getNombre() + " el genio del futbol mundial, siempre " + getNombre() + " genio/a, genio/a, genio/a !!!!");

    }

    @Override
    public void concentrarse(){

        System.out.println(getNombre() + " se pone a pensar la siguiente jugada y empieza a correr");

    }

    @Override
    public void viajar(String ciudad){

        System.out.println("Proxima parada del jugador :  " + ciudad);

    }

    @Override
    public void celebrarGol(){

        System.out.println(getNombre() + " corre a la banda y se desliza gritando vamossss!");

    }

    @Override
    public void entrenar(){

        System.out.println("El jugador " + getNombre() + "se pone a entrenar siguiendo las indicaciones del entrenador");

    }

    @Override
    public void jugarPartido(String rival){

        System.out.println("El jugador " + getNombre() + " dice : hoy vamos a ganar a " + rival);

    }

    public static ArrayList<Jugador> getListajugadores() {
        return listajugadores;
    }

    public static void setListajugadores(ArrayList<Jugador> listajugadores) {
        Jugador.listajugadores = listajugadores;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {

        for (Jugador jugador : listajugadores){

            if (jugador != this && jugador.categoria == this.categoria && jugador.dorsal == dorsal){

                throw new MismoDorsalMismoEquipoException();

            }

        }

        this.dorsal = dorsal;

    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dorsal=" + dorsal +
                ", categoria=" + categoria +
                ", posicion=" + posicion +
                '}';
    }
}
