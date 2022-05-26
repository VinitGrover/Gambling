package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulator {

    static int stake = 100, l = 0, j = 0, k = 0, w = 0, lost = 0, lostTotal = 0, won = 0, wonTotal = 0;
    static int lostDay[] = new int[30];
    static int wonDay[] = new int[30];
    Random r = new Random();


    void Gambling() {
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
                lostDay[j] = i;

            } else {
                won = stake - 100;
                wonTotal += won;
                w++;
                wonDay[k] = i;
            }
            stake = 100;
            j++;
            k++;
        }
        j = 0;
        k = 0;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator Program");
        System.out.println("Gambler puts 100$ everyday and for every game if gambler wins there is a reward of 1$ and if lost 1$ will be deducted from the stake of 100$");

        boolean flag = true;

        while (flag) {
            GamblingSimulator g = new GamblingSimulator();
            g.Gambling();

            System.out.println("Gambler has won " + w + " times and a total of " + wonTotal + "$ after a month");
            System.out.println("Gambler has lost " + l + " times and a total of " + lostTotal + "$ after a month");

            System.out.print("Days Lost : ");
            for (int x : lostDay) {
                if (x == 0)
                    continue;
                System.out.print(x + " ");
            }

            System.out.print("\nDays Won : ");
            for (int x : wonDay) {
                if (x == 0)
                    continue;
                System.out.print(x + " ");
            }

            Scanner sc = new Scanner(System.in);
            if (wonTotal > lostTotal) {
                System.out.print("\nYou are Winning, would you like to continue playing, enter y or n : ");
                if (sc.next().charAt(0) == 'y')
                    flag = true;
                else
                    flag = false;
            } else {
                System.out.print("\nYou are losing, would you like to continue playing, enter y or n : ");
                if (sc.next().charAt(0) == 'y')
                    flag = true;
                else
                    flag = false;
            }
        }
    }
}