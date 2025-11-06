package org.entdes.javafx;

import java.util.Scanner;

public class Abecegrama {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();
        String  lletres = "abcdefghijklmnñopqrstuvwxyz";
        int index =0;
        boolean esAbecegrama = false;

        numCasos=Integer.parseInt(ent.next());

        while (numCasos > 0){

            String paraula = IO.readln();

            esAbecegrama = esAbecegrama && paraula.charAt(0)==lletres.charAt(index);
            index++;
            if(index==28) index=0;

            numCasos--;
        }

        IO.println(esAbecegrama?"SI":"NO");

    }
}
