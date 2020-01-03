package com.oops.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {
	public List<Integer> postOrderTraversal(TreeNode root) {
		List<Integer> reqdList = new ArrayList<>();
		if(root == null)
			return reqdList;
		Stack<TreeNode> nodeStack = new Stack<>();
		nodeStack.push(root);
		while(!nodeStack.empty()) {
			root = nodeStack.pop();
			reqdList.add(0, root.val);
			if(root.left != null)
				nodeStack.add(root.left);
			if(root.right != null)
				nodeStack.add(root.right);
		}
		return reqdList;
	}
}
