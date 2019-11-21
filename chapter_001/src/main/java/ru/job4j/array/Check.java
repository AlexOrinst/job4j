package ru.job4j.array;

public class Check {

    public boolean mono(boolean[] arr) {
        boolean rsl = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
