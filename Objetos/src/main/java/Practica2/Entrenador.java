package Practica2;

import java.util.Scanner;

public class Entrenador extends MutxamelFC implements FuncionesIntegrantes, AccionesDeportivas {

    Scanner read = new Scanner(System.in);

    private String formacionPreferida;
    private Equipos equipo;

    public Entrenador(String nombre, int edad, String formacionPreferida, Equipos equipo) {

        super(nombre, edad);
        setFormacionPreferida(formacionPreferida);
        this.equipo = equipo;

        System.out.println("Entrenador : " + getNombre() + " creado");

    }

    public void planificarEntrenamiento(){

        System.out.println(getNombre() + " escribe en su libreta : Que todos corran 3 vueltas y luego pasen a hacer fisico");

    }

    public void hacerCambios(){

        System.out.println("Arbitro necesitamos hacer cambios!");

    }

    @Override
    public void concentrarse(){

        System.out.println(getNombre() + " se pone a hablar con el segundo entrenador analizando todo lo que pasa y planificando las siguientes acciones");

    }

    @Override
    public void viajar(String ciudad){

        System.out.println("Proxima parada del entrenador :  " + ciudad);

    }

    @Override
    public void celebrarGol(){

        System.out.println(getNombre() + " se lleva las manos a la cabeza, empieza a correr y celebra con los demas jugadores");

    }

    @Override
    public void entrenar(){

        System.out.println(getNombre() + " mira en su libreta y les dice a los jugadores lo que tienen que hacer ese dia");

    }

    @Override
    public void jugarPartido(String rival){

        System.out.println("El entrenador " + getNombre() + " dice : hoy nos enfrentamos a " + rival);

    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if (formacionPreferida.matches("[1-5]-[1-5]-[1-5]")){

            this.formacionPreferida = formacionPreferida;

        }else {

            throw new FormatoFormacionException();

        }
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "formacionPreferida='" + formacionPreferida + '\'' +
                ", equipo=" + equipo +
                '}';
    }
}
