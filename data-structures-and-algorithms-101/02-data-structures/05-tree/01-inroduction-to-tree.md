# Introduction to Tree

In data structure, tree is another way to organize the data.

When to use the tree and why?

Let's say you have a big company and your company have a large number of employees, the company have CEO, managers, directors.. How would you orgnanize the employees considering their roles/position?

Tree should be considered here, lets's see how the company employees would be organized using the tree as the below image (figuer 1):

Figure 1
![data representation](./images/Company-employees-tree.jpg)



## Concept

A tree is a collection of nodes that are connected by edges and has a hierarchical relationship between the nodes.

Figure 2
![data representation](./images/Tree.jpg)


## Implementation
As we explained before, the tree is a collection of nodes, and each node in the tree will contains data and pointers. The pointers in the tree node will depend on how many children a node can have, for example, let us implement a tree with maximum of three children (left, center, and right) will look as the following. 

Figure 3
![data representation](./images/Node-element.jpg)

As always, to implement the tree we will define the `Node` class first since it is the main component that will construct the whole tree.

- `Node` class implementation:

```java
public class Node {

    // Data
    int number;
    // Pointers
    Node left;
    Node center;
    Node right;

    // Constructor
    Node(int number){
        this.number = number;
        this.left = null;
        this.center = null;
        this.right = null;
    }

}

```

<br/>
<br/>

- Create an object of `node` with the name **root** in the main function.
```java
public static void main(String[] args) {
Node root = new Node(1);
}
```

>**root data**: _number_ = 1.   
>**pointers**: ( _left_ , _center_ , _right_ ) = null. as there is no node children created yet.

<br/>
<br/>

- Accecc the **root** data and print it.
```java
// print the root value
System.out.println(root.number);
```

Output:
```java
1
```

<br/>
<br/>

- Accecc and update the **root** data to be (3)

```java
root.number = 3;
```

<br/>
<br/>

- Tree class implementation:

1 - Create Tree.
2 - Create tree root (node object).
3 - Accecc the root data and print it.
4 - Accecc and update the **root** data to be (3).
5 - Create root child (left child).
6 - Print tree values


```java 


public class Node {

    // Data
    int number;
    // Pointers
    Node left;
    Node center;
    Node right;

    // Constructor
    Node(int number) {
        this.number = number;
        this.left = null;
        this.center = null;
        this.right = null;
    }

}

class Tree {

    Node root;

    Tree(int key) {
        root = new Node(key);
    }

    Tree() {
        root = null;
    }

    // Print tree values function
    public void printTreeValues(Node node) {
        if (node != null) {
            printTreeValues(node.left);
            System.out.println(" " + node.number);
            printTreeValues(node.right);
        }
    }

    public static void main(String[] args) {

        // 1 - Create Tree
        Tree tree = new Tree();

        // 2 - Create tree root (node object)
        tree.root = new Node(1);

        // 3 - Accecc the root data and print it
        System.out.println(tree.root);

        // 4 - Accecc and update the **root** data to be (3)
        tree.root.number = 3;

        // 5 - Create root child (left child)
        tree.root.left = new Node(2);

        // 6 - Print tree values
        System.out.println("Print tree values");
        tree.printTreeValues(tree.root);

    }

}
```

>Note: in printTreeValues we used a specific method called in-ordert traverse. It will be explained in details in below sections.

Now we will implement the same logic and code of the above tree but for **employees**:

- Employee class:

```java
public class Employee {
    int id;
    String name;
    String role;

    Employee(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
    }
  
}
```


- Node class

```java

public class Node {

     // Data
    Employee data;
    // Pointers
    Node left;
    Node center;
    Node right;

    // Constructor
 Node(Employee e) {
  data = e;
  left = null;
  center = null;
  right = null;
  }

public static void main(String[] args) {

        // Create Employees
        Employee firstEmployee = new Employee(01,"Ahmed","CEO");
        
        // Create an object of node
        Node root = new Node(firstEmployee);

        // Update the node data (1- change name) (2- change id)
        root.data.name = "mohammed";
        root.data.id = 02;


        // Create Employees
        Employee secondEmployee = new Employee(03,"Ali","HR Manager");
        
        // Create an object of node
        Node child = new Node(secondEmployee);


        // Add child object to the root children (left/center/right).
        root.left = child;


        // print the root value (name)
        System.out.println(root.data.name);
        // print the left child value (name)
        System.out.println(root.left.data.name);


}

}
```

Output:

```java
mohammed
Ali
```


- **Tree traversal**

The process of visiting required node to perform special operation or visiting each node and print their values.

There are three ways to travers tree:

1- Pre-order traversal

- Visit the root node
- Visit all nodes from the left side
- Visit all node from the right side
- Example: in figuer 2, the pre-order path is: `A -> B -> D -> E -> C -> F -> G -> H`.

2- In-order traversal

- Visit all nodes from the left side
- Visit the root node
- Visit all node from the right side
- Example: in figuer 2, the in-order path is: `D -> B -> E -> A -> F -> C -> G -> H`.


3- Post-order traversal

- Visit all nodes from the left side
- Visit all node from the right side
- Visit the root node
- Example: in figuer 2, the post-order path is: `D -> E -> B -> F -> H -> G -> C -> A`.

<br/>


## Types

1 - General Tree

- A tree where there are no constraints on the hierarchical structure.
- A tree where a node can have any number of child nodes.

2 - Binary tree

- A tree where the node has at most two child.

3 - Binary search tree (BST)

- A tree where the node at most has two child 
- A tree where the left subtree is less than the root
- A tree where the right subtree is bigger than the root

4 - AVL tree

- A self-balancing binary search tree
- Each node stores a value called a `balanced factor`, whose value is either -1, 0 or 1.
- `balanced factor` = (height of left subtree - height of right subtree) or (height of right subtree - height of left subtree)
- The tree in figure 2 is AVL tree.
- Example: The `balanced factor` for the node `A` = (height of left subtree {1} - height of right subtree {1}) = {0}.
  
5 - B-tree
- A special kind of self balancing tree, where the node can contain more than one key and can have more then two child.


## Projects

Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|TreeProject01| [Tree with primitive data types](projects/introduction-to-tree/01-premetive-tree-creation/README.md) | - | 









