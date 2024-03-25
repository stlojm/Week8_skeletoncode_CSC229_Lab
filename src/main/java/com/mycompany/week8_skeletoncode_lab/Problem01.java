/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 * Problem01: A class containing a method to calculate the sum of prime numbers between 1 and n.
 */
public class Problem01 {
    
    /**
     * Returns the sum of prime numbers between 1 and n.
     * 
     * @param n The upper limit for finding prime numbers.
     * @return The sum of prime numbers between 1 and n.
     */
    public static long getSumOfPrimes(int n) {
        long sum = 0; // Variable to store the sum of prime numbers
        
        // Iterate through numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // Check if the current number is prime
                sum += i; // If prime, add it to the sum
            }
        }
        
        return sum; // Return the sum of prime numbers
    }
    
    /**
     * Checks if a number is prime.
     */
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }
        
        // Check for divisibility from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, not prime
            }
        }
        
        return true; // If not divisible, prime
    }
    
    public static void main(String[] args) {
        // Test the getSumOfPrimes method
        int n = 10; // Test with n = 10
        long sumOfPrimes = getSumOfPrimes(n);
        System.out.println("Sum of prime numbers between 1 and " + n + " is: " + sumOfPrimes);
    }
}
