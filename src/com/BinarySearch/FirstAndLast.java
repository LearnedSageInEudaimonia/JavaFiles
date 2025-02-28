package BinarySearch;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = { 2, 3,4, 5,6,8,8,8,9,10,22};
       for(int i : arr(nums,8)){
           System.out.println(i);
       }
    }

    public static int[] arr(int nums[], int target) {
        int start = search(nums,target,true);
        int end = search(nums, target, false);
        return new int[]{start,end};
    }
    public static int search(int a[],int target, boolean startIndex){
        int start = 0 ;
        int end = a.length-1;
        int ans = -1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(a[mid]>target){
                 end = mid-1;
            }
            else if(a[mid]< target )
                start= mid+1;
            else{
                ans = mid;
                if(startIndex)
                    end = mid -1;
                else
                    start = mid+1;
            }

        }
        return ans;
    }

}
