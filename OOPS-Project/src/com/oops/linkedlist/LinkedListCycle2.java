package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class LinkedListCycle2 {
	public Node detectCycle(Node head) {
		if(head == null || head.nextNode == null)
			return null;
		Node stepOne = head;
		Node stepTwo = head;
		Boolean isCycle = false;
		while(stepOne != null && stepOne.nextNode != null) {
			stepOne = stepOne.nextNode;
			stepTwo = stepTwo.nextNode.nextNode;
			if(stepOne == stepTwo) {
				isCycle = true;
				break;
			}
		}
		if(isCycle) {
			stepOne = head;
			while(stepOne != stepTwo) {
				stepOne = stepOne.nextNode;
				stepTwo = stepTwo.nextNode;
			}
			return stepOne;
		}
		return null;
	}
}
