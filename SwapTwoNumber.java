package com.bridgelabz;
import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int number1, number2, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        number2 = sc.nextInt();
        System.out.println("Before Swapping " +number1 +" " +number2);
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swaping " +number1 +" " +number2);
    }
}
