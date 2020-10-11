package day12;

public class Tasks4 {

    public static void main(String[] args) {

        String browserName = "Firefox";

        if(browserName == "Chrome" || browserName == "Firefox" || browserName =="Opera" || browserName == "Safari"){
            System.out.println(browserName + " Browser is selected");
        }else{
            System.out.println("Invalid Browser Name");
        }


    }
}

/*
    4. write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name

             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
                browserName =   "cybertek";
                output:
                    Invalid Browser Name
 */