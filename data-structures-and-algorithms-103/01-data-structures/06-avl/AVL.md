# AVL tree   
AVL is named after its inventors Adelson, Velskii, and Landis.  

   
Consider we want to insert the below values in the order from left to right:   
1, 2, 3, 4, 5, 6

   
Figure 1: Binary search tree (BST) vs AVL tree   
<img width="910" alt="AVL" src="https://github.com/fahadLine/data-structure/blob/main/DS-L03/AVL/Images/data-structures-and-algorithms%20-%20Figuer%201%20(1).jpg">
   

Now if we want to search for the value 6 in both trees, in BST we should traverse through all the nodes in the tree to reach the target **performing 5 steps**. On the other hand in the AVL tree, we only have to **perform 2 steps** to reach our target.   

The searching operation in the AVL tree is much faster than BST.

<br/>
<br/>
   
     
## Concept     
Self-balancing binary search tree.    

Figure 2: AVL tree   
<img width="910" alt="AVL" src="https://github.com/fahadLine/data-structure/blob/main/DS-L03/AVL/Images/data-structures-and-algorithms%20-%20Figuer%202%20(1).jpg">



- AVL is a binary search tree itself, let's have a reminder of the binary search tree properties:    
       
In a binary search tree, for any given node:   
1. The value of every node in the left subtree is less than the value of the current node.     
2. The value of every node in the right subtree is greater than or equal to the value of the current node.    
3. Binary search trees do not allow duplicate values. If a value already exists in the tree and an insertion operation is performed with the same value, it is typically ignored.

- AVL is a self-balancing tree

Each node in the tree holds 2 information that helps to detect if the tree is balanced or not:   
1. `Height`: is equal to the **number of edges between that node and the leaf node**.    
Example: In Figure 2 the height for node `4` is:   
**{2}**.   
   
3. `Balance factor`: is equal to **(height of left node - height of right node)**.   
Example: In Figure 2 the balance factor for the node `4` is:   
**{1 - 1 = 0}**.   

When calculating the balance factor for a particular node that has no left node (left child), the height of the left node is (-1), the same rule applies to the right node (right child) if there is no right node.   
Example: In Figure 2 the balance factor for the node `6` is:   
**{ -1 - (-1) = -1 + 1 = 0}**.    
<br/>
- The tree is balanced when each node's balanced factor is either -1, 0, or 1. AVL is a self-balancing tree because it balances itself when the balance factor is not equal to these three values.     
<br/>
<br/>

**Self-balancing process:**   
To rebalance the tree there are 2 operations to be performed based on the balance factor:

1. Right Rotation    
This operation is performed when the balance factor is > +1.    
     
Figure 3   
<img width="910" alt="AVL" src="https://github.com/fahadLine/data-structure/blob/main/DS-L03/AVL/Images/data-structures-and-algorithms%20-%20Figuer%206.jpg">


   
2. Left Rotation    
This operation is performed when the balance factor is < -1.   
   
Figure 4   
<img width="910" alt="AVL" src="https://github.com/fahadLine/data-structure/blob/main/DS-L03/AVL/Images/data-structures-and-algorithms%20-%20Figuer%205.jpg">




   
## Example  

Node class   
```java
public class Node {
    int data;
    Node left, right;
    int height;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 0;
    }
}
```
   
   
AVL class   
```java
public class AVL {

    public Node root;

    AVL(Node root) {
        this.root = root;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        } else {
            // Duplicate key
            return node;
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        if (node.right == null && node.left == null)  
        node.height = 0;
        int balance = getBalance(node);

        if (balance > 1 && key < node.left.data) {
            return rightRotate(node);
        }

        if (balance < -1 && key > node.right.data) {
            return leftRotate(node);
        }

        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = 0;
        int rightHeight = 0;

        if (node.left == null){
            leftHeight = -1;
        } else {
            leftHeight = height(node.left);
        }

        
        if (node.right == null){
            rightHeight = -1;
        }
        else {
            rightHeight = height(node.right);
        }

        return leftHeight - rightHeight;

    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void printPreOrder() {
        printPreOrder(root);
    }
    
    private void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
    
        System.out.print(" " + node.data);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public Node search(int key) {
        return search(this.root, key);
    }
    
    private Node search(Node node, int key) {
        if (node == null || node.data == key) {
            return node;
        }
    
        if (key < node.data) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    public static void main(String[] args) {
        AVL tree = new AVL(new Node(1));
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        tree.printPreOrder();
    }

}

```
   
Output
   
```java
2 1 4 3 5
```
   
   
## Projects   
   
