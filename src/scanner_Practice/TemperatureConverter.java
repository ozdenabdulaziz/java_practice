package scanner_Practice;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value in Fahrenheit");
        double fahrenheit = scan.nextDouble();

            // convert fahrenheit to celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Temperature in Celsius: " + (int) celsius);
            //                                   celsius output with int

    }

}
