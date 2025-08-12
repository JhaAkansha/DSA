"""
No statement found
"""

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