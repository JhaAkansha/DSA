/*
Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

    For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.

A subarray is a contiguous part of an array.
*/
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k-1);
    }
    public int atMostK(int[]nums, int k) {
        int i = 0, j = 0, cnt = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (j = 0; j < n; j++) {
            map.put(nums[j], map.getOrDefault(nums[j],0) + 1);
            while (map.size() > k) {
                map.put(nums[i], map.getOrDefault(nums[i],0)-1);
                if (map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }
            cnt = cnt + (j-i+1);
        }
        return cnt;
    }
}
