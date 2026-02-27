package Examen;

import java.util.Scanner;

public class Agente extends Persona implements AccionesPoliciales {

    static Scanner read = new Scanner(System.in);
    static int contador = 0;
    private int id;
    private int codigo_acceso;

    public Agente(String nombre, String poblacion, int codigo_acceso) {

        contador++;

        super(nombre,poblacion);
        id = contador;
        this.codigo_acceso = codigo_acceso;
        System.out.println("Agente " + getNombre() + " resgistrado. Tu id es : " + getId());

    }

    public Agente (int id, int codigo_acceso){

        this.codigo_acceso = codigo_acceso;
        this.id = id;


    }

    public static boolean login(){

        if ()



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_acceso() {
        return codigo_acceso;
    }

    public void setCodigo_acceso(int codigo_acceso) {
        this.codigo_acceso = codigo_acceso;
    }

    @Override
     public Ciudadano solicitarDatosCiudadano(){

        System.out.println("Introduce los datos del ciudadano a registrar");

        System.out.println("Nombre : ");
        String nombre_escrito = read.next();
        System.out.println("Poblacion : ");
        String poblacion_escrita = read.next();
        System.out.println("DNI");
        String dni_escrito = read.next();

        System.out.println("Expediente para el ciudadano " + nombre_escrito + " creado.");

        return new Ciudadano(nombre_escrito, poblacion_escrita, dni_escrito);

    }

    @Override
    public Expediente crearExpediente(){


        return new Expediente(EstadoTramite.INICIADO,solicitarDatosCiudadano());

    }

    @Override
    public void siguienteEstado(Expediente expediente){

        expediente.setEstado(EstadoTramite.COMPLETADO);
        System.out.println("Agente modificando estado : Iniciado a Completado");

    }

    @Override
    public void archivarExpediente(Expediente expediente){

        expediente.setEstado(EstadoTramite.ARCHIVADO);
        System.out.println("Expediente archivado");

    }

    @Override
    public void mostrarTipoPersona() {

    }
}
