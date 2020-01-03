package com.oops.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> reqdList = new ArrayList<>();
		List<Integer> nodeList = new ArrayList<>();
		if(root == null)
			return reqdList;
		Queue<TreeNode> current = new LinkedList<>();
		Queue<TreeNode> next = new LinkedList<>();
		current.add(root);
		while(!current.isEmpty()) {
			TreeNode node = current.remove();
			if(node.left != null)
				next.add(node.left);
			if(node.right != null)
				next.add(node.right);
			nodeList.add(node.val);
			if(current.isEmpty()) {
				current = next;
				next = new LinkedList<>();
				reqdList.add(nodeList);
				nodeList = new ArrayList<>();
			}
		}
		return reqdList;
	}
}
