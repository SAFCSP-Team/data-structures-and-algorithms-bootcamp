# binary Tree non premitive project

### Objective
In this project, our objective is to create a tree of employees.

### Problem
Create a tree to store employees.

### Implementation
Using Java programming language: 

- `Employee` class is already implemented and added to the BinartTree class as the below:
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


- `Node` class is already implemented and added to the BinartTree class as the below:
```java


// Node creation
public class Node {
  Employee data;
  Node left;
  Node right;

  public Node(Employee e) {
  data = e;
  left = null;
  right = null;
  }

}
```



- `BinaryTree` class is where you will perform the below requirements:

1 - In `BinaryTree` class, create `Preorder` traversal function. 

2 - In `main` creat a tree and add the below nodes that have information about the employees:
- Employee e1: id: 02, name: Ali, role: IT Managaer.
- Employee e2: id: 03, name: Abdullah, role: HR Manager.
- Employee e3: id: 04, name: Mohammed, role: Software Developer.

In the code you can see the `root` is already created with the below informatio:

Employee e: id: 01, name: Ahmed, role: CEO.
```java
Employee e = new Employee(01,"Ahmed","CEO");
````

3 - Crete the root node
- use `tree.root` to create the root and store the object `e`.

4 - Output of this projects should be the same as below:
- Output:
```
Pre order Traversal: 
 id: 1 name: Ahmed Role: CEO
 id: 2 name: Ali Role: IT Managaer
 id: 4 name: Mohammed Role: Software Developer
 id: 3 name: Abdullah Role: HR Manager

In order Traversal: 
 id: 4 name: Mohammed Role: Software Developer
 id: 2 name: Ali Role: IT Managaer
 id: 1 name: Ahmed Role: CEO
 id: 3 name: Abdullah Role: HR Manager

Post order Traversal: 
 id: 4 name: Mohammed Role: Software Developer
 id: 2 name: Ali Role: IT Managaer
 id: 3 name: Abdullah Role: HR Manager
 id: 1 name: Ahmed Role: CEO
```


```java
public class BinaryTree {
  Node root;

  BinaryTree(Employee e) {
  root = new Node(e);
  }

  BinaryTree() {
  root = null;
  }

  // Traverse Inorder
  public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.println(" id: " + node.data.id+ " name: " + node.data.name + " Role: " + node.data.role) ;
      traverseInOrder(node.right);
    }
    }
  
    // Traverse Postorder
    public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.println(" id: " + node.data.id+ " name: " + node.data.name + " Role: " + node.data.role) ;
    }
    }
  
    // Traverse Preorder
    public void traversePreOrder(Node node) {

    // ** 1- add your code here ** //

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
      
        Employee e = new Employee(01,"Ahmed","CEO");
    // ** 2- add your code here ** //

    // ** 3- add your code here ** //
        tree.root.left = new Node(e1);
        tree.root.right = new Node(e2);
        tree.root.left.left = new Node(e3);
      
        System.out.print("Pre order Traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nIn order Traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPost order Traversal: ");
        tree.traversePostOrder(tree.root);
        }


}
```

