/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        String ns = s.trim();
        int i = 0, n = ns.length(), res = 0;
        while (i < n) {
            if (Character.isWhitespace(ns.charAt(i))) {
                res = 0;
            }
            else {
                res += 1;
            }
            i++;
        }
        return res;
    }
}
