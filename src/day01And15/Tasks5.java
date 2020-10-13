package day01And15;

public class Tasks5 {

    public static void main(String[] args) {


        byte n = 19;
        String type = "";

        if (n >= 1 && n <= 5)
            type = "Elementary school";

        else if (n >= 6 && n <= 8)
            type = "Middle";

        else if (n >= 9 && n <= 12)
            type = "High school";

        else if (n >= 13 && n <= 16)
            type = "College";

        else if (n >= 17 && n <= 18)
            type = "Grad School";

        else
            type = "Invalid grade level given";

        System.out.println(type);

    }
}

   /*
        Given a number(byte) grade level determine and print which school type someone is in.
    1-5: Elementary school
    6-8: Middle school
    9-12: High school
    13-16: College
    17-18: Grad School
    Other: Invalid grade level given

         */

