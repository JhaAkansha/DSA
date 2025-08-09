'''
You are given an array of positive integers nums.
An array arr is called product equivalent if prod(arr) == lcm(arr) * gcd(arr), where:
    prod(arr) is the product of all elements of arr.
    gcd(arr) is the gcd of all elements of arr.
    lcm(arr) is the lcm of all elements of arr.
Return the length of the longest product equivalent of nums.
'''
class Solution:
    def maxLength(self, nums: List[int]) -> int:
        def calc_lcm(x, y):
            return abs(x*y)//math.gcd(x, y)
        res = 1
        for left in range (len(nums)):
            prod = nums[left]
            gcd = nums[left]
            lcm = nums[left]
            for right in range (left + 1, len(nums)):
                prod *= nums[right]
                gcd = math.gcd(gcd, nums[right])
                lcm = calc_lcm(lcm, nums[right])
                if prod == (gcd * lcm):
                    res = max (res, right - left + 1)
        return res
