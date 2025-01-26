package org.example;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] numbers) {
        long startTime = System.nanoTime();
        boolean isSorted;

        for (int x = 0; x < numbers.length; x++) {
            isSorted = true;
            for (int y = 1; y < numbers.length - x; y++) {
                if (numbers[y] < numbers[y - 1]) {
                    swap(numbers, y - 1, y);
                    isSorted = false;
                }
            }
            if (isSorted) {
                timeComplexity(startTime, numbers);
                return;
            }
        }
        timeComplexity(startTime, numbers);
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private void timeComplexity(long startTime, int[] numbers) {
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Time complexity: O(n^2)");
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}
