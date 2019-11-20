package ru.job4j.array;

public class Check {

    public boolean mono(boolean[] arr) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                count1++;
            } else if (!arr[i]) {
                count2++;
            }
        }
        return count1 == arr.length || count2 == arr.length;
    }

}
