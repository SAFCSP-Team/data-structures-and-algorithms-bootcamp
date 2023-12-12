# Single Linked List.

## Concept 

`Single Linked List ` is a **linear data structure** in which elements, called nodes, are connected via pointers or references. Each node contains two parts: the data and a reference to the next node in the sequence. The first node in the list is called the `head`, and the last node is called the `tail`.

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

> In java and C++, you can declare and initialize linked lists in a similar way.

### Primitive 
* Single linked list of primitive data types in Java:
  
```java

```
* Single linked list of primitive data types in C++:
```c++


```

### non Primitive
* Single linked list of non primitive data types in Java:
```java

```
Single linked list of non primitive data types in C++:
  
```c++
  
  ```


## Projects

