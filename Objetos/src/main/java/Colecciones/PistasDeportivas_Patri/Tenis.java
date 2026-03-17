package Colecciones.PistasDeportivas_Patri;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Tenis extends Pista {

    private String superficie;

    public Tenis(int id, String techado, String superifice) {

        super(id,techado);
        this.superficie=superifice;

    }
}
