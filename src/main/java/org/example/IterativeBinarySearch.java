package org.example;

public class IterativeBinarySearch {

    public void search(int[] array, int target){
        long startTime = System.nanoTime();

        int left = 0;
        int right = array.length - 1;

        while (left <= right){

            int middle = (left + right) / 2;
            if (target == array[middle]){
                long endTime = System.nanoTime();
                System.out.println("Target found at index: " + middle);
                System.out.println("Time complexity: O(log n)");
                System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
                return;
            }

            if(target < array[middle]){
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Target not found in the array.");
        System.out.println("Time complexity: O(log n)");
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }
}
