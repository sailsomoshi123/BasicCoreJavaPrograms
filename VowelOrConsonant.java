package com.bridgelabz;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char alphabet; boolean lowerCase;
        boolean upperCase;
        System.out.println("Enter a alphabet: ");
        Scanner sc = new Scanner(System.in);
        alphabet = sc.next().charAt(0);
        lowerCase = ( alphabet== 'a' || alphabet== 'e' || alphabet== 'i' || alphabet== 'o' || alphabet== 'u');
        upperCase = ( alphabet== 'A' || alphabet== 'E' || alphabet== 'I' || alphabet== 'O' || alphabet== 'U');
        if (lowerCase || upperCase){
            System.out.println(alphabet +" is a vowel");
        }
        else {
            System.out.println(alphabet +" is a consonant");
        }
    }
}
