/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
*/
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            res.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        
        return res.toString();        
    }
}
