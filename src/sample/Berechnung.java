package sample;

import java.util.Scanner;

public class Berechnung {
    String funktion1 ,funktion2, funktion3, funktion4, auswahl;
    double f1,f2,f3,f4;
    int moeglicheAntworten, richtige, gesammtPunktzahl,auswahlZahl;
    boolean loop = true;
    Scanner scan = new Scanner(System.in);
    public void berechne(){
        //abfrage und zuweisen der festen daten zur berrechnung der puntzahl.

        do {
            System.out.println("welche punkte wertigkeit hat die funktion 1?");
            f1 = scan.nextDouble();
            if(f1 > 0){
                System.out.println(" ist der wert " + f1 + "? ja oder nein" );
                auswahl = scan.next();

            }
            switch (auswahl) {
                case "ja":
                    loop = false;
                    break;
                case "nein":
                    loop = true;
                    break;
            }
        }while(loop == true);
        //System.out.println("schleife beendet");

        do {
            System.out.println("welche punkte wertigkeit hat die funktion 2?");
            f2 = scan.nextDouble();
            if(f2 > 0){
                System.out.println(" ist der wert " + f2 + "? ja oder nein");
                auswahl = scan.next();

            }
            switch (auswahl) {
                case "ja":
                    loop = false;
                    break;
                case "nein":
                    loop = true;
                    break;
            }
        }while(loop == true);
        //System.out.println("schleife beendet");

        do {
            System.out.println("welche punkte wertigkeit hat die funktion 3?");
            f3 = scan.nextDouble();
            if(f3 > 0){
                System.out.println(" ist der wert " + f3 + "? ja oder nein");
                auswahl = scan.next();

            }
            switch (auswahl) {
                case "ja":
                    loop = false;
                    break;
                case "nein":
                    loop = true;
                    break;
            }
        }while(loop == true);
        //System.out.println("schleife beendet");

        do {
            System.out.println("welche punkte wertigkeit hat die funktion 4?");
            f4 = scan.nextDouble();
            if(f4 > 0){
                System.out.println(" ist der wert " + f4 + "? ja oder nein");
                auswahl = scan.next();

            }
            switch (auswahl) {
                case "ja":
                    loop = false;
                    break;
                case "nein":
                    loop = true;
                    break;
            }
        }while(loop == true);
        //System.out.println("schleife beendet");

        System.out.println("die funktionen haben die wertigkeiten\n Funktion1: " + f1 + "\n Funktion2: " + f2 + "\n Funktion3: " +f3 + "\n Funktion4: " + f4 );
        //_____________________________________________________________________
        loop = true;
        do {
        System.out.println("Welche punkte aus den funktionen möchtest du berechnen?");
        auswahlZahl = scan.nextInt();

            switch (auswahlZahl) {
                case 1:
                    System.out.println("Funktion1 wurde ausgewählt!\n wie viele antwortmöglichkeiten gibt es ? \n");
                    moeglicheAntworten = scan.nextInt();
                    System.out.println("wie viele davon sind richtig?");
                    richtige = scan.nextInt();
                    gesammtPunktzahl += (f1/moeglicheAntworten) * richtige;
                    System.out.println("Gesamtpunktzahl:" + gesammtPunktzahl);
                    break;
                case 2:
                    System.out.println("Funktion2 wurde ausgewählt!\n wie viele antwortmöglichkeiten gibt es ? \n");
                    moeglicheAntworten = scan.nextInt();
                    System.out.println("wie viele davon sind richtig?");
                    richtige = scan.nextInt();
                    gesammtPunktzahl += (f2/moeglicheAntworten) * richtige;
                    System.out.println("Gesamtpunktzahl:" + gesammtPunktzahl);
                    break;
                case 3:
                    System.out.println("Funktion3 wurde ausgewählt!\n wie viele antwortmöglichkeiten gibt es ? \n");
                    moeglicheAntworten = scan.nextInt();
                    System.out.println("wie viele davon sind richtig?");
                    richtige = scan.nextInt();
                    gesammtPunktzahl += (f3/moeglicheAntworten) * richtige;
                    System.out.println("Gesamtpunktzahl:" + gesammtPunktzahl);
                    break;
                case 4:
                    System.out.println("Funktion4 wurde ausgewählt!\n wie viele antwortmöglichkeiten gibt es ? \n");
                    moeglicheAntworten = scan.nextInt();
                    System.out.println("wie viele davon sind richtig?");
                    richtige = scan.nextInt();
                    gesammtPunktzahl += (f4/moeglicheAntworten) * richtige;
                    System.out.println("Gesamtpunktzahl:" + gesammtPunktzahl);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + auswahlZahl + "wurde eingegeben, erwartet wird eine zahl von 1 - 4!");
            }
            System.out.println("bist du fertig?");
            auswahl = scan.next();
            switch (auswahl) {
                case "ja":
                    loop = false;
                    System.out.println("Du hast " +gesammtPunktzahl + " Punkte erreicht!");
                    break;
                case "nein":
                    loop = true;
                    break;
            }
        }while(loop == true);
    }

}
