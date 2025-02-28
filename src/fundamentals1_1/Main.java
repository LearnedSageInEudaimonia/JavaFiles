package com.fundamentals1_1;
import  java.lang.*;
import  java.util.Scanner;
public class Main {
   final static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println( mystery(3,11));

    }
    public static void Ex1_1_1() {
        System.out.println((15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true);
        System.out.println();
    }

    public static void Ex1_1_2() {
        System.out.println((1 + 2.236) / 2);
        System.out.println((1 + 2 + 3 + 4.0));
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
        System.out.println();
    }

    public static void Ex1_1_3() {
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if(a==b && b==c) System.out.println(true);
        else System.out.println(false);
    }

    public static void Ex1_1_4() {
        System.out.println("c");
    }

    public static void Ex1_1_5(double num) {
        if(num > 0 && num<1) System.out.println(true);
        else System.out.println(false);
    }

    public static void Ex1_1_6(int n ) {
        //This is Fibonacci Series
        int a = 0;
        int b = 1;
        for(int i = 0;  i <= 15 ; i++){
            System.out.print(a+" ");
            a = a+b;
            b = a-b;
        }
    }

    public static void Ex1_1_7() {
        // a
        double t = 9.0;
        while(Math.abs(t-9.0/t) > .001)
            t= (9.0/t + t) / 2.0;
        System.out.println(t);

        // b
         int sum = 0 ;
         for(int i = 1; i< 1000;i++)
             for(int j = 0 ; j< i ; j++)
                 sum++;
        System.out.println(sum);

        // c
        int sum1 = 0 ;
        for(int i = 1; i< 1000;i*=2)
            for(int j = 0; j< 10;j++)
                sum++;
        System.out.println(sum1);
    }

    public static void Ex1_1_8() {
        System.out.println('b');  // b
        System.out.println('b'+ 'c');  //Numerical value
        System.out.println((char)('a'+ 4)); //e
    }

    public static void Ex1_1_9(int N) {
        String s = "";
        for(int n = N ; n > 0 ; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);
    }

    public static void Ex1_1_12() {
        int[] a = new int[10];
        for(int i = 0 ; i < 10; i++)
            a[i] = 9-i;
        for(int i = 0 ; i < 10; i++)
            a[i] = a[a[i]];
        for(int i = 0 ; i < 10 ; i++)
            System.out.println(i);
    }
    public static void transposeMatrix() {
        //Transposition of Array

        // Read an Array
        int[][] a = new int[3][3];
        for(int i = 0 ; i < 3;i++)
            for (int j = 0 ;j< 3;j++){
                a[i][j]= read.nextInt();
            }

        // Display an Array
        for(int i = 0 ; i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void lg(int n ){


    }
    public static void histogram(){

    }
    public static String exR1(int n ){
        if(n<= 0 ) return "";
        return exR1(n-3)+ exR1(n-2)+n;
    }

    public static String exR2(int n ){
        /// StackOverFlowError
        String s = exR2(n-3) + n + exR2(n-2)+n;
        if(n<=0)return"";
        return s;
    }

    public static int fib(int n ){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }

    public static int mystery(int a , int b ){
        if(b==0) return  1 ;
        if(b%2==0) return  mystery(a*a, b/2);
        return mystery(a*a, b/2) *a;
    }

    


}
