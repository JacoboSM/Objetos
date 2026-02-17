package Dispositivos_Inteligentes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Dispositivo {

    private String nombre;
    private Boolean encendido_apagado;

    public Dispositivo(String nombre, Boolean encendidoApagado) {
        this.nombre =  nombre;
        this.encendido_apagado = encendidoApagado;

    }

    public abstract void encender();

    public void apagar(){

        if (encendido_apagado == false){

            System.out.println(nombre + " ya esta apagado");

        }else {

            encendido_apagado =  false;
            System.out.println(nombre + " apagado");

        }

    }

    public void mostrarEstado(){

        System.out.println(nombre + " " + encendido_apagado);

    }

}
