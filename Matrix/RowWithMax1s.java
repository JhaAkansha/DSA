/*
Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.
In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.
*/

class Solution {
        public int[] rowAndMaximumOnes(int[][] mat) {
        int minIndex = 0;
        int lastMaxOnes = 0;
        for (int i = 0; i < mat.length; i++) {
            int maxOnes = 0;
            for (int j = 0; j < mat[i].length; j++)
                maxOnes+=mat[i][j];
            if (lastMaxOnes < maxOnes) {
                lastMaxOnes = maxOnes;
                minIndex = i;
            }
        }
        return new int[]{minIndex, lastMaxOnes};
    }
}