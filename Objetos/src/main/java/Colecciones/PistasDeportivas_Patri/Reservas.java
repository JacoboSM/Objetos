package Colecciones.PistasDeportivas_Patri;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@ToString
public class Reservas {

    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fecha_hora;

    public Reservas(Usuario usuario, Pista pista) {
        this.usuario = usuario;
        this.pista = pista;
        this.fecha_hora = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reservas reservas = (Reservas) o;
        return Objects.equals(pista, reservas.pista) && Objects.equals(fecha_hora, reservas.fecha_hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pista, fecha_hora);
    }
}
