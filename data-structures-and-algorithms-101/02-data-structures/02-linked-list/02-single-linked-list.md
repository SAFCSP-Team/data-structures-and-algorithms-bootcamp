# Single Linked List.

## Concept 

`Single Linked List ` is a **linear data structure** in which elements, called `nodes`, are connected via `pointers` or references. Each node contains two parts: the data and a reference to the next node in the sequence. The first node in the list is called the `head`, and the last node is called the `tail`.

**Common Singly Linked List Operations:**

* Add a node to the list.
    * When adding a new `node` at the beginning of the list, you simply create the node, set its data, and update its next pointer to point to the current head 
      node. Then, you update the head pointer to point to the new node.
      
![image](https://github.com/SAFCSP-Team/data-structures-and-algorithms-bootcamp/assets/148945652/5951ae52-4328-4750-8e46-3c289c1fb7bf)

* Search for a node in the list.
    * To search for a specific element in the `linked list`, you start from the head and traverse the list until you find the element or reach the end of the list. You can compare the data in each node with the target element to determine if it matches.

* Remove a node from the list.
* To remove a node from the linked list, you need to update the next pointer of the previous node to bypass the node to be deleted. If the node to be deleted is the head, you update the head pointer to point to the next node. 
## Example 
* Method to insert elements into a single linked list.
```java
class LinkedList {
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
            current.next = newNode;
        }
    }
```
### Primitive 
```java
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(7);
        linkedList.insert(14);
        linkedList.insert(21);
        linkedList.insert(28);
        linkedList.display();
    }
}
```

### non Primitive
```java
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Claire", 3);
        Student student4 = new Student("David", 4);
        linkedList.insert(student1);
        linkedList.insert(student2);
        linkedList.insert(student3);
        linkedList.insert(student4);
        linkedList.display();
    }
}
```

## Projects


| Id      | Title          | Deadline |
| ------- | -------------- | -------- |
| SLIProject01|                |          |


