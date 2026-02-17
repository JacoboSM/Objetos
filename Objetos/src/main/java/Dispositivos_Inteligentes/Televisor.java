package Dispositivos_Inteligentes;

public class Televisor extends Dispositivo implements ControlRemoto {

    public Televisor (String nombre, Boolean encendido_apagado){

        super(nombre,encendido_apagado);

    }

    @Override
    public void sincronizar() {

        System.out.println("Sincronizando televisor con control remoto");

    }

    @Override
    public void encender() {

        if (super.getEncendido_apagado() == true){

            System.out.println("El televisor ya esta encendido");

        }else {

            System.out.println("Encendiendo televisor");
            super.setEncendido_apagado(true) ;

        }

    }


}
