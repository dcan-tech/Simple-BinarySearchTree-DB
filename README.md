# Binary Search Tree Implementation

## Overview
This project is a simple implementation of a **Binary Search Tree (BST)** in Java. The BST supports basic operations such as:
- **Insertion** of values into the tree
- **Searching** for values
- **Displaying** the tree in sorted order (in-order traversal)

This project was originally structured with a `Tree` class, which has been refactored to follow industry naming conventions and best practices. The core logic now resides in the `BinarySearchTree` class.

## Features
- **Insert values**: Adds a new value to the tree while maintaining BST properties.
- **Search for values**: Checks if a given value exists in the tree.
- **In-order traversal**: Returns a sorted string representation of the tree.

## Project Structure
```
Simple-BinarySearchTree-DB/
│── src/com/tree/
│   ├── BinarySearchTree.java  # Main tree logic
│   ├── Node.java              # Represents a tree node
│   ├── TreeTest.java          # Test class with sample insertions and searches
│── README.md                  # Project documentation
```

## How to Use
### 1. Clone the Repository
```sh
git clone <repository_url>
cd Simple-BinarySearchTree-DB
```

### 2. Run the Test Program
Execute the `TreeTest` class to see the BST in action:
```sh
javac com/tree/*.java
java com.bst.TreeTest
```
Expected Output:
```
MyTree Values : 4 7 11 12 24
Contains Values ? false
```

## Future Enhancements
- **Deletion operation** to remove values from the BST.
- **Balancing techniques** for better efficiency.
- **Graphical visualization** to represent the BST structure.

## Author
Dylan Canfield

