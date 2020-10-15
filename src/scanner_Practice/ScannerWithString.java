package scanner_Practice;

import java.util.Scanner;

public class ScannerWithString {

    public static void main(String[] args) {

            //accept a string value using a scanner

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter your name: ");

            // for String scanner you can use next(); and nextLine();
        String name = scan1.nextLine();
            //next() can read the input only till the space. It can't read two words separated by space. Also, next() places the cursor in the same line after reading the input.
            //nextLine() reads input including space between the words (that is, it reads till the end of line \n).
        System.out.println("Nice to meet you! " + name);


    }
}
