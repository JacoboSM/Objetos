package Insti;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    private String nombre;
    private int horas;

    public void setNombre(String nombre){

        this.nombre = Objects.requireNonNull(nombre, "No puedes dejar el curso sin nombre");

    }

}
