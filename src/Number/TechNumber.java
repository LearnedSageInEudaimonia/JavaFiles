package javaBasicPrograms.basic.Number;

import java.util.Scanner;
// a java program to check number is tech Number or Not
public class TechNumber {
    public static void main(String[] args) {

        // input the values from the keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int  n = read.nextInt();

        // call the method and print the output
        if(isTech(n)) System.out.println("Tech Number");
        else System.out.println("Not a Tech Number");
    }

    // method named isTech returns true if tech number else returns false
    private static boolean isTech(int n) {
        int temp = n;
        int digits=0;


        // to count number of digits
        while(n>0){
            n= n/10;
            digits++;
        }

        int tech = 0;

        // return false if digits is odd
        if(digits%2 != 0) return  false;

        // to calculate the tech Number and check if it matches with original input
        else{
                int firstHalf = (int) (temp % Math.pow(10, digits/2));
                int secondHalf = (int) ( temp / Math.pow(10,digits/2));
                tech = (int) Math.pow(firstHalf+secondHalf, 2);

                return temp == tech;
        }
    }


}
