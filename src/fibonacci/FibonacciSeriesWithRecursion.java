package javaBasicPrograms.basic.fibonacci;

import java.util.Scanner;

// A java Code for printing Fibonacci series for n values with Recursion

public class FibonacciSeriesWithRecursion {

    // declaring and initializing variable outside main method
    // so that it can be used by both main method and fibonacci method.
    static int  n1 = 0 , n2= 1,n3;

    //main function
    public static void main(String[] args) {

        //input from the Keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the n for the fibonacci series");
        int n = read.nextInt();

        //for values 0 & 1
        if(n>=0) System.out.print(n1 + " ");
        if(n>=1) System.out.print(n2 + " ");

        //calling a method
        fibonacci(n);

    }

    // a recursive method
    static void fibonacci(int n ){
       if(n>1){
           n3 = n1+n2;
           n1=n2;
           n2 =n3;
           System.out.print(n3 + " ");
           fibonacci(n-1);

        }
    }
}
