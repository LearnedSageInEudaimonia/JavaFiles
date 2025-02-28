package javaBasicPrograms.basic.patterns;

import java.util.Scanner;

// a java program to print the below pattern
/*
   *
   * *
   * * *
   * * * *
   * * * * *
 */
public class RightTrianglePattern {
    public static void main(String[] args) {
        //input the number of rows needed
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int n = read.nextInt();

        // loop to print the pattern
        for(int i = 0 ; i <= n; i++){ // for the rows
            for(int j = 0 ; j< i; j++){ // for the columns
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
}
