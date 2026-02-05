package Insti;


import lombok.*;

import java.util.Objects;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    private String nombre;
    private int edad;
    private Curso curso;

    public void setNombre(String nombre){

        this.nombre = Objects.requireNonNull(nombre, "Necesitas poner un nombre al estudiante");

    }

    public Estudiante (String nombre){

        setNombre(nombre);

    }



}
