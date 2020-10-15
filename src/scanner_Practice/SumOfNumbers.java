package scanner_Practice;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        // Create a scanner
        Scanner scan1 = new Scanner(System.in);

        // ask user to enter 3 numbers

        System.out.println("Please enter a number ");
        int num1 = scan1.nextInt();

        System.out.println("Please enter a number ");
        int num2 = scan1.nextInt();

        System.out.println("Please enter a number");
        int num3 = scan1.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("Sum is: " + sum);


        scan1.close();  // it's not mandatory


    }
}
/*
    Warm up task 1:
             Write a program that asks user to enter 3 numbers from keyboard
             and calculates the sum of those numbers then show result
         */