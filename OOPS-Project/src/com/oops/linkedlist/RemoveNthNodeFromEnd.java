package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class RemoveNthNodeFromEnd {
	public Node removeNthFromEnd(Node head, int n) {
        Node pa = head, pb = head, prev = null;
        int length = 0, count = 0, counter = 0;
        while (pa != null) {
            pa = pa.nextNode;
            length += 1;
        }
        count = (length - n);
        if(count == 0 && length == 1) {
            head = null;
            return head;
        }
        if(count == 0) {
            head = head.nextNode;
            return head;
        }
        while (counter != count) {
            prev = pb;
            pb = pb.nextNode;
            counter++;
        }
        prev.nextNode = pb.nextNode;
        return head;
    }
}
