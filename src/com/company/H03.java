package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class H03 {

    public static void main(String[] args) {

        // FERDI VAN DEN BROM
        // H03 SELECTIONS

        // OPDRACHT 3.1

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nOpdracht 3.1\n");
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 + " + " + random2 + " ? ");
        int userInput = scanner.nextInt();
        int uitkomst = random1 + random2;
        if (userInput == uitkomst) {
            System.out.println("Klopt.");
        } else {
            System.out.println("Helaas, het juiste antwoord was " + uitkomst +".");
        }

        // OPDRACHT 3.2

        System.out.println("Opdracht 3.2\n");
        random1 = (int) (Math.random() * 10 + 1);
        random2 = (int) (Math.random() * 10 + 1);
        int random3 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 + " x " + random2 + " x " + random3 + " ? ");
        userInput = scanner.nextInt();
        uitkomst = random1 * random2 * random3;
        if (userInput == uitkomst) {
            System.out.println("Goed");
        } else {
            System.out.println("Helaas, het juiste antwoord was " + uitkomst +".");
        }

        // OPDRACHT 3.3

        System.out.println("Opdracht 3.3\n");
        random1 = (int) (Math.random() * 12 + 1);
        String maand = "onbekend";
        switch (random1) {
            case 1:
                maand = "Januari";
                break;
            case 2:
                maand = "Februari";
                break;
            case 3:
                maand = "Maart";
                break;
            case 4:
                maand = "April";
                break;
            case 5:
                maand = "Mei";
                break;
            case 6:
                maand = "Juni";
                break;
            case 7:
                maand = "Juli";
                break;
            case 8:
                maand = "Augustus";
                break;
            case 9:
                maand = "September";
                break;
            case 10:
                maand = "Oktober";
                break;
            case 11:
                maand = "November";
                break;
            case 12:
                maand = "December";
                break;

            }

            System.out.println("Het random getal is " + random1 + " en dat is de maand " + maand + ".");

        // OPDRACHT 3.4

        System.out.println("Opdracht 3.4\n");
        System.out.println("Welke weekdag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo )\n");
        int weekdag = scanner.nextInt();
        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?\n");
        int dagenVooruit = scanner.nextInt();
        int resultaat = weekdag + dagenVooruit;
        if (resultaat >= 7) {
            resultaat = resultaat % 7;
        }
        String[] weekdagen = {"onbekend","maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};

        System.out.println("Vandaag is het " + weekdagen[weekdag] + " en over " + dagenVooruit + " dagen is het " + weekdagen[resultaat] + ".");

        // OPDRACHT 3.5

        System.out.println("Opdracht 3.5\n");
        System.out.println("Wat is uw gewicht (kg) ? ");
        double gewicht = scanner.nextDouble();
        System.out.println("Wat is uw lengte (m) ? ");
        double lengte = scanner.nextDouble();
        double teller = gewicht;
        double noemer = lengte * lengte;
        double bmi = teller / noemer;
        int tussenstap = (int) (bmi * 100);
        bmi = tussenstap / 100;
        System.out.println("Uw bmi is " + bmi + ".");
        String conclusie = "onbekend";
        if (bmi < 18.5) {
            conclusie = "ondergewicht 5heeft";
        } else if (bmi < 25) {
            conclusie = "een normaal gewicht heeft";
        } else if (bmi < 30) {
            conclusie = "overgewicht heeft";
        } else {
            conclusie = "zwaar overgewicht heeft";
        }
        System.out.println("Als u mintens 20 jaar bent betekent dit dat u " + conclusie + ".");

        // OPDRACHT 3.6

        System.out.println("Opdracht 3.6\n");
        System.out.println("Getal 1: ");
        int getal1 = scanner.nextInt();
        System.out.println("Getal 2: ");
        int getal2 = scanner.nextInt();
        System.out.println("Getal 3: ");
        int getal3 = scanner.nextInt();
        int[] getallen = {getal1,getal2,getal3};
        Arrays.sort(getallen);
        System.out.println("Van klein naar groot: " + getallen[0] + " - " + getallen[1] + " - " + getallen[2]);

    }

}

