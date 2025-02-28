package com.fundamentals1_1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class NNArray {
    public static void main(String[] args) {

        boolean[][] arr = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(checkPrime(i)&& checkPrime(j)){
                    arr[i][j] = true;
                }
                else{
                    arr[i][j] = false;
                }
            }
        }

        for(int i = 0 ; i< 3; i++){
            for(int j = 0 ; j< 3; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static boolean checkPrime(int n) {
        if(n<=1) return  false;
        for(int i = 2; i < n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
