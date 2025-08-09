/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.contains(nums[i])) return true;
            h.add(nums[i]);
            if(h.size()>k)
                h.remove(nums[i-k]);
        }
        return false;
    }
}
