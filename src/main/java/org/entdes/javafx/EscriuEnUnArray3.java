package org.entdes.javafx;

import java.util.Arrays;

public class EscriuEnUnArray3 {
    static void main() {
        //1. Llegim la llinia inicial i en l'esplit ho guardem a una vector d'Strings
        String[] linia=IO.readln().split(" ");
        String[] liniaCurta=new String[linia.length-1];

        IO.println("[");
        for (int i = 0; i < liniaCurta.length; i++) {
            liniaCurta[i]=linia[i];
            IO.println(liniaCurta[i]);
            if (i!=liniaCurta.length-1) IO.println(", ");
        }
        IO.println("]");

        //2. Mostrem el vector de la forma demanada [ vector ]

       // IO.println(Arrays.toString(liniaCurta));

        //3.Llegim la posicio i la mostrem
        IO.println(liniaCurta[Integer.parseInt(IO.readln())]);
    }
}
