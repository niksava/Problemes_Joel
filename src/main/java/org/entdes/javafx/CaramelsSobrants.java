package org.entdes.javafx;

import java.util.Scanner;

public class CaramelsSobrants {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int valor1 = ent.nextInt();
        int valor2 = ent.nextInt();

        System.out.println(valor1%valor2);

        ent.close();
    }
}
