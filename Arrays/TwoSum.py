'''
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
'''

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        length = len(nums)
        lst = []
        for i in range (0,length):
            for j in range (i+1, length):
                if(nums[i]+nums[j] == target):
                    lst.append(i)
                    lst.append(j)
        return lst
