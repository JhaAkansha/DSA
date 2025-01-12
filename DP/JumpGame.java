/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum (you can jump less than this number as well) jump length at that position.
Return true if you can reach the last index, or false otherwise.
*/
class Solution {
    public boolean canJump(int[] nums) {
        int finalPosition = nums.length-1;
        for(int idx = nums.length-2;idx>=0;idx--){
            if(nums[idx]+idx >= finalPosition){
                finalPosition=idx;
            }
        } 
        return finalPosition==0;
    }
}
