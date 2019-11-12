package ru.job4j;

public class Calculator {

    public static void add (int first, int second) {
        int summ = first + second;
        System.out.println(first + " + " + second + " = " + summ);
    }

    public static void multiply (int first, int second) {
        int mult = first * second;
        System.out.println(first + " * " + second + " = " + mult);
    }

    public static void div (int first, int second) {
        int div = first / second;
        System.out.println(first + " / " + second + " = " + div);
    }

    public static void substract (int first, int second) {
        int sub = first - second;
        System.out.println(first + " - " + second + " = " + sub);
    }


    public static void main(String[] args) {
        add(1, 1);
        multiply(2, 1);
        div(4, 2);
        substract(10, 5);

    }
}
