package Practica2;

import java.util.ArrayList;

public class Masajista extends  MutxamelFC implements FuncionesIntegrantes {

    private String titulacion;
    private int anosExperiencia;
    private static ArrayList<Masajista> listaMasajistas = new ArrayList<>();

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {

        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;

        for (Masajista masajista : listaMasajistas){

            if (masajista.anosExperiencia == anosExperiencia && masajista.titulacion.equalsIgnoreCase(titulacion)
                    && masajista.getNombre().equalsIgnoreCase(getNombre()) && masajista.getEdad() == getEdad() ){

                throw new MismaMasajistaException();

            }

        }

        listaMasajistas.add(this);

        System.out.println("Masajista : " + getNombre() + " creado");

    }

    public void darMasaje (Jugador jugador){

        System.out.println(jugador.getNombre() + " esta recibiendo un masaje para recuperarse despues del partido!");

    }

    @Override
    public void concentrarse(){

        System.out.println(getNombre() + " se concentra para poder dar los mejores masajes y recuperar a los jugadores");

    }

    @Override
    public void viajar(String ciudad){

        System.out.println("Proxima parada del / de la masajista :  " + ciudad);

    }

    @Override
    public void celebrarGol(){

        System.out.println(getNombre() + " deja de dar el masaje, mira a la tele y grita GOLLLLLLLLLLLLLLLLLLLLLLLL!");

    }

    public static ArrayList<Masajista> getListaMasajistas() {
        return listaMasajistas;
    }

    public static void setListaMasajistas(ArrayList<Masajista> listaMasajistas) {
        Masajista.listaMasajistas = listaMasajistas;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Nombre : " + getNombre() + ", Edad : " + getEdad() + ", Titulación : " + getTitulacion() + ", Experiencia : " + getAnosExperiencia() + " años";
    }
}
