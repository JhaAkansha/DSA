/*
You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
Evaluate the expression. Return an integer that represents the value of the expression.
Note that:
    1. The valid operators are '+', '-', '*', and '/'.
    2. Each operand may be an integer or another expression.
    3. The division between two integers always truncates toward zero.
    4. There will not be any division by zero.
    5. The input represents a valid arithmetic expression in a reverse polish notation.
    6. The answer and all the intermediate calculations can be represented in a 32-bit integer.
*/
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String t:tokens){
            if ("+-/*".contains(t)) {
                st.push(eval(st.pop(), st.pop(), t));
            }
            else st.push(Integer.parseInt(t));
        }
        return st.pop();
        }
        public int eval(int a, int b, String t) {
            if ("+".equals(t)) return a + b;
            if ("-".equals(t)) return b - a;
            if ("*".equals(t)) return a * b;
            if ("/".equals(t)) return b / a;
            return 0;
    }
}
