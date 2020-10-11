package day06;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int x = 2 + 3 * 2 /1;
        //  x=  2 + 6 /1 ;
        //  x = 2 + 6;
        //  x = 8

        System.out.println(x);

        System.out.println("\n=======================================\n");

        int y = (2+3) * 2;
        //      5 * 2 = 10
        int z = 2 + 3 * 2;
        //      2 + 6 = 8
        System.out.println(y);
        System.out.println(z);

        System.out.println("\n=======================================\n");

        int w = 78 / 2 * 2 + 3 - 5 % 5;
        //  w = 39 * 2 + 3 - 5 % 5;
        //  w = 78 + 3 - 5 % 5;
        //  w = 78 + 3 - 0;
        //  w = 81;

        System.out.println(w);

        System.out.println("\n=======================================\n");

        int t = 8 + 2 + 3 + 5 - 2 -1 -0 + 1 * 2;
        //  t = 8 + 2 + 3 + 5 -2 -1 -0 + 2;
        //  t = 17

        System.out.println(t);




    }
}
