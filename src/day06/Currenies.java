package day06;

public class Currenies {

    public static void main(String[] args) {

        int dolar = 32000;

        double lira = dolar / 0.13;
        double euro = dolar / 1.2;
        double jyp = dolar / 0.009;

        System.out.println(dolar + " Dolar is turkish lira: " + lira);
        System.out.println(dolar + " Dolar is Euro: " + euro);
        System.out.println( dolar +" Dolar is Japon yen: " + jyp);
    }

}
