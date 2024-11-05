/*
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

    0 <= i, j < nums.length
    i != j
    |nums[i] - nums[j]| == k

Notice that |val| denotes the absolute value of val.
*/

 // O(nlogn) Time Solution

 class Solution {
 	public int findPairs(int[] nums, int k) {
 		Set<Integer> uniquePair = new HashSet();
 		Arrays.sort(nums);
 		int n = nums.length;

 		for (int i = 0; i < n - 1; i++)
 			if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0)
 				uniquePair.add(nums[i]);

 		return uniquePair.size();
 	}
 }
