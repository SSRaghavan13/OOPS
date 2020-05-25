package binarytree;

public class P9KthNodeInorder {
    public static TreeNodeNumber findKthNode(TreeNodeNumber root, int k) {
        TreeNodeNumber temp = root;
        while(temp != null) {
            int leftNum = temp.left != null ? temp.left.number : 0;
            if(leftNum + 1 < k) {
                k -= (leftNum + 1);
                temp = temp.right;
            }
            else if(leftNum + 1 == k)
                return temp;
            else 
                temp = temp.left;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNodeNumber root = new TreeNodeNumber(100);
        TreeNodeNumber l1 = new TreeNodeNumber(20);
        TreeNodeNumber r1 = new TreeNodeNumber(500);
        TreeNodeNumber l1l = new TreeNodeNumber(10);
        TreeNodeNumber l1r = new TreeNodeNumber(30);
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
        root.number = 5;
        l1.number = 3;
        l1l.number = 1;
        l1r.number = 1;
        r1.number = 1;
        System.out.println(findKthNode(root, 4));
    }
}