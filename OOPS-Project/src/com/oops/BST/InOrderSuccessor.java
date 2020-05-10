package com.oops.BST;

public class InOrderSuccessor {
	public TreeNode inOrderSuccessor (TreeNode root, TreeNode p) {
		if(root == null)
			return root;
		TreeNode prev = null;
		TreeNode current = root;
		while(current != null && current.val != p.val) {
			if(current.val > p.val) {
				prev = current;
				current = current.left;
			}
			else
				current = current.right;
		}
		
		if(current.right == null)
			return prev;
		
		current = current.right;
		while(current.left != null)
			current = current.left;
		
		return current;
	}
	
	public TreeNode inOrder(TreeNode root, int data) {
		if(root == null)
			return root;
		TreeNode successor = null;
		TreeNode ancestor = root;
		TreeNode current = searchBST(root, data);
		if(current.right != null) {
			TreeNode temp = current.right;
			while(temp.left != null)
				temp = temp.left;
			return temp;
		}
		else {
			while(ancestor != current) {
				if(data < ancestor.val) {
					successor = ancestor;
					ancestor = ancestor.left;
				}
				else {
					ancestor = ancestor.right;
				}
			}
		}
		return successor;
	}
	
	public TreeNode searchBST(TreeNode root, int val) {
		while(root != null) {
			if(val == root.val)
				return root;
			else if(val < root.val)
				root = root.left;
			else if(val > root.val)
				root = root.right;
		}
		return null;
	}
	
}
