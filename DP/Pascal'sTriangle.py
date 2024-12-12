'''
Given an integer numRows, return the first numRows of Pascal's triangle.
'''
import numpy as np
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res = []
        '''res[0] = [1]
        res[1] = [1,1] '''
        for i in range(numRows):
            res.append([1] * (i + 1))
        for i in range (2, numRows):
            for j in range (0,i):
                if (j == 0 or j == i):
                    res[i][j] = 1
                else:
                    res[i][j] = res[i-1][j] + res[i-1][j-1]
        return res
