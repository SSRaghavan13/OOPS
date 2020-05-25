package binarytree;

/**
 * Store the number of nodes below this node in number.
 */
public class TreeNodeNumber {
    public int val;
    public TreeNodeNumber left;
    public TreeNodeNumber right;
    public int number;

    TreeNodeNumber(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node data: " + this.val;
    }
}