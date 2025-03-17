/*
You are given a binary array nums.

You can do the following operation on the array any number of times (possibly zero):

    Choose any 3 consecutive elements from the array and flip all of them.

Flipping an element means changing its value from 0 to 1, and from 1 to 0.

Return the minimum number of operations required to make all elements in nums equal to 1. If it is impossible, return -1.
*/
class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i-2] == 0) {
                count++;
                nums[i-2] = nums[i-2] ^ 1;
                nums[i-1] = nums[i-1] ^ 1;
                nums[i] = nums[i] ^ 1;
            }
        }
        int sum = 0;
        for (int num: nums) sum += num;
        if (sum == nums.length) return count;
        return -1;
    }
}
