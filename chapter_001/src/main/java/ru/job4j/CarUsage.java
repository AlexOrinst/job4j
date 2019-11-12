package ru.job4j;

public class CarUsage {
    public static void main(String[] args) {
        Car vesta = new Car();
        System.out.println("Can you drive?");
        boolean canDrive = vesta.canDrive();
        String carAnswer = canDrive ? "I can drive" : "I can't drive";
        System.out.println(carAnswer);
        System.out.println("Can you drive? " + canDrive);
        System.out.println("I'm going to a GAS stantion!");
        int gas = 50;
        vesta.fill(gas);
        System.out.println("Can you drive now? " + canDrive);
        System.out.println("OK! LET'S FCKN GO!!!");
        int distance = 100;
        vesta.drive(distance);
        vesta.gasInfo();

    }
}
