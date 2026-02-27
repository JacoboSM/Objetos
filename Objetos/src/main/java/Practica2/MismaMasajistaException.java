package Practica2;

public class MismaMasajistaException extends RuntimeException {
    public MismaMasajistaException() {
        super("No puede haber una masajista con los mismo datos que esta");
    }
}
