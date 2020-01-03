package com.oops.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
	public List<Integer> preorderTraversal(TreeNode root) {
		Stack<TreeNode> nodeStack = new Stack<>();
		List<Integer> reqdList = new ArrayList<>();
		if(root == null)
			return reqdList;
		nodeStack.push(root);
		while(nodeStack.empty() != false) {
			TreeNode topNode = nodeStack.peek();
			nodeStack.pop();
			reqdList.add(topNode.val);
			if(topNode.right != null)
				nodeStack.add(topNode.right);
			if(topNode.left != null)
				nodeStack.add(topNode.left);
		}
		return reqdList;
	}
	
	/*
	 * Using recursion
	 */
	public List<Integer> preorderRecursion(TreeNode root) {
		List<Integer> reqdList = new ArrayList<>();
		if(root == null)
			return reqdList;
		reqdList.add(root.val);
		preorderRecursion(root.left);
		preorderRecursion(root.right);
		return reqdList;
	}
}
