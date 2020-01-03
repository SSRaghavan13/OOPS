package com.oops.binaryTree;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		int leftHeight = treeHeight(root.left);
		int rightHeight = treeHeight(root.right);
		if(Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		return false;
	}

	int treeHeight(TreeNode node) {
		if(node == null)
			return 0;
		return (1 + Math.max(treeHeight(node.left),treeHeight(node.right)));
	}
}
