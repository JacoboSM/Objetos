package Practica2;

public class Masajista extends  MutxamelFC implements FuncionesIntegrantes {

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {

        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;

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

        System.out.println("Proxima parada del masajista :  " + ciudad);

    }

    @Override
    public void celebrarGol(){

        System.out.println(getNombre() + " deja de dar el masaje, mira a la tele y grita GOLLLLLLLLLLLLLLLLLLLLLLLL!");

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
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}
