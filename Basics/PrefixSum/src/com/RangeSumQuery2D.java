package com;

/*
 * Problem: Range Sum Query 2D - Immutable (LeetCode 304)
 *
 * Approach: 2D Prefix Sum
 *
 * Time Complexity:
 *  - Constructor: O(rows * cols)
 *  - sumRegion(): O(1)
 *
 * Space Complexity:
 *  - O(rows * cols) for prefixSum matrix
 */

public class RangeSumQuery2D{

    private int[][] prefixSum;

    // Constructor
    public  RangeSumQuery2D(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        prefixSum = new int[rows][cols];

        // Build prefix sum matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int top = (i > 0) ? prefixSum[i - 1][j] : 0;
                int left = (j > 0) ? prefixSum[i][j - 1] : 0;
                int topLeft = (i > 0 && j > 0) ? prefixSum[i - 1][j - 1] : 0;

                prefixSum[i][j] = matrix[i][j] + top + left - topLeft;
            }
        }
    }

    // Returns sum of submatrix (row1,col1) to (row2,col2)
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int total = prefixSum[row2][col2];
        int top = (row1 > 0) ? prefixSum[row1 - 1][col2] : 0;
        int left = (col1 > 0) ? prefixSum[row2][col1 - 1] : 0;
        int topLeft = (row1 > 0 && col1 > 0)
                ? prefixSum[row1 - 1][col1 - 1]
                : 0;

        return total - top - left + topLeft;
    }

    // Main method for local testing
    public static void main(String[] args) {

        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        RangeSumQuery2D obj = new  RangeSumQuery2D(matrix);

        System.out.println(obj.sumRegion(2, 1, 4, 3)); // 8
        System.out.println(obj.sumRegion(1, 1, 2, 2)); // 11
        System.out.println(obj.sumRegion(1, 2, 2, 4)); // 12
    }
}
