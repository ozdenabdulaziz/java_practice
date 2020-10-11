package day05;

public class LiraToUSD {

    public static void main(String[] args) {

        int lira1 = 1000;
        int lira2 = 1000000;

        double usd = 0.16097;

        double convert1 = lira1 * usd;
        double convert2 = lira2 * usd;

        System.out.println(lira1 + " Lira is equal to " + convert1 + " USD");
        System.out.println(lira2 + " Lira is equal to " + convert2 + " USD");

      /*
        double USD1 = lira1 * .16097;
        double USD2 = lira2 * .16097;

        System.out.println(Lira1+" Lira is equal to "+USD1 + " USD");
        System.out.println(Lira2+" Lira is equal to "+USD2 + " USD");

       */

    }

}

/*

    Task03:
        create a class called LiraToUSD, and write a program that can convert lira to dollars, and print the result
        Ex:
            Lira = 1000;

            output:
                1000 Lira is equal to 160.97 USD

            Lira = 1000000;

            output:
                1000000 Lira equal to 160969.70 USD
 */