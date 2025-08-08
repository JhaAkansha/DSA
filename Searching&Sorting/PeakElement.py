'''
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.
'''
class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        '''
        left, right = 0, len(nums) - 1
        while (left <= right):
            mid = (left + right)//2
            if (nums[mid] > nums[mid + 1] and nums[mid] > nums[mid - 1]):
                return mid
            elif ()
        '''
        if (len(nums) == 1):
            return 0
        for i in range (1, len(nums) - 1):
            if (nums[i] > nums[i+1] and nums[i] > nums[i-1]):
                print(i)
                return i
        if (nums[0] > nums[1]):
                return 0
        elif (nums[len(nums) - 1] > nums[len(nums) - 2]):
                return len(nums) - 1