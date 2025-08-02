/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
*/

class Solution {
    
    public int mySqrt(int x) {
        if (x < 2) return x;
        
        int right = x / 2;
        int left = 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if ((long)mid*mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
    
}