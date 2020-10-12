package day12;

public class Tasks3 {

    public static void main(String[] args) {

        int age = 70;

        String ageGroups = (age>=0 && age<21)? "Teenager" : (age<55)? "Adult" : (age>=55 && age<150)? "Senior" : "Invalid";

        System.out.println(ageGroups);

        System.out.println("\n-------------- an other way ------------------\n");

        if(age>=0 && age<=150){

            if(age<21){
                ageGroups = "Teenager";
            }else if(age<55){
                ageGroups = "Adult";
            }else{
                ageGroups = "Senior";
            }

        }else {
            ageGroups = "Invalid";
        }

        System.out.println(ageGroups);

    }
}


/*

  3. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                Hint:  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
 */