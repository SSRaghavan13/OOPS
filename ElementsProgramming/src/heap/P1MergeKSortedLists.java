package heap;

import java.util.PriorityQueue;

import linkedlist.Node;

public class P1MergeKSortedLists {
    
    public Node<Integer> mergeKLists(Node<Integer>[] lists) {
        if (lists == null || lists.length == 0) 
            return null;
        PriorityQueue<Node<Integer>> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        Node<Integer> head = new Node<Integer>(0);
        Node<Integer> temp = head;
        for(Node<Integer> node: lists) {
            if(node != null)
                heap.add(node);
        }
        while(!heap.isEmpty()) {
            Node<Integer> next = heap.poll();
            temp.next = next;
            temp = temp.next;
            if(next.next != null)
                heap.add(next.next);
        }
        return head.next;
    }

}