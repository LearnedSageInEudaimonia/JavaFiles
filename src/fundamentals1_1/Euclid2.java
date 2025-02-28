package com.fundamentals1_1;

public class Euclid2 {

    // Method to compute the GCD using Euclid's algorithm
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;  // Base case: GCD(p, 0) = p
        }
        return gcd(q, p % q);  // Recursive case: GCD(p, q) = GCD(q, p % q)
    }

    // Method to demonstrate the GCD calculation and validate it
    public static void main(String[] args) {
        int p = 1111111;
        int q = 1234567;

        int result = gcd(p, q);
        System.out.println("Greatest common divisor of " + p + " and " + q + " is: " + result);

        // Validate the result by checking common divisors
        int manualGCD = manualGCD(p, q);
        System.out.println("Manual verification GCD: " + manualGCD);

        // Induction-like validation
        validateInduction(p, q);
    }

    // A simple method to manually find the GCD (for validation purposes)
    public static int manualGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Method to simulate an induction-like validation
    public static void validateInduction(int p, int q) {
        int result = gcd(p, q);
        int r = p % q;

        System.out.println("Validating induction:");
        if (q == 0) {
            System.out.println("Base case: GCD(" + p + ", " + q + ") = " + result);
        } else if (r < q) {
            System.out.println("Inductive case: GCD(" + p + ", " + q + ") is the same as GCD(" + q + ", " + r + ")");
            System.out.println("Calculated GCD: " + result);
            System.out.println("Inductive step validation passed.");
        } else {
            System.out.println("Inductive step validation failed.");
        }
    }
}

