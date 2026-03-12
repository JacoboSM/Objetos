package Colecciones;


import lombok.*;

import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Presidente {

    private String nombre;
    private String pais;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Presidente that = (Presidente) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(pais, that.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais);
    }
}
