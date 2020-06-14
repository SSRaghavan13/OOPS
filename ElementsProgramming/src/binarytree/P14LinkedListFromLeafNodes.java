package binarytree;

import linkedlist.Node;

public class P14LinkedListFromLeafNodes {
    
    static Node<Integer> head = new Node<>(0);
    static Node<Integer> temp = head;

    public static Node<Integer> linkedListLeafNodes(TreeNode root) {
        helper(root);
        return head.next;
    }

    public static void helper(TreeNode root) {
        if(root != null) {
            if(root.left == null && root.right == null) {
                Node<Integer> nextNode = new Node<>(root.val);
                temp.next = nextNode;
                temp = temp.next;
            }
            else {
                helper(root.left);
                helper(root.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        TreeNode l1 = new TreeNode(20);
        TreeNode r1 = new TreeNode(500);
        TreeNode l1l = new TreeNode(10);
        TreeNode l1r = new TreeNode(30);
        root.left = l1;
        root.right = r1;
        l1.left = l1l;
        l1.right = l1r;
        l1l.left = null;
        l1l.right = null;
        l1r.left = null;
        l1r.right = null;
        r1.left = null;
        r1.right = null;
        Node.print(linkedListLeafNodes(root));
    }

}