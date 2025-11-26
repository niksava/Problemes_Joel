package org.entdes.javafx;

import java.util.Scanner;

public class MatriuIdentitat {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int n = ent.nextInt();
        int[][] matriu = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriu[i][j] += 1;
                } else {
                    matriu[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matriu[i][j]);
            }
        }
        System.out.println();

    }
}