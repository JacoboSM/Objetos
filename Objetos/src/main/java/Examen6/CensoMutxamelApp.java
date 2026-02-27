package Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class CensoMutxamelApp {

    static Scanner read = new Scanner(System.in);
    public static ArrayList<Agente> agentesPolicialesRegistrados = new ArrayList<>();
    public static ArrayList<Expediente> listaExpedientes = new ArrayList<>();

    public static void main(String[] args) {



    agentesPolicialesRegistrados.add(new Agente("Luisa","Mutxamel",2234));
    agentesPolicialesRegistrados.add(new Agente("Raúl", "Mutxamel", 1234));

    System.out.println("    === BIENVENIDO A LA APP DEL CENSO DE BESTIAS DE MUTXAMEL ===");

    while (!Agente.login()){

        System.out.println("Introduce tu ID");
        int id_escrita = read.nextInt();

        System.out.println("Introduce tu codigo de Acceso");
        int codigo_escrito = read.nextInt();


    }

    Agente pepe = new Agente("pepe", "badalona", 1245);


    System.out.println("Creando expediente");
    Expediente expediente = pepe.crearExpediente() ;
    listaExpedientes.add(expediente);
    pepe.siguienteEstado(expediente);
    pepe.archivarExpediente(expediente);
        System.out.println("*** Resumen de expedientes creados ***");
        System.out.println(listaExpedientes);



    }





}
