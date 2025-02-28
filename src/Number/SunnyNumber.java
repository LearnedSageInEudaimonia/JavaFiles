package javaBasicPrograms.basic.Number;

import java.util.Scanner;
// a java method to check whether the Number is SunnyNumber or not
public class SunnyNumber {
    public static void main(String[] args) {
        // input the values from keyboard
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int t = read.nextInt();

        // call the method and print output
        if(isSunny(t)) System.out.println("Sunny Number");
        else System.out.println("Not a Sunny Number");
    }
   // method named isSunny returns true if sunnyNumber else false
    private static boolean isSunny(int t) {

        double num = Math.sqrt(t+1);
        return (num - Math.floor(num)==0);
    }

}
