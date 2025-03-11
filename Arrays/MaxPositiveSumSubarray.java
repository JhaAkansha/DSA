/*
You are given an integer array nums and two integers l and r. Your task is to find the minimum sum of a subarray whose size is between l and r (inclusive) and whose sum is greater than 0.
Return the minimum sum of such a subarray. If no such subarray exists, return -1.
A subarray is a contiguous non-empty sequence of elements within an array.
*/
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int i = 0, j = l, sum = 0;
        int res = Integer.MAX_VALUE;
        while ( j <= r) {
            sum = 0;
            for (i = 0; i < j; i++) {
                sum += nums.get(i);
            }
            res = (sum > 0) ? Math.min(sum, res): res;

            int temp = sum;
            for (i = j; i < nums.size(); i++) {
                temp += nums.get(i) - nums.get(i-j);
                res = (temp > 0)? Math.min(temp, res): res;
            }
            j++;
        }
        if (res == Integer.MAX_VALUE) return -1;
        return res;
    }
}
