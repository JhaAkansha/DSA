/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> ans=new ArrayList<>();
      HashSet<Integer> st=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if(st.contains(nums[i])) ans.add(nums[i]);
         st.add(nums[i]);
      } 
      return ans; 
    }
}
