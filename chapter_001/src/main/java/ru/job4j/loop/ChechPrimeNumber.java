package ru.job4j.loop;

public class ChechPrimeNumber {

    public boolean isPrime (int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++)
                if(num % i == 0)
                    return false;
            return true;
        } else {
            return false;
        }
    }

}
