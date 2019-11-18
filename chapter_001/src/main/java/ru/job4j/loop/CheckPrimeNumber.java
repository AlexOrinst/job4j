package ru.job4j.loop;

public class CheckPrimeNumber {

    public boolean isPrime(int num) {
        boolean isPrime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
        }
        return isPrime;

    }

}
