package ru.job4j.loop;

public class CheckPrimeNumber {

    public boolean isPrime(int num) {
        boolean isPrime = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
            isPrime = true;
        }
        return isPrime;
    }
}
