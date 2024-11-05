'''
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
'''

class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        last_occ = {}
        stack = []
        visited = set()
        for i in range(len(s)):
            last_occ[s[i]] = i
        for i in range(len(s)):
            if s[i] not in visited:
                while (stack and stack[-1] > s[i] and last_occ[stack[-1]] > i):
                    visited.remove(stack.pop())
                stack.append(s[i])
                visited.add(s[i])
        return ''.join(stack)
