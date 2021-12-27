package com.bridgelabz;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int n,i;
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+(double)1/i;
        }
        System.out.println("Harmonic number is " +sum);
    }
}
