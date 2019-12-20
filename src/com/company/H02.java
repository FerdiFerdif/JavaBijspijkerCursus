package com.company;

import java.util.Scanner;

public class H02 {

    public static void main(String[] args) {

        // FERDI VAN DEN BROM
        // H02 ELEMENTAIR PROGRAMMEREN

        Scanner scanner = new Scanner(System.in);

        // OPDRACHT 2.1

       System.out.println("\nOpdracht 2.1\n");
       System.out.print("Aantal mijlen: ");
       double mijl = scanner.nextDouble();
       double km = mijl * 1.6;
       int tussenstap = (int) (km * 10);
       km = tussenstap / 10.0;
       System.out.println(mijl + " mijlen is " + km + " kilometer");


        // OPDRACHT 2.2

        System.out.println("Opdracht 2.2\n");
        System.out.print("Hoeveel jaar oud ben je? ");
        int leeftijdJaren = scanner.nextInt();
        System.out.print("En hoeveel maanden? ");
        int leeftijdMaanden = scanner.nextInt();
        int leeftijdMinuten = leeftijdJaren * 365 * 24 * 60 + leeftijdMaanden * 30 * 24 * 60;
        System.out.println("Je bent ongeveer " + leeftijdMinuten + " minuten oud");

        // OPDRACHT 2.3

        System.out.println("Opdracht 2.3\n");
        System.out.print("Typ het startbedrag: ");
        double startbedrag = scanner.nextDouble();
        System.out.println("Typ het rentepercentage: ");
        double rentepercentage = scanner.nextDouble();
        double rentebedrag = rentepercentage / 100.0 * startbedrag;
        double totaalbedrag = startbedrag + rentebedrag;
        System.out.println("De rente is " + rentebedrag + " en het totaalbedrag is " + totaalbedrag);

        // OPDRACHT 2.4

        System.out.println("Opdracht 2.4\n");
        System.out.print("Typ een getal tussen 10 en 100: ");
        int userInput = scanner.nextInt();
        int buurman1 = userInput - 2;
        int buurman2 = userInput - 1;
        int buurman3 = userInput + 1;
        int buurman4 = userInput + 2;
        System.out.println("De vijf getallen zijn " + buurman1 + " - " + buurman2 + " - " + userInput + " - " + buurman3 + " - " + buurman4);

        // OPDRACHT 2.5

        System.out.println("Opdracht 2.5\n");
        System.out.print("Typ een getal tussen 0 en 1000: ");
        userInput = scanner.nextInt();


        if (userInput >= 100 && userInput < 1000) {
            int lastDigit = userInput % 10;
            userInput = userInput / 10;

            int middleDigit = userInput % 10;
            userInput = userInput / 10;

            int firstDigit = userInput;

            int totaal = firstDigit * middleDigit * lastDigit;

            System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstDigit + " x " + middleDigit + " x " + lastDigit + " = " + totaal);

        } else if (userInput >= 10 && userInput < 100) {
            int lastDigit = userInput % 10;
            userInput = userInput / 10;

            int firstDigit = userInput;

            int totaal = firstDigit * lastDigit;

            System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstDigit + " x " + lastDigit + " = " + totaal);

        } else if (userInput >= 0 && userInput < 10) {
            System.out.println("De vermenigvuldiging van de cijfers luidt: " + userInput + " = " + userInput + "\n\n");

        } else {
            System.out.println("Het getal moet tussen de 0 en 1000 liggen.");
        }

    }
}

