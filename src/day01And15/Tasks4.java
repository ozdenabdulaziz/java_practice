package day01And15;

public class Tasks4 {

    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 50;

        boolean result = true;

        if (n1 % 2 == 0)
            System.out.println(n1 *= 5);
        else
            System.out.println(n1 *= 10);
        if (n2 % 5 == 0)
            System.out.println(n2 /= 5);
        else
            System.out.println(n2 /= 2);
        if (result = true)
            System.out.println(n1 + n2);
        if ((n1 + n2) % 10 == 0)
            System.out.println((n1 + n2) / 10);

        else
            System.out.println("Invalid result");

        if (result = false)
            System.out.println(n1 * n2);

        if ((n1 * n2) % 2 != 0)
            System.out.println((n1 * n2) % 2);

        else
            System.out.println("Invalid result");


    }
}
 /*
        Given 3 numbers (int) and a boolean calculate a number based on these conditions:
    - If the first number is even, multiple it by 5, but if it's odd, multiple it by 10.
    - If the last number is a multiply of 5 divide it by 5, but if the number is not divide it by 2
    - If the given boolean is true:
        - add all the numbers together
        - After adding the numbers if the total value is divisible by 10 evenly then print the number, otherwise print "invalid result"
    - If the given boolean is false:
        - multiple all the numbers together
        - After multiplying the numbers, if the number is odd, then print it, otherwise print "invalid result"

         */
