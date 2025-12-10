package org.entdes.javafx;

import java.util.Scanner;

public class CrideuAmbulancia {
    static void main() {
        Scanner ent = new Scanner(System.in);

        while (ent.hasNextInt()) {
            int D = ent.nextInt();
            int S = ent.nextInt();

            int temps = 0;
            int recorregut = 0;

            while (recorregut < D) {
                temps++;
                if (temps % S == 0) {
                    recorregut += temps * 2;
                } else {
                    recorregut += temps;
                }
            }

            System.out.println(temps);
        }
    }
}
