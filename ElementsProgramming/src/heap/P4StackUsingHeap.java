package heap;

import java.util.PriorityQueue;

public class P4StackUsingHeap {
    PriorityQueue<HeapObj> maxHeap = new PriorityQueue<>((a, b) -> b.index - a.index);
    int timestamp = 0;

    public void push(int val) {
        maxHeap.add(new HeapObj(val, timestamp++));
    }

    public int pop() {
        return maxHeap.remove().val;
    }

    public int peek() {
        return maxHeap.peek().val;
    }

    public static void main(String[] args) {
        P4StackUsingHeap stack = new P4StackUsingHeap();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
    }
}

class HeapObj {
    int val;
    int index;

    HeapObj(int val, int index) {
        this.val = val;
        this.index = index;
    }
}