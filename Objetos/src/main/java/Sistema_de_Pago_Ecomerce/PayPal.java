package Sistema_de_Pago_Ecomerce;

import java.util.Scanner;

public class PayPal extends MetodoPago {

    Scanner read = new Scanner(System.in);
    private String cuenta;
    private double saldo;

    public PayPal() {
        validarcuenta();
        validarsaldo();

    }

    @Override
    public void procesarPago (){

        System.out.println("Procesando pago de [Importe] € con PayPal");

    }

    public void validarcuenta(){

        System.out.println("¿Escribe tu correo electronico?");
        cuenta = read.next();
        if (cuenta.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+\\.com$")){

            this.cuenta = cuenta;

        }else {

            System.out.println("El correo no cumple el formato");

        }

    }

    public void validarsaldo(){

        System.out.println("Cual es tu saldo?");
        saldo = read.nextDouble(); // mal
        if (saldo > saldo){ // aquí falta cambiar saldo por importe

            this.saldo = saldo;

        } else {

            System.out.println("No tienes suficiente dinero");

        }

    }


    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
