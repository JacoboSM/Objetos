package Sistema_de_Pago_Ecomerce;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago {

    final int MAX = 999999;
    final int MIN = 100000;
    Scanner read = new Scanner(System.in);
    Random random = new Random();
    private String telefono;
    private int pin;

    public Bizum(){

        //constructor

    }

    @Override
    public void procesarPago (){

        System.out.println("Procesando pago de [Importe] € con Bizum");

    }

    public void validarTelefono (){

        if (telefono != null && telefono.matches("\\d{9}")){

            this.telefono = telefono;

        }else {

            System.out.println("Lo que has introducido no cumple el formato requerido");

        }

    }

    public void validarPin (){

        pin = random.nextInt(MAX - MIN + 1) + MIN;
        System.out.println("Tu pin es : " + pin);
        System.out.println("Cual es tu pin?");
        int auxPin = read.nextInt();

        if (pin != auxPin){

            System.out.println("El pin introducido no es correcto");

        }

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }
}
