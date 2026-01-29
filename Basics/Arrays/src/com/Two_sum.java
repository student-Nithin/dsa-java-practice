package com;

public class Two_sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if ( nums[i] + nums[j] == target){
                    return new int[]{i,j} ;
                }

            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int target = 9;
        int[] result = twoSum(nums,target);

        for (int n:result){
            System.out.print(n + ",");
        }
    }
}
