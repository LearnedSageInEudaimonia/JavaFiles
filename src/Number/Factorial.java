package javaBasicPrograms.basic.Number;

import java.util.Scanner;

 // A java program to find factorial of a Number

public class Factorial {
    public static void main(String[] args) {

        //input the values from keyboard

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = read.nextInt();

        // to find factorial just using loop
        int fact =1;
        for(int i = 1 ; i<=n; i++) fact *= i;
        System.out.println(fact + " (Using the loop)");


        // call the method factorial and print the output
        System.out.println(factorial(n) + " (Using Recursive Method)");
    }
    // method named factorial to return the output
    static int factorial(int n) {
        if(n==0) return 1;
        else return (n * factorial(n-1));
    }
}
