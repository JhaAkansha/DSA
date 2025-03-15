'''
A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.
'''
class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        if not s or len(s) < 3:
            return 0
        l = res = 0
        count = {}
        for r in range (len(s)):
            count[s[r]] = 1 + count.get(s[r], 0)
            while (r - l + 1 > 3 or count.get(s[r]) > 1):
                count[s[l]] -= 1
                l += 1
            if r-l+1 == 3:
                res += 1
        return res
