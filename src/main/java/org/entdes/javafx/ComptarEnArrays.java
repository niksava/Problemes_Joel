package org.entdes.javafx;

public class ComptarEnArrays {
    static void main() {

        int numCasos = Integer.parseInt(IO.readln());

        while (numCasos-- > 0) {
            int buscat;
            int comptador = 0;

            IO.readln();

            String[] numsSeparats = IO.readln().split(" ");

            buscat = Integer.parseInt(IO.readln());

            for (int i = 0; i < numsSeparats.length; i++) {
                if (buscat == Integer.parseInt(numsSeparats[i])) comptador++;
            }
            IO.println(comptador);
        }
    }
}
