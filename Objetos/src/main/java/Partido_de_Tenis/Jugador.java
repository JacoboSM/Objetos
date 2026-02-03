package Partido_de_Tenis;

public class Jugador {

    private String nombre;
    private int ranking;
    private Jugador rival;

    public Jugador (String nombre, int ranking){

        this.nombre = nombre;
        this.ranking = ranking;

    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", ranking=" + ranking +
                '}';
    }



}
