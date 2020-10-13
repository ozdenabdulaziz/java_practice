package day01And15;

public class Tasks3 {

    public static void main(String[] args) {

        long num = 1000l;
        String digits = "";

        if (num >= 1 && num < 100000) {
            if (num >= 1 && num <= 9) {
                digits = "1 digit";
            } else if (num >= 10 && num <= 99) {
                digits = "2 digits";
            } else if (num >= 100 && num <= 999) {
                digits = "3 digits";
            } else if (num >= 1000 && num <= 9999) {
                digits = "4 digits";
            } else if (num >= 10000 && num <= 99999) {
                digits = "5 digits";
            }

        } else {
            digits = "Invalid number";
        }
        System.out.println(digits);



    }
}
/*
Given a number(long) determine and print how many digits it has.

    - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"
    Ex: 124 --> 3 digits
        13213 --> 5 digits
        883218 --> Invalid number
        23 --> 2 digits
 */