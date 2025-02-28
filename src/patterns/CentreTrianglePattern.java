package javaBasicPrograms.basic.patterns;

import java.util.Scanner;
// a java program to print below pattern
//                   *
//                  * *
//                 * * *
//                * * * *
//               * * * * *

public class CentreTrianglePattern {
    public static void main(String[] args) {
        //input the number of rows needed
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int n = read.nextInt();

        // loop to print the pattern
        for(int i = 0 ; i < n; i++){

            for(int j = 1 ; j<n-i+1; j++){ // for the columns
                System.out.print(" ");
            }
            // for the rows
            for(int j = 0 ; j<= i; j++){ // for the columns
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
}
