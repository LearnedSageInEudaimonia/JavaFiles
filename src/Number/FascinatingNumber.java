package javaBasicPrograms.basic.Number;

import java.util.Scanner;

// A java program to check whether the number is fascinating Number
public class FascinatingNumber {
    public static void main(String[] args) {

        //input the values from Keyboard
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = read.nextInt();

        //call the method and print the output
        if(isFascinating(n)) System.out.println("Fascinating Number");
        else System.out.println("Not a Fascinating Number");
    }
    // a method named isFascinating returns true if fascinating else false
    private static boolean isFascinating(int n) {
        int temp = n;
        if(n/100 ==0) return  false;
        else{
            String str = n +""+  n*2 + "" +  n*3;
            System.out.println(str);
            return contains1to9(str);
        }
    }
    // method named contains1to9 returns true if contains all digits
    // from 1 to 9 and exactly once
    private static boolean contains1to9(String str) {
        if(str.length()!=9) return  false;
        for(char ch = '1'; ch<='9' ;ch++){
            if(str.indexOf(ch)==-1) return false;
        }
        return  true;
    }
}
