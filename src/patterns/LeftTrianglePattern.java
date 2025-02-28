package javaBasicPrograms.basic.patterns;

import java.util.Scanner;
// a java program to print below pattern
/*
      *
     **
    ***
   ****
  *****
 */
public class LeftTrianglePattern {
    public static void main(String[] args) {
        // input the number of rows
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int n = read.nextInt();

        // loop to print the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
