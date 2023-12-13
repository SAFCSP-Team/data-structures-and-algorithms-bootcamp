# Double Linked List.
## Concept

A `doubly linked list` is an enhanced version of a linked list that allows **bidirectional traversal**. Each `node` in a **double linked list** contains an additional pointer called the `previous pointer`, which points to the previous node in the list. This feature enables efficient **traversal** both **forward and backward** through the list. Unlike singly linked lists, where traversal is only possible in one direction.

![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/853da773-559e-4b16-b203-b9ca500185b5)

 `Doubly linked list` enables efficient implementation of operations like **reverse traversal, 
  inserting elements** before or after a given node, and **deleting** a node with direct access to it.
   
## Example 
* Method to delete elements into a double linked list.
```java
 public void delete(int data) {
    Node current = head;
     while (current != null) {
      if (current.data == data) {
      if (current == head) {
      head = current.next;
       if (head != null) {
        head.previous = null;
    }
} else {
current.previous.next = current.next;
   if (current.next != null) {
     current.next.previous = current.previous;
    }
   } break;
    }
   current = current.next;
 } }
```

### Primitive 
```java

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(7);
        doublyLinkedList.insert(14);
        doublyLinkedList.insert(21);
        System.out.println("Original list:");
        doublyLinkedList.display();
        doublyLinkedList.delete(14);
        System.out.println("List after deleting 14:");
        doublyLinkedList.display();
    }
/* Create Node class */
class Node {
    int data;
    Node previous;
    Node next;
    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
/* Create a Double linked list class that contains the necessary methods for insertion, deletion, and display */
class DoublyLinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            newNode.previous = current;
            current.next = newNode;
        }
    }
/* display method traverses the list and print the data of each node */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
} }
```
### non Primitive



## Projects

