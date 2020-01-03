package com.oops.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {
	public List<Integer> inOrderTraversal (TreeNode root) {
		List<Integer> reqdList = new ArrayList<>();
		Stack<TreeNode> nodeStack = new Stack<>();
		while(root == null)
			return reqdList;
		while(root != null || !nodeStack.empty()) {
			while(root != null) {
				nodeStack.push(root);
				root = root.left;
			}
			root = nodeStack.pop();
			reqdList.add(root.val);
			root = root.right;
		}
		return reqdList;
	}
}
