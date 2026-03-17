package Colecciones.PistasDeportivas_Patri;

import java.util.*;


public class ReservaApp {

    static HashMap<Usuario, HashSet<Reservas>> mapa = new HashMap<>();
    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        Usuario joaquin =  new Usuario(2,"culo");
        Usuario rita_laCantaora =  new Usuario(1,"joaquin");

        

    }

    public static void eliminar (HashSet<Reservas> listaReservas){

        System.out.println("Que pistas quieres borrar?");
        String pista = read.next();

        Iterator<Reservas> it = listaReservas.iterator();
        while (it.hasNext()){

            Reservas reservas = it.next();

            if (reservas.getPista() instanceof Tenis && pista.equals("tenis")){

                it.remove();

            } else if (reservas.getPista() instanceof Padel && pista.equals("padel")) {

                it.remove();

            }

        }

    }

    public static HashSet<Reservas> DevolverReservasPorUsuario (Usuario usuario){

        return mapa.get(usuario);

    }

    public static void CrearReserva (Usuario usuario, Pista pista){

        Reservas reservas =  new Reservas(usuario,pista);

        HashSet<Reservas> lista = DevolverReservasPorUsuario(usuario);

        if (lista.contains(reservas)){

            throw new ReservaDuplicada_Exception();

        }else {

            lista.add(reservas);

            mapa.put(usuario,lista);


        }

    }

}
