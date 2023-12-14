# Single Linked List.

## Concept 

`Single Linked List ` is a **linear data structure** in which elements, called `nodes`, are connected via `pointers` or references. Each node contains two parts, the data and a reference to the next node in the sequence. The first node in the list is called the `head`, and the last node is called the `tail`.

**Common Singly Linked List Operations**

* Add a node to the list.
    * When adding a new `node` at the beginning of the list, you simply create the node, set its data, and update its next pointer to point to the current head 
      node. Then, you update the head pointer to point to the new node.
      
![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/c8720b15-54f6-41c3-bfdf-c070b9e8b4b0)

* Access for a node in the list.
    * To access a specific element in the `linked list`, you start from the head and traverse the list until you find the element or reach the end of the list. 
      You can compare the data in each node with the target element to determine if it matches.

* Remove a node from the list.
* To remove a node from the linked list, you need to update the next pointer of the previous node to bypass the node to be deleted. If the node to be deleted is the head, you update the head pointer to point to the next node.
  
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
        Node* newNode = new Node(data);
        if (head == nullptr) {
            head = newNode;
        } else {
            Node* current = head;
            while (current->next != nullptr) {
                current = current->next;
            }
            current->next = newNode;
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
### non Primitive
* Single linked list of non primitive data types in Java.
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
        }  }
}
class LinkedListNode<T> {
    T val;
    LinkedListNode<T> next;
    LinkedListNode(T val) {
        this.val = val;
    } }
```
## Projects


| Id      | Title          | Deadline |
| ------- | -------------- | -------- |
| SLIProject01|                |          |


