/*
The Tribonacci sequence Tn is defined as follows: 
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.
*/
class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int sum0 = 0, sum1 = 1, sum2 = 1, res=0;
        for (int i = 3; i <= n; i++) {
            res = sum0 + sum1 + sum2;
            sum0 = sum1;
            sum1 = sum2;
            sum2 = res;
        }
        return res;
    }
}
