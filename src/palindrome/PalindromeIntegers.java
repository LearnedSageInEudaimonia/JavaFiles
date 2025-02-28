package javaBasicPrograms.basic.palindrome;

import java.util.Scanner;

// A java program to check whether palindrome or not

public class PalindromeIntegers {
    public static void main(String[] args) {

        // input values from the keyboard

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = read.nextInt();

        //call the method and print the output
        if(isPalindrome(n)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }

    // a static method to check whether palindrome or not
    private static boolean isPalindrome(int n) {
        int temp = n;
        int reversedNumber = 0 , rem;
        while(n>0){
            rem = n % 10;
            reversedNumber = reversedNumber*10 +rem;
            n = n/10;
        }
        return reversedNumber == temp;
    }
}
