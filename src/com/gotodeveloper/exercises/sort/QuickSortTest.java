package com.gotodeveloper.exercises.sort;

import org.junit.Test;

public class QuickSortTest {
    QuickSort sort = new QuickSort();

    @Test
    public void test() {
        int[] input = new int[] { 5, 2, 4, 10, 3 };
        
        for (int i : sort.sort(input)) {
            System.out.println(i);
        }
    }

}
