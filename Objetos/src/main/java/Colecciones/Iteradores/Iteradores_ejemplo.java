package Colecciones.Iteradores;

import Colecciones.Tareas_del_Funcionario.Informe;

import java.util.*;

public class Iteradores_ejemplo {

    static void main(String[] args) {

        TreeSet<String> lista = new TreeSet<>();

        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Squirtle");
        lista.add("Bulbasur");
        lista.add("Magikarp");

//        for (String pokemons : lista){
//
//            if (pokemons.equals("Charmander")){
//
//                lista.remove(pokemons);
//
//            }
//
//        }

        Iterator<String> it = lista.iterator();

        while (it.hasNext()){

            String pokemon = it.next();

            if (pokemon.equals("Pikachu")){

                it.remove();

            }

            System.out.println(pokemon);

        }

        System.out.println(lista);

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Nicki Nicole",4);
        mapa.put("Hermion",7);

        Iterator<Map.Entry<String,Integer>> itmapita = mapa.entrySet().iterator();

        while (itmapita.hasNext()){

            Map.Entry<String,Integer> novias = itmapita.next();

            System.out.println(novias.getKey() + " ha durado " + novias.getValue() + " meses con Joaquin");

            if (novias.getKey().equals("Hermion")){

                itmapita.remove();

            }



        }

    }
}
