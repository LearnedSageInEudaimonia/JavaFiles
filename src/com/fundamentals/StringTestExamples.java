package com.fundamentals;
import edu.princeton.cs.algs4.*;
public class StringTestExamples {
    public boolean isPalindrome(String s){
        int N = s.length();
        for(int i = 0; i < N/2; i++){
            if(s.charAt(i) != s.charAt(N-1-i))
                return false;
        }
        return true;
    }
    public static void extractFileNameAndExtension(){
        String s = "HelloWorld.java";
        int  dot = s.indexOf('.');
        String base = s.substring(0,dot);
        String extension = s.substring(dot+1);
        System.out.println(base + extension);
    }

    public static boolean isSorted(String[] a){
        for(int i = 1; i < a.length; i++){
            if(a[i-1].compareTo(a[i]) > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        extractFileNameAndExtension();
        String[] arr = {"Hello", "world"};
        System.out.println(isSorted(arr));
    }

}
