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

    public int indexOf(int[] arr, int elem, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (arr[i] == elem) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
