package ru.job4j.loop;

public class PrimeNumbers {

    public int calc(int finish) {
        CheckPrimeNumber check = new CheckPrimeNumber();
        int count = 0;
            for (int i = 2; i <= finish; i++) {
                if (check.isPrime(i)) {
                    count++;
                }
            }
        return count;
    }
}

