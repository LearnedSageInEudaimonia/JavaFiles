package com.practice.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2,4,6,3,5,6,3,9,5,3,56};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int start = 0 ;

        for(int i =0 ;i< arr.length;i++ ){
            int end = arr.length-i-1;
            int maxValue = maxValue(arr,start,end);
            swap(arr,maxValue,end);
        }

    }

    private static void swap(int[] arr, int maxValue, int end) {
        int temp = arr[end];
        arr[end] = arr[maxValue];
        arr[maxValue] = temp;
    }

    static int maxValue(int[] arr, int start, int end) {
        int max = start;
        for(int i = 1 ; i<= end;i++){
            if(arr[max]< arr[i]){
                max= i;
            }
        }
        return max;
    }


}
