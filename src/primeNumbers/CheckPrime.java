package javaBasicPrograms.basic.primeNumbers;

import java.util.Scanner;
// A java program to find the given number is prime or not
public class CheckPrime {
    public static void main(String[] args) {

        //input the value from the keyboard
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = read.nextInt();

        // call the method and print the output
        if(isPrime(n))  System.out.println( n + " - Prime Number" );
        else System.out.println(n + " - Not a prime Number");
    }
 // a method named isPrime
 // returns true if prime else return false if not
    public static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i = 2 ; i <= Math.sqrt(n); i++){
            if(n%i ==0) return  false;

        }
        return  true;
    }
}
