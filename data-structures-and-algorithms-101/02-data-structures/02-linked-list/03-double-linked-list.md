# Double Linked List.
## Concept

A `double linked list` is an enhanced version of a linked list that allows **bidirectional traversal**. Each `node` in a **double linked list** contains of additional pointer called the `previous pointer`, which points to the previous node in the list. This feature enables efficient **traversal** both **forward and backward** through the list. Unlike singly linked lists, where traversal is only possible in one direction.

![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/6e7ee626-df74-4e29-8771-eb23d84d4f19)

 `Doubly linked list` enables efficient implementation of operations like **reverse traversal, 
  inserting elements** before or after a given node, and **deleting** a node with direct access to it.
   
## Example 

### Primitive 
* Double linked list of primitive data types in java.
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
    }}

class Node {
    int data;
    Node previous;
    Node next;
    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }}

class DoublyLinkedList {
 Node head;
 public void insert(int data) {
    Node Node = new Node(data);
     if (head == null) {
         head = Node;
   } else {
    Node current = head;
      while (current.next != null) {
        current = current.next;
          }
          newNode.previous = current;
          current.next = Node;
        }
    }
    public void delete(int data) {
        if (head == null) {
            return;
        }
   Node current = head;
     while (current != null) {
       if (current.data == data) {
        if (current.previous == null) {
            /*  Node to delete is the head node */
               head = current.next;
               if (head != null) {
                head.previous = null;
                    }
                } else {
                    /* Node to delete is not the head node */
                    current.previous.next = current.next;
                    if (current.next != null) {
                        current.next.previous = current.previous;
                    }
                }
                break;
            }
            current = current.next;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

```
### Non-Primitive
* Double linked list of non-primitive data types in c++.
```c++
#include <iostream>
#include <string>
using namespace std;

/* Node declaration for doubly linked list */
struct Node {
   string data;
   struct Node* prev, * next;
};

Node* Node(string val) {
   Node* temp = new Node;
   temp->data = val;
   temp->prev = temp->next = nullptr;
   return temp;
}

void displayList(Node* head) {
   while (head->next != nullptr) {
      cout << head->data << " <==> ";
      head = head->next;
   }
   cout << head->data << endl;
}

/* Insert a new node at the head of the list */
void insert(Node** head, string node_data) {
   Node* temp = Node(node_data);
   temp->next = *head;
   if (*head != nullptr) {
      (*head)->prev = temp;
   }
   *head = temp;
}

/* Reverse the doubly linked list */
void reverseList(Node** head) {
   Node* left = *head;
   Node* right = *head;

   /* Traverse the entire list and set right next to right */
   while (right->next != nullptr) {
      right = right->next;
   }
   /* Swap left and right data by moving them towards each other till they meet or cross */
   while (left != right && left->prev != right) {
      // Swap left and right pointer data
      swap(left->data, right->data);

      /* Advance left pointer */
      left = left->next;

      /* Advance right pointer */
      right = right->prev;
   }
}
int main() {
   Node* headNode = newNode("E");
   insert(&headNode, "D");
   insert(&headNode, "C");
   insert(&headNode, "B");
   insert(&headNode, "A");
   cout << "Original doubly linked list:" << endl;
   displayList(headNode);
   cout << "Reverse doubly linked list:" << endl;
   reverseList(&headNode);
   displayList(headNode);
   return 0;
}
```
## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
 [Double linked list](https://github.com/SAFCSP-Team/double-linked-list) | - | 

