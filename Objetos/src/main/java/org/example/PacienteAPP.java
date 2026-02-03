package org.example;

import java.util.Scanner;

public class PacienteAPP {

    static Scanner read = new Scanner(System.in);

    public static void main (String[] args){

//        Paciente joaquin = new Paciente();
//        System.out.println(joaquin.getDni());
//
//        Paciente prueba = new Paciente("juan",20,'H',50,160);
//
//        System.out.println(prueba.calcularIMC());
//
//        if (prueba.MayorDeEdad()){
//
//            System.out.println("Es mayor");
//
//        }else {
//
//            System.out.println("No es mayor");
//
//        }
//
//        Paciente pepe = new Paciente("pepe", 80, 'G', 40, 160);
//
//        System.out.println(pepe.getGenero());

        System.out.println("Como te llamas?");
        String nombre = read.next();
        System.out.println("Que años tienes?");
        int edad = read.nextInt();
        System.out.println("Que eres? (H o M)");
        char genero = read.next().charAt(0);
        System.out.println("Cuanto pesas?");
        double peso = read.nextDouble();
        System.out.println("Que mides?");
        int altura = read.nextInt();


        System.out.println("Este es el primer paciente");
        Paciente Joaquin = new Paciente(nombre, edad, genero, peso, altura);

        Joaquin.imprimirInfo();

        System.out.println(Joaquin.calcularIMC());

        if (Joaquin.mayorDeEdad()){

            System.out.println("Es mayor");

        }else {

            System.out.println("No es mayor");

        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Este es el paciente sin peso");
        Paciente sinpeso = new Paciente(nombre,edad,genero,0,0);

        sinpeso.imprimirInfo();

        if (sinpeso.calcularIMC() <= -10){

            System.out.println("No ha introducido bien el peso o la altura, no se pudo calcular el IMC");

        }else {

            System.out.println(sinpeso.calcularIMC());

        }

        if (sinpeso.mayorDeEdad()){

            System.out.println("Es mayor");

        }else {

            System.out.println("No es mayor");

        }

        Paciente David = new Paciente();

        David.setNombre(nombre);
        David.setEdad(edad);
        David.setDni(David.getDni());
        David.setPeso(peso);
        David.setAltura(altura);



    }

}
