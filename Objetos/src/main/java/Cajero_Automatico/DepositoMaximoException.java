package Cajero_Automatico;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("No puedes hacer un ingreso mayor a 3.000 € ");
    }
}
