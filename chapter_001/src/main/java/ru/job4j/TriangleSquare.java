package ru.job4j;

public class TriangleSquare {

    public static double square(int a, int b, int c){
        int p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p * c));
    }

    public static void main(String[] args) {

        double res1 = square(2,2,2);
        System.out.println("The square of triangle is " + res1);
    }
}
