package org.entdes.javafx;

import java.util.Scanner;

public class LaviMesGran {
    public static void main() {
        Scanner ent = new Scanner(System.in);

        String avi1 = ent.nextLine();
        int edat1 = ent.nextInt();

        String avi2 = ent.nextLine();
        int edat2 = ent.nextInt();

        if (edat1 > edat2) {
            System.out.println(avi1);
        }  else if (edat2 > edat1) {
            System.out.println(avi2);
        } else {
            System.out.println("Tenen la mateixa edat");
        }
    }
}
