'''
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with

places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to
are acceptable.
'''

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    count_positive = 0
    count_negative = 0
    count_zero = 0 
    for i in range (0,n):
        if (arr[i]>0):
            count_positive+=1
        if(arr[i]<0):
            count_negative+=1;
        if(arr[i]==0):
            count_zero+=1
    ratio_positive = count_positive/n
    ratio_negative = count_negative/n
    ratio_zero = count_zero/n
    print(format(ratio_positive,'0.6f'))
    print(format(ratio_negative,'0.6f'))
    print(format(ratio_zero,'0.6f'))
    #return ratio_positive, ratio_negative, ratio_zero

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
