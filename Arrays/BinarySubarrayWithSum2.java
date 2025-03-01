/*
Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.
*/
class Solution {
    private int slidingWindowAtMost(int[] nums, int goal) {
        int i = 0, currentSum = 0, totalCount = 0;

        for (int j = 0; j < nums.length; j++) {
            currentSum += nums[j];

            while (i <= j && currentSum > goal) {
                currentSum -= nums[i];
                i++;
            }

            totalCount += j - i + 1;
        }
        return totalCount;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return slidingWindowAtMost(nums, goal) - slidingWindowAtMost(nums, goal - 1);
    }
}
