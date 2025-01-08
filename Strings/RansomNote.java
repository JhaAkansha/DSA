/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> rn = new HashMap<>();
        int m = magazine.length(), n = ransomNote.length();
        for (int i = 0; i < m; i++) {
            if (!freq.containsKey(magazine.charAt(i))) {
                freq.put(magazine.charAt(i), 1);
            }
            else {
                freq.put(magazine.charAt(i), freq.get(magazine.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!freq.containsKey(ransomNote.charAt(i))) return false;
            if (!rn.containsKey(ransomNote.charAt(i))) {
                rn.put(ransomNote.charAt(i), 1);
            }
            else {
                rn.put(ransomNote.charAt(i), rn.get(ransomNote.charAt(i)) + 1);
                if (rn.get(ransomNote.charAt(i)) > freq.get(ransomNote.charAt(i))) return false;
            }
        }
        return true;
    }
}
