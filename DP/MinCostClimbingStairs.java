/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int step1 = cost[0], step2 = cost[1];
        if (len <= 2) {
            return Math.min(step1, step2);
        }

        for (int i = 2; i < len; i ++) {
            int curr = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = curr;
        }
        return Math.min(step1, step2);
    }
}
