package scanner_Practice;

import java.util.Scanner;

public class Home_Calculator {

    public static void main(String[] args) {

        Scanner unit = new Scanner(System.in);

        System.out.println("Abdulaziz How much is Spend: ");
        double aziz = unit.nextDouble();

        System.out.println("Semih How much is Spend: ");
        double semih = unit.nextDouble();

        System.out.println("Zubeyir How much is Spend: ");
        double zubeyir = unit.nextDouble();

        System.out.println("Hasan How much is Spend: ");
        double hasan = unit.nextDouble();


        double total = aziz + semih + hasan + zubeyir;

        System.out.println("Aziz spend: " + aziz);
        System.out.println("Semih spend: " + semih);
        System.out.println("Zubeyir spend: " + zubeyir);
        System.out.println("Hasan spend: " + hasan);


        System.out.println("Each person need to spend " + total/4 + " money");

        double calculator1 = total/4 - aziz;
        double calculator2 = total/4 - semih;
        double calculator3 = total/4 - zubeyir;
        double calculator4 = total/4 - hasan;

        System.out.println(-calculator1);
        System.out.println(-calculator2);
        System.out.println(-calculator3);
        System.out.println(-calculator4);

        if(aziz>semih && aziz>zubeyir && aziz>hasan){
            
        }


    }
}
