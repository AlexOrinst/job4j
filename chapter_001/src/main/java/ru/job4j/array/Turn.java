package ru.job4j.array;

public class Turn {

    public int[] back(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = tmp;
        }
        return array;
    }

}
