package ru.job4j.sqarea;

public class SqArea {
    public static double height;
    public static double length; // = height*2;
    public static double square; // = length*height;
    //perimetr = 2 * (length + height)

    public static double square(int p, int k) {
        double halfPerimetr = p / 2 / (1 + k);
        length = k * halfPerimetr;
        height = halfPerimetr;
        return length * height;
    }

    public static void main(String[] args) {

        System.out.println(square(6, 2));
        System.out.println(square(4, 1));

    }
}
