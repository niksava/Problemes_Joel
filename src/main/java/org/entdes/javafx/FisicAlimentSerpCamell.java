package org.entdes.javafx;

public class FisicAlimentSerpCamell {
    static void main() {

        int numCasos;

        numCasos=Integer.parseInt(IO.readln());

        while (numCasos > 0){
            String notacio=IO.readln();
            String text=IO.readln().toLowerCase();          //passem el text a minuscules
            String resultat="";

            switch (notacio) {
                case "P":
                    int index=0, indexIni=0, compt=0;

                    do{
                        int trobat = text.indexOf(' ',index);
                        if(compt==-1){
                            if (compt==0) resultat = text.substring(indexIni,indexIni+1).toUpperCase() + text.substring(indexIni+1);
                            else resultat = resultat + text.substring(indexIni,indexIni+1).toUpperCase() + text.substring(indexIni+1);
                            //IO.println(text.substring(indexIni,text.length()));
                            compt++;
                            break;
                        }
                        String paraula=text.substring(indexIni,indexIni+1).toUpperCase() + text.substring(indexIni+1,trobat);
                        if (!paraula.isBlank()) {
                            if (compt == 0) resultat = paraula;
                            else resultat = resultat + "-" + paraula;
                            compt++;
                        }
                        indexIni=trobat+1;
                        index = trobat+1;
                    }while (true);

                    break;
                case "K":
                    index=0;
                    indexIni=0;
                    compt=0;
                    do{
                        int trobat = text.indexOf(' ',index);
                        if(compt==-1){
                            if (compt==0) resultat=text.substring(indexIni+1);
                            else resultat=resultat+"-"+text.substring(indexIni);
                            //IO.println(text.substring(indexIni,text.length()));
                            break;
                        }
                        String paraula=text.substring(indexIni,trobat);
                        if (!paraula.isBlank()) {
                            if (compt == 0) resultat = paraula;
                            else resultat = resultat + "-" + paraula;
                            compt++;
                        }

                        indexIni=trobat+1;
                        index = trobat+1;
                    }while (true);

                    break;
                case "S":
                    index=0;
                    indexIni=0;
                    compt=0;
                    do{
                        int trobat = text.indexOf(' ',index);
                        if(compt==-1){
                            if (compt==0) resultat=text.substring(indexIni+1);
                            else resultat=resultat+"_"+text.substring(indexIni);
                            //IO.println(text.substring(indexIni,text.length()));
                            break;
                        }
                        String paraula=text.substring(indexIni,trobat);
                        if (!paraula.isBlank()) {
                            if (compt == 0) resultat = paraula;
                            else resultat = resultat + "_" + paraula;
                            compt++;
                        }
                        indexIni=trobat+1;

                        index = trobat+1;
                    }while (true);
                    break;
                case "C":

                    index=0;
                    indexIni=0;
                    compt=0;

                    do{
                        int trobat = text.indexOf(' ',index);
                        if(compt==-1){
                            if (compt==0) resultat = text.substring(indexIni);
                            else resultat = resultat + text.substring(indexIni,indexIni+1).toUpperCase() + text.substring(indexIni+1);
                            //IO.println(text.substring(indexIni,text.length()));
                            compt++;
                            break;
                        }
                        String paraula;

                        if (compt==0) paraula=text.substring(indexIni+1,trobat);
                        else paraula = text.substring(indexIni, indexIni+1).toUpperCase() + text.substring(indexIni+1, trobat);
                        if (!paraula.isBlank()) {
                            if (compt == 0) resultat = paraula;
                            else resultat = resultat + "-" + paraula;
                            compt++;
                        }
                        indexIni=trobat+1;
                        index = trobat+1;
                    }while (true);

                    break;
            }

            IO.println(resultat);

            numCasos--;
        }
    }
}
