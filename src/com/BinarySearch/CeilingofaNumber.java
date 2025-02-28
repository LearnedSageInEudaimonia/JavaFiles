package BinarySearch;

public class CeilingofaNumber {
    public static void main(String[] args) {
        int[] arr = { 2,3,5,9,14,16,18};
        System.out.println(Ceil(arr,10));
    }
    public static  int Ceil(int[] a,int target){
        int start = 0 ;
        int end = a.length;
        int ceiling= -1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(a[mid]== target) return mid;
            else if(a[mid]< target) start= mid+1;
            else {
                ceiling = mid;
                end = mid-1;
            }

        }
        return ceiling;

    }

}
