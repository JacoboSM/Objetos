package Insti;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

  @ToString //Pone las cosas en él .class de target
//@NoArgsConstructor // Constructor vacio
//@AllArgsConstructor // Constructor de toda la vida
//@RequiredArgsConstructor // Constructor que pilla todo lo que se este utilizando
//@Data // Hace todo lo que hacen los de arriba, de los tres constructores pilla el Requiered
public class Instituto {

    //@NonNull // Esto se le pone encima de la variable que no puede ser null
    @Getter
    private String nombre;
    @Setter @Getter
    private String poblacion;
    @Setter @Getter
    private ArrayList<Estudiante> listaestudiantes;
    @Setter @Getter
    private ArrayList<Curso> listacursos;


    public Instituto(String nombre){

        setNombre(nombre);
        listaestudiantes = new ArrayList<>();
        listacursos = new ArrayList<>();

    }

    public Instituto(){

        setNombre(nombre);

    }

    public void agregarCurso (Curso curso){

        if (curso == null){

            System.out.println("No puedes agregar un curso null");
            return;

        }

        for (Curso curso1 : listacursos ){

            if (curso1.getNombre().equals(curso.getNombre())){

                System.out.println("Ya hay un curso llamado " + curso.getNombre());
                return;

            }

        }

        listacursos.add(curso);

    }

    public void agregarEstudiante (Estudiante estudiante){

        if (estudiante == null){

            System.out.println("No puedes agregar un estudiante null");
            return;

        }

        for (Estudiante estudiante1 : listaestudiantes ){

            if (estudiante1.getNombre().equals(estudiante.getNombre())){

                System.out.println("Ya hay un estudiante llamado " + estudiante.getNombre());
                return;

            }

        }

        listaestudiantes.add(estudiante);

    }

    private void setNombre(String nombre){
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre"); // Para darle un valor base cuando venga null
    }



}
