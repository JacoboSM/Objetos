package Colecciones.Tareas_del_Funcionario;

import java.util.HashSet;
import java.util.Set;

public class FuncionarioApp {

    static void main() {

        int contador = 1;
        String comprobar_iguales = "";
        Set<String> listaNoRepetidos = new HashSet<>();

        System.out.println();

        Informe pepe = new Informe(2134,Descripcion_tipo.ADMINISTRATIVO);
        Informe palo = new Informe(3333,Descripcion_tipo.EMPRESARIAL);
        Informe pipa = new Informe(6453,Descripcion_tipo.PERSONAL);
        Informe polo = new Informe(8983,Descripcion_tipo.ADMINISTRATIVO);
        Informe paleta = new Informe(3532,Descripcion_tipo.PERSONAL);

        System.out.println();


        while (!Informe.getListaInformes().isEmpty()){

            System.out.println(Informe.getListaInformes().pop());

        }

        System.out.println();

        Informe david = new Informe(4444, Descripcion_tipo.ADMINISTRATIVO);
        Informe joaquin = new Informe(5555,Descripcion_tipo.EMPRESARIAL);
        Informe iris = new Informe(6666,Descripcion_tipo.PERSONAL);

        System.out.println();

        for (int i = Informe.getListaInformes().size() - 1; i >= 0 ; i--) {

            System.out.println("Numero " + contador + " en salir : " + Informe.getListaInformes().get(i));

            contador++;
        }

        new Informe(4444, Descripcion_tipo.ADMINISTRATIVO);
        new Informe(5555, Descripcion_tipo.EMPRESARIAL);
        new Informe(6767,Descripcion_tipo.PERSONAL);
        System.out.println();

        for (Informe informe : Informe.getListaInformes()){

            comprobar_iguales = informe.getCodigo() + "-" + informe.getDescripcion();

            listaNoRepetidos.add(comprobar_iguales);

        }

        System.out.println();

        System.out.println("Hay por hacer " + listaNoRepetidos.size() + " informes diferentes");

    }

}
