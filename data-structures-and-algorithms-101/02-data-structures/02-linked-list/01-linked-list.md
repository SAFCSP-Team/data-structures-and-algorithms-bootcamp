# Introduction to Linked List

Imagine you are on a treasure hunt with a series of cards leading you to the hidden gold. The cards are arranged in links to guide you on the path.

Let's say there are two cards in the treasure hunt, the first card would contain the information about card 1 and a reference to the next card, in the second card would hold the information about card 2 and have an empty reference since it's the last card in the treasure hunt.

To simulate the treasure hunt in our program, we need to use a `linked list` to represent the sequence of cards, each card is like a `node`. Each `node` **contains two parts**, the information about the card itself and a `pointer`(or reference) to the next card in the list.

## Concept

A `linked list` is a **data structure** that consists of a **sequence of elements called nodes**. Each node contains the `data` and a `pointer` to the next node in the sequence. The last node in the list has a pointer to null, `tail` indicates the end of the list.

![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/095e5e5f-8251-4b88-96dc-4c27103f9569)

**Types of Linked List**:

* `Single linked list`: A type of linked list that is unidirectional, it can be traversed in only **one direction** from `head` to the last node `tail`.
     
* `Double linked list`: It is a special type of linked list where each node contains a **pointer to the previous** node as well as the next node of the linked 
   list.
  
* `Circular linked list`: Is a type of linked list in which the first and the last nodes are also **connected** to each other to form a circle.

## Example 

### Primitive 

* linked list of primitive data types in Java.
  
```java
public class Main {
 public static void main(String[] args) {
   LinkedList linkedList = new LinkedList();
     linkedList.insert(10);
     linkedList.insert(20);
     linkedList.insert(30);
     linkedList.insert(40);
     linkedList.display();
    }

class Node {
  int data;
  Node next;
   Node(int data) {
     this.data = data;
     this.next = null;
    }
}

class LinkedList {
  private Node head;
  LinkedList() {
   this.head = null;
    }

 public void insert(int data) {
  Node Node = new Node(data);
  if (head == null) {
   head = Node;
    } else {
    Node current = head;
    while (current.next != null) {
     current = current.next;
       }
     current.next = Node;
      }
    }

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
    } }
}
}
```
* linked list of primitive data types in c++.
```c++
#include <iostream>

class Node {
public:
int data;
Node* next;
 Node(int data) {
  this->data = data;
  this->next = nullptr;
    }
};

class LinkedList {
private:
    Node* head;
public:
LinkedList() {
  this->head = nullptr;
 }

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
 if (head == nullptr) {
 std::cout << "Linked list is empty." << std::endl;
 } else {
 Node* current = head;
 while (current != nullptr) {
  std::cout << current->data << " ";
   current = current->next;
 }
 std::cout << std::endl;
        }
    }
};

int main() {
 LinkedList linkedList;
  linkedList.insert(10);
  linkedList.insert(20);
  linkedList.insert(30);
  linkedList.insert(40);
  linkedList.display();
    return 0;
}
```
### Non-Primitive
* linked list of non-primitive data types in Java.
  
```java
public class Main {
  public static void main(String[] args) {
    LinkedListNode<String> head = new LinkedListNode<>(new String("Lama"));
    LinkedListNode< String > second = new LinkedListNode<>(new String("Sara"));
    LinkedListNode<String> third = new LinkedListNode<>(new String("Eman"));
      head.next = second;
      second.next = third;
        /* Print the elements of the linked list */
        LinkedListNode<String> current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        } }
}

class LinkedListNode<T> {
    T val;
    LinkedListNode<T> next;

    LinkedListNode(T val) {
        this.val = val;
    } }
```
* linked list of non primitive data types in c++:
  
```c++
#include <iostream>
#include <string>

struct Person {
    std::string name;
    Person(const std::string& n) : name(n) {}
};

struct PersonNode {
    Person val;
    PersonNode* next;
    PersonNode(const Person& p) : val(p), next(nullptr) {}
};

void printPersonList(PersonNode* head) {
    PersonNode* current = head;
    while (current != nullptr) {
        std::cout << "Name:  " << current-> val.name;
        current = current->next;
    }}

int main() {
    PersonNode* head = new PersonNode(Person("Lama"));
    PersonNode* second = new PersonNode(Person("Noura"));
    PersonNode* third = new PersonNode(Person("Lamyaa"));
    head->next = second;
    second->next = third;
    /* Print the elements of the linked list */
   printPersonList(head);
}
  ```
> In java and c++, you can declare and initialize linked list in a similar way.


## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [linked list](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/tree/main/data-structures-and-algorithms-101/02-data-structures/02-linked-list/projects/01-linked-list) | - | 
