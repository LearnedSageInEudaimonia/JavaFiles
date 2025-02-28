package com.arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int complement  = target - nums[i];

            if(map.containsKey(complement)) {
                return  new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return  new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 7};
        int target = 9;
        int[] answer = twoSum(nums, target);
        System.out.print(answer[0] + " " + answer[1]);
    }
}
