/*
You are given a binary string s and an integer k.

A binary string satisfies the k-constraint if either of the following conditions holds:

    The number of 0's in the string is at most k.
    The number of 1's in the string is at most k.

Return an integer denoting the number of substrings of s that satisfy the k-constraint.
*/
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        int oneCount = 0;
        int zeroCount = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (c == '0') {
                zeroCount++;
            } else {
                oneCount++;
            }
            while (zeroCount > k && oneCount > k) {
                if (s.charAt(left) == '0') {
                    zeroCount--;
                } else {
                    oneCount--;
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
