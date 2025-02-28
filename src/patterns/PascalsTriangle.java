package javaBasicPrograms.basic.patterns;

import java.util.Scanner;

// a java program to print pascals triangle
//                1
//               1 1
//              1 2 1
//             1 3 3 1
//            1 4 6 4 1


public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int n = read.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");// for spaces
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);// for the Numbers
            }
            System.out.println();
        }
    }
}
