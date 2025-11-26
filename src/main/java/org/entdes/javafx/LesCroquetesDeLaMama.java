package org.entdes.javafx;

import java.util.Scanner;

public class LesCroquetesDeLaMama {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int carn = sc.nextInt();

        int carnDeci = carn * 2;
        int pesNormal = 8; // 4g * 2
        int pesPetita = 5; // 2.5g * 2

        int numNormal = carnDeci / pesNormal;
        int sobranteNormal = carnDeci - (numNormal * pesNormal);

        int numPetita = carnDeci / pesPetita;
        int sobrantePetita = carnDeci - (numPetita * pesPetita);

        String mida;
        int numCroquetes;
        double sobrants;

        if (sobranteNormal <= sobrantePetita) {
            mida = "grans";
            numCroquetes = numNormal;
            sobrants = sobranteNormal / 2.0;
        } else {
            mida = "petites";
            numCroquetes = numPetita;
            sobrants = sobrantePetita / 2.0;
        }

        // Paella
        String paella;
        if (numCroquetes <= 9) paella = "paella petita";
        else if (numCroquetes <= 18) paella = "paella mitjana";
        else if (numCroquetes <= 36) paella = "paella gran";
        else paella = "paella gegant";

        System.out.println(numCroquetes + " croquetes " + mida);
        System.out.println(paella);
        System.out.println(sobrants);

        sc.close();
    }
}