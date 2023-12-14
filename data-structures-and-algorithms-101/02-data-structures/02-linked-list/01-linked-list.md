# Introduction to Linked List

Imagine you are on a treasure hunt with a series of cards leading you to the hidden gold. The cards are arranged in links to guide you on the path.

Let's say there are two cards in the treasure hunt, the first card would contain the information about card 1 and a reference to the next card, in the second card would hold the information about card 2 and have an empty reference since it's the last card in the treasure hunt.

To simulate the treasure hunt in our program, we need to use a `linked list` to represent the sequence of cards, each card is like a `node`. Each `node` **contains two parts**, the information about the card itself and a `pointer`(or reference) to the next card in the list.

## Concept

A `linked list` is a **data structure** that consists of a **sequence of elements called nodes**. Each node contains the `data` and a `pointer` to the next node in the sequence. The last node in the list has a pointer to null, `tail` indicates the end of the list.


![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/1275b8b7-457d-4657-9946-170ec9062628)


**Types of Linked List**:

* Single linked list.
   * A type of linked list that is unidirectional, it can be traversed in only **one direction** from `head` to the last node `tail`.
     
* Double linked list.
  * It is a special type of linked list where each node contains a **pointer to the previous** node as well as the next node of the linked list.
  
* Circular linked list.
  * is a type of linked list in which the first and the last nodes are also connected to each other to form a circle.

## Example 

### Primitive 

* linkedlist of primitive data types in Java.
```java
public class Main {
    public static void main(String[] args) {
     LinkedListNode head = new LinkedListNode(1);
     LinkedListNode second = new LinkedListNode(2);
     LinkedListNode third = new LinkedListNode(3);
      head.next = second;
      second.next = third;
      /* Print the elements of the linked list */
       LinkedListNode current = head;
       while (current != null) {
         System.out.println(current.val);
          current = current.next;
        }  }
}
class LinkedListNode {
    int val;
    LinkedListNode next;
    LinkedListNode(int val) {
        this.val = val;
    }
}
```
* linkedlist of primitive data types in c++.
  
```c++

struct LinkedListNode {
    int val;
    LinkedListNode* next;

    LinkedListNode(int value) : val(value), next(nullptr) {}
};

void printList(LinkedListNode* head) {
    LinkedListNode* current = head;
    while (current != nullptr) {
        std::cout << current->val << " ";
        current = current->next;
    }
    std::cout << std::endl;
}

```
### non Primitive
* linkedlist of non primitive data types in Java.
  
```java
public class Main {
  public static void main(String[] args) {
    LinkedListNode<String> head = new LinkedListNode<>(new String("LAMA"));
    LinkedListNode< String > second = new LinkedListNode<>(new String("SARA"));
    LinkedListNode<String> third = new LinkedListNode<>(new String("EMAN"));
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
    }
}
```
* linkedlist of non primitive data types in c++:
  
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
    PersonNode* head = new PersonNode(Person("John"));
    PersonNode* second = new PersonNode(Person("Jane"));
    PersonNode* third = new PersonNode(Person("Mike"));
    head->next = second;
    second->next = third;
    /* Print the elements of the linked list */
   printPersonList(head);
}
  
  ```
> In java and c++, you can declare and initialize linkedlist in a similar way.


## Projects
