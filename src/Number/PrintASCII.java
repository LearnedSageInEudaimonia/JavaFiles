package javaBasicPrograms.basic.Number;

import java.util.Scanner;
// a java program to print Ascii values of a character

public class PrintASCII {
    public static void main(String[] args) {
        //input the character
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = read.next().trim().charAt(0);

        // print the ascii values
        System.out.println((int)(ch));
    }
}
