'''
Given a set of distinct integers, print the size of a maximal subset of S where the sum of any 2 numbers in S' is not evenly divisible by k.
'''
import sys
from itertools import combinations
def check_array(k, s):
    for el1 in s:
        test_arr = list(s)
        test_arr.remove(el1)
        
        for el2 in test_arr:
            if (el1 + el2) % k == 0:
                return False
    return True
def nonDivisibleSubset_brute(k, s):
    if check_array(k, s):
        return len(s)
    
    best = 0
    for num in range(1, len(s)):
        to_remove = list(combinations(s, num))
        #print("to_remove = {}".format(to_remove))
        for option in to_remove:
            test_arr = list(s)
            #print("test_arr = {}".format(test_arr))
            for el in option:
                test_arr.remove(el)
            if check_array(k, test_arr) == True:
                best = max(len(test_arr), best)
    return best
def nonDivisibleSubset(k, s):
    resid_cnt = [0] * k
    
    for el in s:
        resid_cnt[el%k] += 1
        
    res = min(1, resid_cnt[0])
    for ind in range(1, (k//2)+1):
        if ind != k - ind:
            res += max(resid_cnt[ind], resid_cnt[k - ind])
    
    if k % 2 == 0 and resid_cnt[int(k/2)] != 0:
        res += 1
    
    return res
    
if __name__ == "__main__":
    n, k = input().strip().split(' ')
    n, k = [int(n), int(k)]
    arr = list(map(int, input().strip().split(' ')))
    result = nonDivisibleSubset(k, arr)
    print(result)
        

'''if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    k = int(first_multiple_input[1])

    s = list(map(int, input().rstrip().split()))

    result = nonDivisibleSubset(k, s)

    fptr.write(str(result) + '\n')

    fptr.close()
'''
