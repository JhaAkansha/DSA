/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.
*/

class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int sum0 = 0, sum1 = 1, res=0;
        for (int i = 2; i <= n; i++) {
            res = sum0 + sum1;
            sum0 = sum1;
            sum1 = res;
        }
        return res;
    }
}
