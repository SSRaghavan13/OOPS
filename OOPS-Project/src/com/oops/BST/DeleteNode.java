package com.oops.BST;

public class DeleteNode {
	public TreeNode deleteNode(TreeNode root, int val) {
		TreeNode current = root;
		TreeNode prev = null;
		//Keep traversing till you find the node to be deleted
		while(current != null && current.val != val) {
			prev = current;
			if(val < current.val)
				current = current.left;
			else
				current = current.right;
		}
		//If val is not present in the tree, return
		if(current == null)
			return root;
		
		//If node has no children
		if(current.left == null && current.right == null) {
			if(current != root) {
				if(prev.left == current)
					prev.left = null;
				else
					prev.right = null;
			}
			else
				root = null;
		}
		//If node has 2 children
		else if(current.left != null && current.right != null) {
			TreeNode inOrderSucc = nextMinVal(current.right);
			prev.val = inOrderSucc.val;
			deleteNode(root, inOrderSucc.val);
		}
		//If node has 1 child
		else {
			TreeNode child = (current.left != null) ? current.left : current.right;
			if(current != root) {
				if(prev.left == current)
					prev.left = child;
				else
					prev.right = child;
			}
			else
				root = child;
		}
		return root;
	}
	
	//To find in order successor of the right node
	public TreeNode nextMinVal(TreeNode current) {
		while(current.left != null)
			current = current.left;
		return current;
	}
}
