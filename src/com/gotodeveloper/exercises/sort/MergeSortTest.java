package com.gotodeveloper.exercises.sort;

import org.junit.Test;

public class MergeSortTest {
    MergeSort mergeSort = new MergeSort();

    @Test
    public void test() {
        int[] input = new int[] { 5, 2, 4, 10, 3 };
        int[] output = mergeSort.mergeSort(input, 0, input.length - 1);
        for (int i : output) {
            System.out.println(i);
        }
    }

}
