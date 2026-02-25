package Practica2;

public class Acompañante extends MutxamelFC implements FuncionesIntegrantes{

    private Jugador jugador;
    private String parentesco;

    public Acompañante(String nombre, int edad, String parentesco) {

        super(nombre, edad);
        this.parentesco = parentesco;

    }

    @Override
    public void concentrarse(){

        System.out.println(getNombre() + " se emociona y pasa a intentar copiar los movimientos de los jugadores en su cabeza");

    }

    @Override
    public void viajar(String ciudad){

        System.out.println("Proxima parada del acompañante : " + ciudad);

    }

    @Override
    public void celebrarGol(){

        System.out.println(getNombre() + " se levanta junto a los demas, mira fijamente al jugador con la pelota, Grita GOL! al coro de todos los demas y empiezan a correr.");

    }

    public void animarEquipo(){

        System.out.println("Boca yo te amo, siempre te sigo a todo lados, de corazón pongan más huevo, porque a Boca lo queremos "); {}

    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "jugador=" + jugador +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }
}
