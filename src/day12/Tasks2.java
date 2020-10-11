package day12;

public class Tasks2 {

    public static void main(String[] args) {

        int month = 2;


        if(month>=1 && month<=12){

            if(month==2){
                System.out.println("28");
            }else if(month==4 && month==6 && month==9 && month==11){
                System.out.println("30");
            }else{
                System.out.println("31");
            }


        }else{
            System.out.println("Invalid");
        }


    }
}
/*
        2. write a program that can find the number of days in a month
                    Note: MUST USE NESTED IF

            days 28 = 2
            days 30 = 4, 6, 9, 11
            days 31 = 1, 3, 5, 7, 8, 10, 12
 */