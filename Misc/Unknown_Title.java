/**
No statement found
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum = Integer.MAX_VALUE / 2;  // A large value but not overflow
        
        for (int i = 0; i < nums.length - 2; ++i) {
            int left = i + 1, right = nums.length 