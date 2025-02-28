package com.fundamentals1_1;

public class ValueOfLn {
    private static double ln(double n){
        if(n==0||n==1){
            return 0;
        }
        return Math.log(n)+ ln(n-1);
    }

    public static void main(String[] args) {
        System.out.println(ln(10));
    }
}
