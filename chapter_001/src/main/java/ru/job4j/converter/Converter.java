package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro (int value) {
        return value / 70;
    }

    public static int rubleToDollar (int value) {
        return value / 60;
    }

    public static int euroToRubles (int value) {
        return value * 70;
    }

    public static int dollarToRubles (int value) {
        return value * 60;
    }


    public static void main(String[] args) {

        // testing

        /*int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(passed);

        int in2 = 300;
        int expected2 = 5;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println(passed2);

        int in3 = 50;
        int excp3 = 3500;
        int out3 = euroToRubles(in3);
        boolean passed3 = excp3 == out3;
        System.out.println(passed3);

        int in4 = 50;
        int excp4 = 3000;
        int out4 = dollarToRubles(in4);
        boolean passed4 = excp4 == out4;
        System.out.println(passed4); */


        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(300);

        System.out.println("140 RUR are " + euro + " EUR");
        System.out.println("300 RUR are " + dollar + " USD");

        int ruble1 = euroToRubles(50);
        int ruble2 = dollarToRubles(50);

        System.out.println("50 EUR are " + ruble1 + " RUR");
        System.out.println("50 USD are " + ruble2 + " RUR");

    }

}
