package org.entdes.javafx;

import java.util.Scanner;

public class HolaUser {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String Nombre = ent.nextLine();

        System.out.println("Hola, "+Nombre);
    }
}
