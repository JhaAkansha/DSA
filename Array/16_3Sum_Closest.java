/**
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 
Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).


 
Constraints:


	3 <= nums.length <= 500
	-1000 <= nums[i] <= 1000
	-104 <= target <= 104
*/

                if (current_sum < target) {
                    closest_sum = current_sum;
                }
            while (left < right) {
                int current_sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(current_sum - target) < Math.abs(closest_sum - 
target)) {
        for (int i = 0; i < nums.length - 2; ++i) {
            int left = i + 1, right = nums.length - 1;
        int closest_sum = Integer.MAX_VALUE / 2;  // A large value but not overflow
        
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
class Solution {