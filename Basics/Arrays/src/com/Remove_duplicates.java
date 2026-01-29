package com;

public class Remove_duplicates {
    public static  int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int k = 1;
        for (int i= 1;i<nums.length;i++){
            if (nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,3,4,4,4,4};

         int result = removeDuplicates(nums);
         System.out.println("Length of unique elements " + result);

         System.out.print("updated array : ");
        for (int i = 0; i < result; i++) { // only print first 'result' elements
            System.out.print(nums[i] + " ");
        }
    }
}


