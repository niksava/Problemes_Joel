package org.entdes.javafx;

import java.util.Scanner;

public class DarSangreDonaEsperaza {
    static void main() {
        Scanner ent = new Scanner(System.in);

        String donante = ent.nextLine().trim();
        String receptor = ent.nextLine().trim();

        String donanteABO = donante.substring(0, donante.length() - 1); // tot menys Rh
        String receptorABO = receptor.substring(0, receptor.length() - 1);

        char donanteRh = donante.charAt(donante.length() - 1);
        char receptorRh = receptor.charAt(receptor.length() - 1);

        boolean compatible = false;

        if (receptorRh == '+') {
            compatible = true;
        } else {
            compatible = (donanteRh == '-');
        }
        if (compatible) {
            if (donanteABO.equals("O")) {
                compatible = true;
            } else if (donanteABO.equals("A")) {
                compatible = receptorABO.equals("A") || receptorABO.equals("AB");
            } else if (donanteABO.equals("B")) {
                compatible = receptorABO.equals("B") || receptorABO.equals("AB");
            } else if (donanteABO.equals("AB")) {
                compatible = receptorABO.equals("AB");
            }
        }

        System.out.println(compatible ? "SI" : "NO");
    }
}
