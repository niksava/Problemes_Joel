package org.entdes.javafx;

import java.util.Scanner;

public class EscriuArray2 {
    public static void main(String[] args) {
        //Declaracio de variables
        Scanner ent = new Scanner(System.in);
        String[] vector;

        //1. Llegim dimensio de l'array i l'instanciem
        vector = new String[ent.nextInt()];
        ent.nextLine();

        //2. Omplim l'array i el mostrem
        for (int i = 0; i < vector.length; i++) {
            IO.println(vector[i] = ent.nextLine());
        }

        IO.println();

        //3. Llegir la posicio a mostrar i la mostrem
        IO.println(vector[ent.nextInt()]);
    }
}
