package org.entdes.javafx;

import java.util.Scanner;

public class ComptadorDeFitxers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max = 1;

        while (max <= num) {
            System.out.println(max++);
        }

    }
}
