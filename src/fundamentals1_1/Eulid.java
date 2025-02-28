package com.fundamentals1_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Eulid {
    public  static int gcd(int p , int q)
    {
        System.out.println("p = " + p + " q = " + q);
        if(q==0){
            return p;
        }
        return gcd(q, p%q);
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int p = read.nextInt();
        int q =read.nextInt();

        int gcd = gcd(p,q);
        System.out.println("Greatest common divisor" + p + "and" + q +"is : "+ gcd);
    }
}
