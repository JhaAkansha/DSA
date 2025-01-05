/*
Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order.
*/
class Solution {
    Map<String, List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if(map.containsKey(expression)){
            return map.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch=='*' || ch == '+' ||ch=='-'){
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for (int l : left) {
                    for (int r : right) {
                        if (ch == '+') {
                            result.add(l + r);
                        } else if (ch == '-') {
                            result.add(l - r);
                        } else if (ch == '*') {
                            result.add(l * r);
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        map.put(expression, result);

        return result;
        
    }
}
