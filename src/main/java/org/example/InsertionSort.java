package org.example;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] numbers) {
        long startTime = System.nanoTime();

        for (int x = 1; x < numbers.length; x++) {
            int current = numbers[x];
            int y = x - 1;

            while (y >= 0 && numbers[y] > current) {
                numbers[y + 1] = numbers[y];
                y--;
            }
            numbers[y + 1] = current;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Time complexity: O(n^2)");
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}
