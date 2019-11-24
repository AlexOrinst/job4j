package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] arr) {
        FindLoop fl = new FindLoop();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int min = MinDiapason.findMin(arr, i, arr.length - 1);
            int index = fl.indexOf(arr, min, i, arr.length - 1);
            temp = min;
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
