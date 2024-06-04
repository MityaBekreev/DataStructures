class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    private TreeNode root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    // Метод для вставки элемента в дерево
    public void add(int value) {
        root = addRec(root, value);
        size++;
    }

    private TreeNode addRec(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.value) {
            node.left = addRec(node.left, value);
        } else if (value > node.value) {
            node.right = addRec(node.right, value);
        }
        return node;
    }

    // Метод для удаления элемента из дерева
    public void remove(int value) {
        root = removeRec(root, value);
        size--;
    }

    private TreeNode removeRec(TreeNode node, int value) {
        if (node == null) {
            return null;
        }
        if (value < node.value) {
            node.left = removeRec(node.left, value);
        } else if (value > node.value) {
            node.right = removeRec(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.value = findMinValue(node.right);
            node.right = removeRec(node.right, node.value);
        }
        return node;
    }

    private int findMinValue(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }

    // Метод для проверки, содержится ли значение в дереве
    public boolean contains(int value) {
        return containsRec(root, value);
    }

    private boolean containsRec(TreeNode node, int value) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        } else if (value < node.value) {
            return containsRec(node.left, value);
        } else {
            return containsRec(node.right, value);
        }
    }

    // Метод для обхода дерева в порядке "inorder"
    public void inorderTraversal() {
        inorderTraversalRec(root);
    }

    private void inorderTraversalRec(TreeNode node) {
        if (node != null) {
            inorderTraversalRec(node.left);
            System.out.print(node.value + " ");
            inorderTraversalRec(node.right);
        }
    }
    // Метод для обхода дерева в порядке "preorder"
    public void preorderTraversal() {
        preorderTraversalRec(root);
    }

    private void preorderTraversalRec(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderTraversalRec(node.left);
            preorderTraversalRec(node.right);
        }
    }

    // Метод для обхода дерева в порядке "postorder"
    public void postorderTraversal() {
        postorderTraversalRec(root);
    }

    private void postorderTraversalRec(TreeNode node) {
        if (node != null) {
            postorderTraversalRec(node.left);
            postorderTraversalRec(node.right);
            System.out.print(node.value + " ");
        }
    }

    // Метод для получения количества узлов в дереве
    public int count() {
        return size;
    }

    // Метод для очистки дерева
    public void clear() {
        root = null;
        size = 0;
    }
}
