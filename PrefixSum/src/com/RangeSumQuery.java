package com;

/*
 * Range Sum Query - Immutable (Prefix Sum)
 *
 * Time Complexity:
 *  Constructor: O(n)
 *  sumRange(): O(1)
 *
 * Space Complexity:
 *  O(n)
 */

class RangeSumQuery {

    private int[] prefixSum;

    public RangeSumQuery(int[] nums) {
        prefixSum = new int[nums.length];
        if (nums.length > 0) {
            prefixSum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }

    // Main method for execution
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery obj = new RangeSumQuery(nums);

        System.out.println(obj.sumRange(0, 2)); // 1
        System.out.println(obj.sumRange(2, 5)); // -1
        System.out.println(obj.sumRange(0, 5)); // -3
    }
}
