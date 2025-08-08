'''
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
'''

class Solution:
    def reverseWords(self, s: str) -> str:
        '''l = len(s)
        res = ""
        lst = []
        a = ""
        for i in s:
            if (i != " "):
                a = a + i
            elif (#index of char == l - 1):
                lst.append(a)
            else:
                lst.append(a)
                a = ""
            print(lst)
        k = len(lst)
        for i in range (-1, -k-1, -1):
            res = res + lst[i] + " "
        return res
        '''
        temp=s.split()
        temp.reverse()
        ans=" ".join(temp)

        return ans