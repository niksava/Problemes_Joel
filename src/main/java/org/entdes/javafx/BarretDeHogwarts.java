package org.entdes.javafx;

import java.util.Scanner;

public class BarretDeHogwarts {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String nom = ent.nextLine();

        switch (nom) {
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
                default:
                    System.out.println("Hufflepuff");
                    break;
        }
    }
}
