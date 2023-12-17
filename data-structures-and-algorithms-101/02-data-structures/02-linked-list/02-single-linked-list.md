# Single Linked List.

## Concept 

`Single Linked List ` is a **linear data structure** in which elements, called `nodes`, are connected via `pointers` or references. Each node contains two parts, the data and a reference to the next node in the sequence. The first node in the list is called the `head`, and the last node is called the `tail`.

**Common Singly Linked List Operations**

* `Add a node to the list`: when adding a new `node` at the beginning of the list, you simply create the node, set its data, and update its next pointer to point 
  to the current head node. Then, you update the head pointer to point to the new node.
      
![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/5e0c1f75-9400-473f-a647-5d3f20268785)


* `Access for a node in the list`: to access a specific element in the `linked list`, you start from the head and traverse the list until you find the element or 
  reach the end of the list. You can compare the data in each node with the target element to determine if it matches.

* `Remove a node from the list`: to remove a node from the linked list, you need to update the next pointer of the previous node to bypass the node to be deleted. If the node to be deleted 
  is the head, you update the head pointer to point to the next node.
  
## Example 

### Primitive 

* Single linked list of primitive data types in c++ .
```c++
#include <iostream>

struct Node {
    int data;
    Node* next;
    Node(int value) : data(value), next(nullptr) {}
};

class LinkedList {
private:
    Node* head;
public:
    LinkedList() : head(nullptr) {}
/* Method to insert elements into a single linked list */
    void insert(int data) {
        Node* Node = new Node(data);
        if (head == nullptr) {
            head = Node;
        } else {
            Node* current = head;
            while (current->next != nullptr) {
                current = current->next;
            }
            current->next = Node;
        }
    }
void display() {
        Node* current = head;
        while (current != nullptr) {
            std::cout << current->data << " ";
            current = current->next;
        }
        std::cout << std::endl;
    }
};

int main() {
 LinkedList linkedList;
 linkedList.insert(7);
 linkedList.insert(14);
 linkedList.insert(21);
 linkedList.insert(28);
 linkedList.display();
 return 0;
}

```
### Non-Primitive
* Single linked list of non-primitive data types in Java.
```java

public class Main {
 public static void main(String[] args) {
   LinkedList<String> linkedList = new LinkedList<>();
   linkedList.insert("LAMA");
   linkedList.insert("SARA");
   linkedList.insert("EMAN");
   linkedList.display();
    }
}

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private Node<T> head;
    LinkedList() {
        this.head = null;
    }
 void insert(T data) {
 Node<T> newNode = new Node<>(data);
    if (head == null) {
     head = newNode;
    } else {
    Node<T> current = head;
    while (current.next != null) {
    current = current.next;
     }
    current.next = newNode;
        }
    }
 void display() {
  if (head == null) {
   System.out.println("Linked list is empty.");
   } else {
   Node<T> current = head;
  while (current != null) {
   System.out.println(current.data);
   current = current.next;
            }
        }
    }
}

```
## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Single linkedlist](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/tree/main/data-structures-and-algorithms-101/02-data-structures/02-linked-list/projects/01-single-linked-list) | - | 
