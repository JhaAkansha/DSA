'''
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
'''

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        med = 0
        l1 = len(nums1)
        l2 = len(nums2)
        l = len(nums1) + len(nums2)
      
        for i in nums2:
            nums1.append(i)
        nums1.sort()
      
        print(nums1)
      
        if (l % 2 == 1):
            med = nums1[l//2]
        else:
            med = (nums1[l//2] + nums1[(l//2)-1])/2
        
        return med


