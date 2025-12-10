package org.entdes.javafx;

import java.util.Scanner;

public class TaulaBlackJack {
    static void main() {
        Scanner ent = new Scanner(System.in);

        int min = ent.nextInt();
        int max = ent.nextInt();

        while (min <= max) {
            System.out.println(min++);
        }

    }
}
