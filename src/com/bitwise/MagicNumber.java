package com.practice.bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        int n= 3;
        int base = 5;
        int ans = 0;
        while(n>0){
            int last = n&1;
            n=n>>1;
            ans+= last*base;
            base = base*5;

        }
        System.out.println(ans);
    }
}
