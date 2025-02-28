package javaBasicPrograms.basic.Number;

import java.util.Scanner;

// A java program to check whether the Number is spy Number or Not
public class SpyNumber {
    public static void main(String[] args) {

        // input the value from the keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = read.nextInt();

        // call the method and print the output
        if(isSpy(n)) System.out.println("Spy Number");
        else System.out.println("Not a Spy Number");
    }
//a method named isSpy returns true if spyNumber else false
    private static boolean isSpy(int n) {
        int sum =0 , multi =1, rem ;
         while(n>0){
            rem = n%10;
            sum += rem;
            multi *= rem;
            n = n/10;
        }
         return sum== multi;
    }
}
