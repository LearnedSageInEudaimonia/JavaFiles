package javaBasicPrograms.basic.primeNumbers;

import java.util.Scanner;

public class CheckPrimeOrComposite {
    public static void main(String[] args) {

        //input the values from the keyboard

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : " );
        int n = read.nextInt();

        //call the method and print the output
        if(n<=1) System.out.println("Neither Prime Nor Composite");
        else{
            if(isPrime(n)) System.out.println("Prime Number");
            else System.out.println("Composite Number");
        }

    }

    // a method named isPrime to check prime or not
    private static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i = 2 ; i <= Math.sqrt(n); i++){
            if(n%i ==0) return  false;

        }
        return  true;
    }
}
