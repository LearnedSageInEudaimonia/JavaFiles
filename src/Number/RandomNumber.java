package javaBasicPrograms.basic.Number;

import java.util.Random;
import java.util.Scanner;

// A java program to generate Random Numbers

public class RandomNumber {
    public static void main(String[] args) {
        // input the values from the Keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number of Test Cases : ");
        int t = read.nextInt();

        // creating an object Random
        Random random = new Random();

        for(int i = 0 ; i < t ; i++){
            // using Math.random methods
            System.out.println(Math.random() + " (Using Math.random)");

            //using "Random" methods
            System.out.println(random.nextInt() +" (Using the random function {Integer} )");
            System.out.println(random.nextDouble() +" (Using the random function {Double} )");
            System.out.println(random.nextFloat() +" (Using the random function {Float} )");
            System.out.println(random.nextLong() +" (Using the random function {Long} )");
            System.out.println(random.nextBoolean() +" (Using the random function {Boolean} )");

        }
    }
}
