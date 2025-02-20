/*
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
    Each letter in pattern maps to exactly one unique word in s.
    Each unique word in s maps to exactly one letter in pattern.
    No two letters map to the same word, and no two words map to the same letter.

*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        int len = pattern.length();
        if (str.length != len) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char schar = pattern.charAt(i);
            String curr = str[i];
            if (map.containsKey(schar)) {
                String corresT = map.get(schar);
                if (!corresT.equals(curr)) {
                    return false;
                }
            }
            else if (map.containsValue(curr)) {
                return false;
            }
            else {
                map.put(schar, curr);
            }
        }
        return true;
    }
}
