package org.example;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;

    public Persona (String nombre, String dni, int edad){

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;

    }

    public Persona(){

    }

    public String getNombre(){

        return nombre;

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public String getDni(){

        return nombre;

    }

    public void setdni(String dni){

        this.dni = dni;

    }

    public int getEdad(){

        return edad;

    }

    public void setEdad(int edad){

        this.edad = edad;

    }

    public void imprimirdatos (){

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);

    }

}
