package com;

import java.util.Arrays;

public class Plus_one {

    // Plus one (problem number 66)
    // time complexity : O(n)
    // space complexity : O(1)

    public static int[] plusOne(int[] digits) {

        // start from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;      // add 1
                return digits;    // done, no carry
            }

            digits[i] = 0;        // digit was 9, carry forward
        }

        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    // main method to execute and test
    public static void main(String[] args) {

        int[] digits1 = {1, 2, 9};
        int[] digits2 = {9, 9, 9};
        int[] digits3 = {4, 3, 2, 1};

        System.out.println("Input  : " + Arrays.toString(digits1));
        System.out.println("Output : " + Arrays.toString(plusOne(digits1)));
        System.out.println();

        System.out.println("Input  : " + Arrays.toString(digits2));
        System.out.println("Output : " + Arrays.toString(plusOne(digits2)));
        System.out.println();

        System.out.println("Input  : " + Arrays.toString(digits3));
        System.out.println("Output : " + Arrays.toString(plusOne(digits3)));
    }
}
