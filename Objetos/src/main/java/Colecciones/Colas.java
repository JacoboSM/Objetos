package Colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Colas {

    static void main(String[] args) {

        Deque<String> cola =  new LinkedList<>();

        cola.poll(); // Esto si que lo podemos hacer en el caso de las colas

        cola.offer("Blessd");
        cola.offer("Yatra");
        cola.offer("Morat");

        cola.poll();

        System.out.println(cola.peek());

        cola.offerFirst("Cali y el Dandee");
        System.out.println(cola.peek());
        System.out.println(cola.pollLast());

        Queue<String> cola2 = new ArrayBlockingQueue<>(2);

        cola2.offer("Juan");
        cola2.offer("Jorge");
        cola2.offer("Adrian");

        System.out.println(cola2);



    }

}
