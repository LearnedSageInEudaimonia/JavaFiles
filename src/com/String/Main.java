package com.practice.String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String t = read.next();
        System.out.println(isPalindrome(t));

    }
    static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        System.out.println(end);
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
