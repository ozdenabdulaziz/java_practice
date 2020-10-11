package day05;

public class GalonsToLiters {

    public static void main(String[] args) {

        int gallons = 10;
        int gallons2 = 20;
        double liters = 3.78541;

        double convert1 = gallons * liters;
        double convert2 = gallons2 * liters;

        System.out.println(gallons + " Gallons equal to " + convert1 + " liters");
        System.out.println(gallons2 + " Gallons equal to " + convert2 + " liters");


    /*
        double liters = gallons * 3.78541;
        double liters2 = gallons2 * 3.78541;

        System.out.println( gallons + " gallons equal to " + liters + " liters");
        System.out.println( gallons2 + " gallons equal to " + liters2 + " liters");
    */



    }


}
/*
    Task02:
        create a class called GalonsToLiters, and write a program that can convert the gallons tto litters
            Ex:
                galon = 10;

                output:
                    10 gallons equal to 37.8541 liters


                galon = 20

                 output:
                    20 gallons equal to 75.7082 liters


            Hint: 1 gallon = 3.78541 liters
 */