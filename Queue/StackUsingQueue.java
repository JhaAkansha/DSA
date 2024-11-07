/*
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

    1. void push(int x) Pushes element x to the top of the stack.
    2. int pop() Removes the element on the top of the stack and returns it.
    3. int top() Returns the element on the top of the stack.
    4. boolean empty() Returns true if the stack is empty, false otherwise.

*/

class MyStack {
    Queue<Integer> q;
    int top;

    public MyStack() {
        q = new LinkedList<>();
        top = 0; 
    }
    
    public void push(int x) {
        q.offer(x);
        top = x;
    }
    
    public int pop() {
        int size = q.size();
        while (size > 2) {
            q.offer(q.poll());
            size--;
        }
        top = q.peek();
        q.offer(q.poll());
        return q.poll();
    }
    
    public int top() {
        return this.top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
