package org.entdes.javafx;

import java.util.Scanner;

public class JugadorsAmbSort {
    static void main() {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();
        int maxim = Integer.MIN_VALUE;

        if (numCasos == 0) {
            return;
        }

        while (numCasos != 0) {
            if (numCasos > maxim) {
                maxim = numCasos;
            }
            numCasos = ent.nextInt();
        }
        System.out.println(maxim);
    }
}
