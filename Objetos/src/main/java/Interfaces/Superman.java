package Interfaces;

public class Superman extends SuperHeroe implements volador, Ataques {

    @Override
    public void volar(){

        System.out.println("Volando por la ciudad vigilando a los malos!");

    }

    @Override
    public void rayoLaser() {

        System.out.println("Disparando rayos");

    }

    @Override
    public void alientoHelado() {

        System.out.println("Congelando a gente");

    }
}
