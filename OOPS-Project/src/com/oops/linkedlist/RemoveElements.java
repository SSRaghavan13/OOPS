package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class RemoveElements {
	public Node removeElements(Node head, int val) {
		Node temp = null, current = head;
		if(head == null)
			return head;
		while(head != null) {
			if(head.value == val)
				head = head.nextNode;
			else
				break;
		}
		while(current.nextNode != null) {
			if(current.nextNode.value == val) {
				temp = current.nextNode;
				current.nextNode = temp.nextNode;
			}
			else
				current = current.nextNode;
		}
		return head;
	}
}
