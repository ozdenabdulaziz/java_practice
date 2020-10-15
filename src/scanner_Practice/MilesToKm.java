package scanner_Practice;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter miles:");

        double miles = scan1.nextDouble();
        double kms = miles * 1.609344;

        System.out.println("KMs value: " + kms);


    }
}
/*
 * Create a program that accepts value
 * in miles and converts to kilometers
 */
