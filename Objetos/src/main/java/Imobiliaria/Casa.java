package Imobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    static Scanner read = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa (String direccion){

        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();

    }

    public void crearHabitaciones (String nombre, double metros){

        for (Habitacion habitacion : listaHabitaciones){

            if (habitacion.getNombre().equals(nombre)){

                System.out.println("La habitación " + nombre + " ya existe.");
                return;

            }

        }

        Habitacion habitacion = new Habitacion(nombre,metros);

        listaHabitaciones.add(habitacion);

        System.out.println("La habitación " + nombre + " ha sido creada!" );

    }

    public void eliminarHabitaciones (String nombre){

        for (Habitacion habitacion : listaHabitaciones){

            if (habitacion.getNombre().equals(nombre)){

                listaHabitaciones.remove(habitacion);

                System.out.println("La habitación " + nombre + " ha sido borrada!" );

                return;

            }

        }

        System.out.println("La habitación " + nombre + " no existe");

    }

    public void mostrarHabitaciones (){


        System.out.println("Casa en " + direccion + " tiene " + listaHabitaciones.size() + " habitaciones y propietario " + propietario.getNombre());

        for (Habitacion habitacion : listaHabitaciones){

            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetros() + ") m2");

        }

    }

    public Habitacion getHabitacionMasGrande (){

        Habitacion grande = listaHabitaciones.get(0);

        for (Habitacion habitacion : listaHabitaciones){

            if (habitacion.getMetros() > grande.getMetros()){

                grande = habitacion;

            }

        }

        return grande;

    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {

        System.out.println("Introduce el nombre del propietario de la casa en  " + direccion);

        String nombre = read.next();

        System.out.println("Introduce la edad : ");

        int edad = read.nextInt();

        read.nextLine();

        Propietario propietario = new Propietario(nombre, edad);

        this.propietario = propietario;

        System.out.println("Propietario " + nombre + " añadido");
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propietario='" + propietario +
                '}';
    }

}
