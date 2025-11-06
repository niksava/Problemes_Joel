package org.entdes.javafx;

public class EscriuEnUnArray4vIOMillorat {
    static void main() {

        IO.readln();
        int inc;

        String[] numsSeparats = IO.readln().split(" ");

        //Llegim l'increment a aplicar als elements del vector
        inc = Integer.parseInt(IO.readln());

        //Mostrem els valors de l'array incrementats adequadament
        for (int i = 0; i < numsSeparats.length; i++) {
            IO.print(String.format("%d ", Integer.parseInt(numsSeparats[i])+ inc));
        }
        IO.println();
    }
}
