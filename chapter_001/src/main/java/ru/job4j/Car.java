package ru.job4j;

public class Car {
    private double volume;

    public void drive(int km){
        this.volume -= km;
        boolean canDrive = this.volume > 0;
        if (canDrive){
            System.out.println("Yeap! Let's go!");
        }else {
            System.out.println("Nope! I'm hungry!");
        }
    }

    public void fill(int gas) {
        this.volume = this.volume + gas * 10;
    }

    public boolean canDrive () {
        boolean result = this.volume > 0;
        if (result) {
            System.out.println("Yeap! Let's go!");
        }else {
            System.out.println("Nope! I'm hungry!");
        }
        return result;
    }

    public void gasInfo () {
        System.out.println("I can drive " + this.volume + " kms");
    }
}
