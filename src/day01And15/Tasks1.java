package day01And15;

public class Tasks1 {

    public static void main(String[] args) {

        String a1 = "Tree House";
        int a2 = 1;

        String b1 = "Mobile Home";
        int b2 = 2;

        String c1 = "Apartment";
        int c2 = 4;

        String d1 = "Town House";
        int d2 = 6;

        String e1 = "Villa";
        int e2 = 8;

        String g1 = "Mansion";
        int g2 = 10;

        System.out.println(a1 + ": " + a2 + "\n" + b1 + ": " + b1 + "\n" + c1 + ": " + c2 + "\n" + d1 + ": " + d2 + "\n" + e1 + ": " + e2 + "\n" + g1 + ": " + g2);

        System.out.println("\n------------\t----------------------\n");

        System.out.println(a1 + ": " + a2);
        System.out.println(b1 + ": " + b2);
        System.out.println(c1 + ": " + c2);
        System.out.println(d1 + ": " + d2);
        System.out.println(e1 + ": " + e2);
        System.out.println(g1 + ": " + g2);

        System.out.println("\n------------\tWith else-if statement\t----------------------\n");

        String houseType = "Mansion";
        int occupants = 0;

        if (houseType == "Tree House")
            occupants = 1;
        else if (houseType == "Mobile Home")
            occupants = 2;
        else if (houseType == "Apartment")
            occupants = 4;
        else if (houseType == "Town House")
            occupants = 6;
        else if (houseType == "Villa")
            occupants = 8;
        else if (houseType == "Mansion")
            occupants = 10;
        else
            System.out.println("Invalid house type");

        System.out.println(houseType + ": " + occupants);

        System.out.println("\n------------\t----------------------\n");

        houseType = "Mobile Home";

        switch (houseType) {
            case "Tree House":
                occupants = 1;
                break;

            case "Mobile Home":
                occupants = 2;
                break;

            case "Apartment":
                occupants = 4;
                break;

            case "Town House":
                occupants = 6;
                break;

            case "Villa":
                occupants = 8;
                break;

            case "Mansion":
                occupants = 10;
                break;

            default:
        }

        System.out.println(houseType + ": " + occupants);


    }
}

/*
Given a house type (String) print out the number of max occupants (int)
    Tree house: 1
    Mobile home: 2
    Apartment: 4
    Town house: 6
    Villa: 8
    Mansion: 10

 */