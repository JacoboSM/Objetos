package Dispositivos_Inteligentes;

import java.util.ArrayList;

public class Dispositivos_Inteligentes_APP {

    public static void main(String[] args) {

        ParlanteInteligente altavoz_cuarto = new ParlanteInteligente("parlante1", true);
        Televisor tele_salon =  new Televisor("televisor1", false);
        AireAcondicionado aire_dormitorio =  new AireAcondicionado("aire1", false);

        ArrayList<Dispositivo> lista_dispositivos =  new ArrayList<>();

        lista_dispositivos.add(altavoz_cuarto);
        lista_dispositivos.add(tele_salon);
        lista_dispositivos.add(aire_dormitorio);

        for (Dispositivo dispositivo : lista_dispositivos){

            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){

                ((ControlRemoto) dispositivo).sincronizar();

            }

            dispositivo.mostrarEstado();

            dispositivo.apagar();

        }

        Dispositivo microondas = new Dispositivo("Bosch", true) {
            @Override
            public void encender() {

                System.out.println(getNombre() + " encendido una sola vez");

            }
        };

        microondas.encender();


        Dispositivo Proyector =  new Dispositivo("Optoma", false) {
            @Override
            public void encender() {

                if (getEncendido_apagado() == true){

                    System.out.println("El proyector ya está encendido.");
                }else {

                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    setEncendido_apagado(true);

                }
            }
        };

        Proyector.encender();
        Proyector.encender();

        ControlRemoto Proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {

                System.out.println("Sincronizando proyector con control remoto de presentación...");

            }
        };

        Proyector_sinc.sincronizar();

        Dispositivo horno_ia = new Dispositivo("Horno LG", false) {
            @Override
            public void encender() {

                if (getEncendido_apagado() == true){

                    System.out.println("El horno ya está encendido.");

                }else {

                    System.out.println("Calentando horno con ajuste automático de temperatura...");

                }

            }
        };

        horno_ia.encender();
        horno_ia.encender();

        lista_dispositivos.add(Proyector);
        lista_dispositivos.add(horno_ia);

        for (Dispositivo dispositivo : lista_dispositivos){

            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){

                ((ControlRemoto) dispositivo).sincronizar();

            } else if (dispositivo.getNombre().equals("Optoma")) {

                Proyector_sinc.sincronizar();

            }

            dispositivo.mostrarEstado();

            dispositivo.apagar();

        }

    }




}
