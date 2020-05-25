package binarytree;

public class TreeNodeParent {
    public int val;
    public TreeNodeParent left;
    public TreeNodeParent right;
    public TreeNodeParent parent;

    TreeNodeParent(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node data: " + this.val;
    }
}