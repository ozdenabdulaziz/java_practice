package day08;

public class SwipeToVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a +=5;
        b -=5;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }


}

/*
3. write a program that can swipe two variables' value by using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
 */