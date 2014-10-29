package com.gotodeveloper.exercises.sort;

import org.junit.Test;

public class HeapSortTest {
    HeapSort sort = new HeapSort();

    @Test
    public void test() {
        int[] input = new int[] { 5, 2, 4, 10, 3 };
        sort.sort(input);
    }

}
