# Introduction to Linked List

Imagine you are on a treasure hunt with a series of cards leading you to the hidden gold. The cards are arranged in a linked list to guide you on the path.

In this linked list representation, each card is like a `node`. Each `node` **contains two parts**: the information about the card itself and a `pointer`(or reference) to the next card in the list.

**For example**, let's say there are two cards in the treasure hunt:
the first card would contain the information about card 1 and a reference to the next card, In the second card would hold the information about card 2 and have a null reference since it's the last card in the treasure hunt.

## Concept

A `linked list` is a **data structure** that consists of a **sequence of elements called nodes**. Each node contains the `data` and a `pointer` to the next node in the sequence. The last node in the list has a pointer to null, `tail` indicates the end of the list.



![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/e5906bb0-2a3a-4bfd-9f14-fa919ba80bd6)


**Types of Linked List**:

* Single linked list.
   
  > A type of linked list that is unidirectional, it can be traversed in only one direction from head to the last node (tail).
* Double linked list.
  > It is a special type of linked list where each node contains a pointer to the previous node as well as the next node of the linked list.
  
* Circular linked list.
  > is a type of linked list in which the first and the last nodes are also connected to each other to form a circle.

## Example 

> In java and c++, you can declare and initialize linkedlist in a similar way.

### Primitive 

* linkedlist of primitive data types in Java:
 
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
