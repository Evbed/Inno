package ru.bedarev.task32;

public class BinaryTree {
    Node root;

    int getLeafCount(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return getLeafCount(node.left) + getLeafCount(node.right);
        }
    }
}

class Node {
    private int data;
    Node left;
    Node right;

    Node(int item) {
        this.data = item;
        left = null;
        right = null;
    }
}

class CreateTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Листовых узлов в дереве: " + tree.getLeafCount(tree.root));
    }
}

