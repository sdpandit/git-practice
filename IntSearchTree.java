public class IntSearchTree {
    private TreeNode root;

    public IntSearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private TreeNode insert(int value, TreeNode node) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.data) {
            node.left = insert(value, node.left);
            return node;
        }
        else {
            node.right = insert(value, node.right);
            return node;
        }
    }

    public boolean search(int value) {
        return search(value, root);
    }

    private boolean search(int value, TreeNode node) {
        if (node == null) {
            return false;
        }
        if (node.data == value) {
            return true;
        }
        if (value < node.data) {
            return search(value, node.left);
        }
        else {
            return search(value, node.right);
        }
    }

    public void print() {
        print(root);
    }

    private void print(TreeNode node) {
        if (node != null) {
            print(node.left);
            System.out.print(node.data + " ");
            print(node.right);
        }
    }

    public static void main(String[] args) {
        IntSearchTree tree = new IntSearchTree();
        tree.insert(28);
        tree.insert(12);
        tree.insert(5);
        tree.insert(31);
        tree.insert(19);
        tree.print();
    }

    private static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int data) {
            this(data,null,null);
        }
    }
}
