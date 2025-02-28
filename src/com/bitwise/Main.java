package com.practice.bitwise;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static int a = 10;




    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2,2,4,74,5,7,7,4};
        System.out.println(ans(arr));
        System.out.println((a & 1) == 0 ? "Even" : "Odd");
    }
    static int ans(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique^=n;
        }
        return unique;
    }
}