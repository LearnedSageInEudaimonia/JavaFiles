package javaBasicPrograms.basic.Number;

import java.util.Scanner;
// a java program to check whether the Number is Duck Number or Not
public class DuckNumber {
    public static void main(String[] args) {

        // Input the values from the Keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = read.nextInt();

        //call the method and print the output
        if(isDuck(n)) System.out.println("Duck Number");
        else System.out.println("Not a Duck Number");
    }

    // a method named isDuck returns true if duckNumber else false
    private static boolean isDuck(int n) {
        String str = String.valueOf(n);
        return str.contains("0") && str.charAt(0) != 0;
    }
}
