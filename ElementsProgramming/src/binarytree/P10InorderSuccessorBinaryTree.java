package binarytree;

public class P10InorderSuccessorBinaryTree {
    public static TreeNodeParent inorderSuccessor(TreeNodeParent node) {
        TreeNodeParent temp = node; 
        if(temp.right != null) {
            temp = temp.right;
            while(temp.left != null)
                temp = temp.left;
            return temp;
        }
        while(temp.parent != null && temp.parent.right == temp) {
            temp = temp.parent;
        }
        return temp.parent;
    }

    public static void main(String[] args) {
        TreeNodeParent root = new TreeNodeParent(100);
        TreeNodeParent l1 = new TreeNodeParent(20);
        TreeNodeParent r1 = new TreeNodeParent(500);
        TreeNodeParent l1l = new TreeNodeParent(10);
        TreeNodeParent l1r = new TreeNodeParent(30);
        root.left = l1;
        root.right = r1;
        root.parent = null;
        l1.left = l1l;
        l1.right = l1r;
        l1.parent = root;
        l1l.left = null;
        l1l.right = null;
        l1l.parent = l1;
        l1r.left = null;
        l1r.right = null;
        l1r.parent = l1;
        r1.left = null;
        r1.right = null;
        r1.parent = root;
        System.out.println(inorderSuccessor(root));
        System.out.println(inorderSuccessor(l1));
        System.out.println(inorderSuccessor(l1l));
        System.out.println(inorderSuccessor(l1r));
        System.out.println(inorderSuccessor(r1));
    }
}