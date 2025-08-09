/*
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
*/
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int len = nums.length;
        if (len == 1) return 0;
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < len - k +1; i++) {
            res = Math.min(res, nums[i+k-1]-nums[i]);
        }
        return res;
    }
}
