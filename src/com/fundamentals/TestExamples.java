package com.fundamentals;

public class TestExamples {
    public double maximum(int[] arr){
        double max = arr[0];
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public double average(int[] a){
        double sum = 0;
        for(int i =0 ; i < a.length; i++){
            sum +=a[i];
        }
        double average = sum/a.length;
        return average;
    }

    public void  copyArray(int [] a){
        double[] b = new double[a.length];
        for(int i = 0 ; i < a.length; i++){
            b[i] = a[i];
        }
    }

    public void reverseArrayWithinTheArray(int[] a){
        int n = a.length;
        for(int i =0 ; i < n/2; i++){
            double temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1]= a[i];
        }
    }

    public double[][] matrixMultiplication(int[][] a, int[][] b){
        int n = a.length;
        double[][] c = new double[n][n];
        for(int i =0 ; i< n; i++){
            for(int j = 0; j< n; j++){
                for(int k = 0 ; k < n; k++){
                    c[i][j] = a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }

    public static double sqrt(double n){
        if( n < 0) return Double.NaN;
        double err = 1e-15;
        double t = n;
        while(Math.abs( t - n/t) > err * t){
            t= (n/t + t)/2.0;
        }
        return  t;
    }

    public static int abs(int x){
        if(x<0) return -x;
        else return x;
    }

    public static boolean isPrime(int n){
        if(n<2) return true;
        for(int i = 2 ; i * i < n; i++){
            if(n % i ==0) return false;
        }
        return true;
    }

    public static  double hypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
    }

    public static  double harmonicNumber(int N){
        double sum = 0.0;
        for(int i = 1; i <= N; i++)
            sum += 1.0/i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(9));
        System.out.println(isPrime(7));
        System.out.println(harmonicNumber(10));
    }
}
