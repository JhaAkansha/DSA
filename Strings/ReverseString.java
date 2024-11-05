/*
Write a function that reverses a string. The input string is given as an array of characters s.
*/

class Solution {
    public void reverseString(char[] s) {
        rec(s,0);
    }
    public void rec(char[] s,int i){
        int n = s.length;
        if(i<n/2){
            rec(s,i+1);
            char temp =s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }  
    }
    public void swap(char a,char b){
        char temp =a;
        a=b;
        b=temp;
    }
}
