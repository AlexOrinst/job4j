package ru.job4j.loop;

public class Fitness {

    public int calc (int ivan, int nik) {
        int count = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            count++;
        }

        return count;
    }

}


