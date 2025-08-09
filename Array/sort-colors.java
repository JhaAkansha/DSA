/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
*/

class Solution {
    public void sortColors(int[] nums) {
        int i, j,n = nums.length, swap;
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (nums[j] <= nums[i]) {
                    swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
            }
        }
    }
}
