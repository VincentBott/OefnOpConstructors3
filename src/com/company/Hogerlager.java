package com.company;

import java.util.Random;


public class Hogerlager {

    private int aantalBeurten = 0;
    private int teRadenGetal;


    public Hogerlager(int maxGetal) {

        Random rnd = new Random();

        teRadenGetal = rnd.nextInt(maxGetal) + 1;

    }

    public int raad(int getal) {

        aantalBeurten++;

        int returnwaarde = 0;

       if (getal < teRadenGetal)
           returnwaarde = 1;

       if (getal > teRadenGetal)
           returnwaarde = -1;

       if (getal == teRadenGetal)
           returnwaarde = 0;


       return returnwaarde;
    }

    public int getAantalBeurten() {

        return aantalBeurten;
    }

}

