package org.entdes.javafx;

import java.util.Scanner;

public class ApostesSenars {
    static void main() {
    Scanner sc = new Scanner(System.in);

        // Llegim el número N
        int N = sc.nextInt();

        // Mostrem tots els números imparells des de 1 fins a N
        for (int i = 1; i <= N; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}
