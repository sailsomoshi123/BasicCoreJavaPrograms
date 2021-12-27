package com.bridgelabz;
import java.util.Scanner;

public class largestNumberAmong3 {
    public static void main(String[] args) {
        int number1, number2, number3 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        number1 = sc.nextInt();
        System.out.println("Enter a second number : ");
        number2 = sc.nextInt();
        System.out.println("Enter a third number :  ");
        number3 = sc.nextInt();
        if (number1 > number2 && number1 >number3) {
            System.out.println("Greater number is : " +number1);
        }
        else if (number2 > number3) {
            System.out.println("Greater number is : " +number2);
        }else {
            System.out.println("Greater number is : " +number3);
        }
    }
}
