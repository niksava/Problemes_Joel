package org.entdes.javafx;

import java.util.Scanner;

public class FiscAlimentSerpCamell {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();

        while (casos --> 0) {
            // Introduir lletra per a la notació
            char lletra=ent.skip("[\n\r]*").nextLine().charAt(0);
            // Introduir frase
            String[] paraules=ent.skip("[\n\r]*").nextLine().split(" ");
            String resultat="";

            // Casos de les lletres
            switch (lletra) {
                case 'P':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat+=paraules[i].toUpperCase().charAt(0)+paraules[i].toLowerCase().substring(1);
                    };
                    break;
                case 'K':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat+=paraules[i].toLowerCase();
                        if (i != paraules.length-1) resultat+='-';
                    };
                    break;
                case 'S':
                    for (int i = 0; i < paraules.length; i++) {
                        resultat+=paraules[i].toLowerCase();
                        if (i != paraules.length-1) resultat+='_';
                    };
                    break;
                case 'C':
                    for (int i = 0; i < paraules.length; i++) {
                        if (i == 0) resultat+=paraules[i].toLowerCase();
                        else resultat+=paraules[i].toUpperCase().charAt(0)+paraules[i].toLowerCase().substring(1);
                    };
                    break;
            }
            System.out.println(resultat);
        }
    }
}
