'''
Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlock must determine the number of square integers within that range.
'''
from math import ceil, floor
def squares(a, b):
    # Write your code here
    res = 0
    res = floor(b**0.5)+1 - ceil(a**0.5)
    return res
