package org.example;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] numbers) {
        long startTime = System.nanoTime();

        sortRecursive(numbers);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Time complexity: O(n log n)");
        System.out.println("Execution time: " + duration + " nanoseconds");
    }

    private void sortRecursive(int[] numbers) {
        if (numbers.length < 2) {
            return; // Base case: Arrays with 0 or 1 element are already sorted.
        }

        int middle = numbers.length / 2;

        int[] left = new int[middle];
        int[] right = new int[numbers.length - middle];

        for (int x = 0; x < middle; x++) {
            left[x] = numbers[x];
        }

        for (int y = middle; y < numbers.length; y++) {
            right[y - middle] = numbers[y];
        }


        sortRecursive(left);
        sortRecursive(right);
        merge(left, right, numbers);

    }

    private void merge(int[] left, int[] right, int[] result) {
        int x = 0, y = 0, z = 0;

        while (x < left.length && y < right.length) {
            if (left[x] <= right[y]) {
                result[z++] = left[x++];
            } else {
                result[z++] = right[y++];
            }
        }

        while (x < left.length) {
            result[z++] = left[x++];
        }

        while (y < right.length) {
            result[z++] = right[y++];
        }
    }
}
