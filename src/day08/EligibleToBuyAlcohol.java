package day08;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        String name1 = "James";
        int age1 = 19;
        String name2 = "Aoraon";
        int age2 = 39;

        boolean eligibleToBuyAlcohol = age1 > 19;

        System.out.println(name1 + " is eligible to buy alcohol? " + eligibleToBuyAlcohol);

        eligibleToBuyAlcohol = age2 > 19;
        System.out.println(name2 + " is eligible to buy alcohol? " + eligibleToBuyAlcohol);

    }

}
/*
1. write a program that can check if the person is eligible to buy alcohol
        Ex:
            name = "James"
            age = 19
            output:
                James is eligible to buy alcohol?
                    false
            name = "Aaron"
            age = 39
            output:
                Aaron is eligible to buy alcohol?
                    true
 */