package com.bridgelabz;

import java.util.Random;

public class GamblingSimulator {

    static int stake = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator Program");
        System.out.println("Gambler puts 100$ everyday and for every game if gambler wins there is a reward of 1$ and if lost 1$ will be deducted from the stake of 100$");

        Random r = new Random();
        int sum = 0;

        for (int i = 1; i <= 20; i++) {
            while (stake < 150 && stake > 50) {
                int check = r.nextInt(2);
                if (check == 0) {
                    // System.out.println("Gambler will lose 1$");
                    stake--;
                } else {
                    //  System.out.println("Gambler will win 1$");
                    stake++;
                }
            }
            sum += stake;
            stake = 100;
        }
        if (sum > 2000)
            System.out.println("Gambler has won " + (sum - 2000) + "$ after playing for 20 days");
        else
            System.out.println("Gambler has lost " + (2000 - sum) + "$ after playing for 20 days");

    }
}