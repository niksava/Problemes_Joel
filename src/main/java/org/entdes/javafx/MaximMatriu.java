package org.entdes.javafx;

import java.util.Scanner;

import static java.lang.System.in;

public class MaximMatriu {
    static void main() {
        Scanner ent = new Scanner(System.in);
        int numCasos;
        int[][] matriu;
        int iMax, jMax,         //guardem les cordenades de la casella que conte el maxim
                maxim;          //valor del maxim trobat

        //1. Llegim el numero de casos
        numCasos = ent.nextInt();

        while (numCasos--> 0) {
            //tractament de cada cas
            matriu=new int[ent.nextInt()][ent.nextInt()];
            maxim= Integer.MIN_VALUE;
            iMax= jMax = 0;

            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    matriu[i][j]=ent.nextInt();
                    if (matriu[i][j]>=maxim) {
                        maxim=matriu[i][j];
                        iMax=i;
                        jMax=j;
                    }
                }
            }
            //Mostro el resultat demanat
            System.out.format("%d %d%n", iMax+1, jMax+1);

        }

        //tanco el scaner
        ent.close();
    }
}
