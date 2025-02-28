package javaBasicPrograms.basic.Number;

import java.util.Scanner;

// a java program to check whether the Number is Evil Number or Not
public class EvilNumber {
    public static void main(String[] args) {
        //input the value from the keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = read.nextInt();

        //call the method and print the output
        if(isEvil(n)) System.out.println("Evil Number");
        else System.out.println("Not a Evil Number");
    }
    // a method named isEvil returns true if Evil Number else false
    private static boolean isEvil(int n) {
        int digits = 0;
        String s = Integer.toBinaryString(n);
        for(int i = 0 ; i < s.length(); i++  ){
            if(s.charAt(i)=='1') digits++;
        }
        return (digits%2==0);
    }
}
