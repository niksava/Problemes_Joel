package org.entdes.javafx;

import java.util.Scanner;

public class YoSiPudieraVotabaFalange {

    static void main() {

        int a1,b1,c1,a2,b2,c2;
        int suma;

        Scanner ent = new Scanner(System.in);

        a1=ent.nextInt();
        b1=ent.nextInt();
        c1=ent.nextInt();
        a2=ent.nextInt();
        b2=ent.nextInt();
        c2=ent.nextInt();

        if(a1+1==a2 && b1==b2 && c1==c2) IO.println("A");
        else if(a1==a2 && b1+1==b2 && c1==c2) IO.println("B");
        else if(a1==a2 && b1==b2 && c1+1==c2) IO.println("C");
        else if(a1==a2 && b1==b2 && c1==c2) IO.println("BLANC");
        else IO.println("NUL");

        /*
        suma=(a1-a2)+(b1-b2)+(c1-c2);

        switch (suma) {
            case 0:
                IO.println("BLANC");
                break;
            case 1:
                if (a1+1==a2) System.out.println("A");
                else if (b1+1==b2) System.out.println("B");
                else IO.println("C");
                break;
            default:
                IO.println("NUL");
        }*/
        ent.close();
    }
}
