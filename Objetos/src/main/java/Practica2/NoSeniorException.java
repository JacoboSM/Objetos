package Practica2;

public class NoSeniorException extends RuntimeException {
    public NoSeniorException() {
        super("Un jugador no puede tener acompañante a menos que sea SENIOR");
    }
}
