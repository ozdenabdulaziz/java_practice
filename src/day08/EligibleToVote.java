package day08;

public class EligibleToVote {

    public static void main(String[] args) {

        String name1 = "Jhon";
        String citizenShip = "USA";
        String name2 = "Jimmy";
        String citizenShip2 = "Korea";

        boolean vote = citizenShip == "USA";
        boolean vote2 = citizenShip2 == "USA";

        System.out.println(name1 + " is eligible to vote for Donald Trump or Joe Biden? " + vote);
        System.out.println(name2 + " is eligible to vote for Donald Trump or Joe Biden? " + vote2);


    }

}

/*
    2. write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
            name = "Jimmy"
            citizenShip = "Korea"
            output:
                Jimmy is eligible to vote for Donald Trump or Joe Biden?
                    false
 */