package javaBasicPrograms.basic.Number;

import java.util.Scanner;
// A java program  to check whether the Number is Armstrong or not
public class ArmstrongNumber {
    public static void main(String[] args) {

        //input the value from the Keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = read.nextInt();

        //call the method and print the output
        if(isArmstrong(n)) System.out.println("ArmStrong NUmber");
        else System.out.println("Not a ArmStrong Number");
    }

    // a method named isArmstrong return true if Armstrong else false
    private static boolean isArmstrong(int n) {
        int digits = 0, temp = n , rem , sum = 0;

        // to count the number or digits
        while(n > 0){
            n= n/10;
            digits++;
        }

        // reassign the n  with temp
        n = temp;

        // find the armstrong Number
        while(n>0){
            rem = n%10;
            sum = (int) (sum + (Math.pow(rem,digits)));
            n = n/10;
        }
        // return true if equal or false if not equal
        return temp == sum;

    }
}
