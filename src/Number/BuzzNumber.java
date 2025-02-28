package javaBasicPrograms.basic.Number;

import java.util.Scanner;
// a java program to check the Number is Buzz Number or Not

public class BuzzNumber{
    public static void main(String[] args) {

        // input the value from the Keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = read.nextInt();

        // check whether it ends with 7 or divisible by 7
        // print the output
        if(n % 10 == 7 || n % 7 == 0) System.out.println("Buzz Number");
        else System.out.println("Not a Buzz Number");
    }
}
