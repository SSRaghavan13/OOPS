package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class IntersectionLinkedList {
	public Node getIntersectionNode(Node headA, Node headB) {
		Node pa = headA, pb = headB;
		while(pa != pb) {
			/*if(pa != null)
				pa = pa.nextNode;
			else
				pa = headB;
			if(pb != null)
				pb = pb.nextNode;
			else
				pb = headA;*/
			pa = (pa != null) ? pa.nextNode : headB;
			pb = (pb != null) ? pb.nextNode : headA;
		}
		return pa;
	}
}
