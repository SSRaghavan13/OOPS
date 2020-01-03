package com.oops.linkedlist;

import com.oops.linkedlist.MyLinkedList.Node;

public class AddingNumbers {
	//The numbers in the two linked list are stored in the reverse order
	public Node addTwoNumbers(Node l1, Node l2) {
		Node p1 = l1, p2 = l2, head = new MyLinkedList().new Node(0), p3 = null;
		p3 = head;
		int sum = 0, carry = 0, num = 0;
		while(p1 != null && p2 != null) {
			sum = p1.value + p2.value + carry;
			if(sum > 9) {
				carry = sum / 10;
				num = sum % 10;
			}
			else {
				carry = 0;
				num = sum;
			}
			Node temp = new MyLinkedList().new Node(num);
			p3.nextNode = temp;
			p1 = p1.nextNode;
			p2 = p2.nextNode;
			p3 = p3.nextNode;
		}
		
		while(p1 != null) {
            sum = p1.value + carry;
            if(sum > 9) {
                carry = sum / 10;
                num = sum % 10;
            }
            else {
                num = sum;
                carry = 0;
            }
            Node temp1 = new MyLinkedList().new Node(num);
            p3.nextNode = temp1;
            p3 = p3.nextNode;
            p1 = p1.nextNode;
        }
        
        while(p2 != null) {
            sum = p2.value + carry;
            if(sum > 9) {
                carry = sum / 10;
                num = sum % 10;
            }
            else {
                num = sum;
                carry = 0;
            }
            Node temp2 = new MyLinkedList().new Node(num);
            p3.nextNode = temp2;
            p3 = p3.nextNode;
            p2 = p2.nextNode;
        }
        
        if(carry > 0) {
        	Node lastNode = new MyLinkedList().new Node(carry);
            p3.nextNode = lastNode;
            lastNode.nextNode = null;
        }
        else
        	p3.nextNode = null;
        
        return head.nextNode;
	}
}
