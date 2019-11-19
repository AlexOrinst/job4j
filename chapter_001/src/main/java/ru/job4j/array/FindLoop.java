package ru.job4j.array;

public class FindLoop {

    public int indexOf(int[] arr, int elem) {
        int rst = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
