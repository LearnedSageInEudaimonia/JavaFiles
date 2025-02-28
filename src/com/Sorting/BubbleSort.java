package com.practice.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2,4,6,3,5,6,3,5,3,56};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean swapped =false;
        for(int i  = 0 ; i < arr.length;i++){
            for(int j = 1; j < arr.length-i;j++){
                if(arr[j]< arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped= true;
                }
                if(!swapped) break;
            }
        }
    }

}
