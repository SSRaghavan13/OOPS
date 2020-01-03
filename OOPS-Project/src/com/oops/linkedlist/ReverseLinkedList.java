package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class ReverseLinkedList {
	public Node reverseMyList(Node head) {
		Node next = null, prev = null, current = head;
		while(current != null) {
			next = current.nextNode;
			current.nextNode = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
}

/*
Node reverseUtil(Node curr, Node prev) 
    { 
  
        // If last node mark it head
        if (curr.next == null) { 
            head = curr; 
  
            //* Update next to prev node 
            curr.next = prev; 
  
            return head; 
        } 
  
        // Save curr->next node for recursive call 
        Node next1 = curr.next; 
  
        // and update next ..
        curr.next = prev; 
  
        reverseUtil(next1, curr); 
        return head; 
    }
*/