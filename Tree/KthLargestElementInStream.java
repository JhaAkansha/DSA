/*
You are part of a university admissions office and need to keep track of the kth highest test score from applicants in real-time. This helps to determine cut-off marks for interviews and admissions dynamically as new applicants submit their scores.
You are tasked to implement a class which, for a given integer k, maintains a stream of test scores and continuously returns the kth highest test score after a new score has been submitted. More specifically, we are looking for the kth highest score in the sorted list of all scores.
Implement the KthLargest class:
    1. KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of test scores nums.
    2. int add(int val) Adds a new test score val to the stream and returns the element representing the kth largest element in the pool of test scores so far.
*/

class KthLargest {
    Queue<Integer> q;
    int k;
    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        this.k = k;
        for (int i : nums) add(i);
    }
    
    public int add(int val) {
        q.offer(val);
        if (q.size() > k) q.poll();
        return q.peek();
        
    }
}

/*
 Your KthLargest object will be instantiated and called as such:
 KthLargest obj = new KthLargest(k, nums);
 int param_1 = obj.add(val);
*/
