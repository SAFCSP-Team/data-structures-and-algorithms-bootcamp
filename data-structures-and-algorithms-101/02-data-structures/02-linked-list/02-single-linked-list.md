# Single Linked List.

## Concept 

`Single Linked List ` is a **linear data structure** in which elements, called nodes, are connected via pointers or references. Each node contains two parts: the data and a reference to the next node in the sequence. The first node in the list is called the `head`, and the last node is called the `tail`.

**Common Singly Linked List Operations:**

* Add a node to the list.
    * When adding a new `node` at the beginning of the list, you simply create the node, set its data, and update its next pointer to point to the current head 
      node. Then, you update the head pointer to point to the new node.
      
![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/5951ae52-4328-4750-8e46-3c289c1fb7bf)

* Search for a node in the list.
    * To search for a specific element in the `linked list`, you start from the head and traverse the list until you find the element or reach the end of the list. You can compare the data in each node with the target element to determine if it matches.

* Remove a node from the list.
  




## Example 

> In java and c++, you can declare and initialize linkedlist in a similar way.

### Primitive 

```java

public class Node {
    public int data; // Primitive data type
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```
* linkedlist of primitive data types in c++:
```c++
struct Node {
    int data; // Primitive data type
    Node* next;

    Node(int data) {
        this->data = data;
        next = nullptr;
    }
};


```

### non Primitive
* linkedlist of non primitive data types in Java:
```java
public class Node {
    public String data; // Non-primitive data type
    public Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }    }
```
* linkedlist of non primitive data types in c++:
  
```c++

struct Node {
    std::string data; // Non-primitive data type
    Node* next;

    Node(const std::string& data) {
        this->data = data;
        next = nullptr;
    }
};
  
  ```


## Projects

