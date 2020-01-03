package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class MergeSortedLL {
	public Node mergeTwoLists(Node l1, Node l2) {
		Node p1 = l1, p2 = l2, head = new MyLinkedList().new Node(0), temp = head;
		while(p1 != null && p2 != null) {
			if(p1.value <= p2.value) {
				temp.nextNode = p1;
				p1 = p1.nextNode;
			}
			else {
				temp.nextNode = p2;
				p2 = p2.nextNode;
			}
			temp = temp.nextNode;
		}
		if(p1 != null) {
			temp.nextNode = p1;
		}
		if(p2 != null) {
			temp.nextNode = p2;;
		}
		return head.nextNode;
	}
}
