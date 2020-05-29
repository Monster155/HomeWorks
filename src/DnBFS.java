import java.util.ArrayDeque;
import java.util.Queue;

public class DnBFS {
    public static void main(String[] args) {
        BinTreeNode head = new BinTreeNode(1);
        BinTreeNode left = new BinTreeNode(2);
        head.setLeft(left);
        BinTreeNode right = new BinTreeNode(3);
        head.setRight(right);
        BinTreeNode leftLeft = new BinTreeNode(4);
        left.setLeft(leftLeft);
        BinTreeNode leftRight = new BinTreeNode(5);
        left.setRight(leftRight);
        BinTreeNode rightLeft = new BinTreeNode(6);
        right.setLeft(rightLeft);
        BinTreeNode rightRight = new BinTreeNode(7);
        right.setRight(rightRight);

        System.out.print("DFS:\n");
        dfs(head);
        System.out.print("\nBFS:\n");
        bfs(head);
    }

    public static void dfs(BinTreeNode node) {
        if (node == null) return;
        System.out.print(node.getValue() + " ");
        dfs(node.getLeft());
        dfs(node.getRight());
    }

    public static void bfs(BinTreeNode head) {
        if (head == null) return;
        Queue<BinTreeNode> queue = new ArrayDeque<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            BinTreeNode node = queue.remove();
            System.out.print(node.getValue() + " ");
            if (node.getLeft() != null)
                queue.add(node.getLeft());
            if (node.getRight() != null)
                queue.add(node.getRight());
        }
    }
}
