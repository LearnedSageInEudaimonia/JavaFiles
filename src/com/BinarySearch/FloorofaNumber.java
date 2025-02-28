package BinarySearch;

public class FloorofaNumber {
    public static void main(String[] args) {
        int[] arr = { 2,3,5,9,14,16,18};
        System.out.println(Ceil(arr,10));
    }
    public static  int Ceil(int[] a,int target){
        int start = 0 ;
        int end = a.length;
        int floor= -1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(a[mid]== target) return mid;
            else if(a[mid]< target){
                floor = mid;
                start= mid+1;
            }
            else {
                end = mid-1;
            }

        }
        return floor;
    }
}
