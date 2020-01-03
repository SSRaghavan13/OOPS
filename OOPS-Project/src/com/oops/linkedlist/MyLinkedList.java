package com.oops.linkedlist;

public class MyLinkedList {
	int length;
	Node head;
	
	class Node {
		Node nextNode;
		int value;
		Node(int value) {
			this.value = value;
		}
	}
	
	MyLinkedList() {
		this.length = 0;
		this.head = null;
	}
	
	public int getAtIndex(int index) {
		if(index < 0 || index >= this.length) {
			return -1;
		}
		int count = 0;
		Node head = this.head;
		while(count != index) {
			head = head.nextNode;
			count++;
		}
		return head.value;
	}
	
	public void addAtHead(int value) {
		Node newNode = new Node(value);
		newNode.nextNode = this.head;
		this.head = newNode;
		length++;
	}
	
	public void addAtTail(int value) {
		if(this.length == 0) {
			addAtHead(value);
			return;
		}
		else {
			Node head = this.head;
			Node newNode = new Node(value);
			while(head.nextNode != null) {
				head = head.nextNode;
			}
			head.nextNode = newNode;
			newNode.nextNode = null;
			this.length++;
		}
	}
	
	public void AddAtIndex (int index, int value) {
		if(index == 0 || this.length == 0) {
			addAtHead(value);
			return;
		}
		else if(index == this.length) {
			addAtTail(value);
			return;
		}
		else if(index > this.length) {
			return;
		}
		else {
			Node head = this.head;
			Node newNode = new Node(value);
			int counter = 0;
			while(counter != (index - 1)) {
				head = head.nextNode;
				counter++;
			}
			newNode.nextNode = head.nextNode;
			head.nextNode = newNode;
			this.length++;
		}
	}
	
	public void deleteAtIndex(int index) {
		Node head = this.head;
		if(index < 0 || index > this.length)
			return;
		if(index == 0) {
			head = head.nextNode;
			this.length--;
			return;
		}
		else {
			Node prev = null;
			int counter = 0;
			while(counter != (index - 1)) {
				prev = head;
				head = head.nextNode;
				counter++;
			}
			prev.nextNode = head.nextNode;
			this.length--;
		}
	}
}