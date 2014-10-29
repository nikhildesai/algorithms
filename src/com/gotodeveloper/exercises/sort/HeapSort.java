package com.gotodeveloper.exercises.sort;

public class HeapSort {

    int heapSize = 0;

    void sort(int[] input) {

        buildMaxHeap(input);
        for (int n = input.length - 1; n >= 1; n--) {
            int temp = input[n];
            input[n] = input[0];
            input[0] = temp;
            System.out.println(input[n]);
            heapSize--;
            maxHeapify(input, 0);
        }
        System.out.println(input[0]);
    }

    private void buildMaxHeap(int[] input) {
        heapSize = input.length;
        for (int i = (input.length - 1) / 2; i >= 0; i--) {
            maxHeapify(input, i);
        }
    }

    private void maxHeapify(int[] input, int i) {
        if (heapSize == 1)
            return;
        int left = left(i);
        int right = right(i);

        int largest = i;
        if (left < heapSize && input[left] > input[i]) {
            largest = left;
        }
        if (right < heapSize && input[right] > input[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = input[largest];
            input[largest] = input[i];
            input[i] = temp;
        }
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }
}