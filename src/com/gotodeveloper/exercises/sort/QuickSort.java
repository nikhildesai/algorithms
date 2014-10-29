package com.gotodeveloper.exercises.sort;

public class QuickSort {

    int[] sort(int[] input) {

        return quickSort(input, 0, input.length - 1);

    }

    private int[] quickSort(int[] input, int i, int j) {
        if (i < j) {
            int k = partition(input, i, j);
            quickSort(input, i, k);
            System.out.println("quickSort(input," + i + "," + k + ")");
            quickSort(input, k + 1, j);
            System.out.println("quickSort(input," + (k + 1) + "," + j + ")");

        }
        return input;
    }

    private int partition(int[] input, int i, int j) {
        int x = input[j];
        int n = i - 1;
        for (int m = i; m < j; m++) {
            if (input[m] < x) {
                n++;
                int temp1 = input[n];
                input[n] = input[m];
                input[m] = temp1;
            }
        }
        int temp2 = input[j];
        input[j] = input[n + 1];
        input[n + 1] = temp2;
        return n;
    }

}
