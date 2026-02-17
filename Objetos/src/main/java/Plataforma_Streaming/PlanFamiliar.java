package Plataforma_Streaming;

public class PlanFamiliar extends Suscripcion {

    public PlanFamiliar (String nombrePlan, double precio){

        super(nombrePlan, precio);

    }

    @Override
    public void mostrarInfo(){

        super.mostrarInfo();

    }

    @Override
    public void obtenerBeneficios(){

        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");

    }

    @Override
    public void obtenerPeriodoPrueba(){

        System.out.println("7 dias de prueba para cuentas nuevas");

    }

}
