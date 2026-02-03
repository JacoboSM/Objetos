package org.example;

public class TelevisorAPP {

    public static void main(String[] args){

        Televisor lg = new Televisor(3,5  );

        lg.subircanal();
        lg.subircanal();
        lg.subircanal();
        lg.bajarvolumen();
        lg.bajarvolumen();
        lg.bajarcanal();
        lg.subircanal();

        System.out.println(lg.getCanal() + " " + lg.getVolumen());

        Televisor vacio = new Televisor();

        System.out.println(vacio.getCanal() + " " + vacio.getVolumen());

    }

}
