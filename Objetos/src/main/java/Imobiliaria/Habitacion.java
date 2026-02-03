package Imobiliaria;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros;
    private ArrayList<Electrodomesticos> listaElectrodomesticos;

    public  Habitacion (String nombre, double metros){

        this.nombre = nombre;
        this.metros = metros;
        listaElectrodomesticos = new ArrayList<>();

    }

    public void agregarElectrodomestico(String nombre, double consumo){

        Electrodomesticos electrodomesticos = new Electrodomesticos(nombre, consumo);

        listaElectrodomesticos.add(electrodomesticos);

        System.out.println("La habitación " + nombre + " ha sido creada!");

    }

    public ArrayList<Electrodomesticos> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<Electrodomesticos> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }

}
