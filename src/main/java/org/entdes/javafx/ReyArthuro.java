package org.entdes.javafx;

import java.util.Scanner;

public class ReyArthuro {
    static void main() {
        Scanner ent = new Scanner(System.in);

        double diametro = ent.nextDouble();
        double espacio = ent.nextDouble();
        int caballeros = ent.nextInt();

        double perimetro = Math.PI * diametro;
        double espacioTotal = espacio * caballeros;

        if (perimetro >= espacioTotal) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}