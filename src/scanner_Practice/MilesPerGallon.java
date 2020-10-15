package scanner_Practice;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter current Odometer value:");
        double currentOdometerValue = scan1.nextDouble();

        System.out.println("Enter previous Odometer value:");
        double previousOdometerValue = scan1.nextDouble();

        System.out.println("Enter gallons:");
        double gallons = scan1.nextDouble();

        System.out.println("Price per gallon:");
        double pricePerGallon = scan1.nextDouble();

        double mpg = (currentOdometerValue - previousOdometerValue) / gallons;

        System.out.println("MPG value: " + mpg);

        double totalCost = gallons * pricePerGallon;
        System.out.println("Your total cost is $" + totalCost);
    }

}


/*
  Write a program that asks user to enter current car odometer miles
  and previous car odometer miles. Also number of gallons that was put.
  price per gallon.

  calculate MPG -> miles per gallon value.
  calculate total fuel expense.

 */