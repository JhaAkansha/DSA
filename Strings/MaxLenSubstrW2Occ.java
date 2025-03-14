/*
Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character. 
*/
class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length(), res = 0, i = 0, j = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            while (map.get(s.charAt(j)) == 3) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            
            res = Math.max(res, j - i + 1);
            j++;
        }
        
        return res;
    }
}
