package org.entdes.javafx;

import java.util.Scanner;

public class EscriuArray1 {
    public static void main(String[] args) {
        //Declaracio de variables
        Scanner ent = new Scanner(System.in);
        int[] vector;
        int dim, pos;

        //1. Llegim dimensio de l'array i l'instanciem
        dim = ent.nextInt();
        vector = new int[dim];

        //2. Omplim l'array i el mostrem
        for (int i = 0; i < vector.length; i++) {
            IO.println(String.format("%d", vector[i] = ent.nextInt()));
        }

        IO.println();

        //3. Llegir la posicio a mostrar i la mostrem
        pos = ent.nextInt();
        IO.println(vector[pos]);
    }
}
