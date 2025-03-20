/*
You are given an m x n integer matrix matrix with the following two properties:
  1. Each row is sorted in non-decreasing order.
  2. The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m*n - 1, mid;
        while (low <= high) {
            mid = (low + high)/2;
            int j = mid % n;
            int i = (mid - j) / n;
            if (matrix[i][j] == target) {
                return true;
            }
            else if (matrix[i][j] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
}
