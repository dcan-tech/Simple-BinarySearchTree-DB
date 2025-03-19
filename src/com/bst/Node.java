package com.bst;

/**
 * Represents a node in a binary search tree.
 * Each node contains an integer value, a reference to a left child node, and a reference to a right child node.
 */
public class Node {
    private int value;       // The integer value stored in this node
    private Node leftNode;   // Reference to the left child node
    private Node rightNode;  // Reference to the right child node

    /**
     * Constructor 1: Creates a Node with only a value.
     * The left and right children are set to null.
     * This is useful for inserting new nodes into the tree.
     *
     * @param value The integer value to store in the node
     */
    public Node(int value) {
        this(value, null, null); // Calls the second constructor with null children
    }

    /**
     * Constructor 2: Creates a Node with a value and specified child nodes.
     * This is useful when creating a tree manually.
     *
     * @param value The integer value to store in the node
     * @param left  The left child node (can be null)
     * @param right The right child node (can be null)
     */
    public Node(int value, Node left, Node right) {
        this.value = value;
        this.leftNode = left;
        this.rightNode = right;
    }

    /**
     * Sets the left child node.
     *
     * @param node The new left child
     */
    public void setLeftNode(Node node) {
        this.leftNode = node;
    }

    /**
     * Sets the right child node.
     *
     * @param node The new right child
     */
    public void setRightNode(Node node) {
        this.rightNode = node;
    }

    /**
     * Returns the left child node.
     *
     * @return The left child node (or null if no left child)
     */
    public Node getLeftNode() {
        return leftNode;
    }

    /**
     * Returns the right child node.
     *
     * @return The right child node (or null if no right child)
     */
    public Node getRightNode() {
        return rightNode;
    }

    /**
     * Returns the integer value stored in this node.
     *
     * @return The node's value
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets a new value for this node.
     *
     * @param value The new integer value to store in the node
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Generates a string representation of the node and its subtree.
     * Uses in-order traversal (Left - Root - Right) for output.
     *
     * @return A string representation of the subtree rooted at this node
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (leftNode != null) result.append(leftNode).append(" - ");
        result.append(value);
        if (rightNode != null) result.append(" - ").append(rightNode);
        return result.toString();
    }
}
