/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();
      
        Arrays.sort(s1c);
        
        for (int i = 0; i <= s2c.length - s1c.length; i++) {
            char[] sub = Arrays.copyOfRange(s2c, i, i + s1c.length);
            Arrays.sort(sub);
            if (Arrays.equals(s1c, sub)) {
                return true;
            }
        }
        return false;
    }
}
