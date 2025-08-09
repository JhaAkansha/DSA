'''
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers. 
'''

def miniMaxSum(arr):
    # Write your code here
    sum = 0
    large = arr[0]
    small = arr[0]
    for i in range (0,5):
        sum+=arr[i]
        if (arr[i] > large):
            large = arr[i]
        if (arr[i] < small):
            small = arr [i]
    min_sum = sum - large
    max_sum = sum - small
    print(min_sum,max_sum)
