package org.entdes.javafx;

import java.util.Scanner;

public class Bloodborne {
    static void main() {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();

        while (numCasos-- > 0){
            String paraula = ent.skip("[\r\n]*").nextLine();
            boolean trobat = false;
            for (int i = 0; i + 1 < paraula.length(); i++){
                if (paraula.charAt(i)==paraula.charAt(i+1)) trobat=true;
            }
            System.out.println(trobat?"SI":"NO");

        }
    }
}
