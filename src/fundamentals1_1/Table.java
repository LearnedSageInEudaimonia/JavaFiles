package com.fundamentals1_1;


import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.printf("%-18s %10s %10s %10s%n","Name","Value 1", "Value 2" , "Result");
        System.out.println("-----------------------------------------------------------");
        while(read.hasNext()){
            String line = read.nextLine();
            String[] parts = line.split(" ");

            if(parts.length ==3) {
                String name = parts[0];
                int value1 = Integer.parseInt(parts[1]);
                int value2 = Integer.parseInt(parts[2]);

                double result = (value2 != 0) ? (double) value1 / value2 : Double.NaN;

                System.out.printf("%-20s %10d %10d %10.3f%n", name.toUpperCase(), value1, value2, result);
            }
            else System.out.println("Invalid Input format.Please Enter Valid Input format");
            }
        }
    }

