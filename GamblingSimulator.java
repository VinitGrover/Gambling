package com.bridgelabz;

import java.util.Random;

public class GamblingSimulator {

    static int stake = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator Program");
        System.out.println("Gambler puts 100$ everyday and for every game if gambler wins there is a reward of 1$ and if lost 1$ will be deducted from the stake of 100$");

        Random r = new Random();
        int lost, lostTotal = 0, won, wonTotal = 0, l = 0, w = 0;

        for (int i = 1; i <= 30; i++) {
            while (stake < 150 && stake > 50) {
                int check = r.nextInt(2);
                if (check == 0) {
                    stake--;
                } else {
                    stake++;
                }
            }
            if (stake < 100) {
                lost = 100 - stake;
                lostTotal += lost;
                l++;
            } else {
                won = stake - 100;
                wonTotal += won;
                w++;
            }
            stake = 100;

        }
        System.out.println("Gambler has won " + w + " times and a total of " + wonTotal + "$ after a month");
        System.out.println("Gambler has lost " + l + " times and a total of " + lostTotal + "$ after a month");

    }
}