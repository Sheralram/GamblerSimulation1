package com.bridgelabz.com.Bridgelabz;

import java.util.Random;

public class Utility {
    public static final int STAKE = 100;
    public static final int BET = 1;

     public void winOrLoss() {
        int win = 1;
        Random random = new Random();
        int game = random.nextInt(2);

        if (game == win) {
            System.out.println("Gambler win");
           
        } else {
            System.out.println("Gambler loose");

        }

    }
}