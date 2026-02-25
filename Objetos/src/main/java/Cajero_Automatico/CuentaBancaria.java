package Cajero_Automatico;

import java.util.Scanner;

public class CuentaBancaria {

    double cantidad = 0;
    Scanner read = new Scanner(System.in);

    private double saldo;


    public CuentaBancaria (double saldo){

        this.saldo = saldo;

    }

    public void ingresarDinero (){

        System.out.println("Introduce el importe a ingresar");
        cantidad = read.nextDouble();
        validarDatos();

        if (cantidad > 3000){

            throw new DepositoMaximoException();

        } else {

            saldo = saldo + cantidad;

        }

    }

    public void sacarDinero (){

        System.out.println("Introduce el importe a retirar");
        cantidad = read.nextDouble();
        validarDatos();

        if (cantidad > saldo){

            throw new SaldoInsuficienteException();


        }else {

            saldo = saldo - cantidad;

        }

    }

    public void mostrarSaldo (){

        System.out.println("Saldo Disponible : " + saldo + " €");

    }

    public boolean validarDatos (){ // me valida que sea mayor a 0 y que no me metan letras

        if (String.valueOf(cantidad).matches("^[0-9]{1,6}(\\.[0-9]{1,2})?$")){



        }

    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
