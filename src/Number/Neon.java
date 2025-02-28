package javaBasicPrograms.basic.Number;

import java.util.Scanner;

// A java program to check whether Neon Number or Not
public class Neon {
    public static void main(String[] args) {

        // input the values from the keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = read.nextInt();

        // call the method and print the output
        if(isNeon(n)) System.out.println("Neon Number");
        else System.out.println("Not a Neon Number");
    }

    //a method names isNeon returns true if NeonNumber else false
    private static boolean isNeon(int n) {
        int square = n*n, rem,sum =0;
        while(square>0){
            rem = square%10;
            sum += rem;
            square = square/10;
        }
        return (n == sum);
    }


}
