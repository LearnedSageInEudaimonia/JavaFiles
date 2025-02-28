package com.practice.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 2,4,6,3,5,6,3,9,5,3,56};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 0 ; i < arr.length -1 ;i++ ){
            for(int j = i+1 ; j >0; j-- ){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }
    private static void swap(int[] arr, int maxValue, int end) {
        int temp = arr[end];
        arr[end] = arr[maxValue];
        arr[maxValue] = temp;
    }
}
