# Double Linked-List 

### Objective

In this project, our main goal will be to understand the fundamentals of a double linked-list and its operations.

### Concepts

Use the provided resources for a better understanding.

|Concept|	Resources|
|-------|----------|
|What is a double linked list|[double linked list in c](https://medium.com/@noransaber685/efficient-data-manipulation-with-doubly-linked-lists-insertion-deletion-and-positional-6d4c6b79cdeb)|
|Double linked list Java|[Insert and delete elements](https://www.youtube.com/watch?v=ZlNKNSz88Nk)|

### Problem

Implement `deleteNode` method to remove a specific value from a double linked-list

### Implementation

Write the implementation of the `deleteNode` method that removes a node with a specific value from the list.
```java

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.displayList();
    }
public class Node {
    public int data;
    public Node previous;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void displayList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

/* your code here */
} }
```

