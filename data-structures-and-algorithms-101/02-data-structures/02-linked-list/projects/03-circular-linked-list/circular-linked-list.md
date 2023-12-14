# circular Linked List 

### Objective

In this project, our main goal will be to understand the fundamentals of a double linked list, and their operations.

### Concepts

Using the provided resources for a better understanding.

|Concept|	Resources|
|-------|----------|
|||
|||

### Problem

Create `add()` method to added to the `CircularLinkedList` class and `display()` method to print the data values.

### Implementation

In the `add()` method follow the provided steps:
* It first checks if the head is null. If it is, the new node becomes both the head and tail of the list, and its next reference is set to itself.
* If the head is not null, the new node is added at the end of the list by updating the tail's next reference to the new node, and the new node becomes the new 
  tail.
* The circularity of the list is maintained by making the tail's next reference point back to the head.
  
In the `display()` method follow the provided steps:
* It checks if the head is null. If it is, it prints a message indicating that the list is empty.
* If the head is not null, it creates a new node called current and initializes it to the head.
* It then loops through the list, printing the data of each node pointed to by the current node, until the current node points back to the head.

```java
public class CreateList { 
        public static void main(String[] args) {  
        CreateList cl = new CreateList();  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
        cl.display();
    }
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }
   public Node head = null;  
   public Node tail = null;  
     
 /* your method here */
}

```
