package org.entdes.javafx;

import java.util.Scanner;

public class DarSangreDonaEsperaza {
    static void main() {
        Scanner ent = new Scanner(System.in);

        String donante = ent.nextLine().trim();
        String receptor = ent.nextLine().trim();

        String donantABO = donante.substring(0, donante.length() - 1);
        String receptorABO = receptor.substring(0, receptor.length() - 1);

        char donantRh = donante.charAt(donante.length() - 1);
        char receptorRh = receptor.charAt(receptor.length() - 1);

        boolean compatible = false;

        if (receptorRh == '+') {
            compatible = true;
        }else{
            compatible = (donantRh == '-');
        }
        if (compatible) {
            if (donantABO.equals("O")) {
                compatible = true;
            }else if (donantABO.equals("A")){
                compatible = receptorABO.equals("A") || receptorABO.equals("AB");
            }else if (donantABO.equals("B")){
                compatible = receptorABO.equals("B") || receptorABO.equals("AB");
            }else if (donantABO.equals("AB")){
                compatible = receptorABO.equals("AB");
            }
        }

        if (compatible) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}
