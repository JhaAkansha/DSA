'''
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
'''
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        size = len(digits)
        num = 0
        x = 0
        for i in range (0,size):
            num += digits[i]*(10**(size-1-i))
        #print("num = ", num)
        num+=1
        num_cpy = num
        #print("num = ", num)
        res= []
        res_size=0
        while(num_cpy >= 1):
            res_size+=1
            num_cpy = num_cpy//10
        #print("res_size = ", res_size)
        for j in range (0, res_size):
            x = 10**(res_size-1-j)
            #print("x = ",x)
            res.append((num//x)%10)
        return res