/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.add(nums[i]);
        }
        int max = 0;
        for (int num : map) {
            if (!map.contains(num - 1)) {
                int s = 1;
                while(map.contains(num + 1)) {
                    s++;
                    num += 1;
                }
                max = Math.max(s, max);
            }
        }
        return max;
    }
}
