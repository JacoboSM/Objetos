package Practica2;

public class APPMutxamelFC {

    public static void main(String[] args) {

        Jugador pepe = new Jugador("pepe", 23, 33, Equipos.SENIOR, Posiciones.PORTERO);
        Jugador lucas = new Jugador("lucas", 29, 87, Equipos.SENIOR, Posiciones.DELANTERO);
        Jugador alberto = new Jugador("alberto", 49, 11, Equipos.SENIOR, Posiciones.CENTROCAMPISTA);
        Jugador mario = new Jugador("mario", 32, 53, Equipos.SENIOR, Posiciones.DEFENSA);

        Entrenador senior = new Entrenador("David", 33,"4-3-3",Equipos.SENIOR);

        Masajista jorge = new Masajista("jorge",24,"Mamporrero",23);
        Masajista joaquin = new Masajista("jaquin",18,"Fisioterapeuta",17);

        Acompañante cristian = new Acompañante("cristian",24, pepe, "Padre");
        Acompañante pablo = new Acompañante("pablo", 34, lucas, "Madre");

        System.out.println(" ");

        System.out.println("Concentración : ");
        System.out.println(" ");

        pepe.concentrarse();
        senior.concentrarse();
        jorge.concentrarse();
        cristian.concentrarse();

        System.out.println(" ");
        System.out.println("Entrenar :");
        System.out.println(" ");

        senior.entrenar();
        alberto.entrenar();

        System.out.println(" ");
        System.out.println("Masajeando : ");
        System.out.println(" ");

        joaquin.darMasaje(mario);

        System.out.println(" ");
        System.out.println("Viajando : ");
        System.out.println(" ");

        mario.viajar("Madrid");
        senior.viajar("Madrid");
        jorge.viajar("Madrid");
        pablo.viajar("Madrid");

        System.out.println(" ");
        System.out.println("Planificando entrenamiento : ");
        System.out.println(" ");

        senior.planificarEntrenamiento();

        System.out.println(" ");
        System.out.println(" Descansnado :");
        System.out.println(" ");

        mario.descansar();

        System.out.println(" ");
        System.out.println("Calentando ");
        System.out.println(" ");

        mario.calentar();

        System.out.println(" ");
        System.out.println("Jugando partidos : ");
        System.out.println(" ");

        senior.jugarPartido("Real Madrid");
        pepe.jugarPartido("Barcelona");

        System.out.println(" ");
        System.out.println("Animando al equipo : ");
        System.out.println(" ");

        cristian.animarEquipo();

        System.out.println(" ");
        System.out.println("Haciendo cambios : ");
        System.out.println(" ");

        senior.hacerCambios();

        System.out.println(" ");
        System.out.println("Marcando goles : ");
        System.out.println(" ");

        pepe.marcarGol();
        mario.marcarGol();

        System.out.println(" ");
        System.out.println("Celebrando goles : ");
        System.out.println(" ");

        pepe.celebrarGol();
        joaquin.celebrarGol();
        pablo.celebrarGol();
        senior.celebrarGol();

        System.out.println(" ");
        System.out.println("Dando masajes : ");
        System.out.println(" ");

        joaquin.darMasaje(pepe);
        joaquin.darMasaje(mario);
        joaquin.darMasaje(alberto);

        System.out.println(" ");
        System.out.println("Viajando : ");
        System.out.println(" ");

        pepe.viajar("Mutxamel");
        senior.viajar("Mutxamel");
        joaquin.viajar("Mutxamel");
        pablo.viajar("Mutxamel");

        System.out.println(" ");
        System.out.println("Descansando : ");
        System.out.println(" ");

        pepe.descansar();
        mario.descansar();

    }

}
