package Dispositivos_Inteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{


    public AireAcondicionado(String nombre, Boolean encendidoApagado) {

        super(nombre, encendidoApagado);

    }

    @Override
    public void sincronizar() {

        System.out.println("Sincronizando aire acondicionado con control remoto");

    }

    @Override
    public void encender() {

        if (super.getEncendido_apagado() == true){

            System.out.println("El aire acondicionado ya esta encendido");

        }else {

            System.out.println("Encendiendo aire acondicionado...");
            super.setEncendido_apagado(true);

        }

    }
}
