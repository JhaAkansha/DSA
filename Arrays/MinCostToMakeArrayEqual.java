/*
You are given two 0-indexed arrays nums and cost consisting each of n positive integers.

You can do the following operation any number of times:

    Increase or decrease any element of the array nums by 1.

The cost of doing one operation on the ith element is cost[i].

Return the minimum total cost such that all the elements of the array nums become equal.
*/

class Solution:
    def minCost(self, nums: List[int], cost: List[int]) -> int:
        num_and_cost = sorted([num, c] for num, c in zip(nums, cost))
        n = len(cost)
        prefix_cost = [0] * n
        prefix_cost[0] = num_and_cost[0][1]
        for i in range(1, n): 
            prefix_cost[i] = num_and_cost[i][1] + prefix_cost[i - 1]        
        total_cost = 0
        for i in range(1, n): 
            total_cost += num_and_cost[i][1] * (num_and_cost[i][0] - num_and_cost[0][0])
        answer = total_cost
        
        for i in range(1, n):
            gap = num_and_cost[i][0] - num_and_cost[i - 1][0]
            total_cost += prefix_cost[i - 1] * gap
            total_cost -= gap * (prefix_cost[n - 1] - prefix_cost[i - 1])
            answer = min(answer, total_cost)
            
        return answer
