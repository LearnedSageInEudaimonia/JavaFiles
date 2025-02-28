package com.fundamentals;
import static java.lang.StringTemplate.STR;

class BinarySearchSelf {
//    public static int rank(int key, int[] arr){
//        int start = 0 ;
//        int end  = arr.length-1 ;
//        while(start<end){
//            int mid = start + (end - start)/2;
//            if(arr[mid]== key){
//                return mid;
//            }
//            else if(arr[mid]<key){
//                start = mid +1;
//            }
//            else {
//                end = mid -1;
//            }
//        }
//        return -1;
//    }
    public static int rank(int key, int[] a, int low, int high){
        if(low>high) return -1;
        int mid = low + (high -low)/2;
        if(key < a[mid]) return rank(key,a, low, mid -1);
        else if(key > a[mid] ) return rank(key, a, mid+1, high);
        else return mid;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5,6, 7, 7,8,9};
        int status = rank(7, arr,1,7);
        if(status == -1){
            System.out.println("Not Found!");
        }
        else {
            System.out.println(STR."Found: \{status}");
        }
    }
}