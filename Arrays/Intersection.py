'''
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
'''

class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        lst = []
        for i in nums1:
            if i in nums2:
                if i not in lst:
                    lst.append(i)
        for j in nums2:
            if j in nums1:
                if j not in lst:
                    lst.append(j)
        return lst
