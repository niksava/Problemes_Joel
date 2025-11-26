package org.entdes.javafx;

import java.util.Scanner;

public class RobosEnLaCantina {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int N = ent.nextInt();
        long est = 0;
        long pro = 0;
        long vis = 0;

        for (int i = 0; i < N; i++) {
            String A = ent.next();
            String B = ent.next();
            long C = ent.nextLong();

            switch (A) {
                case "EST":
                    if (B.equals("IN")) est += C;
                    else est -= C;
                    break;
                case "PRO":
                    if (B.equals("IN")) pro += C;
                    else pro -= C;
                    break;
                case "VIS":
                    if (B.equals("IN")) vis += C;
                    else vis -= C;
                    break;
            }
        }
        long estPermitidos = pro * 5;
        long visPermitidos = pro * 1;
        long estSospechosos = Math.max(0, est - estPermitidos);
        long visSospechosos = Math.max(0, vis - visPermitidos);
        long totalSospechosos = estSospechosos + visSospechosos;
        if (totalSospechosos == 0) {
            System.out.println("OK");
        } else {
            System.out.println("ALARMA " + totalSospechosos);
        }
    }
}