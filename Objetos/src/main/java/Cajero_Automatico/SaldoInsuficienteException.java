package Cajero_Automatico;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("No puedes retirar esa cantidad, saldo insuficiente!");
    }
}
