/*
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = k-1;
        double avg = 0, res; 
        for (int a = i; a <= j; a++) {
                avg += nums[a];
        }
        res = avg/k;
        j++;
        while(j < nums.length) {
            avg = avg - nums[i] + nums[j];
            if ( avg/k > res) res = avg/k;
            i++;
            j++;
        }
        return res;
    }
}
