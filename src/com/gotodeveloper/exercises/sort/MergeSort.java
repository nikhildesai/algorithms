package com.gotodeveloper.exercises.sort;

public class MergeSort {

    int[] mergeSort(int[] input, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(input, start, mid);
            System.out.println("mergeSort(input, " + start + "," + mid + ")");
            System.out.println("mergeSort(input, " + (mid + 1) + "," + end + ")");
            mergeSort(input, mid + 1, end);
            System.out.println("mergeSort(input, " + (mid + 1) + "," + end + ")");

            merge(input, start, mid, end);
        }
        return input;
    }

    void merge(int[] input, int start, int mid, int end) {
        if (start == end)
            return;

        int leftLength = mid - start + 1;
        int[] leftHalf = new int[leftLength];
        for (int i = 0; i < leftLength; i++) {
            leftHalf[i] = input[start + i];
        }

        int rightLength = end - mid;
        int[] rightHalf = new int[rightLength];
        for (int i = 0; i < rightLength; i++) {
            rightHalf[i] = input[mid + i + 1];
        }

        int m = 0;
        int n = 0;
        int temp = start;
        while (m < leftLength && n < rightLength) {
            if (leftHalf[m] < rightHalf[n]) {
                input[temp++] = leftHalf[m++];

            } else {
                input[temp++] = rightHalf[n++];
            }
        }

        while (m < leftLength) {
            input[temp++] = leftHalf[m++];
        }

        while (n < rightLength) {
            input[temp++] = rightHalf[n++];
        }

    }
}