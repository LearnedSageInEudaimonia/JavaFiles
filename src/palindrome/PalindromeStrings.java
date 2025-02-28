package javaBasicPrograms.basic.palindrome;

import java.util.Scanner;

public class PalindromeStrings {
    public static void main(String[] args) {

        //input the String the keyboard
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = read.next().trim();

        // call the method isPalindrome and print the output

        if(isPalindrome(str)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");


    }
   //  a method named isPalindrome to check whether palindrome or not
    private static boolean isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length()-1 ; i > -1; i--){
            reverse.append(str.charAt(i));

        }
        return str.equals(reverse.toString());
    }
}
