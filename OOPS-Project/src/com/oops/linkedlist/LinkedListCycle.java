package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class LinkedListCycle {
	public boolean hasCycle(Node head) {
		if(head == null || head.nextNode == null)
			return false;
		Node stepOne = head;
		Node stepTwo = head.nextNode;
		while(stepOne != stepTwo) {
			if(stepTwo == null || stepTwo.nextNode == null)
				return false;
			stepOne = stepOne.nextNode;
			stepTwo = stepTwo.nextNode.nextNode;
		}
		return true;
	}
	/*
	 public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;   
        }
        ListNode stepOne = head;
        ListNode stepTwo = head;
        while(stepTwo != null && stepTwo.next != null) {
            stepOne = stepOne.next;
            stepTwo = stepTwo.next.next;
            if(stepOne == stepTwo) {
                return true;
            }
        }
        return false;
    }
	 */
}
