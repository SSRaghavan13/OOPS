package com.oops.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	List<Integer> myStack;
	
	public MyStack() {
		myStack = new ArrayList<>();
	}
	
	public void push(int val) {
		myStack.add(val);
	}
	
	public boolean isEmpty() {
		return myStack.isEmpty();
	}
	
	public int top() {
		return myStack.get(myStack.size() - 1);
	}
	
	public boolean pop() {
		if(isEmpty())
			return false;
		myStack.remove(myStack.size() - 1);
		return true;
	}
}
