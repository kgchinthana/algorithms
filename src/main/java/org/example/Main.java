package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,25,10,4,1,89,5,2,7,57,24,35};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(numbers);

    }
}