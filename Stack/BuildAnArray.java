/*
Use the two stack operations to make the numbers in the stack (from the bottom to the top) equal to target. You should follow the following rules:
    1. If the stream of the integers is not empty, pick the next integer from the stream and push it to the top of the stack.
    2. If the stack is not empty, pop the integer at the top of the stack.
    3. If, at any moment, the elements in the stack (from the bottom to the top) are equal to target, do not read new integers from the stream and do not do more operations on the stack.
*/
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        var j = 0;      // сounter for target
        var i = 1;       // counter for n

        while(j < target.length) {
            res.add("Push");
            if (target[j] != i) res.add("Pop");
            else j++;
            i++;
        }
        return res ;   
    }
}
