package org.entdes.javafx;

import java.util.Scanner;

public class LasViasDelTren {
    static void main() {
        Scanner ent = new Scanner(System.in);
        long cruces = ent.nextLong();
        long desvios = ent.nextLong();
        System.out.println((desvios % 2 == 0) ? "SI" : "NO");

    }
}
