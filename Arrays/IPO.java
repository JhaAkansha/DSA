/*
Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on some projects to increase its capital before the IPO. Since it has limited resources, it can only finish at most k distinct projects before the IPO. Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.
You are given n projects where the ith project has a pure profit profits[i] and a minimum capital of capital[i] is needed to start it.
Initially, you have w capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.
Pick a list of at most k distinct projects from given projects to maximize your final capital, and return the final maximized capital.
The answer is guaranteed to fit in a 32-bit signed integer.
*/

class Solution {
        private static class Project {
            int capital;
            int profit;
            Project(int capital, int profit) {
                this.capital= capital;
                this.profit = profit;
            }
        }
        
        public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
            int n = profits.length;
            List<Project> projects = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                projects.add(new Project(capital[i], profits[i]));
            }
            Collections.sort(projects, (a,b) -> a.capital - b.capital);
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
            int i = 0;
            for (int j = 0; j < k; j++) {
                while (i < n && projects.get(i).capital <= w) {
                    maxHeap.add(projects.get(i).profit);
                    i++;
                }
                if(maxHeap.isEmpty()) {
                    break;
                }
                w += maxHeap.poll();
            }
                
            return w;
    }
}
