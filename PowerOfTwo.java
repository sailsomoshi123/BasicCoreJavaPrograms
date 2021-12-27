package com.bridgelabz;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        if (n > 0 && n < 31) {
            for (int i = 1; i <= n; i++) {
                System.out.println("power of 10 is " +i + " " + Math.pow(2, i));
            }
        } else {
            System.out.println("Exceed max value, please enter lower value");
        }

    }
}