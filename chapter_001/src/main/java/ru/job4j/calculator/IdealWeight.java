package ru.job4j.calculator;

public class IdealWeight {

    public static final double INDEX = 1.15;

    public static double manWeight (int height) {
        return (height - 100) * INDEX;
    }

    public static double womanWeight (int height) {
        return (height - 110) * INDEX;
    }

    public static void main(String[] args) {

        int manWght = 175;
        int womanWght = 163;

        double idealManWeight = manWeight(manWght);
        double idealWomanWeight = womanWeight(womanWght);

        System.out.println("Ideal weight for Man " + manWght + " is " + idealManWeight);
        System.out.println("Ideal weight for Woman " + womanWght + " is " + idealWomanWeight);

    }
}
