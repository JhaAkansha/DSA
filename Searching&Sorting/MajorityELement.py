'''
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
'''

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        maj = n//2
        c = 0
        lst = set(nums)
        print("lst = ", lst)
        for i in lst:
            print("i = ", i)
            c = nums.count(i)
            print("c = ", c)
            if (c > maj):
                return i
        return 0
