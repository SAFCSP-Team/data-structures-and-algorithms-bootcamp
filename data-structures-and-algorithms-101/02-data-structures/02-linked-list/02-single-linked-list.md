# Single Linked List.

## Concept 

`Single Linked List ` is a **linear data structure** in which elements, called `nodes`, Each node **contains two parts**, the `data` and a `reference` to the next node in the sequence. The first node in the list is called the `head`, and the last node is called the `tail`.

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

* Single linked list of primitive data types.
```java
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
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

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.display();
    }
}

```

## Projects
| Project Title | Deadline |
|:-----------:|:-------------|
| [Single linkedlist](https://github.com/SAFCSP-Team/single-linked-list) | 5 Jan 2024 | 
