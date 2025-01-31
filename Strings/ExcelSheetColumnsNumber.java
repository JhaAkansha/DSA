/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
*/
class Solution {
    public int titleToNumber(String columnTitle) {
        int res =0;
        for(int i=0;i<columnTitle.length();i++){  // runs untile the length of column
            int value = columnTitle.charAt(i)-'A'+1;//example 'AB'-'A'
            res = res*26+value;
        }
        return(res);
    }
}
