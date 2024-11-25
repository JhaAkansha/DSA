'''
Given an array of integers and a positive integer k, determine the number of (i,j) pairs where i < j and ar[i] + ar[j] is divisible by k
'''
def divisibleSumPairs(n, k, ar):
    # Write your code here
    count = 0
    for i in range (0,n):
        for j in range (0,n):
            if(i<j):
                if((ar[i]+ar[j])% k == 0):
                    count+=1
    return count
