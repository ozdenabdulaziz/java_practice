package day05;

public class KgToPounds {

    public static void main(String[] args) {

        int kg = 10;
        int kg2 = 20;

        double pounds = 2.20462;

        double convertToPounds = kg * pounds;
        double convertToPounds2 = kg2 * pounds;

        System.out.println(kg +" kg equal to " + convertToPounds + " pounds");
        System.out.println(kg2 +" kg equal to " + convertToPounds2 + " pounds");



    }


}

/*

        Task01:
        create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;

                output:
                    10 kg equal to 22.0462 pounds


                kg = 20

                output:
                    20 kg equal to 44.0924 pounds

                ....

            Hint: 1kg = 2.20462 pounds
 */