# Introduction to Linked List

Imagine you are on a treasure hunt with a series of cards leading you to the hidden gold. The cards are arranged in links to guide you on the path.

Let's say there are two cards in the treasure hunt, the first card would contain the information about card 1 and a reference to the next card, in the second card would hold the information about card 2 and have an empty reference since it's the last card in the treasure hunt.

To simulate the treasure hunt in our program, we need to use a `linked list` to represent the sequence of cards, each card is like a `node`. Each `node` **contains two parts**, the information about the card itself and a `pointer`(or reference) to the next card in the list.

## Concep

A `linked list` is a **data structure** that consists of a **sequence of elements called nodes**. Each node contains the `data` and a `pointer` to the next node in the sequence. The last node in the list has a pointer to null, `tail` indicates the end of the list.

![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/095e5e5f-8251-4b88-96dc-4c27103f9569)


## Implementation

In a `linked list`, a node represents an individual element in the sequence, which is the key component that the linked list is built on. Each `node` contains two main parts: the `data`, which stores the value associated with the node, and a `pointer` to the next node. The Node class captures this structure to provide the foundation for constructing linked lists.

                                                                                                                                                          
  <img src="https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/c1c59d61-030a-41ec-89db-607d1fee63c3"
 width="280" height="180">

Now, let's proceed with implementing the linked list data structure. We'll start by creating a `Node` class and then build the `LinkedList` class that manages the nodes and provides various operations to manipulate the list.

* Create a `Node` class that holds an **integer** data type. The data variable stores the integer value, and the next variable is a reference to the next `Node` in the linked list.
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```
* Example of a non-primitive `Node` class that holds an **string** data type in c++.
```c++
class Node {
public:
    std::string data;
    Node* next;

    Node(const std::string& data) : data(data), next(nullptr) {}
};
```
* Create a `LinkedList`, the class has a `pointer` to the **head** node, which is the starting point of the list.
```java
class LinkedList {
    private Node head;

    LinkedList() {
        this.head = null;
    }
}
```
* Create an instance and link the first node to LinkedList.
```java
public class Main {
  public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        /* Create the first node */
        Node firstNode = new Node(10);

        /* Link the first node to the LinkedList */
        linkedList.head = firstNode;
    }
}

```
* Perform an action 
  
 ```java
class LinkedList {
    private Node head;

    LinkedList() {
        this.head = null;
    }
    /* insert a new element at the end of the linked list */
    public void insert(int data) {
        Node value = new Node(data);

        if (head == null) {
            head = value;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = value;
        }
    }
   /* to print the contents of the linked list */
    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
   /*  delete a specific element from the linked list */
   public void delete(int data) {
      if (head == null) {
        System.out.println("Linked list is empty.");
        return;
    }

    if (head.data == data) {
        head = head.next;
        return;
    }

    Node current = head;
    Node prev = null;
    while (current != null) {
        if (current.data == data) {
            prev.next = current.next;
            return;
        }
        prev = current;
        current = current.next;
    }

    System.out.println(data + " not found in the linked list.");
}

}

```
> In java and c++, you can declare and initialize linked list in a similar way.

## Types
Types of Linked List:

* `Single linked list`: A type of linked list that is unidirectional, it can be traversed in only **one direction** from `head` to the last node `tail`.
     
* `Double linked list`: It is a special type of linked list where each node contains a **pointer to the previous** node as well as the next node of the linked 
   list.
  
* `Circular linked list`: Is a type of linked list in which the first and the last nodes are also **connected** to each other to form a circle.

## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [linked list](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/tree/main/data-structures-and-algorithms-101/02-data-structures/02-linked-list/projects/01-linked-list) | - | 