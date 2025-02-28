package javaBasicPrograms.basic.primeNumbers;

import java.util.Scanner;

// A java program to input a range values and print the prime numbers between them.

public class PrimeNumberWithinARange {
    public static void main(String[] args) {

        //input values from the keyboard

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int start = read.nextInt();
        int end = read.nextInt();

       // to print values between the range

        for(int i = start ; i<end; i++){
            if(isPrime(i)) System.out.print(i +" ");
        }

    }
    private static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i = 2 ; i <= Math.sqrt(n); i++){
            if(n%i ==0) return  false;

        }
        return  true;
    }
}
