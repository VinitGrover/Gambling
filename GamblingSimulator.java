package com.bridgelabz;

import java.util.Random;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator Program");
        System.out.println("Gambler puts 100$ everyday and for every game if gambler wins there is a reward of 1$ and if lost 1$ will be deducted from the stake of 100$");

        Random r = new Random();
        int check = r.nextInt(2);
        if (check == 0)
            System.out.println("Gambler will lose 1$");
        else
            System.out.println("Gambler will win 1$");

    }
}