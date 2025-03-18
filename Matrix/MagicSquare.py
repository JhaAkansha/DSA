'''
We define a magic square to be an n x n matrix of distinct positive integers from 1 to n^2 where the sum of any row, column, or diagonal of length
is always equal to the same number: the magic constant.
You will be given a 3x3 matrix of integers in the inclusive range [1,9]. We can convert any digit a to any other digit b in the range [1,9] at cost of |a-b| . Given s, convert it into a magic square at minimal cost. Print this cost on a new line.
Note: The resulting magic square must contain distinct integers in the inclusive range [1,9].
'''
def formingMagicSquare(s):
    msp = {
    0:[8,1,6,3,5,7,4,9,2],
    1:[6,1,8,7,5,3,2,9,4],
    2:[4,9,2,3,5,7,8,1,6],
    3:[2,9,4,7,5,3,6,1,8],
    4:[8,3,4,1,5,9,6,7,2],
    5:[4,3,8,9,5,1,2,7,6],
    6:[6,7,2,1,5,9,8,3,4],
    7:[2,7,6,9,5,1,4,3,8],
    }
    box = [*s[0], *s[1], *s[2]]
    result = [0, 0, 0, 0, 0, 0, 0, 0]
    for x in range(9):
            result[0] += abs(msp[0][x] - box[x])
            result[1] += abs(msp[1][x] - box[x])
            result[2] += abs(msp[2][x] - box[x])
            result[3] += abs(msp[3][x] - box[x])
            result[4] += abs(msp[4][x] - box[x])
            result[5] += abs(msp[5][x] - box[x])
            result[6] += abs(msp[6][x] - box[x])
            result[7] += abs(msp[7][x] - box[x])
    return min(result)
