package day06;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PostPre {

    public static void main(String[] args) {

        int x = 2;
        int y = x++;  // post increment: first passes current value 2;
        System.out.println(x); //3
        System.out.println(y); //2

        System.out.println("\n=======================================\n");

        int x2 = 2;
        System.out.println(x2++); // x2 = 2
        System.out.println(x2); // 3

        System.out.println("\n=======================================\n");

        int x3 = 2;
        System.out.println(--x3); // 1

        System.out.println("\n=======================================\n");

        int x4= 8;
        int y4 = x4--;  // y4 = 8

        System.out.println(y4); //8
        System.out.println(x4); // 7

        System.out.println("\n=======================================\n");

        int a=1;
        int b = -a-- + a++ / -a-- * --a;
        //      -1  + 0 / -1 * -1
        //       -1 + 0 / -1
        //         -1 + 0
        //            -1
        System.out.println(b);

        System.out.println("\n=======================================\n");

        int A = 50;
        int B = --A + A++ + A-- + A++;
        //      49 + 49 + 50 + 49;
        //          98 + 50 + 49;
        //              148 + 49;
        //                  197
        System.out.println(B);
        System.out.println("\n=======================================\n");

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        //      -101 * -101 / 100 + 100;
        //          10201 / 101 + 100;
        //              102 + 100
        //                  202

        System.out.println(p);

        System.out.println("\n=======================================\n");

        int m = 300; // 300
        int n = 400; // 400

        int u = ++m + n++ - m-- % 2 + --n %2;
        //      301 + 400 - 301 % 2 + 400 % 2;
        //      301 + 400 - 1 + 0 ;
        //      700;

        System.out.println(u);

        System.out.println("\n=======================================\n");

        int j = m + n - m * n + m /n;
        //  300 + 400 - 300 * 400 + 300 / 400;
        //  300 + 400 - 120000 + 0;
        //  700 - 12000 + 0 ;


        System.out.println(j);






    }
}
