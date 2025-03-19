package com.bst;

public class BinarySearchTree {
    private Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.getValue()) {
            current.setLeftNode(insertRecursive(current.getLeftNode(), value));
        } else if (value > current.getValue()) {
            current.setRightNode(insertRecursive(current.getRightNode(), value));
        }
        return current;
    }

    public boolean contains(int value) {
        return searchRecursive(root, value) != null;
    }

    private Node searchRecursive(Node current, int value) {
        if (current == null || current.getValue() == value) {
            return current;
        }
        return value < current.getValue()
                ? searchRecursive(current.getLeftNode(), value)
                : searchRecursive(current.getRightNode(), value);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value < current.getValue()) {
            current.setLeftNode(deleteRecursive(current.getLeftNode(), value));
        } else if (value > current.getValue()) {
            current.setRightNode(deleteRecursive(current.getRightNode(), value));
        } else {
            // Case 1: No children (Leaf node)
            if (current.getLeftNode() == null && current.getRightNode() == null) {
                return null;
            }
            // Case 2: One child
            if (current.getLeftNode() == null) {
                return current.getRightNode();
            } else if (current.getRightNode() == null) {
                return current.getLeftNode();
            }
            // Case 3: Two children - Find the in-order successor (smallest in right subtree)
            Node smallestNode = findMin(current.getRightNode());
            current.setValue(smallestNode.getValue());
            current.setRightNode(deleteRecursive(current.getRightNode(), smallestNode.getValue()));
        }
        return current;
    }

    private Node findMin(Node node) {
        while (node.getLeftNode() != null) {
            node = node.getLeftNode();
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        inOrderTraversal(root, sb);
        return sb.toString().trim();
    }

    private void inOrderTraversal(Node node, StringBuilder sb) {
        if (node != null) {
            inOrderTraversal(node.getLeftNode(), sb);
            sb.append(node.getValue()).append(" ");
            inOrderTraversal(node.getRightNode(), sb);
        }
    }
}
