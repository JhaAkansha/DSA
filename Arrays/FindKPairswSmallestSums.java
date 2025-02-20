/*
You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k.
Define a pair (u, v) which consists of one element from the first array and one element from the second array.
Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
*/
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for (int x : nums1) {
            q.offer(new int[]{x + nums2[0], 0});
        }
        while (k > 0 && !q.isEmpty()) {
            int[] pair = q.poll();
            int sum = pair[0];
            int pos = pair[1];
            List<Integer> curr = new ArrayList<>();
            curr.add(sum - nums2[pos]);
            curr.add(nums2[pos]);
            res.add(curr);
            if (pos + 1 < nums2.length) {
                q.offer(new int[]{sum - nums2[pos] + nums2[pos + 1], pos + 1});
            }
            k--;
        }
        return res;
    }
}
