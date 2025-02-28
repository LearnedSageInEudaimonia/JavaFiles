package com.practice.bitwise;

public class RangeXor {
    public static void main(String[] args) {
        String s = "    42";
        String m = s.trim();
        StringBuilder str = new StringBuilder(m);

        boolean neg = false;
        if(str.charAt(0)=='-'){
            str.deleteCharAt(0);
            neg = true;
        }
        if(neg) System.out.println(-1*Integer.parseInt(String.valueOf(str)));
        else System.out.println(String.valueOf(str)+10);
    }
}
