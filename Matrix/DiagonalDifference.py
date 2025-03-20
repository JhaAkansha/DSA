'''
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
'''
# Complete the 'diagonalDifference' function below.
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.

def diagonalDifference(arr):
    diagonal_1 = 0;
    diagonal_2 = 0;
    for i in range (0,n):
        for j in range (0,n):
            if (i==j):
                diagonal_1+=arr[i][j]
            if (i+j == n-1):
                diagonal_2+=arr[i][j]
    diff = abs(diagonal_1 - diagonal_2)
    return diff
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(input().strip())
    arr = []
    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))
    result = diagonalDifference(arr)
    fptr.write(str(result) + '\n')
    fptr.close()
