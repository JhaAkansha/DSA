/*
You are given a string s of length n containing only four kinds of characters: 'Q', 'W', 'E', and 'R'.
A string is said to be balanced if each of its characters appears n / 4 times where n is the length of the string.
Return the minimum length of the substring that can be replaced with any other string of the same length to make s balanced. If s is already balanced, return 0.
*/
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int balancedString(String s) {
        int n = s.length();
        int target = n / 4;
        int min = Integer.MAX_VALUE, i = 0;
        
        // Count the frequency of each character in the string
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        // If the string is already balanced, return 0
        if (freq.getOrDefault('Q', 0) == target &&
            freq.getOrDefault('W', 0) == target &&
            freq.getOrDefault('E', 0) == target &&
            freq.getOrDefault('R', 0) == target) {
            return 0;
        }
        
        int j = 0;
        
        for (j = 0; j < n; j++) {
            freq.put(s.charAt(j), freq.get(s.charAt(j)) - 1);
            while (i <= j && isBalanced(freq, target)) {
                min = Math.min(min, j - i + 1);
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
                i++;
            }
        }
        
        return min;
    }

    private boolean isBalanced(Map<Character, Integer> freq, int target) {
        return freq.getOrDefault('Q', 0) <= target &&
               freq.getOrDefault('W', 0) <= target &&
               freq.getOrDefault('E', 0) <= target &&
               freq.getOrDefault('R', 0) <= target;
    }
}
