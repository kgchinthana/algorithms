package org.example;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] numbers) {
        long startTime = System.nanoTime();

        for (int x = 0; x < numbers.length - 1; x++) {
            int minIndex = x;
            for (int y = x + 1; y < numbers.length; y++) {
                if (numbers[y] < numbers[minIndex]) {
                    minIndex = y;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[x];
            numbers[x] = temp;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Time complexity: O(n^2)");
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}
