package Entornos;

import java.util.Scanner;

public class Clean_code {

    static int z = 10;

    public static void main(String[] args) {

        // 1 - Legible antes que conciso, en este caso las variables pueden ser cualquier cosa en el sentido de que no sabemos por el nombre a que forman parte
        // 2 - YAGNI (elimina lo inecesario), el metodo p no se utiliza
        // 3 - Cometarios pertinentes, siempre que hagamos un codigo es importante comentar el codigo con pequeñas explicaciones o recordatorios en caso de que
        // volvamos al codigo en un futuro o se lo pasemos a otra persona
        // 4 - No tiene tests

        Scanner s = new Scanner(System.in);

        System.out.println("mete un numero");
        int n = s.nextInt();

        cosa c = new cosa(n, z);

        int r = c.h();

        if (r > 50) {
            System.out.println("grande");
        } else {
            System.out.println("pequeño");
        }

        System.out.println(r);

        for (int i = 0; i < 3; i++) {
            System.out.println(c.h());
        }

        s.close();
    }
}

class cosa {

    int a;
    int b;

    public cosa(int x, int y) {
        a = x;
        b = y;
    }

    public int h() {
        int r = 0;
        for (int i = 0; i < a; i++) {
            r = r + b;
        }
        return r;
    }

    public void p() {
        System.out.println(a + " " + b);
    }
}