"""
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:
Input: n = 1
Output: ["()"]

 
Constraints:


	1 <= n <= 8
"""

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack = []
        res = []
        def backtrack(openB, closeB):
            if (openB == closeB == n):
                res.append("".join(stack))
                return
            if (openB < n):
                stack.append("(")
                backtrack(openB + 1, closeB)
                stack.pop()
            if (closeB < openB):
                stack.append(")")
                backtrack(openB, closeB + 1)
                stack.pop()
        backtrack(0,0)
        return res