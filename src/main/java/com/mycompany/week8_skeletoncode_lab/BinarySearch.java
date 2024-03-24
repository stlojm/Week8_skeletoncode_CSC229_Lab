package com.mycompany.week8_skeletoncode_lab;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int key = 13;
        int low = 0;
        int high = sortedArray.length - 1;

        int index = BinarySearch.runBinarySearchIteratively(sortedArray, key, low, high);

        if (index != Integer.MAX_VALUE) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Time complexity: O(log n)
        // Space complexity: O(1)
    }
}

