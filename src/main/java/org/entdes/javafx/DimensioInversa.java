package org.entdes.javafx;

import java.util.Scanner;

public class DimensioInversa {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double numero = ent.nextDouble();
        double inversa = 1 / numero;

        System.out.println(inversa);
    }
}
