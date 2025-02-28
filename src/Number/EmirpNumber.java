package javaBasicPrograms.basic.Number;

import java.util.Scanner;

import static javaBasicPrograms.basic.primeNumbers.CheckPrime.isPrime;
// a java program to check whether the Number is spyNumber or Not
public class EmirpNumber {
    public static void main(String[] args) {
        // input the values from the Keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = read.nextInt();

        // call the method and print the output
        if(isEmirp(n)) System.out.println("Emirp Number");
        else System.out.println("Not a Emirp Number");
    }

    // a method named isEmirp return true if Emirp Number else false
    private static boolean isEmirp(int n) {
     int rem , reverseNumber=0, temp = n;
        while(n>0){
            rem = n%10;
            reverseNumber = reverseNumber*10 + rem;
            n = n/10;
        }
        return (isPrime(temp)&& isPrime(reverseNumber));
    }
}
