'''
The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:
    1. It has a length of k.
    2. It is a divisor of num.
Given integers num and k, return the k-beauty of num.
'''
class Solution:
    def divisorSubstrings(self, num: int, k: int) -> int:
        count = 0
        i = 0
        j = k
        st = str(num)
        while j <= len(st):
            if int(st[i:j]) != 0 and num % int(st[i:j]) == 0:
                count += 1
            i += 1
            j += 1
        return count
