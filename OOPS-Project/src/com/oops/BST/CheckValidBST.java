package com.oops.BST;

import java.util.Stack;

import com.oops.BST.TreeNode;

public class CheckValidBST {
	public boolean isValidBST(TreeNode root) {
		if(root == null)
			return true;
		Stack<TreeNode> nodes = new Stack<>();
		TreeNode prevNode = null;
		while(root != null || !nodes.isEmpty()) {
			while(root != null) {
				nodes.push(root);
				root = root.left;
			}
			TreeNode top = nodes.pop();
			if(prevNode != null && prevNode.val >= top.val)
				return false;
			prevNode = top;
			root = top.left;
		}
		return true;
	}
}
