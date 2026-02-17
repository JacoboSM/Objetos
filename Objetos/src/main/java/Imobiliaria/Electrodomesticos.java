package Imobiliaria;

public class Electrodomesticos {

    private String nombre;
    private double consumo;

    public Electrodomesticos (String nombre, double consumo){

        this.nombre = nombre;
        this.consumo = consumo;

    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "nombre='" + nombre + '\'' +
                ", consumo=" + consumo +
                '}';
    }

}
