public class AVLTree {

    private Node head;

    //get height because can be (node = null)
    private int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    //balance factor - check for height between left and right childs
    private int balanceFactor(Node node) {
        return height(node.right) - height(node.left);
    }

    //set height by child heights
    private void fixHeight(Node node) {
        int hl = height(node.left);
        int hr = height(node.right);
        node.height = (hl > hr ? hl : hr) + 1;
    }

    //rotate tree to right
    private Node rotateRight(Node node) {
        Node left = node.left;
        node.left = left.right;
        left.right = node;
        fixHeight(node);
        fixHeight(left);
        return left;
    }

    //rotate tree to left
    private Node rotateLeft(Node node) {
        Node right = node.right;
        node.right = right.left;
        right.left = node;
        fixHeight(node);
        fixHeight(right);
        return right;
    }

    //balance changed tree
    private Node balance(Node node) {
        fixHeight(node);
        if (balanceFactor(node) > 1) {
            if (balanceFactor(node.right) < 0) {
                node.right = rotateRight(node.right);
            }
            return rotateLeft(node);
        }
        if (balanceFactor(node) < 1) {
            if (balanceFactor(node.left) > 0)
                node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        return node;
    }

    // public add
    public void add(int value) {
        head = add(head, value);
    }

    //add in recursion
    private Node add(Node node, int value) {
        if (node == null) return new Node(value);
        if (value < node.value) {
            node.left = add(node.left, value);
        } else {
            node.right = add(node.right, value);
        }
        return balance(node);
    }

    //remove lowest node (left always lower than right)
    private Node removeMin(Node node) {
        if (node.left == null) return node.right;
        node.left = removeMin(node.left);
        return balance(node);
    }

    //public remove
    public void remove(int value) {
        head = remove(head, value);
    }

    //remove in recursion
    private Node remove(Node node, int value) {
        if (node == null) return null;
        if (value < node.value) {
            node.left = remove(node.left, value);
        } else if (value > node.value) {
            node.right = remove(node.right, value);
        } else { // value == node.value
            if (node.right == null) return node.left;
            Node min = node.right;
            while (min.left != null) {
                min = min.left;
            }
            min.right = removeMin(node.right);
            min.left = node.left;
            return balance(min);
        }
        return balance(node);
    }

    //public print
    public void print() {
        print(head, "head");
    }

    //print tree in recursion
    private void print(Node node, String parent) {
        if (node == null) return;
        System.out.print("Height: " + node.height + " Value: " + node.value + " Parent: " + parent + "\n");
        print(node.left, node.value + "-left");
        print(node.right, node.value + "-right");
    }

    //node of tree
    private class Node {
        int height;
        int value;
        Node left, right;

        public Node(int value) {
            this.height = 1;
            this.value = value;
        }
    }
}
