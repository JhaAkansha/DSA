/*
Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle, and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".
One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.
Implement the MyCircularQueue class:
    1. MyCircularQueue(k) Initializes the object with the size of the queue to be k.
    2. int Front() Gets the front item from the queue. If the queue is empty, return -1.
    3. int Rear() Gets the last item from the queue. If the queue is empty, return -1.
    4. boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
    5. boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
    6. boolean isEmpty() Checks whether the circular queue is empty or not.
    7. boolean isFull() Checks whether the circular queue is full or not.
*/
class MyCircularQueue {
    public MyCircularQueue(int k) {
        q = new int[k];
        cnt = 0;                     //number of elements in the queue
        size = k;
        headIdx = 0;
    }
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        q[(headIdx + cnt) % size] = value;
        cnt += 1;
        return true;
    }
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        headIdx = (headIdx + 1) % size;
        cnt -= 1;
        return true;
    }
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return q[headIdx];
    }
    public int Rear() {
        if (isEmpty()) return -1;
        return q[(headIdx + cnt - 1) % size];
    } 
    public boolean isEmpty() {
        return cnt == 0;
    }
    public boolean isFull() {
        return cnt == size;
    }
    private int[] q;
    private int headIdx, cnt, size;
}
/*
 Your MyCircularQueue object will be instantiated and called as such:
 MyCircularQueue obj = new MyCircularQueue(k);
 boolean param_1 = obj.enQueue(value);
 boolean param_2 = obj.deQueue();
 int param_3 = obj.Front();
 int param_4 = obj.Rear();
 boolean param_5 = obj.isEmpty();
 boolean param_6 = obj.isFull();
 */
