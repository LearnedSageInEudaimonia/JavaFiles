package javaBasicPrograms.basic.fibonacci;

import java.util.Scanner;


 //  A java Code for printing fibonacci series for n values without using Recursion


public class FibonacciSeriesWithoutRecursion {
    public static void main(String[] args) {
        // Input from the Keyboard
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the n in Fibonacci Series : ");
        int n = read.nextInt();

        //declaring and initializing the variables
        int n1 = 0 , n2 = 1,n3;

        // for 0, 1 values of n
        if(n>=0) System.out.print(n1 + " ");
        if(n>=1) System.out.print(n2 + " ");

        //Using While Loop for values from 2 to n-1;
        for(int i = 2 ; i < n; i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }
    }
}
