package day13;

public class SwitchTasks1 {

    public static void main(String[] args) {

        int month = 1;

        String nameOfMonth = "";

        switch (month) {

            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;

            default:
                nameOfMonth = "Invalid Month";

        }

        System.out.println(nameOfMonth);


    }
}
/*
        2. write a program that cna print the name of the month based on the number.
        if numbers is greater than 12 or less than 1, print invalid

        MUST use switch
*/

