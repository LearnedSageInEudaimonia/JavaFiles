package com.fundamentals1_1;

public class Continuation {
    public static void main(String[] args) {
        System.out.println(lg(16));
    }
    public static double lg(double n ){
        double quotient=0;
        while(n>0){
            quotient += n/2;
            n=n/2;
        }
        return quotient;
    }
}
