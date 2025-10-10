package org.entdes.javafx;

public class EstructuraCondicional {
    void main() {
        // Declaracio de variables
        boolean esMati = true;
        String resposta;


        //Mostrem el text dientque estem al mati
        IO.println("Estem al mati");

        //Preguntem-li a l'usuari si estem o no al mati
        resposta = IO.readln("Estem al mati? (S/N)");

        //Modifiquem el valor de Mati depenent de la resposta de l'usuari
        esMati = (resposta == "S");     //Incorrecte perque els objectes no es comparen en doble ==
        esMati = resposta.equals("S");
        esMati = resposta.equalsIgnoreCase("S");

        //No passa dins una estructura condicional IF
        if (esMati) {
            IO.println("Estem al mati");
        }

        if (IO.readln("Estem al mati? (S/N)").equalsIgnoreCase("S")) IO.println("Estem al mati? (S/N)"); {}
    }
}
