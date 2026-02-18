/*
LeetCode 88 - Merge Sorted Array
Author: Nithin Sai
Time Complexity: O(m + n)
Space Complexity: O(1)
*/

package com;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // Last valid element in nums1
        int j = n - 1;        // Last element in nums2
        int k = m + n - 1;    // Last index of nums1

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}
