package com.gotodeveloper.exercises.sort;

public class SelectionSort {

    public int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }
        }

        return array;
    }

}
