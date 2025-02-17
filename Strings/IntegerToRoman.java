/*
Given an integer, convert it to a Roman numeral.
*/
class Solution {
    public String intToRoman(int num) {
        final int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] sym = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vals.length; ++i) {
            if (num == 0)
                break;
            while (num >= vals[i]) {
                sb.append(sym[i]);
                num -= vals[i];
            }
        }
        return sb.toString();        
    }
}
