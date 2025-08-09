/*
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.
    1. For example, for arr = [2,3,4], the median is 3.
    2. For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.

Implement the MedianFinder class:
    1. MedianFinder() initializes the MedianFinder object.
    2. void addNum(int num) adds the integer num from the data stream to the data structure.
    3. double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
*/
class MedianFinder {
    private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        }
        else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if (even) return (small.peek() + large.peek()) / 2.0;
        else return small.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
