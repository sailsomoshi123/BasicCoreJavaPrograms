package com.bridgelabz;
import java.util.Scanner;

public class QuotientReminderCalculaton {
    public static void main(String[] args) {
        int dividend,divisor,reminder,quotient;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter divided or number: ");
        dividend = sc.nextInt();
        System.out.println("enter a divisor or number: ");
        divisor = sc.nextInt();
        quotient = dividend / divisor;
        reminder = dividend % divisor;
        System.out.println("quotient is : "  +quotient);
        System.out.println("Reminder is : " +reminder);
    }
}
