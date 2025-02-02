'''
Given an integer n, return true if it is a power of two. Otherwise, return false.
'''
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        return n > 0 and (n & (n - 1)) == 0
