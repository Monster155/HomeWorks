public class BinTreeNode {
    private BinTreeNode right, left;
    private int value;

    public BinTreeNode(int value) {
        this.value = value;
    }

    public BinTreeNode getRight() {
        return right;
    }

    public BinTreeNode getLeft() {
        return left;
    }

    public int getValue() {
        return value;
    }

    public void setRight(BinTreeNode right) {
        this.right = right;
    }

    public void setLeft(BinTreeNode left) {
        this.left = left;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
