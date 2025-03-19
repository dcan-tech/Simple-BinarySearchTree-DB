package com.bst;

import com.bst.BinarySearchTree;

public class TreeTest {
    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();

        // Insert some values
        myTree.insert(50);
        myTree.insert(30);
        myTree.insert(70);
        myTree.insert(20);
        myTree.insert(40);
        myTree.insert(60);
        myTree.insert(80);

        System.out.println("Tree before deletion: " + myTree);

        // Test deleting a leaf node (20)
        myTree.delete(20);
        System.out.println("After deleting 20 (leaf node): " + myTree);

        // Test deleting a node with one child (30)
        myTree.delete(30);
        System.out.println("After deleting 30 (one child): " + myTree);

        // Test deleting a node with two children (50)
        myTree.delete(50);
        System.out.println("After deleting 50 (two children): " + myTree);
    }
}
