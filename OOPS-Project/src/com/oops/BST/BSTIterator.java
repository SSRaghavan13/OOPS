package com.oops.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTIterator {
	
	List<Integer> nodeList = new ArrayList<>();
	int index;
	
	public BSTIterator(TreeNode root) {
		Stack<TreeNode> nodes = new Stack<>();
		while(root != null || !nodes.isEmpty()) {
			while(root != null) {
				nodes.push(root);
				root = root.left;
			}
			TreeNode top = nodes.pop();
			nodeList.add(top.val);
			root = top.right;
		}
	}
	
	/** @return the next smallest number */
    public int next() {
    	return nodeList.get(index++);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
    	return (index < nodeList.size());
    }
}
