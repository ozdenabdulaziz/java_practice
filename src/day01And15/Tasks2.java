package day01And15;

public class Tasks2 {

    public static void main(String[] args) {

        char c1 = 'a';

        String message = "";

        if (c1 >= 'A' && c1 <= 'Z')
            message = "Uppercase";
        else if (c1 >= 'a' && c1 <= 'z')
            message = "Lowercase";
        else
            message = "Please enter a letter";

        System.out.println(c1 + " is a " + message);
    }
}
 /*
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter
    Ex: 'b'  --> lowercase
        'G'  --> uppercase
        'O'  --> uppercase
 */