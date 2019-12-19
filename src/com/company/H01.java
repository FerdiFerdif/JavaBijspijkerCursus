package com.company;

public class H01 {

    public static void main(String[] args) {

        // FERDI VAN DEN BROM
        // H01 INTRODUCTIE JAVA

        // OPDRACHT 1.1
        System.out.println("\nOpdracht 1.1\n");
        System.out.println("Java is Object Georiënteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript\n\n");

        // OPDRACHT 1.2

        System.out.println("Opdracht 1.2\n");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Java is geweldig");

        }

        // OPDRACHT 1.3

        System.out.println("Opdracht 1.3\n");
        System.out.println("a\ta^2\ta^3\ta^4");
        System.out.println("1\t1\t1\t1");
        System.out.println("2\t4\t8\t16");
        System.out.println("3\t9\t27\t81");
        System.out.println("4\t16\t64\t256\n\n");

        // OPDRACHT 1.4

        System.out.println("Opdracht 1.4\n");
        double teller = 7.5 * 6.5 - 4.5 * 3;
        double noemer = 47.5 * 5.5;
        double breuk = teller / noemer;
        System.out.println(breuk + "\n\n");

        // OPDRACHT 1.5

        System.out.println("Opdracht 1.5\n");
        int optelsom = 	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(optelsom + "\n\n");

        //OPDRACHT 1.6

        System.out.println("Opdracht 1.6\n");
        double benedaringVanPi = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println(benedaringVanPi + "\n\n");

        //OPDRACHT 1.7

        System.out.println("Opdracht 1.7\n");
        double oppervlakte = 6.5 * 6.5 * 3.14159;
        double omtrek = 6.5 * 3.14159 * 2;
        System.out.println("De oppervlakte is: " + oppervlakte);
        System.out.println("De omtrek is: " + omtrek);

        //OPDRACHT 1.8

        System.out.println("Opdracht 1.8\n");
        double breedte = 8.6;
        double lengte = 5.3;
        oppervlakte = breedte * lengte;
        omtrek = 2 * (lengte + breedte);
        System.out.println("De oppervlakte is: " + oppervlakte);
        System.out.println("De omtrek is: " + omtrek);

    }
}
