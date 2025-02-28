package javaBasicPrograms.basic.Number;

import java.util.Scanner;

import static javaBasicPrograms.basic.Number.Factorial.factorial;

// a java program to  check the Number is peterson Number
public class PetersonNumber {
    public static void main(String[] args) {
        // input the values from keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int t = read.nextInt();

        // call the method and print output
        if(isPeterson(t)) System.out.println("Peterson Number");
        else System.out.println("Not a Peterson Number");
    }


   // method named isPeterson return true if peterson Number returns false if not
    private static boolean isPeterson(int t) {
        int temp = t, rem =0, sum =0;
        while(t >0){
            rem =t % 10;
            sum = sum + factorial(rem);
            t = t/10;

        }
        return temp == sum;

    }


}
