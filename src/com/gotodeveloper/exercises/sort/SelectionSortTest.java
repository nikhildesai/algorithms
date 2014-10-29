package com.gotodeveloper.exercises.sort;

import org.junit.Test;

public class SelectionSortTest {

    SelectionSort sort = new SelectionSort();

    @Test
    public void test() {
        int[] input = new int[] { 5, 2, 4, 10, 3 };
        int[] output = sort.sort(input);
        for (int i : output) {
            System.out.println(i);
        }
    }

}
