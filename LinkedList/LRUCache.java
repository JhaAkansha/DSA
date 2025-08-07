/*
 Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 Implement the LRUCache class:
    - LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
    - int get(int key) Return the value of the key if the key exists, otherwise return -1.
    - void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 The functions get and put must each run in O(1) average time complexity.
 */

 class LRUCache {
    class DLLNode {
        DLLNode prev, next;
        int key, val;

        DLLNode(int key, int value) {
            this.key = key;
            this.val = value;
        }
    }

    DLLNode head; 
    DLLNode tail;
    HashMap<Integer, DLLNode> mpp;
    int capacity;

    public LRUCache(int capacity) { //just used to instiantiate the values
        head = new DLLNode(-1,-1);
        tail = new DLLNode(-1,-1); 
        head.next = tail;
        tail.prev = head;

        mpp = new HashMap<>();

        this.capacity = capacity;
    }
    
    public int get(int key) { //if it doesnot contain return -1, if contain then put the node after the head which indicated the node has been recently used.
        if(!mpp.containsKey(key)) return -1;
        DLLNode node = mpp.get(key);
        deleteNode(node);
        insertAfterHead(node);
        return node.val;
    }
    
    //if it contain the key, no need to generate the new node 
    //as creating the new node with same key will waste of nodes or increase space complexity
    //so just update the value of the key and replace the node from its place to "after the head"(which indicated the node is recently used)
    public void put(int key, int value) { 
        if(mpp.containsKey(key)) {
            DLLNode node = mpp.get(key);
            node.val = value;
            deleteNode(node);
            insertAfterHead(node);
            mpp.put(key,node);
        }
        else{
            //if it doesnot contain the node have the same key then check if there is capacity left or not
            //if not present remove the LRU cache node (which is previous of tail)and from map also(which contain the older value) then Add the node "after the head" and don't forget to add it in Map(with new value).
            if(mpp.size() == capacity) {
                //DLLNode node = mpp.get(tail.prev.val);
                mpp.remove(tail.prev.key);
                deleteNode(tail.prev); 
            }
            DLLNode newNode = new DLLNode(key,value);
            insertAfterHead(newNode);
            mpp.put(key,newNode);
        }
    }

    //deleting the node from its place.
    public void deleteNode(DLLNode node) {
        DLLNode prevNode = node.prev;
        prevNode.next = node.next;
        node.next.prev = prevNode;
    }

    //just putting the newNode after the head
    public void insertAfterHead(DLLNode node) { 
        DLLNode afterNode = head.next;
        head.next = node;
        node.prev = head;
        afterNode.prev = node;
        node.next = afterNode;
    }
}



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */