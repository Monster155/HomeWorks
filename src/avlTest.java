public class avlTest {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        for (int i = 0; i < 10; i++) {
            tree.add(i + 1);
        }
        tree.remove(6);
        tree.print();
    }
}
