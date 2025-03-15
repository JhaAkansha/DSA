'''
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
'''
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        lst = [-1,-1]
        low = 0
        high = len(nums) - 1
        mid = (low + high)//2
        while (low <= high):
            mid = (low + high)//2
            if (nums[mid] == target):
                lst[0] = mid
                high = mid-1
            elif (nums[mid] < target):
                low = mid+1
            elif (nums[mid] > target):
                high = mid-1
        low = 0
        high = len(nums) - 1
        while (low <= high):
            mid = (low+high)//2
            if (target == nums[mid]):
                lst[1] = mid
                low = mid+1
            elif (target < nums[mid]):
                high = mid - 1
            else:
                low = mid+1
        return lst
