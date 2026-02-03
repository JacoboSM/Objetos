package org.example;

import java.util.Random;

public class Paciente {

    static Random random = new Random();
    private static final char DEF_GENERO = 'X';
    private static final int DEF_SUBPESO = -1;
    private static final int DEF_IDEAL = 0;
    private static final int DEF_SOBREPESO = 1;
    private static final int DEF_MAYORDEEDAD = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private int altura;
    private double peso;

    public Paciente (String nombre, int edad, char genero, double peso,int altura){

        this.nombre = nombre;
        this.edad = edad;
        dni = generarDNI();
        setGenero(genero);
        this.altura = altura;
        this.peso = peso;

    }

    public Paciente (){

        this(null,0,DEF_GENERO,0,0);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getGenero() {
        return genero;
    }

    private void setGenero(char genero) {
        this.genero = validarGenero(genero);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private String generarDNI (){

        String dni = "";

        for (int i = 0; i < 8; i++) {

            int num = random.nextInt(10);

            dni = dni + num;

        }

        int dni_num = Integer.parseInt(dni);

        int posicion = dni_num % 23;

        char[] letras = {
                'T','R','W','A','G','M','Y',
                'F','P','D','X','B','N','J','Z',
                'S','Q','V','H','L','C','K','E'
        };

        dni = dni + letras[posicion];

        return dni;

    }

    public int calcularIMC (){

        if (peso > 0 && altura > 0){

            double resultado = peso / Math.pow((double) altura/100, 2);

            System.out.println(resultado);

            if (resultado < 20){

                return DEF_SUBPESO;

            }else if (resultado > 25){

                return DEF_SOBREPESO;

            }else {

                return DEF_IDEAL;

            }
        } else {


            return -10 ;
        }

    }

    public boolean mayorDeEdad(){

        if (edad >= DEF_MAYORDEEDAD){

            return true;

        } else {

            return false;

        }

    }

    private char validarGenero (char genero){

        if (genero == 'M' || genero == 'H'){

            return genero;

        }else {

            return DEF_GENERO;

        }

    }

    public void imprimirInfo (){

        System.out.println("El nombre es " + nombre);
        System.out.println("La edad es " + edad);
        System.out.println("El dni es " + dni);
        System.out.println("La persona es  " + genero );
        System.out.println("El peso es " + peso);
        System.out.println("La altura es " + altura);

    }

    @Override
    public String toString(){

       return " [ " + "El nombre es " + nombre + " La edad es " + edad + " El dni es " + dni + " La persona es  " + genero
        + " El peso es " + peso + " La altura es " + altura + "]";

    }

}
