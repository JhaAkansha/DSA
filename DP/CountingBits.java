/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
*/
class Solution {
    public int numberOfOnes(int a) {
        int temp = 0;
        while (a != 0) {
            if (a % 2 != 0){
                temp+=1;
            }
            a = a/2;
        }
        return temp;
    }

    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i =0; i <= n; i++) {
            ans[i] = numberOfOnes(i);
        }
        return ans;
    }
}
