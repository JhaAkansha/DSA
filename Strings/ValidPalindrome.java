/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
*/

class Solution {
    public boolean isPalindrome(String s) {
        String new_s = s.toLowerCase();
        new_s = new_s.replaceAll("\s+", "");
        new_s = new_s.replaceAll("[^a-zA-Z0-9]", "");
        int len = new_s.length();
        int i = 0, j = len - 1;
        while ( i < j) {
            if (new_s.charAt(i) != new_s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
