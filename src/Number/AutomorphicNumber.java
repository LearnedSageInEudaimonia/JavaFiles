package javaBasicPrograms.basic.Number;

import java.util.Scanner;
// a java program to find whether number is automorphic or not

public class AutomorphicNumber {
    // input the values
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = read.nextInt();

    // call the method and print the output
        if(isAutomorphic(n)) System.out.println("Automorphic Number");
        else System.out.println("Not a Automorphic Number");
    }
    // a method named isAutomorphic  return true if automorphic else false if not
    private static boolean isAutomorphic(int n) {
        int square = n*n;
        String  str = String.valueOf(n);
        String squarest = String.valueOf(square);
        return  squarest.endsWith(str);
    }

}
