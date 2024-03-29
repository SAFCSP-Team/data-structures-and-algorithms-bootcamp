# Binary tree
A binary tree is a type of tree data structure and it will be covered in the following sections.

## Concept

The binary tree is a tree where every node has a maximum of two child nodes 



**Types of binary tree**
<br/>

Figure 1    
<p align="center">
  <img src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/05-tree/images/Types-of-binary-tree.jpg">
</p>

1. Full Binary Tree
- A tree where tree nodes can have either two children or no child.
  

2. Complete Binary Tree 
- A tree where each node on all levels except the last level has two children.
- A tree where at the lowest level, all leaves should reside possibly on the left side.


3. Perfect Binary Tree
- A tree where every node must have two children and every leaf is present on the same level.


4. Balanced Binary Tree
- `Balance factor` = height(left subtree) - height(right subtree)
- It balances a binary tree for each node if its `balance factor` is either -1,0 or 1. The height of the left subtree and that of the right tree can vary by at most one.


5. Degenerate Binary Tree
- A tree where every `internal node` has exactly one child.
- `Internal node`: Any node with a child and a parent

<br/>

### Tree traversal  
It is the process of accessing a required node to perform a special operation or visiting each node and printing its values.

Figure 2   
<p align="center">
  <img width="460" height="300" src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/blob/main/data-structures-and-algorithms-101/02-data-structures/05-tree/images/Copy-of-tree-intro.jpg">
</p>

There are three ways to traverse a tree:

1. Pre-order traversal

- Access the root node
- Access all nodes from the left side
- Access all nodes from the right side
For example: in figure 2, the pre-order path is: `A -> B -> D -> E -> C -> F -> G -> H`.

2. In-order traversal

- Access all nodes from the left side
- Access the root node
- Access all nodes from the right side
- Example: in Figure 2, the in-order path is: `D -> B -> E -> A -> F -> C -> G -> H`.


3. Post-order traversal

- Access all nodes from the left side
- Access all nodes from the right side
- Access the root node
- Example: in Figure 2, the post-order path is: `D -> E -> B -> F -> H -> G -> C -> A`.

<br/>




## Example 
We will create a tree of integers and we will perform the Pre-order traversal and add operations on it.  
Since the `binary tree` has a maximum of two children, then the `node` should have only two pointers (left and right).

### Primitive 

- In the `node` class we will declare the attributes (data and pointers) and create a constructor.

```java
class Node {
  int data;
  Node left, right;

  public Node(int item) {
    data = item;
    left = right = null;
  }
}
```

- In the `binary tree` class we will declare the root as an attribute  
1. Create constructor  
2. Create a Pre-order traversal operation/function to print all the nodes values   
3. Create a search function to find a specific node   
4. Create addLeft and addRight function  


```java

import java.util.Stack;

import 
class BinaryTree {
  Node root;

  public BinaryTree(Node root) {
    this.root = root;
  }


  // Pre-order traverse
  public void print() {

    if (this.root == null) {
      System.out.println("Tree is empty");
      return;
    }

    Stack<Node> stack = new Stack<Node>();
    stack.push(this.root);

    while (!stack.isEmpty()) {
      Node currentNode = stack.pop();

      System.out.print(" " + currentNode.data);

      if (currentNode.right != null) {
        stack.push(currentNode.right);
      }

      if (currentNode.left != null) {
        stack.push(currentNode.left);
      }

    }
    return;
  }

  public Node search(int target) {

    if (this.root == null) {
      System.out.println("Tree is empty");
      return null;
    }

    Stack<Node> stack = new Stack<Node>();
    stack.push(this.root);

    while (!stack.isEmpty()) {
      Node currentNode = stack.pop();

      if (currentNode.data == target) {
        return currentNode;
      }

      if (currentNode.right != null) {
        stack.push(currentNode.right);
      }

      if (currentNode.left != null) {
        stack.push(currentNode.left);
      }

    }
    return null;
  }

  public void addRight(int parentData, int newNodeData) {

    Node newNode = new Node(newNodeData);
    Node parent = search(parentData);

    if (parent != null) {

      if (parent.right == null) {
        parent.right = newNode;
        System.out.println(newNodeData + " child added successfully");
      } else {
        System.out.println("parent already has a right child");
        return;
      }
    } else {
      System.out.println(parentData + " parent not fount");
    }

  }

  public void addLeft(int parentData, int newNodeData) {

    Node newNode = new Node(newNodeData);
    Node parent = search(parentData);

    if (parent != null) {

      if (parent.left == null) {
        parent.left = newNode;
        System.out.println(newNodeData + " child added successfully");
      } else {
        System.out.println("parent already has a right child");
        return;
      }
    } else {
      System.out.println(parentData + " parent not fount");
    }

  }

 
}

```

- In `main` we will build the tree using binary tree class functions:

```java

  public static void main(String[] args) {

    // Root creation
    BinaryTree tree = new BinaryTree(new Node(1));

    // Add children to the root
    tree.addLeft(1, 2);
    tree.addRight(1, 3);

    // Add children to the left child
    tree.addLeft(2, 4);
    tree.addRight(2, 5);

    // Add children to the right child
    tree.addLeft(3, 6);
    tree.addRight(3, 7);

    System.out.print("Print tree values");
    tree.print();

  }

```

Output
```
2 child added successfully
3 child added successfully
4 child added successfully
5 child added successfully
6 child added successfully
7 child added successfully
Print tree values 1 2 4 5 3 6 7           
```
<br/>
 
 
## Projects

Project Title | Deadline |
|:-----------:|:-------------|
|[Binary tree project](https://github.com/SAFCSP-Team/binary-tree-project) | - | 







