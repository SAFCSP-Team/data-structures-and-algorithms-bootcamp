# Binary seacrh tree (BST)

## Concept

A binary search tree (BST) is a type of binary tree that follows a specific ordering property.   
    
- In a binary search tree, for any given node:   
1 - The value of every node in the left subtree is less than the value of the current node.     
2- The value of every node in the right subtree is greater than or equal to the value of the current node.    
3 - Binary search trees do not allow duplicate values. If a value already exists in the tree and an insertion operation is performed with the same value, it is typically ignored.


<br/>
    
## Example 


### Primitive 
 
- BST example in the figuer 1 below:  

Figuer 1     

        8   
      /   \
     3     10   
    / \      \
   1   6      14  
      / \    /
     4   7  13   

   
In this example, the binary search tree follows the ordering property, where all values in the left subtree are less than the current node, and all values in the right subtree are greater than or equal to the current node.


- `Node` class implementation:

```java

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

```

- `BinarySearchTree` class implementation:

1. Print function 
2. Insert function


```java

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void print() {

        if (this.root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(this.root);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            System.out.print(" " + currentNode.val);

            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }

            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }

        }
        return;
    }

public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (true) {
            stack.push(curr);

            if (value == curr.val) {
                return;
            } else if (value < curr.val) {
                if (curr.left == null) {
                    curr.left = newNode;
                    return;
                }
                curr = curr.left;
            } else {
                if (curr.right == null) {
                    curr.right = newNode;
                    return;
                }
                curr = curr.right;
            }
        }
    }

}

```

Now we will use the BinarySearchTree in the main function:

```java
public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);

        System.out.println("print tree values:");
        bst.print();
}

```

## Projects

Project Title | Deadline |
|:-----------:|:-------------|
|[Binary tree - Decision tree](https://github.com/SAFCSP-Team/binary-tree-with-non-premetive-data-type) | - | 