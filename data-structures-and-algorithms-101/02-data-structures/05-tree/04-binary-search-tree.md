# Binary seacrh tree (BST)

## Concept

A binary search tree (BST) is a type of binary tree that follows a specific ordering property.   
    
- In a binary search tree, for any given node:   
1. The value of every node in the left subtree is less than the value of the current node.     
2. The value of every node in the right subtree is greater than or equal to the value of the current node.    
3. Binary search trees do not allow duplicate values. If a value already exists in the tree and an insertion operation is performed with the same value, it is typically ignored.


<br/>
    
## Example 


### Primitive 
   
Figuer 1     
<img width="910" alt="Introduction to Decision tree-01" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/05-tree/images/binary-search-tree-example.jpg">

   
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
3. Search function
4. Delete function 


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

        System.out.println();
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

    public boolean search(int value) {
        if (this.root == null) {
            return false;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(this.root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            if (current.val == value) {
                return true;
            }

            if (value < current.val && current.left != null) {
                stack.push(current.left);
            } else if (value > current.val && current.right != null) {
                stack.push(current.right);
            }
        }

        return false;
    }

    public boolean delete(int value) {
        if (this.root == null) {
            return false;
        }

        Stack<Node> stack = new Stack<>();
        Node curr = this.root;
        Node prev = null;
        boolean isLeftChild = false;

        // Search for the taget (curr) and it's parent (prev)
        while (curr != null) {
            stack.push(curr);

            if (value == curr.val) {
                break;
            }

            prev = curr;

            if (value < curr.val) {
                curr = curr.left;
                isLeftChild = true;
            } else {
                curr = curr.right;
                isLeftChild = false;
            }
        }

        // Case: the target was not found
        if (curr == null) {
            System.out.println("The target was not found");
            return false;
        }

        // Case: the target has no children (leaf node)
        if (curr.left == null && curr.right == null) {
            if (curr == root) {
                root = null;
            } else if (isLeftChild) {
                prev.left = null;
            } else {
                prev.right = null;
            }
        // Case: the target is not a leaf node    
        } else {
            System.out.println("The target { " + value + " } is not a leaf node");
            return false;
        }

        return true;
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

        System.out.println("\nprint tree values:");
        bst.print();

        int deleteTerget = 13;
        bst.delete(deleteTerget);

        System.out.println("\nAfter deletion of " + deleteTerget + ":");
        bst.print();

        int searchTarget = 14;
        System.out.println("\nWas the serach target: { " + searchTarget + "} found?" );
        System.out.println(bst.search(searchTarget));

        

    }

```

Output:
```java
print tree values:
 8 3 1 6 4 7 10 14 13

After deletion of 13:
 8 3 1 6 4 7 10 14

Was the serach target: { 14 } found?
true
```

## Projects

Project Title | Deadline |
|:-----------:|:-------------|
