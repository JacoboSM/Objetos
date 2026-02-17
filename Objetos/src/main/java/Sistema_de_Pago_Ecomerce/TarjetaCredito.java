package Sistema_de_Pago_Ecomerce;

import java.util.Scanner;

public class TarjetaCredito extends MetodoPago {

    Scanner read = new Scanner(System.in);
    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito (){

        validarNumeroTarjeta();
        validarTipoTarjeta();

    }

    @Override
    public void procesarPago (){

        System.out.println("Procesando pago de [Importe] € con tarjeta de credito " + tipo );

    }

    public void validarNumeroTarjeta (){

        System.out.println("¿Cual es tu numero de la tarjeta?");
        nro_tarjeta = read.next();

        if ( nro_tarjeta == null || !nro_tarjeta.matches("\\d{16}")){

            System.out.println("El numero de la tarjeta no es valido");
            return;
        }

        this.nro_tarjeta = nro_tarjeta;

    }

    public void validarTipoTarjeta (){

        System.out.println("¿Que tipo de tarjeta tienes?");
        tipo = read.next();

        if (tipo == null || !tipo.matches("(?i)VISA|Mastercard|Maestro")){

            System.out.println("El tipo de la tarjeta no es valido");
            return;

        }

        this.tipo = tipo;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
