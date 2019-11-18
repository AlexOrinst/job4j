package ru.job4j.loop;

public class PrimeNumbers {

    public int calc(int finish) {
        int count = 0;
        if (finish > 1) {
            for (int i = 2; i <= finish; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        return count;
    }
}

