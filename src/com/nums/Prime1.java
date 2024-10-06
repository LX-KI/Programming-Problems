package com.nums;

import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if Prime or not");
        int n = sc.nextInt();
        System.out.println(isPrime(n)?"is a prime":"not a prime");
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println("Prime numbers are always greater than 1");
            return false;
        }
        if (n == 2) {
            System.out.println("2 is the only even Prime number");
            return true;
        }
        if (n % 2 == 0) {
            System.out.println("Even numbers other than 2 are not prime numbers");
            return false;
        }

        // Looping through only odd numbers, starting from 3
        // Incrementing by 2 to skip even numbers
        for (int i = 3; i <= Math.sqrt(n); i+=2) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
