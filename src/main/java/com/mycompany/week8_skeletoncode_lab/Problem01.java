package com.mycompany.week8_skeletoncode_lab;

public class LinearSearch {
 
    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i; // element found at index i
            }
        }
        return -1; // element not found
    }
    
   
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 11, 15, 20};
        int target = 11;
        int index = search(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
