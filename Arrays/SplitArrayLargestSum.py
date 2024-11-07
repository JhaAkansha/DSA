'''
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.
'''

class Solution:
    def splitArray(self, nums: List[int], m: int) -> int:
        lo, hi = max(nums), sum(nums)
      
        while lo < hi:
            mid = (lo+hi)//2
            tot, cnt = 0, 1
          
            for num in nums:
                if tot+num<=mid: 
                    tot += num
                else:
                    tot = num
                    cnt += 1
                  
            if cnt>m: lo = mid+1
            else: hi = mid
              
        return hi
      
