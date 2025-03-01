'''
You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
'''
class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        total = ((n**2)*(n**2 + 1))//2
        gridSum = 0
        lookup = set()
        a = None
        for row in grid:
            for num in row:
                if num in lookup:
                    a = num
                gridSum+=num
                lookup.add(num)
        missing = total - gridSum
        return [a,missing + a]
