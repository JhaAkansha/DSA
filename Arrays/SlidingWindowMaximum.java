/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Return the max sliding window.
*/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
			return new int[0];
		}
		int n = nums.length;
		int[] res = new int[n-k+1];
		int temp = 0;
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < nums.length; i++) {
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
				q.pollLast();
			}
			q.offer(i);
			if (i >= k - 1) {
				res[temp++] = nums[q.peek()];
			}
		}
		return res;
    }
}
