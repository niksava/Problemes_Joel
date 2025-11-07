package org.entdes.javafx;

public class BloodBorne {
    static void main(){

        int numCasos = Integer.parseInt(IO.readln());

        while (numCasos-- > 0) {
            int buscat;
            boolean trobada = false;

            IO.readln();

            String[] numsSeparats = IO.readln().split(" ");

            for (int i = 0; i < numsSeparats.length-1 && !trobada; i++) {
                trobada = numsSeparats[i].equals(numsSeparats[i+1]);
            }

            IO.println(trobada ? "Si" : "No");
        }
    }
}