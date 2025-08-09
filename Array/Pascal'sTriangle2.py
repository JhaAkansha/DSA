#Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        res = []
        for i in range(rowIndex+1):
            res.append([1] * (i + 1))
        for i in range (2, rowIndex+1):
            for j in range (0,i):
                if (j == 0 or j == i):
                    res[i][j] = 1
                else:
                    res[i][j] = res[i-1][j] + res[i-1][j-1]
        return res[rowIndex ]
