package scanner_Practice;

import java.util.Scanner;

public class AgeCalculatorWithScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter year of birth: ");
        // let user to enter an int number during executing:
        int yearOfBirth = scan.nextInt();
        //ask for current year or year of death
        System.out.println("Enter Current year: ");
        int currentYear = scan.nextInt();
        int age = currentYear - yearOfBirth;

        System.out.println(age);
        // second way
        System.out.println("If you are born on " + yearOfBirth + " and current year is " + currentYear
                + " then you are " + age + " years old.");

        scan.close(); // this not mandatory, but it is however in many cases very advisable to do so.


    }
}

/*
        bring Scanner class code so that i can use in my program
        ask user to enter currentYear value as well
        calculate the age and print out the result
 */