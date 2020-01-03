package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class PalindromeLL {
	public boolean isPalindrome(Node head) {
		if(head == null || head.nextNode == null)
			return true;
		Node slow = head, fast = head;
		while(fast.nextNode != null && fast.nextNode.nextNode != null) {
			slow = slow.nextNode;
			fast = fast.nextNode.nextNode;
		}
		//Split the LL into two parts and reverse the second part
		Node secondHead = slow.nextNode, prev = secondHead, current = secondHead.nextNode, next = null;
		slow.nextNode = null;
		while(current != null && prev != null) {
			next = current.nextNode;
			current.nextNode = prev;
			prev = current;
			current = next;
		}
		secondHead.nextNode = null;
		//Check the 2 sub linked list if they are equal
		slow = (current == null ? prev : current);
		fast = head;
		while(slow != null) {
			if(slow.value != fast.value)
				return false;
			slow = slow.nextNode;
			fast = fast.nextNode;
		}
		return true;
	}
}
