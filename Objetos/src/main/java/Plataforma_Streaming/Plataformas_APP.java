package Plataforma_Streaming;

import java.util.ArrayList;

public class Plataformas_APP {

    public static void main (String[] args){

        ArrayList<Suscripcion> listaPlanes =  new ArrayList<>();

        Suscripcion gratuito = new PlanGratis("Gratis", 0);

        Suscripcion basico =  new PlanBasico("Basico", 9.99);

        Suscripcion premium = new PlanPremium("Premium", 14.99);

        Suscripcion familiar = new PlanFamiliar("Familiar", 19.99);

        listaPlanes.add(gratuito);
        listaPlanes.add(basico);
        listaPlanes.add(premium);
        listaPlanes.add(familiar);

        for (Suscripcion suscripcion : listaPlanes){

            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();

        }

    }

}
