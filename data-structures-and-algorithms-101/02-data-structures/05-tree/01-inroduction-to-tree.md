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



- **Types of tree**

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


## Example 
This implementation is for general tree, the node can have multiple children.

### Primitive 

In this example we will create a `tree` of integers.

Node class consists of 2 attributes: `int number`,  `ArrayList children` to store the node children and a `constructor` that takes a value as a parameter and assigne it to the `number` attribute.


- TreeNode class

Java code
```java
import java.util.ArrayList;


public class TreeNode {

    // Node Data
    int number;
    // Node Children
    ArrayList<TreeNode> children = new ArrayList<TreeNode>();

    // Constructor to create the node
    TreeNode(int number){
        this.number = number;
    }

    public static void main(String[] args) {
        
        // Create the root
        TreeNode root = new TreeNode(1);

        // Create TreeNodes
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        TreeNode child3 = new TreeNode(4);

        // Add the TreeNodes as the root children
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        // Print the root and the children data
        System.out.println(root.number);
        System.out.println(root.children.get(0).number);
        System.out.println(root.children.get(1).number);
        System.out.println(root.children.get(2).number);

    }

    
}
```

Output:
```java
1
2
3
4
```



### non-primitive

In this example we will create a `tree` of employees.

- Employee class

Java code
```java
class Employee {

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


Tree class consists of 1 attributes: `Employee employee` and a `constructor` that takes `employee` as a parameter and assigne it to the `employee` attribute.


- TreeNode class

Java code
```java

public class TreeNode {

    // Node Data
    Employee employee;
    // Node Children
    ArrayList<TreeNode> children = new ArrayList<TreeNode>();

    // Constructor to create the node
    TreeNode(Employee e){
        this.employee = e;
    }

    public static void main(String[] args) {

        // Create Employees
        Employee e = new Employee(01,"Ahmed","CEO");
        Employee e1 = new Employee(02,"Ali","IT Managaer");
        Employee e2 = new Employee(03,"Abdullah","HR Manager");
        Employee e3 = new Employee(04,"Mohammed","Finance Manager");
        
        // Create the root
        TreeNode root = new TreeNode(e);

        // Create TreeNodes
        TreeNode child1 = new TreeNode(e1);
        TreeNode child2 = new TreeNode(e2);
        TreeNode child3 = new TreeNode(e3);

        // Add the TreeNodes as the root children
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        // Print the root and the children names
        System.out.println(root.employee.name);
        System.out.println(root.children.get(0).employee.name);
        System.out.println(root.children.get(1).employee.name);
        System.out.println(root.children.get(2).employee.name);

    }

    
}

```

Output:
```java
Ahmed
Ali
Abdullah
Mohammed
```

## Projects

Project ID | Project Title | Deadline |
|:-----|:-----------:|:-------------|
|TreeProject01| [Tree with primitive data types](projects/introduction-to-tree/01-premetive-tree-creation/README.md) | - | 









