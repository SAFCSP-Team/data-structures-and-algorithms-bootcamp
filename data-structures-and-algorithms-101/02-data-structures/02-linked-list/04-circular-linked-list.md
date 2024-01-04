# Circular Linked List

## Concept 
 > A circular linked list is a type of linked list in which the last node are connected to the first node.

There are basically two types of `circular linked list`:
* `Circular Single Linked List.`: the pointer of the last node equals the pointer of the first node.
  
![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/ff25ed6a-bd89-45d2-bf2b-38ca73324371)

* `Circular Double Linked List.`: if the last node is null, instead of storing null as the address of the last node, the first node will store the address of itself as the last node. This creates a circular reference, where the last node points back to the first node, and the first node also points to the last node."
    
![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/46181a8e-5ce6-4734-bfce-79954bd87466)


## Example 
### Primitive 
* Circular linked list of primitive data types in java.
```java
public class CircularLinkedList {
  private class Node {
   int value;
   Node next;
    Node(int value) {
     this.value = value;
     this.next = null;
        }
    }
    private Node head;
    public CircularLinkedList() {
        head = null;
    }
    public void insert(int value) {
     Node newNode = new Node(value);
     if (head == null) {
      head = newNode;
      newNode.next = head; // Make it point to itself for circularity
        } else {
        Node current = head;
        while (current.next != head) {
         current = current.next;
            }
       current.next = newNode;
       newNode.next = head; // Make the new node point to the head for circularity
        }
    }
    public void display() {
     if (head == null) {
      System.out.println("Circular linked list is empty.");
      return;
        }
    Node current = head;
     do {
      System.out.print(current.data + " ");
       current = current.next;
       } while (current != head);
       System.out.println();
    }
    public static void main(String[] args) {
      CircularLinkedList circularLinkedList = new CircularLinkedList();
      circularLinkedList.insert(1);
      circularLinkedList.insert(2);
      circularLinkedList.insert(3);
      circularLinkedList.insert(4);
       System.out.println("Circular linked list:");
       circularLinkedList.display();
    }
}
```

### Non-Primitive
* Circular linked list of non-primitive data types in c++.
```c++
#include <iostream>
#include <string>
using namespace std;
struct Node {
   string data;
   Node* next;
};
class CircularLinkedList {
private:
   Node* head;
public:
   CircularLinkedList() {
      head = nullptr;
   }
void insert(string value) {
      Node* newNode = new Node;
      newNode->data = value;
      newNode->next = nullptr;
      if (head == nullptr) {
         head = newNode;
         newNode->next = head; // Make it point to itself for circularity
      } else {
         Node* current = head;
         while (current->next != head) {
            current = current->next;
         }
         current->next = newNode;
         newNode->next = head; // Make the new node point to the head for circularity
      }
   }
   void display() {
      if (head == nullptr) {
         cout << "Circular linked list is empty." << endl;
         return;
      }
      Node* current = head;
      do {
         cout << current->data << " ";
         current = current->next;
      } while (current != head);
      cout << endl;
   }
};
int main() {
   CircularLinkedList circularLinkedList;
   circularLinkedList.insert("Alice");
   circularLinkedList.insert("Bob");
   circularLinkedList.insert("Charlie");
   circularLinkedList.insert("David");
   cout << "Circular linked list:" << endl;
   circularLinkedList.display();
   return 0;
}
```

## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Circular linked list](https://github.com/SAFCSP-Team/circular-linked-list) | - | 

