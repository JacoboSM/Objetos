package Colecciones.Mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Diccionario {

   private static HashMap<String,String> diccionario;
   private static ArrayList<String> claves_restantes;
   static Random random = new Random();

    public Diccionario() {

        diccionario = new HashMap<>();
        claves_restantes = new ArrayList<>();

    }

    public HashMap<String, String> getDiccionario() {
        return diccionario;
    }

    public static void setDiccionario(HashMap<String, String> diccionario) {
        Diccionario.diccionario = diccionario;
    }

    public static ArrayList<String> getClaves_restantes() {
        return claves_restantes;
    }

    public static void setClaves_restantes(ArrayList<String> claves_restantes) {
        Diccionario.claves_restantes = claves_restantes;
    }

    public void nuevoPar(String espanol, String ingles){

        if (diccionario.containsKey(espanol)) {

            System.out.println("Esa palabra ya esta en el mapa!");

        }else {

            diccionario.put(espanol.toLowerCase(), ingles.toLowerCase());

            System.out.println("Has introducido la palabra en español : " + espanol + " con traduccion " + ingles);

        }

    }

    public String traducir(String espanol){

        if (!diccionario.containsKey(espanol)){

            return diccionario.get(espanol);

        }else {

            return "vacio";

        }

    }

    public String palabraAleatoria(){

        int indice = random.nextInt(claves_restantes.size());

        String palabra_elegida = claves_restantes.get(indice);
        claves_restantes.remove(indice);

        return palabra_elegida;

    }

    public void rellenar_claves_restantes (){

        claves_restantes = new ArrayList<>(diccionario.keySet());

    }

    public Character primeraLetraTraduccion(String espanol){

        return diccionario.get(espanol).charAt(0);

    }



}
