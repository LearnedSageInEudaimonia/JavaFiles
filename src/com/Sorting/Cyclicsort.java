package com.practice.Sorting;

import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = { 3,5,2,1,4,7,9,8,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
             if(arr[i] != arr[correct]){
                 swap(arr, i, correct);
             }
             else{
                 i++;
             }
        }
    }
    private static void swap(int[] arr, int maxValue, int end) {
        int temp = arr[end];
        arr[end] = arr[maxValue];
        arr[maxValue] = temp;
    }

}
