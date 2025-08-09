/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
*/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j;
        for (j = 0; j < nums.length; ++j) {
            if (nums[j] == 0) k--;
            if (k < 0 && nums[i++] == 0) k++;
        }
        return j - i;
    }
}
