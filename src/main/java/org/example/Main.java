package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 25, 10, 4, 1, 89, 5, 2, 7, 57, 24, 35};

        System.out.println("========================Sort Algorithms========================");

        // Bubble Sort
        int[] bubbleSortArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("\nBubble Sort:");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(bubbleSortArray);

        // Selection Sort
        int[] selectionSortArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("\nSelection Sort:");
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(selectionSortArray);

        // Insertion Sort
        int[] insertionSortArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("\nInsertion Sort:");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(insertionSortArray);

        // Merge Sort
        int[] mergeSortArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("\nMerge Sort:");
        MergeSort mergeSort = new MergeSort();
        int[] sortArray = mergeSort.sort(mergeSortArray);

        System.out.println("========================Search Algorithms========================");

        // Linear Search
        System.out.println("\nLinear Search:");
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.search(numbers, 24);

        // Recursive Binary Search
        System.out.println("\nRecursive Binary Search:");
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        recursiveBinarySearch.search(sortArray, 24, 0, numbers.length - 1);

        // Iterative Binary Search
        System.out.println("\nIterative Binary Search:");
        IterativeBinarySearch iterativeBinarySearch = new IterativeBinarySearch();
        iterativeBinarySearch.search(sortArray, 24);

    }
}
