package Recursion.Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ReturnIndex {
    private static int[] returnindex(int[] arr, int target){
        int start = findindex(arr, target, true,0 ,arr.length-1);
        int end = findindex(arr, target, false, 0 , arr.length-1);
        return new int[]{start,end};
    }

    private static int findindex(int[] arr, int target, boolean b,int start , int end) {
        int ans = -1;
       if(start<= end){
           int mid = start + (start-end)/2;
           if(arr[mid] > target){
               end = mid - 1;
               findindex(arr,target,b,start,end);
           }
           else if (arr[mid] < target){
               start = mid + 1;
               findindex(arr,target,b,start,end);
           }
           else if(arr[mid]== target){
               ans = mid;
               if(b) {
                   end = mid - 1;
                   findindex(arr,target,b,start,end);
               }
               else {
                   start = mid + 1;
                   findindex(arr,target,b,start,end);
               }
           }
       }
       return  ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,4,4,5,6,7,8};
        System.out.println(Arrays.toString(returnindex(arr, 4)));
    }
}
