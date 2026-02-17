package Plataforma_Streaming;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion (String nombrePlan, double precio){

        this.nombrePlan = nombrePlan;
        this.precio = precio;

    }

    public void mostrarInfo(){

        System.out.println("El plan que has elegido es " + nombrePlan + " y su precio es " + precio);

    }

    public abstract void obtenerBeneficios();

    public abstract void obtenerPeriodoPrueba();

    @Override
    public String toString() {
        return "Suscripcion{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }

}
