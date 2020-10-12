package day12;

public class Tasks1 {

    public static void main(String[] args) {


        int n1 = 0;

        String nameOfValue = (n1==0)? "Zero" : (n1==1)?"One": (n1==2)?"Two": (n1==3)?"Three": (n1==4)?"Four": (n1==5)?"Five": (n1==6)?"Six": (n1==7)? "Seven": (n1==8)? "Eight":(n1==9)? "Nine" : "Invalid";

        System.out.println(nameOfValue);

        System.out.println("\n------------------------------\n");

        int value = 9;

        String word = "";

        if(value >=0 && value <=9){

            if(value==0){
                word = "Zero";
            }else if(value == 1){
                word = "One";
            }else if(value ==2){
                word = "Two";
            }else if(value==3){
                word = "Three";
            }else if(value ==4){
                word = "Four";
            }else if(value==5){
                word = "Five";
            }else if(value ==6){
                word = "Six";
            }else if(value == 7){
                word = "Seven";
            }else if(value==8){
                word = "Eight";
            }else{
                word = "Nine";
            }
        }else {
            System.out.println("invalid");
        }

        System.out.println(word);



    }
}

/*
 1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".

            Note: MUST USE NESTED IF
 */