package IfStatementQuiz;

public class Quiz1 {

    public static void main(String[] args) {


        int num = 9;

        if (num++ == 10) {
            System.out.println("Hello world " + num);
        } else {
            System.out.println("Hello Universe " + num);
        }

        System.out.println("\n---------------------          ---------------------------\n");

        int n1 = 10;

        System.out.println(n1++ + " " + n1);

        System.out.println("\n--------------               ----------------------------------\n");

        int n2 = 100;   // 99

        int result = --n2 + n2++ + n2-- * n2++ - --n2 / n2--;
        //          99    + 99  +  100 * 99 - 99 / 99;
        //          99 + 99 + 9900 - 99 /99;
        //          99 + 99 + 9900 - 1;
        //          198 + 9900 - 1;
        //          197 + 9900;
        //              10097


        System.out.println(result);


        System.out.println("\n-------------------       2      -----------------------------\n");


        int score = 0;

        if (score == 0) {
            score += 50;
        }

        if (score != 0) {
            score += 50;
        }

        System.out.println(score);  //  score == 100

        System.out.println("\n---------------------     3       ---------------------------\n");

        char grade = 'A';

        boolean passed = grade == 'A' || grade == 'B';
        boolean passed2 = grade == 'C' || grade == 'D';

        if (passed || passed2) {
            System.out.println("You've passed the exam");
        } else {
            System.out.println("You failed");
        }

        System.out.println("\n---------------------     4       ---------------------------\n");


        boolean A = true;
        boolean B = !false; // True

        if (B) {
            System.out.println("B");
        } else if (A) {
            System.out.println("A");
        } else {
            System.out.println("C");
        }

        System.out.println("\n----------------------        5       --------------------------\n");

        boolean b1 = true;

        if (b1) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }
        //      }else if(b1){
        //          System.out.println("None of the above");
        //      }


        System.out.println("\n-------------------       6       -----------------------------\n");

        String question6 = "Q1";

        boolean b3 = question6 == "Q1";

        if (b3) {
            System.out.println("In multi-branch if statement we can give as many \"else-if\" statements as we want");
        } else {
            System.out.println("In multi-brach if statement we can not give as many \"else-if\" statement as we can't");
        }

        System.out.println("\n-------------------       7       -----------------------------\n");

        String questin2 = "Q2";

        boolean b4 = questin2 != "Q2";

        System.out.println("Question:\tWhen we declare if statement, it is mandatory to give the else block\n");
        if (b4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("\n-------------------       8       -----------------------------\n");

        int n3 = 10;    //9

        if (--n3 > 10) {
            System.out.println("Hello Cybertek " + n3);
        } else if (n3 == 9) {
            System.out.println("Hello World " + n3);
        }

        System.out.println("\n-------------------       9       -----------------------------\n");

        boolean x = true;
        boolean y = !x == false;
        boolean z = y;

        if (x) {
            System.out.println("Hello Everyone");
        }
        if (y) {
            System.out.println("Today is great day");
        }
        if (z) {
            System.out.println("We are improving everyday");
        }

        System.out.println("\n-------------------       10       -----------------------------\n");

        int n5 = 10;        // 11
        int n6 = n5++;      // 11
        //10
        System.out.println(n6++ + " " + n5++ + " " + n6);
//                          10  +       10  +       11


    }
}
