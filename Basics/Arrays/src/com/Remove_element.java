package com;

public class Remove_element {

    //Remove element (problem number 27)
    //time complexity=O(n)
    //space complexity = O(n)


    public static int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int k=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=val){
                temp[k] = nums[j];
                k++;
            }
        }
        for (int i=0;i<temp.length;i++){
            nums[i] = temp[i];
        }
        return k;
    }

    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;

        int result = removeElement(nums,val);

        System.out.println("The number of element other than  the given value is " + result);
        System.out.println("The updated array is : ");
        for (int i=0 ; i<result;i++){
            System.out.print(nums[i] + " ");
        }
    }
}

