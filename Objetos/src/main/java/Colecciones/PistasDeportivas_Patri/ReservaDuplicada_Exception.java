package Colecciones.PistasDeportivas_Patri;

public class ReservaDuplicada_Exception extends RuntimeException {
    public ReservaDuplicada_Exception() {
        super("Esa ya esta reservada");
    }
}
