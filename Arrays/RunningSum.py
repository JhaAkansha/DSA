'''
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
'''
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        res = []
        temp = 0
        for i in range (len(nums)):
            temp += nums[i]
            res.append(temp)

        return res
