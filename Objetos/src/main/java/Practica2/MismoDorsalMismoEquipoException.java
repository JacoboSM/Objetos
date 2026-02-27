package Practica2;

public class MismoDorsalMismoEquipoException extends RuntimeException {
    public MismoDorsalMismoEquipoException() {
        super("Ya hay un jugador con ese dorsal en ese equipo.");
    }
}
