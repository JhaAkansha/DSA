/*
  Given an integer array nums, find the subarray with the largest sum, and return its sum.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            local_max = Math.max(nums[i], nums[i] + local_max);
            if (local_max > global_max) {
                global_max = local_max;
            }
        }
        return global_max;
    }
}
