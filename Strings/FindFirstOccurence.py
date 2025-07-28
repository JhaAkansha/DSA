'''
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
'''
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        lst1 = [needle]
        lst2 = []
        x = len(needle)
        y = len(haystack)
        for i in range (0, y):
            lst2.append(haystack[i:i+x])
        print(lst1)
        print(lst2)
        for i in lst2:
            print(i)
            if (i in lst1):
                print("yup")
                idx = (lst2.index(i))
                break;
            else:
                print("nope")
                idx =  -1
        return idx