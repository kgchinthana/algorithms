package org.example;

public class LinearSearch {
    public void search(int[] array, int target) {
        long startTime = System.nanoTime(); // Start timing

        for (int x = 0; x < array.length; x++) {
            if (array[x] == target) {
                long endTime = System.nanoTime();
                System.out.println("Target found at index: " + x);
                System.out.println("Time complexity: O(n)");
                System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
                return;
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Target not found in the array.");
        System.out.println("Time complexity: O(n)");
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }
}
