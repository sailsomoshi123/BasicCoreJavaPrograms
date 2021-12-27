package com.bridgelabz;
import java.util.Scanner;

public class FlipCoin{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  positive number that time you require to flip coin : ");
        int numOfFlips = sc.nextInt();
        int heads=0;
        int tails=0;
        for (int index=0;index <= numOfFlips;index++)
        {
            double flip = Math.random();
            if (flip < 0.5) {
                tails++;
            }
            else {
                heads++;
            }
        }
        double percentageOfTails = (tails * 100)/numOfFlips;
        double percentageOfHeads = 100-percentageOfTails;
        System.out.println("percentage of tails:" + percentageOfTails);
        System.out.println("percentage of heads:" + percentageOfHeads);
    }
}


