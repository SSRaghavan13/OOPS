package com.oops.queue;

public class CircularQueue {
	int[] queue;
	int head;
	int tail;
	int size;
	
	public CircularQueue(int size) {
		this.queue = new int[size];
		this.head = -1;
		this.tail = -1;
		this.size = size;
	}
	
	public boolean isFull() {
		return ((tail + 1) % size) == head;
	}
	
	public boolean isEmpty() {
		return (head == -1);
	}
	
	public boolean enQueue(int val) {
		if(isFull())
			return false;
		tail = (tail + 1) % size;
		queue[tail] = val;
		return true;
	}
	
	public boolean deQueue() {
		if(isEmpty())
			return false;
		if(tail == head) {
			tail = -1;
			head = -1;
			return true;
		}
		head = (head + 1) % size;
		return true;
	}
	
	public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return queue[head];
    }
	
	public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return queue[tail];
    }
}
