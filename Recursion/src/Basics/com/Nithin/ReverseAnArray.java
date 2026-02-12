package Basics.com.Nithin;

import java.util.Arrays;

public class ReverseAnArray {

    public static void reverse(int[] arr, int start, int end) {
        // Base condition
        if (start >= end) {
            return;
        }

        // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
