package day06;

public class PrimitiveCasting {

    public static void main(String[] args) {

        short a = 3000;
        long b = a; // implicit casting, automatically done
        //  b= 3000l
        System.out.println(b);

        System.out.println("\n=======================================\n");

        double d1 = 200.5;
        int i1 = (int)d1;       // 200

        System.out.println(i1);

        System.out.println("\n=======================================\n");

        long l1 = 300;
        short s1 = (short)l1;   // explicit casting;
        System.out.println(s1);

        System.out.println("\n=======================================\n");

        double d2 = 300;
        float f2 = (float)d2;
        System.out.println(f2);

        System.out.println("\n=======================================\n");

        long l2 = 300l; // explicit casting
        int i2 = (int)l2;

        System.out.println(i2);

        System.out.println("\n=======================================\n");

        short s2 = 400;
        byte b1 = (byte)s2;     // byte = -128 <= byte <= 127
        System.out.println(b1); // the value 400 is out og byte range and casting does not change the limit of dataType

        System.out.println("\n=======================================\n");

        long l3 = 100;
        byte b3 = (byte)l3;
        System.out.println(b3);








    }
}
