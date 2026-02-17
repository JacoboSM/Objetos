package Dispositivos_Inteligentes;

public class ParlanteInteligente extends Dispositivo {


    public ParlanteInteligente(String nombre, Boolean encendidoApagado) {

        super(nombre, encendidoApagado);

    }

    @Override
    public void encender() {

        if (super.getEncendido_apagado() == true){

            System.out.println("El parlante ya esta encendido");

        }else {

            System.out.println("Activando parlante con comando de voz...");
            super.setEncendido_apagado(true);

        }

    }


}
