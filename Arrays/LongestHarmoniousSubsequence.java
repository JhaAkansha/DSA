/*
We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious
among all its possible subsequences.
*/
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for(int num : freq.keySet()) {
            if(freq.containsKey(num + 1)) 
            res = Math.max(res, freq.get(num) + freq.get(num + 1));
        }

        return res;
    }
}
