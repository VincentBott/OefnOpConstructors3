package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int maxGetal = 100;

        Hogerlager hl = new Hogerlager(maxGetal);

        System.out.printf("Raad getal (tussen 1 en %d): ", maxGetal);

        int getal = Integer.parseInt(scanner.nextLine());

        int resultaat = hl.raad(getal);

        while (resultaat != 0){

            if (resultaat < 0){
                System.out.println("lager");
            }else{
                System.out.println("hoger");
            }

            System.out.printf("Raad getal (tussen 1 en %d): ", maxGetal);

            getal = Integer.parseInt(scanner.nextLine());

            resultaat = hl.raad(getal);

        }
        System.out.printf("Gevonden in %d beurten.%n", hl.getAantalBeurten());

    }
}
