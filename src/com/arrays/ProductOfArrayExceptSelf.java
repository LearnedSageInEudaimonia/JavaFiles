package com.arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productOfArrayExceptSelf(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for(int i = 1; i < n; i++ ){
            answer[i] = answer[i-1] * nums[i-1];
        }

        int rightSide = 1;

        for(int i = n-1 ; i >= 0 ; i--){
            answer[i] *= rightSide;
            rightSide *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4};
        int[] answer = productOfArrayExceptSelf(nums);
        for(int ans : answer){
            System.out.print(ans + ", ");
        }
    }
}
