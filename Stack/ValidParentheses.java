/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
  */

class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            switch (ch){
                case ('('):
                case ('{'):
                case ('['):
                    stack.push(ch);
                    break;
                case (')'):
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ('}'):
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case (']'):
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
