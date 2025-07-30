'''
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
'''
class Solution:
    def myPow(self, x: float, n: int) -> float:
        prod = 1
        power = abs(n)
        if (n == 0):
            return prod
        else:
            while (power > 0):
                if (power % 2 == 1):
                    prod = prod*x
                    power-=1
                elif (power % 2 == 0):
                    x = x*x
                    power = power/2
            if (n>0):
                return prod
            else:
                return (1/prod)