package com.arrays;

public class FindMajorityElement {
    public static  int findMajorityElement(int[] nums){
        int candidate = nums[0] ;
        int count = 0 ;

        for(int num : nums){
            if( count == 0 ){
                candidate = num;
            }
            else {
                count += (num == candidate)? 1 : -1 ;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 5, 4, 3, 3, 3, 5};
        System.out.println(findMajorityElement(nums));
    }
}
