package day08;

public class UnaryPractice {

    public static void main(String[] args) {

        int a = 100; //100

        int b = -a++ + ++a - a-- * a-- % 2;
        //      -100 + 102 - 102 * 101 % 2;
        //      -100 + 102 - 10302 % 2;
        //      -100 + 102 - 0;
        //         2;

        System.out.println(b);

        System.out.println("\n\t===========================================\n");





    }
}
