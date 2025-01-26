package org.example;

public class RecursiveBinarySearch {

    private long startTime;

    public void search(int[] array, int target, int left, int right) {

        if (left == 0 && right == array.length - 1) {
            startTime = System.nanoTime();
        }

        if (right < left) {
            long endTime = System.nanoTime();
            System.out.println("Target not found in the array.");
            System.out.println("Time complexity: O(log n)");
            System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
            return;
        }

        int middle = (left + right) / 2;

        if (target == array[middle]) {
            long endTime = System.nanoTime();
            System.out.println("Target found at index: " + middle);
            System.out.println("Time complexity: O(log n)");
            System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
            return;
        }

        if (target < array[middle]) {
            search(array, target, left, middle - 1);
        } else {
            search(array, target, middle + 1, right);
        }
    }
}
