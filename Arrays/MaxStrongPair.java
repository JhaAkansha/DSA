/*
You are given a 0-indexed integer array nums. A pair of integers x and y is called a strong pair if it satisfies the condition:
    |x - y| <= min(x, y)
You need to select two integers from nums such that they form a strong pair and their bitwise XOR is the maximum among all strong pairs in the array.
Return the maximum XOR value out of all possible strong pairs in the array nums.
Note that you can pick the same integer twice to form a pair.
*/
class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int res = 0;
        for (int num: nums) {
            for (int temp: nums) {
                if (Math.abs(num-temp) <= Math.min(num,temp)) {
                    res = Math.max(res, num^temp);
                }
            }
        }
        return res;
    }
}
